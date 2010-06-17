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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Campaign;
import org.teksme.model.teks.InboundMessage;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getCampaign <em>Campaign</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getSList <em>S</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getInMsgList <em>In Msg</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksImpl#getAccountID <em>Account ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeksImpl extends EObjectImpl implements Teks {
	/**
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCampaign() <em>Campaign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaign()
	 * @generated
	 * @ordered
	 */
	protected Campaign campaign;

	/**
	 * The cached value of the '{@link #getSList() <em>S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSList()
	 * @generated
	 * @ordered
	 */
	protected EList<OutboundMessage> s;

	/**
	 * The empty value for the '{@link #getS() <em>S</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected static final OutboundMessage[] S_EEMPTY_ARRAY = new OutboundMessage[0];

	/**
	 * The cached value of the '{@link #getInMsgList() <em>In Msg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMsgList()
	 * @generated
	 * @ordered
	 */
	protected EList<InboundMessage> inMsg;

	/**
	 * The empty value for the '{@link #getInMsg() <em>In Msg</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMsg()
	 * @generated
	 * @ordered
	 */
	protected static final InboundMessage[] IN_MSG_EEMPTY_ARRAY = new InboundMessage[0];

	/**
	 * The default value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountID() <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountID()
	 * @generated
	 * @ordered
	 */
	protected String accountID = ACCOUNT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.TEKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campaign getCampaign() {
		if (campaign != null && campaign.eIsProxy()) {
			InternalEObject oldCampaign = (InternalEObject) campaign;
			campaign = (Campaign) eResolveProxy(oldCampaign);
			if (campaign != oldCampaign) {
				InternalEObject newCampaign = (InternalEObject) campaign;
				NotificationChain msgs = oldCampaign.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__CAMPAIGN,
						null, null);
				if (newCampaign.eInternalContainer() == null) {
					msgs = newCampaign.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.TEKS__CAMPAIGN, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.TEKS__CAMPAIGN, oldCampaign, campaign));
			}
		}
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campaign basicGetCampaign() {
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCampaign(Campaign newCampaign,
			NotificationChain msgs) {
		Campaign oldCampaign = campaign;
		campaign = newCampaign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.TEKS__CAMPAIGN, oldCampaign,
					newCampaign);
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
	public void setCampaign(Campaign newCampaign) {
		if (newCampaign != campaign) {
			NotificationChain msgs = null;
			if (campaign != null)
				msgs = ((InternalEObject) campaign).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__CAMPAIGN,
						null, msgs);
			if (newCampaign != null)
				msgs = ((InternalEObject) newCampaign).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.TEKS__CAMPAIGN,
						null, msgs);
			msgs = basicSetCampaign(newCampaign, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__CAMPAIGN, newCampaign, newCampaign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage[] getS() {
		if (s == null || s.isEmpty())
			return S_EEMPTY_ARRAY;
		BasicEList<OutboundMessage> list = (BasicEList<OutboundMessage>) s;
		list.shrink();
		return (OutboundMessage[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage getS(int index) {
		return getSList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSLength() {
		return s == null ? 0 : s.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(OutboundMessage[] newS) {
		((BasicEList<OutboundMessage>) getSList()).setData(newS.length, newS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(int index, OutboundMessage element) {
		getSList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutboundMessage> getSList() {
		if (s == null) {
			s = new EObjectContainmentEList.Resolving<OutboundMessage>(
					OutboundMessage.class, this, TeksPackage.TEKS__S);
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundMessage[] getInMsg() {
		if (inMsg == null || inMsg.isEmpty())
			return IN_MSG_EEMPTY_ARRAY;
		BasicEList<InboundMessage> list = (BasicEList<InboundMessage>) inMsg;
		list.shrink();
		return (InboundMessage[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundMessage getInMsg(int index) {
		return getInMsgList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInMsgLength() {
		return inMsg == null ? 0 : inMsg.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMsg(InboundMessage[] newInMsg) {
		((BasicEList<InboundMessage>) getInMsgList()).setData(newInMsg.length,
				newInMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMsg(int index, InboundMessage element) {
		getInMsgList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InboundMessage> getInMsgList() {
		if (inMsg == null) {
			inMsg = new EObjectResolvingEList<InboundMessage>(
					InboundMessage.class, this, TeksPackage.TEKS__IN_MSG);
		}
		return inMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountID(String newAccountID) {
		String oldAccountID = accountID;
		accountID = newAccountID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS__ACCOUNT_ID, oldAccountID, accountID));
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
		case TeksPackage.TEKS__CAMPAIGN:
			return basicSetCampaign(null, msgs);
		case TeksPackage.TEKS__S:
			return ((InternalEList<?>) getSList()).basicRemove(otherEnd, msgs);
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
		case TeksPackage.TEKS__APP_ID:
			return getAppId();
		case TeksPackage.TEKS__CAMPAIGN:
			if (resolve)
				return getCampaign();
			return basicGetCampaign();
		case TeksPackage.TEKS__S:
			return getSList();
		case TeksPackage.TEKS__IN_MSG:
			return getInMsgList();
		case TeksPackage.TEKS__ACCOUNT_ID:
			return getAccountID();
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
		case TeksPackage.TEKS__APP_ID:
			setAppId((String) newValue);
			return;
		case TeksPackage.TEKS__CAMPAIGN:
			setCampaign((Campaign) newValue);
			return;
		case TeksPackage.TEKS__S:
			getSList().clear();
			getSList().addAll((Collection<? extends OutboundMessage>) newValue);
			return;
		case TeksPackage.TEKS__IN_MSG:
			getInMsgList().clear();
			getInMsgList().addAll(
					(Collection<? extends InboundMessage>) newValue);
			return;
		case TeksPackage.TEKS__ACCOUNT_ID:
			setAccountID((String) newValue);
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
		case TeksPackage.TEKS__APP_ID:
			setAppId(APP_ID_EDEFAULT);
			return;
		case TeksPackage.TEKS__CAMPAIGN:
			setCampaign((Campaign) null);
			return;
		case TeksPackage.TEKS__S:
			getSList().clear();
			return;
		case TeksPackage.TEKS__IN_MSG:
			getInMsgList().clear();
			return;
		case TeksPackage.TEKS__ACCOUNT_ID:
			setAccountID(ACCOUNT_ID_EDEFAULT);
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
		case TeksPackage.TEKS__APP_ID:
			return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT
					.equals(appId);
		case TeksPackage.TEKS__CAMPAIGN:
			return campaign != null;
		case TeksPackage.TEKS__S:
			return s != null && !s.isEmpty();
		case TeksPackage.TEKS__IN_MSG:
			return inMsg != null && !inMsg.isEmpty();
		case TeksPackage.TEKS__ACCOUNT_ID:
			return ACCOUNT_ID_EDEFAULT == null ? accountID != null
					: !ACCOUNT_ID_EDEFAULT.equals(accountID);
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
		result.append(" (appId: ");
		result.append(appId);
		result.append(", accountID: ");
		result.append(accountID);
		result.append(')');
		return result.toString();
	}

} //TeksImpl
