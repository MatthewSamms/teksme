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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Message;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.TextMessage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getGatewayId <em>Gateway Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getMessageCharCount <em>Message Char Count</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getTextMessage <em>Text Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunicationChannelList() <em>Communication Channel</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationChannelList()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelKind> communicationChannel;

	/**
	 * The empty value for the '{@link #getCommunicationChannel() <em>Communication Channel</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationChannel()
	 * @generated
	 * @ordered
	 */
	protected static final ChannelKind[] COMMUNICATION_CHANNEL_EEMPTY_ARRAY = new ChannelKind[0];

	/**
	 * The default value of the '{@link #getGatewayId() <em>Gateway Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGatewayId()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayId() <em>Gateway Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGatewayId()
	 * @generated
	 * @ordered
	 */
	protected String gatewayId = GATEWAY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageCharCount() <em>Message Char Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMessageCharCount()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_CHAR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageCharCount() <em>Message Char Count</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMessageCharCount()
	 * @generated
	 * @ordered
	 */
	protected String messageCharCount = MESSAGE_CHAR_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextMessage() <em>Text Message</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTextMessage()
	 * @generated
	 * @ordered
	 */
	protected TextMessage textMessage;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind[] getCommunicationChannel() {
		if (communicationChannel == null || communicationChannel.isEmpty())
			return COMMUNICATION_CHANNEL_EEMPTY_ARRAY;
		BasicEList<ChannelKind> list = (BasicEList<ChannelKind>) communicationChannel;
		list.shrink();
		return (ChannelKind[]) list.data();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind getCommunicationChannel(int index) {
		return getCommunicationChannelList().get(index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommunicationChannelLength() {
		return communicationChannel == null ? 0 : communicationChannel.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationChannel(ChannelKind[] newCommunicationChannel) {
		((BasicEList<ChannelKind>) getCommunicationChannelList()).setData(
				newCommunicationChannel.length, newCommunicationChannel);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationChannel(int index, ChannelKind element) {
		getCommunicationChannelList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelKind> getCommunicationChannelList() {
		if (communicationChannel == null) {
			communicationChannel = new EDataTypeUniqueEList<ChannelKind>(
					ChannelKind.class, this,
					TeksPackage.MESSAGE__COMMUNICATION_CHANNEL);
		}
		return communicationChannel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getGatewayId() {
		return gatewayId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatewayId(String newGatewayId) {
		String oldGatewayId = gatewayId;
		gatewayId = newGatewayId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__GATEWAY_ID, oldGatewayId, gatewayId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageCharCount() {
		return messageCharCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageCharCount(String newMessageCharCount) {
		String oldMessageCharCount = messageCharCount;
		messageCharCount = newMessageCharCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__MESSAGE_CHAR_COUNT,
					oldMessageCharCount, messageCharCount));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TextMessage getTextMessage() {
		if (textMessage != null && textMessage.eIsProxy()) {
			InternalEObject oldTextMessage = (InternalEObject) textMessage;
			textMessage = (TextMessage) eResolveProxy(oldTextMessage);
			if (textMessage != oldTextMessage) {
				InternalEObject newTextMessage = (InternalEObject) textMessage;
				NotificationChain msgs = oldTextMessage
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TeksPackage.MESSAGE__TEXT_MESSAGE, null, null);
				if (newTextMessage.eInternalContainer() == null) {
					msgs = newTextMessage.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.MESSAGE__TEXT_MESSAGE, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.MESSAGE__TEXT_MESSAGE, oldTextMessage,
							textMessage));
			}
		}
		return textMessage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TextMessage basicGetTextMessage() {
		return textMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextMessage(TextMessage newTextMessage,
			NotificationChain msgs) {
		TextMessage oldTextMessage = textMessage;
		textMessage = newTextMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.MESSAGE__TEXT_MESSAGE,
					oldTextMessage, newTextMessage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextMessage(TextMessage newTextMessage) {
		if (newTextMessage != textMessage) {
			NotificationChain msgs = null;
			if (textMessage != null)
				msgs = ((InternalEObject) textMessage)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TeksPackage.MESSAGE__TEXT_MESSAGE, null, msgs);
			if (newTextMessage != null)
				msgs = ((InternalEObject) newTextMessage)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- TeksPackage.MESSAGE__TEXT_MESSAGE, null, msgs);
			msgs = basicSetTextMessage(newTextMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__TEXT_MESSAGE, newTextMessage,
					newTextMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			return basicSetTextMessage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.MESSAGE__ID:
			return getId();
		case TeksPackage.MESSAGE__TIMESTAMP:
			return getTimestamp();
		case TeksPackage.MESSAGE__ENCODING:
			return getEncoding();
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			return getCommunicationChannelList();
		case TeksPackage.MESSAGE__GATEWAY_ID:
			return getGatewayId();
		case TeksPackage.MESSAGE__MESSAGE_CHAR_COUNT:
			return getMessageCharCount();
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			if (resolve)
				return getTextMessage();
			return basicGetTextMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.MESSAGE__ID:
			setId((String) newValue);
			return;
		case TeksPackage.MESSAGE__TIMESTAMP:
			setTimestamp((Date) newValue);
			return;
		case TeksPackage.MESSAGE__ENCODING:
			setEncoding((String) newValue);
			return;
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			getCommunicationChannelList().addAll(
					(Collection<? extends ChannelKind>) newValue);
			return;
		case TeksPackage.MESSAGE__GATEWAY_ID:
			setGatewayId((String) newValue);
			return;
		case TeksPackage.MESSAGE__MESSAGE_CHAR_COUNT:
			setMessageCharCount((String) newValue);
			return;
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			setTextMessage((TextMessage) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TeksPackage.MESSAGE__ID:
			setId(ID_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__ENCODING:
			setEncoding(ENCODING_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			return;
		case TeksPackage.MESSAGE__GATEWAY_ID:
			setGatewayId(GATEWAY_ID_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__MESSAGE_CHAR_COUNT:
			setMessageCharCount(MESSAGE_CHAR_COUNT_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			setTextMessage((TextMessage) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TeksPackage.MESSAGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TeksPackage.MESSAGE__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null
					: !TIMESTAMP_EDEFAULT.equals(timestamp);
		case TeksPackage.MESSAGE__ENCODING:
			return ENCODING_EDEFAULT == null ? encoding != null
					: !ENCODING_EDEFAULT.equals(encoding);
		case TeksPackage.MESSAGE__COMMUNICATION_CHANNEL:
			return communicationChannel != null
					&& !communicationChannel.isEmpty();
		case TeksPackage.MESSAGE__GATEWAY_ID:
			return GATEWAY_ID_EDEFAULT == null ? gatewayId != null
					: !GATEWAY_ID_EDEFAULT.equals(gatewayId);
		case TeksPackage.MESSAGE__MESSAGE_CHAR_COUNT:
			return MESSAGE_CHAR_COUNT_EDEFAULT == null ? messageCharCount != null
					: !MESSAGE_CHAR_COUNT_EDEFAULT.equals(messageCharCount);
		case TeksPackage.MESSAGE__TEXT_MESSAGE:
			return textMessage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", communicationChannel: ");
		result.append(communicationChannel);
		result.append(", gatewayId: ");
		result.append(gatewayId);
		result.append(", messageCharCount: ");
		result.append(messageCharCount);
		result.append(')');
		return result.toString();
	}

} // MessageImpl
