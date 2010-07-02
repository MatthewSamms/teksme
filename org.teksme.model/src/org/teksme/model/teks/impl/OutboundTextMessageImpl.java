/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outbound Text Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.OutboundTextMessageImpl#getMessageHandler <em>Message Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutboundTextMessageImpl extends MessageImpl implements
		OutboundTextMessage {
	/**
	 * The default value of the '{@link #getMessageHandler() <em>Message Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageHandler() <em>Message Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHandler()
	 * @generated
	 * @ordered
	 */
	protected String messageHandler = MESSAGE_HANDLER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutboundTextMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.OUTBOUND_TEXT_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageHandler() {
		return messageHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageHandler(String newMessageHandler) {
		String oldMessageHandler = messageHandler;
		messageHandler = newMessageHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_HANDLER,
					oldMessageHandler, messageHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_HANDLER:
			return getMessageHandler();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_HANDLER:
			setMessageHandler((String) newValue);
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
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_HANDLER:
			setMessageHandler(MESSAGE_HANDLER_EDEFAULT);
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
		case TeksPackage.OUTBOUND_TEXT_MESSAGE__MESSAGE_HANDLER:
			return MESSAGE_HANDLER_EDEFAULT == null ? messageHandler != null
					: !MESSAGE_HANDLER_EDEFAULT.equals(messageHandler);
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
		result.append(" (messageHandler: ");
		result.append(messageHandler);
		result.append(')');
		return result.toString();
	}

} //OutboundTextMessageImpl
