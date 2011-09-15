package org.teksme.server.sms.movistar.x2m;

import java.io.IOException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.apache.xmlrpc.client.XmlRpcLiteHttpTransportFactory;
import org.smslib.AGateway;
import org.smslib.GatewayException;
import org.smslib.Message.MessageTypes;
import org.smslib.OutboundMessage;
import org.smslib.OutboundMessage.FailureCauses;
import org.smslib.OutboundMessage.MessageStatuses;
import org.smslib.Service;
import org.smslib.TimeoutException;
import org.teksme.server.provider.sms.service.AServiceThread;
import org.teksme.server.provider.sms.service.HTTPGateway;

public class MovistarHTTPGateway extends HTTPGateway {

	private static Logger logger = Logger.getLogger(MovistarHTTPGateway.class
			.getName());

	KeepAlive keepAlive;

	String URL_AUTH = "200.37.161.80/x2m/rpc2";

	String URL_SENDMSG = "200.37.161.80/x2m/rpc2";

	String SENDMSG_METHOD = "Tiaxa.SendMsg";

	String HTTP = "http://";

	String HTTPS = "https://";

	private String username;

	private String password;

	private Object sessionId;

	private String GTW_DATE_PATTERN = "yyyy-MM-dd HH:mm";

	private boolean secure;

	private Object SYNC_Commander;

	public MovistarHTTPGateway(String id, String myUsername, String myPassword) {
		super(id);
		this.username = myUsername;
		this.password = myPassword;
		this.sessionId = null;
		this.secure = false;
		this.SYNC_Commander = new Object();
		setAttributes(AGateway.GatewayAttributes.SEND);
	}

	@Override
	public int getQueueSchedulingInterval() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Sets whether the gateway works in unsecured (HTTP) or secured (HTTPS)
	 * mode. False denotes unsecured.
	 * 
	 * @param mySecure
	 *            True for HTTPS, false for plain HTTP.
	 */
	public void setSecure(boolean mySecure) {
		this.secure = mySecure;
	}

	/**
	 * Return the operation mode (HTTP or HTTPS).
	 * 
	 * @return True for HTTPS, false for HTTP.
	 * @see #setSecure(boolean)
	 */
	public boolean getSecure() {
		return this.secure;
	}

	@Override
	public void startGateway() throws TimeoutException, GatewayException,
			IOException, InterruptedException {
		getService().getLogger().logInfo("Starting gateway.", null,
				getGatewayId());
		connect();
		super.startGateway();
		setKeepAlive(new KeepAlive("KeepAlive [" + getGatewayId() + "]",
				getService(), 60 * 1000));
	}

	@Override
	public void stopGateway() throws TimeoutException, GatewayException,
			IOException, InterruptedException {
		getService().getLogger().logInfo("Stopping gateway.", null,
				getGatewayId());
		if (getKeepAlive() != null) {
			getKeepAlive().cancel();
			setKeepAlive(null);
		}
		super.stopGateway();
		this.sessionId = null;
	}

	void connect() throws GatewayException, IOException {
		try {
			if (!authenticate())
				throw new GatewayException(
						"Cannot authenticate to Movistar X2M Gateway.");
			logger.info("SMS gateway >> " + getGatewayId()
					+ " successfully authenticated.");
		} catch (MalformedURLException e) {
			throw new GatewayException("Internal Movistar X2M Gateway error.");
		}
	}

