/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Confirmation;
import org.teksme.model.teks.CustomOutboundMessage;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confirmation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ConfirmationImpl#getAutoReply <em>Auto Reply</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfirmationImpl#getConfirmationList <em>Confirmation</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfirmationImpl#getCustomReply <em>Custom Reply</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ConfirmationImpl#getResponseRef <em>Response Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfirmationImpl extends TeksElementImpl implements Confirmation {
	/**
	 * The cached value of the '{@link #getAutoReply() <em>Auto Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoReply()
	 * @generated
	 * @ordered
	 */
	protected OutboundMessage autoReply;

	/**
	 * The cached value of the '{@link #getConfirmationList() <em>Confirmation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmationList()
	 * @generated
	 * @ordered
	 */
	protected EList<Confirmation> confirmation;

	/**
	 * The empty value for the '{@link #getConfirmation() <em>Confirmation</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final Confirmation[] CONFIRMATION_EEMPTY_ARRAY = new Confirmation[0];

	/**
	 * The cached value of the '{@link #getCustomReply() <em>Custom Reply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomReply()
	 * @generated
	 * @ordered
	 */
	protected CustomOutboundMessage customReply;

	/**
	 * The cached value of the '{@link #getResponseRef() <em>Response Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseRef()
	 * @generated
	 * @ordered
	 */
	protected Response responseRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfirmationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.CONFIRMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage getAutoReply() {
		if (autoReply != null && autoReply.eIsProxy()) {
			InternalEObject oldAutoReply = (InternalEObject) autoReply;
			autoReply = (OutboundMessage) eResolveProxy(oldAutoReply);
			if (autoReply != oldAutoReply) {
				InternalEObject newAutoReply = (InternalEObject) autoReply;
				NotificationChain msgs = oldAutoReply.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CONFIRMATION__AUTO_REPLY, null,
						null);
				if (newAutoReply.eInternalContainer() == null) {
					msgs = newAutoReply.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.CONFIRMATION__AUTO_REPLY,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CONFIRMATION__AUTO_REPLY, oldAutoReply,
							autoReply));
			}
		}
		return autoReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage basicGetAutoReply() {
		return autoReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoReply(OutboundMessage newAutoReply,
			NotificationChain msgs) {
		OutboundMessage oldAutoReply = autoReply;
		autoReply = newAutoReply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.CONFIRMATION__AUTO_REPLY,
					oldAutoReply, newAutoReply);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoReply(OutboundMessage newAutoReply) {
		if (newAutoReply != autoReply) {
			NotificationChain msgs = null;
			if (autoReply != null)
				msgs = ((InternalEObject) autoReply).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CONFIRMATION__AUTO_REPLY, null,
						msgs);
			if (newAutoReply != null)
				msgs = ((InternalEObject) newAutoReply).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CONFIRMATION__AUTO_REPLY, null,
						msgs);
			msgs = basicSetAutoReply(newAutoReply, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CONFIRMATION__AUTO_REPLY, newAutoReply,
					newAutoReply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confirmation[] getConfirmation() {
		if (confirmation == null || confirmation.isEmpty())
			return CONFIRMATION_EEMPTY_ARRAY;
		BasicEList<Confirmation> list = (BasicEList<Confirmation>) confirmation;
		list.shrink();
		return (Confirmation[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confirmation getConfirmation(int index) {
		return getConfirmationList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConfirmationLength() {
		return confirmation == null ? 0 : confirmation.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmation(Confirmation[] newConfirmation) {
		((BasicEList<Confirmation>) getConfirmationList()).setData(
				newConfirmation.length, newConfirmation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmation(int index, Confirmation element) {
		getConfirmationList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Confirmation> getConfirmationList() {
		if (confirmation == null) {
			confirmation = new EObjectContainmentEList.Resolving<Confirmation>(
					Confirmation.class, this,
					TeksPackage.CONFIRMATION__CONFIRMATION);
		}
		return confirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomOutboundMessage getCustomReply() {
		if (customReply != null && customReply.eIsProxy()) {
			InternalEObject oldCustomReply = (InternalEObject) customReply;
			customReply = (CustomOutboundMessage) eResolveProxy(oldCustomReply);
			if (customReply != oldCustomReply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CONFIRMATION__CUSTOM_REPLY,
							oldCustomReply, customReply));
			}
		}
		return customReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomOutboundMessage basicGetCustomReply() {
		return customReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomReply(CustomOutboundMessage newCustomReply) {
		CustomOutboundMessage oldCustomReply = customReply;
		customReply = newCustomReply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CONFIRMATION__CUSTOM_REPLY, oldCustomReply,
					customReply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response getResponseRef() {
		if (responseRef != null && responseRef.eIsProxy()) {
			InternalEObject oldResponseRef = (InternalEObject) responseRef;
			responseRef = (Response) eResolveProxy(oldResponseRef);
			if (responseRef != oldResponseRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CONFIRMATION__RESPONSE_REF,
							oldResponseRef, responseRef));
			}
		}
		return responseRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response basicGetResponseRef() {
		return responseRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseRef(Response newResponseRef) {
		Response oldResponseRef = responseRef;
		responseRef = newResponseRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CONFIRMATION__RESPONSE_REF, oldResponseRef,
					responseRef));
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
		case TeksPackage.CONFIRMATION__AUTO_REPLY:
			return basicSetAutoReply(null, msgs);
		case TeksPackage.CONFIRMATION__CONFIRMATION:
			return ((InternalEList<?>) getConfirmationList()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.CONFIRMATION__AUTO_REPLY:
			if (resolve)
				return getAutoReply();
			return basicGetAutoReply();
		case TeksPackage.CONFIRMATION__CONFIRMATION:
			return getConfirmationList();
		case TeksPackage.CONFIRMATION__CUSTOM_REPLY:
			if (resolve)
				return getCustomReply();
			return basicGetCustomReply();
		case TeksPackage.CONFIRMATION__RESPONSE_REF:
			if (resolve)
				return getResponseRef();
			return basicGetResponseRef();
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
		case TeksPackage.CONFIRMATION__AUTO_REPLY:
			setAutoReply((OutboundMessage) newValue);
			return;
		case TeksPackage.CONFIRMATION__CONFIRMATION:
			getConfirmationList().clear();
			getConfirmationList().addAll(
					(Collection<? extends Confirmation>) newValue);
			return;
		case TeksPackage.CONFIRMATION__CUSTOM_REPLY:
			setCustomReply((CustomOutboundMessage) newValue);
			return;
		case TeksPackage.CONFIRMATION__RESPONSE_REF:
			setResponseRef((Response) newValue);
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
		case TeksPackage.CONFIRMATION__AUTO_REPLY:
			setAutoReply((OutboundMessage) null);
			return;
		case TeksPackage.CONFIRMATION__CONFIRMATION:
			getConfirmationList().clear();
			return;
		case TeksPackage.CONFIRMATION__CUSTOM_REPLY:
			setCustomReply((CustomOutboundMessage) null);
			return;
		case TeksPackage.CONFIRMATION__RESPONSE_REF:
			setResponseRef((Response) null);
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
		case TeksPackage.CONFIRMATION__AUTO_REPLY:
			return autoReply != null;
		case TeksPackage.CONFIRMATION__CONFIRMATION:
			return confirmation != null && !confirmation.isEmpty();
		case TeksPackage.CONFIRMATION__CUSTOM_REPLY:
			return customReply != null;
		case TeksPackage.CONFIRMATION__RESPONSE_REF:
			return responseRef != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfirmationImpl
