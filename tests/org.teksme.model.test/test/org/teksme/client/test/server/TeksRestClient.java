package org.teksme.client.test.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.teksme.model.teks.Response;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.impl.TeksPackageImpl;
import org.teksme.server.identity.util.BASE64Encoder;

public class TeksRestClient {

	// private String endpointURL = "http://api.teks.me/p/";
	private String baseURL = "http://localhost:8080";
	private String accountSid;
	private String profileId;

	private String authSecretKey;

	public TeksRestClient(String accountSid, String authSecretKey,
			String profileId, String endpointURL) {

		this.accountSid = accountSid;
		this.authSecretKey = authSecretKey;
		this.profileId = profileId;
		if (null != endpointURL && !"".equals(endpointURL)) {
			this.baseURL = endpointURL;
		}

	}

	public Response request(String path, String method, Map<String, String> vars)
			throws TeksRestException {

		String encoded = "";
		if (vars != null) {
			for (String key : vars.keySet()) {
				try {
					encoded += "&" + key + "="
							+ URLEncoder.encode(vars.get(key), "UTF-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
			encoded = encoded.substring(1);
		}

		String url = this.baseURL + path;

		if (method.toUpperCase().equals("GET"))
			url += ((path.indexOf('?') == -1) ? "?" : "&") + encoded;

		try {

			URL urlLogin = new URL(
					"http://localhost:8080/auth?oauth_consumer_key="+accountSid);

			HttpURLConnection httpConn = (HttpURLConnection) urlLogin
					.openConnection();

			BASE64Encoder encoder = new BASE64Encoder();

			String fmt = "EEE, dd MMM yyyy HH:mm:ss ";
			SimpleDateFormat df = new SimpleDateFormat(fmt, Locale.US);
			df.setTimeZone(TimeZone.getTimeZone("GMT"));

			String date = df.format(new Date()) + "GMT";

			String signingKey = accountSid + ":" + authSecretKey;
			String encodedCredential = encoder.encode(signingKey
					.getBytes("UTF8"));

			httpConn.setRequestProperty("Authorization", "Basic "
					+ encodedCredential);

			BufferedReader rd = new BufferedReader(new InputStreamReader(
					httpConn.getInputStream()));
			String liner = rd.readLine();
			String token = liner.split("=")[1];

			System.out.println("Return after login authentication: " + token);

			URL resturl = new URL(url.concat("&oauth_token="+token));

			System.out.println("Send message URL: "+url.concat("?oauth_token="+token));
			
			httpConn = (HttpURLConnection) resturl.openConnection();

			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);
			httpConn.setUseCaches(false);
			httpConn.setDefaultUseCaches(false);
			httpConn.setAllowUserInteraction(true);
			httpConn.setRequestProperty("Date", date);
			httpConn.setRequestProperty("Content-Length", "0");
			httpConn.setRequestProperty("oauth_token", token);

			// initialize a new curl object
			if (method.toUpperCase().equals("GET")) {
				httpConn.setRequestMethod("GET");
			} else if (method.toUpperCase().equals("POST")) {
				httpConn.setRequestMethod("POST");
				OutputStreamWriter out = new OutputStreamWriter(
						httpConn.getOutputStream());
				out.write(encoded);
				out.close();
			} else if (method.toUpperCase().equals("PUT")) {
				httpConn.setRequestMethod("PUT");
				OutputStreamWriter out = new OutputStreamWriter(
						httpConn.getOutputStream());
				out.write(encoded);
				out.close();
			} else if (method.toUpperCase().equals("DELETE")) {
				httpConn.setRequestMethod("DELETE");
			} else {
				throw new TeksRestException("Unknown method " + method);
			}

			BufferedReader in = null;
			try {
				if (httpConn.getInputStream() != null) {
					in = new BufferedReader(new InputStreamReader(
							httpConn.getInputStream()));
				}
			} catch (IOException e) {
				if (httpConn.getErrorStream() != null) {
					in = new BufferedReader(new InputStreamReader(
							httpConn.getErrorStream()));
				}
			}

			if (in == null) {
				throw new TeksRestException(
						"Unable to read response from server");
			}

			StringBuffer decodedString = new StringBuffer();
			String line;
			while ((line = in.readLine()) != null) {
				decodedString.append(line);
			}
			in.close();

			// get result code
			int responseCode = httpConn.getResponseCode();

			TeksPackageImpl.init();
			// Retrieve the default factory singleton
			TeksFactory factory = TeksFactory.eINSTANCE;

			Response response = factory.createResponse();

			String message = decodedString.toString();

			System.out.println("Response code: " + responseCode);
			System.out.println("Message: " + message);

			// org.teksme.model.teks.Error error = factory.createError();
			// error.setStatus(responseCode);
			// error.setCode(new Integer(message.split("::")[0]));
			// error.setMessage(message.split("::")[1]);
			// error.setUrl(url);
			// response.setError(error);

			return response;

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public String getAccountSid() {
		return accountSid;
	}

	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

}