	boolean authenticate() throws IOException, MalformedURLException {
		URL url;
		getService().getLogger().logDebug("Authenticate().", null,
				getGatewayId());
		// Install Authenticator
		Authenticator.setDefault(new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password
						.toCharArray());
			}
		});

		url = new URL((this.secure ? this.HTTPS : this.HTTP) + this.URL_AUTH);
		URLConnection connection = url.openConnection();

		int code = 0;
		synchronized (this.SYNC_Commander) {
			connection.connect();
			HttpURLConnection httpConnection = (HttpURLConnection) connection;
			code = httpConnection.getResponseCode();
		}

		// TODO FIXME workaround to authenticate on movistar gateway via GET
		if (code == HttpURLConnection.HTTP_UNAUTHORIZED) {
			this.sessionId = null;
			return false;
		} else if (code == HttpURLConnection.HTTP_BAD_METHOD) {
			this.sessionId = UUID.randomUUID().toString();
			return true;
		}

		return false;
	}

	@Override
	public boolean sendMessage(OutboundMessage msg) throws TimeoutException,
			GatewayException, IOException, InterruptedException {

		logger.info("Sending text message through >> " + getGatewayId());

		URL url = null;
		boolean ok = false;
		List<String> response = new ArrayList<String>();

		if (this.sessionId == null) {
			getService().getLogger().logError("No session defined.", null,
					getGatewayId());
			msg.setFailureCause(FailureCauses.GATEWAY_FAILURE);
			return false;
		}

		if (msg.getType() == MessageTypes.OUTBOUND) {
			url = new URL((this.secure ? this.HTTPS : this.HTTP)
					+ this.URL_SENDMSG);

		} else {
			msg.setFailureCause(FailureCauses.BAD_FORMAT);
			getService().getLogger().logError("Incorrect message format.",
					null, getGatewayId());
			return false;
		}

		try {

			synchronized (this.SYNC_Commander) {
				// XmlRpc.setDebug(true);
				XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
				config.setServerURL(url);
				config.setBasicUserName(username);
				config.setBasicPassword(password);

				XmlRpcClient client = new XmlRpcClient();
				client.setTransportFactory(new XmlRpcLiteHttpTransportFactory(
						client));
				client.setConfig(config);

				Vector<Hashtable<String, String>> data = new Vector<Hashtable<String, String>>();

				Hashtable<String, String> ht1 = new Hashtable<String, String>();
				String to = msg.getRecipient();
				if (to.startsWith("+"))
					to = msg.getRecipient().replace("+", "");
				ht1.put("celular", to);
				ht1.put("texto", msg.getText());
				ht1.put("fecha", formatDate(GTW_DATE_PATTERN, msg.getDate()));
				data.add(ht1);

				Vector<Vector<Hashtable<String, String>>> vec = new Vector<Vector<Hashtable<String, String>>>();
				vec.add(data);

				Object[] result = (Object[]) client
						.execute(SENDMSG_METHOD, vec);
				if (result == null) {
					response.add("101");
					response.add("DispatchMT::doDispatch : XmlRpc dispatch. Null response.");
				}

				for (Object object : result) {
					// System.out.println(object.toString());
					response.add(object.toString());
				}
			}

			logger.info("Response at index(0) : " + response.get(0));
			logger.info("Response at index(1) : " + response.get(1));
			if (response.get(1).contains("err")) {
				switch (Integer.parseInt(response.get(0))) {
				case HttpURLConnection.HTTP_INTERNAL_ERROR:
					msg.setFailureCause(FailureCauses.GATEWAY_AUTH);
					break;
				default:
					msg.setFailureCause(FailureCauses.UNKNOWN);
					break;
				}
				msg.setRefNo(null);
				msg.setDispatchDate(null);
				msg.setMessageStatus(MessageStatuses.FAILED);
				ok = false;
			} else if (response.get(1).contains("Invalid phone format")) {
				msg.setFailureCause(FailureCauses.BAD_NUMBER);
				msg.setRefNo(null);
				msg.setDispatchDate(null);
				msg.setMessageStatus(MessageStatuses.FAILED);
				ok = false;
			} else if (response.get(1).contains("OK")) {
				// msg.setRefNo(response.get(0).substring(4));
				msg.setDispatchDate(new Date());
				msg.setGatewayId(getGatewayId());
				msg.setMessageStatus(MessageStatuses.SENT);
				incOutboundMessageCount();
				ok = true;
			} else {
				msg.setFailureCause(FailureCauses.UNKNOWN);
				msg.setRefNo(null);
				msg.setDispatchDate(null);
				msg.setMessageStatus(MessageStatuses.FAILED);
			}

		} catch (XmlRpcException e) {
			throw new GatewayException("Internal Movistar X2M Gateway error: "
					+ e.getMessage());
		}
		return ok;
	}

	@Override
	public float queryBalance() {
		logger.log(Level.WARNING, "Feature not supported");
		return Float.NaN;
	}

	@Override
	public boolean queryCoverage(OutboundMessage msg) {
		logger.log(Level.WARNING, "Feature not supported");
		return false;
	}

	class KeepAlive extends AServiceThread {
		public KeepAlive(String name, Service service, int delay) {
			super(name, service, delay, 0, true);
		}

		@Override
		public void process() throws Exception {
			if (MovistarHTTPGateway.this.sessionId == null)
				return;
			synchronized (MovistarHTTPGateway.this.SYNC_Commander) {
				// ping();
			}
		}
	}

	KeepAlive getKeepAlive() {
		return this.keepAlive;
	}

	void setKeepAlive(KeepAlive keepAlive) {
		this.keepAlive = keepAlive;
	}

}
