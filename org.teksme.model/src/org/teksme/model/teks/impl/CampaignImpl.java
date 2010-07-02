/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.teksme.model.teks.Campaign;
import org.teksme.model.teks.Confirmation;
import org.teksme.model.teks.Inquiry;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Campaign</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.teksme.model.teks.impl.CampaignImpl#getInstance <em>Instance
 * </em>}</li>
 * <li>{@link org.teksme.model.teks.impl.CampaignImpl#getResponses <em>Responses
 * </em>}</li>
 * <li>{@link org.teksme.model.teks.impl.CampaignImpl#getConfirmations <em>
 * Confirmations</em>}</li>
 * <li>{@link org.teksme.model.teks.impl.CampaignImpl#getId <em>Id</em>}</li>
 * <li>{@link org.teksme.model.teks.impl.CampaignImpl#getAdvertiseIt <em>
 * Advertise It</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CampaignImpl extends EObjectImpl implements Campaign {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Inquiry instance;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected Response responses;

	/**
	 * The cached value of the '{@link #getConfirmations()
	 * <em>Confirmations</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getConfirmations()
	 * @generated
	 * @ordered
	 */
	protected Confirmation confirmations;

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
	 * The cached value of the '{@link #getAdvertiseIt() <em>Advertise It</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAdvertiseIt()
	 * @generated
	 * @ordered
	 */
	protected OutboundTextMessage advertiseIt;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Inquiry getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject) instance;
			instance = (Inquiry) eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				InternalEObject newInstance = (InternalEObject) instance;
				NotificationChain msgs = oldInstance
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__INSTANCE, null, null);
				if (newInstance.eInternalContainer() == null) {
					msgs = newInstance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.CAMPAIGN__INSTANCE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CAMPAIGN__INSTANCE, oldInstance,
							instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Inquiry basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInstance(Inquiry newInstance,
			NotificationChain msgs) {
		Inquiry oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.CAMPAIGN__INSTANCE,
					oldInstance, newInstance);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInstance(Inquiry newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject) instance)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject) newInstance)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CAMPAIGN__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Response getResponses() {
		if (responses != null && responses.eIsProxy()) {
			InternalEObject oldResponses = (InternalEObject) responses;
			responses = (Response) eResolveProxy(oldResponses);
			if (responses != oldResponses) {
				InternalEObject newResponses = (InternalEObject) responses;
				NotificationChain msgs = oldResponses.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__RESPONSES, null, null);
				if (newResponses.eInternalContainer() == null) {
					msgs = newResponses.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.CAMPAIGN__RESPONSES, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CAMPAIGN__RESPONSES, oldResponses,
							responses));
			}
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Response basicGetResponses() {
		return responses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResponses(Response newResponses,
			NotificationChain msgs) {
		Response oldResponses = responses;
		responses = newResponses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.CAMPAIGN__RESPONSES,
					oldResponses, newResponses);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResponses(Response newResponses) {
		if (newResponses != responses) {
			NotificationChain msgs = null;
			if (responses != null)
				msgs = ((InternalEObject) responses).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__RESPONSES, null, msgs);
			if (newResponses != null)
				msgs = ((InternalEObject) newResponses).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__RESPONSES, null, msgs);
			msgs = basicSetResponses(newResponses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CAMPAIGN__RESPONSES, newResponses, newResponses));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Confirmation getConfirmations() {
		if (confirmations != null && confirmations.eIsProxy()) {
			InternalEObject oldConfirmations = (InternalEObject) confirmations;
			confirmations = (Confirmation) eResolveProxy(oldConfirmations);
			if (confirmations != oldConfirmations) {
				InternalEObject newConfirmations = (InternalEObject) confirmations;
				NotificationChain msgs = oldConfirmations.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__CONFIRMATIONS, null,
						null);
				if (newConfirmations.eInternalContainer() == null) {
					msgs = newConfirmations.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.CAMPAIGN__CONFIRMATIONS,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CAMPAIGN__CONFIRMATIONS,
							oldConfirmations, confirmations));
			}
		}
		return confirmations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Confirmation basicGetConfirmations() {
		return confirmations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetConfirmations(
			Confirmation newConfirmations, NotificationChain msgs) {
		Confirmation oldConfirmations = confirmations;
		confirmations = newConfirmations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.CAMPAIGN__CONFIRMATIONS,
					oldConfirmations, newConfirmations);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConfirmations(Confirmation newConfirmations) {
		if (newConfirmations != confirmations) {
			NotificationChain msgs = null;
			if (confirmations != null)
				msgs = ((InternalEObject) confirmations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__CONFIRMATIONS, null,
						msgs);
			if (newConfirmations != null)
				msgs = ((InternalEObject) newConfirmations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__CONFIRMATIONS, null,
						msgs);
			msgs = basicSetConfirmations(newConfirmations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CAMPAIGN__CONFIRMATIONS, newConfirmations,
					newConfirmations));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CAMPAIGN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutboundTextMessage getAdvertiseIt() {
		if (advertiseIt != null && advertiseIt.eIsProxy()) {
			InternalEObject oldAdvertiseIt = (InternalEObject) advertiseIt;
			advertiseIt = (OutboundTextMessage) eResolveProxy(oldAdvertiseIt);
			if (advertiseIt != oldAdvertiseIt) {
				InternalEObject newAdvertiseIt = (InternalEObject) advertiseIt;
				NotificationChain msgs = oldAdvertiseIt.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__ADVERTISE_IT, null,
						null);
				if (newAdvertiseIt.eInternalContainer() == null) {
					msgs = newAdvertiseIt.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.CAMPAIGN__ADVERTISE_IT, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.CAMPAIGN__ADVERTISE_IT, oldAdvertiseIt,
							advertiseIt));
			}
		}
		return advertiseIt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OutboundTextMessage basicGetAdvertiseIt() {
		return advertiseIt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAdvertiseIt(
			OutboundTextMessage newAdvertiseIt, NotificationChain msgs) {
		OutboundTextMessage oldAdvertiseIt = advertiseIt;
		advertiseIt = newAdvertiseIt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.CAMPAIGN__ADVERTISE_IT,
					oldAdvertiseIt, newAdvertiseIt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAdvertiseIt(OutboundTextMessage newAdvertiseIt) {
		if (newAdvertiseIt != advertiseIt) {
			NotificationChain msgs = null;
			if (advertiseIt != null)
				msgs = ((InternalEObject) advertiseIt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__ADVERTISE_IT, null,
						msgs);
			if (newAdvertiseIt != null)
				msgs = ((InternalEObject) newAdvertiseIt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.CAMPAIGN__ADVERTISE_IT, null,
						msgs);
			msgs = basicSetAdvertiseIt(newAdvertiseIt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CAMPAIGN__ADVERTISE_IT, newAdvertiseIt,
					newAdvertiseIt));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.CAMPAIGN__INSTANCE:
			return basicSetInstance(null, msgs);
		case TeksPackage.CAMPAIGN__RESPONSES:
			return basicSetResponses(null, msgs);
		case TeksPackage.CAMPAIGN__CONFIRMATIONS:
			return basicSetConfirmations(null, msgs);
		case TeksPackage.CAMPAIGN__ADVERTISE_IT:
			return basicSetAdvertiseIt(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.CAMPAIGN__INSTANCE:
			if (resolve)
				return getInstance();
			return basicGetInstance();
		case TeksPackage.CAMPAIGN__RESPONSES:
			if (resolve)
				return getResponses();
			return basicGetResponses();
		case TeksPackage.CAMPAIGN__CONFIRMATIONS:
			if (resolve)
				return getConfirmations();
			return basicGetConfirmations();
		case TeksPackage.CAMPAIGN__ID:
			return getId();
		case TeksPackage.CAMPAIGN__ADVERTISE_IT:
			if (resolve)
				return getAdvertiseIt();
			return basicGetAdvertiseIt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.CAMPAIGN__INSTANCE:
			setInstance((Inquiry) newValue);
			return;
		case TeksPackage.CAMPAIGN__RESPONSES:
			setResponses((Response) newValue);
			return;
		case TeksPackage.CAMPAIGN__CONFIRMATIONS:
			setConfirmations((Confirmation) newValue);
			return;
		case TeksPackage.CAMPAIGN__ID:
			setId((String) newValue);
			return;
		case TeksPackage.CAMPAIGN__ADVERTISE_IT:
			setAdvertiseIt((OutboundTextMessage) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TeksPackage.CAMPAIGN__INSTANCE:
			setInstance((Inquiry) null);
			return;
		case TeksPackage.CAMPAIGN__RESPONSES:
			setResponses((Response) null);
			return;
		case TeksPackage.CAMPAIGN__CONFIRMATIONS:
			setConfirmations((Confirmation) null);
			return;
		case TeksPackage.CAMPAIGN__ID:
			setId(ID_EDEFAULT);
			return;
		case TeksPackage.CAMPAIGN__ADVERTISE_IT:
			setAdvertiseIt((OutboundTextMessage) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TeksPackage.CAMPAIGN__INSTANCE:
			return instance != null;
		case TeksPackage.CAMPAIGN__RESPONSES:
			return responses != null;
		case TeksPackage.CAMPAIGN__CONFIRMATIONS:
			return confirmations != null;
		case TeksPackage.CAMPAIGN__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case TeksPackage.CAMPAIGN__ADVERTISE_IT:
			return advertiseIt != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // CampaignImpl
