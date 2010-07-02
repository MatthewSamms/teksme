/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.teksme.model.teks.Message;
import org.teksme.model.teks.MessageType;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getTextMessage <em>Text Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getTypeList <em>Type</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getHeaderData <em>Header Data</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getToList <em>To</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getApiId <em>Api Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The default value of the '{@link #getTextMessage() <em>Text Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextMessage() <em>Text Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMessage()
	 * @generated
	 * @ordered
	 */
	protected String textMessage = TEXT_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeList() <em>Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeList()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> type;

	/**
	 * The empty value for the '{@link #getType() <em>Type</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageType[] TYPE_EEMPTY_ARRAY = new MessageType[0];

	/**
	 * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected String gateway = GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected String charset = CHARSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderData() <em>Header Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderData()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderData() <em>Header Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderData()
	 * @generated
	 * @ordered
	 */
	protected String headerData = HEADER_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToList() <em>To</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> to;

	/**
	 * The empty value for the '{@link #getTo() <em>To</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String[] TO_EEMPTY_ARRAY = new String[0];

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiId() <em>Api Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiId()
	 * @generated
	 * @ordered
	 */
	protected static final String API_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiId() <em>Api Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiId()
	 * @generated
	 * @ordered
	 */
	protected String apiId = API_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextMessage() {
		return textMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextMessage(String newTextMessage) {
		String oldTextMessage = textMessage;
		textMessage = newTextMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__TEXT_MESSAGE, oldTextMessage,
					textMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType[] getType() {
		if (type == null || type.isEmpty())
			return TYPE_EEMPTY_ARRAY;
		BasicEList<MessageType> list = (BasicEList<MessageType>) type;
		list.shrink();
		return (MessageType[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getType(int index) {
		return getTypeList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTypeLength() {
		return type == null ? 0 : type.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MessageType[] newType) {
		((BasicEList<MessageType>) getTypeList()).setData(newType.length,
				newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(int index, MessageType element) {
		getTypeList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getTypeList() {
		if (type == null) {
			type = new EDataTypeUniqueEList<MessageType>(MessageType.class,
					this, TeksPackage.MESSAGE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(String newGateway) {
		String oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharset() {
		return charset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharset(String newCharset) {
		String oldCharset = charset;
		charset = newCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__CHARSET, oldCharset, charset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderData() {
		return headerData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderData(String newHeaderData) {
		String oldHeaderData = headerData;
		headerData = newHeaderData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__HEADER_DATA, oldHeaderData, headerData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getTo() {
		if (to == null || to.isEmpty())
			return TO_EEMPTY_ARRAY;
		BasicEList<String> list = (BasicEList<String>) to;
		list.shrink();
		return (String[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo(int index) {
		return getToList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getToLength() {
		return to == null ? 0 : to.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String[] newTo) {
		((BasicEList<String>) getToList()).setData(newTo.length, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(int index, String element) {
		getToList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getToList() {
		if (to == null) {
			to = new EDataTypeUniqueEList<String>(String.class, this,
					TeksPackage.MESSAGE__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiId() {
		return apiId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiId(String newApiId) {
		String oldApiId = apiId;
		apiId = newApiId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__API_ID, oldApiId, apiId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			return getTextMessage();
		case TeksPackage.MESSAGE__TIMESTAMP:
			return getTimestamp();
		case TeksPackage.MESSAGE__ID:
			return getId();
		case TeksPackage.MESSAGE__TYPE:
			return getTypeList();
		case TeksPackage.MESSAGE__GATEWAY:
			return getGateway();
		case TeksPackage.MESSAGE__CHARSET:
			return getCharset();
		case TeksPackage.MESSAGE__HEADER_DATA:
			return getHeaderData();
		case TeksPackage.MESSAGE__FROM:
			return getFrom();
		case TeksPackage.MESSAGE__TO:
			return getToList();
		case TeksPackage.MESSAGE__USERNAME:
			return getUsername();
		case TeksPackage.MESSAGE__PASSWORD:
			return getPassword();
		case TeksPackage.MESSAGE__API_ID:
			return getApiId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			setTextMessage((String) newValue);
			return;
		case TeksPackage.MESSAGE__TIMESTAMP:
			setTimestamp((Date) newValue);
			return;
		case TeksPackage.MESSAGE__ID:
			setId((String) newValue);
			return;
		case TeksPackage.MESSAGE__TYPE:
			getTypeList().clear();
			getTypeList().addAll((Collection<? extends MessageType>) newValue);
			return;
		case TeksPackage.MESSAGE__GATEWAY:
			setGateway((String) newValue);
			return;
		case TeksPackage.MESSAGE__CHARSET:
			setCharset((String) newValue);
			return;
		case TeksPackage.MESSAGE__HEADER_DATA:
			setHeaderData((String) newValue);
			return;
		case TeksPackage.MESSAGE__FROM:
			setFrom((String) newValue);
			return;
		case TeksPackage.MESSAGE__TO:
			getToList().clear();
			getToList().addAll((Collection<? extends String>) newValue);
			return;
		case TeksPackage.MESSAGE__USERNAME:
			setUsername((String) newValue);
			return;
		case TeksPackage.MESSAGE__PASSWORD:
			setPassword((String) newValue);
			return;
		case TeksPackage.MESSAGE__API_ID:
			setApiId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			setTextMessage(TEXT_MESSAGE_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__ID:
			setId(ID_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__TYPE:
			getTypeList().clear();
			return;
		case TeksPackage.MESSAGE__GATEWAY:
			setGateway(GATEWAY_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__CHARSET:
			setCharset(CHARSET_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__HEADER_DATA:
			setHeaderData(HEADER_DATA_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__TO:
			getToList().clear();
			return;
		case TeksPackage.MESSAGE__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__API_ID:
			setApiId(API_ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			return TEXT_MESSAGE_EDEFAULT == null ? textMessage != null
					: !TEXT_MESSAGE_EDEFAULT.equals(textMessage);
		case TeksPackage.MESSAGE__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null
					: !TIMESTAMP_EDEFAULT.equals(timestamp);
		case TeksPackage.MESSAGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TeksPackage.MESSAGE__TYPE:
			return type != null && !type.isEmpty();
		case TeksPackage.MESSAGE__GATEWAY:
			return GATEWAY_EDEFAULT == null ? gateway != null
					: !GATEWAY_EDEFAULT.equals(gateway);
		case TeksPackage.MESSAGE__CHARSET:
			return CHARSET_EDEFAULT == null ? charset != null
					: !CHARSET_EDEFAULT.equals(charset);
		case TeksPackage.MESSAGE__HEADER_DATA:
			return HEADER_DATA_EDEFAULT == null ? headerData != null
					: !HEADER_DATA_EDEFAULT.equals(headerData);
		case TeksPackage.MESSAGE__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT
					.equals(from);
		case TeksPackage.MESSAGE__TO:
			return to != null && !to.isEmpty();
		case TeksPackage.MESSAGE__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null
					: !USERNAME_EDEFAULT.equals(username);
		case TeksPackage.MESSAGE__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null
					: !PASSWORD_EDEFAULT.equals(password);
		case TeksPackage.MESSAGE__API_ID:
			return API_ID_EDEFAULT == null ? apiId != null : !API_ID_EDEFAULT
					.equals(apiId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (textMessage: ");
		result.append(textMessage);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(", charset: ");
		result.append(charset);
		result.append(", headerData: ");
		result.append(headerData);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", apiId: ");
		result.append(apiId);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
