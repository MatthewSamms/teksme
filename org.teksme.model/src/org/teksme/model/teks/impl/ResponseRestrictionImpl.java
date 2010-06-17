/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.teksme.model.teks.Inquiry;
import org.teksme.model.teks.ResponseRestriction;
import org.teksme.model.teks.RestrictionKind;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#isAcceptMultipleChannels <em>Accept Multiple Channels</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#getRestrictionType <em>Restriction Type</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#getOwnedInquiry <em>Owned Inquiry</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#isBlockRepeat <em>Block Repeat</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#isModerateFirst <em>Moderate First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseRestrictionImpl extends EObjectImpl implements
		ResponseRestriction {
	/**
	 * The default value of the '{@link #isAcceptMultipleChannels() <em>Accept Multiple Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptMultipleChannels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCEPT_MULTIPLE_CHANNELS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAcceptMultipleChannels() <em>Accept Multiple Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAcceptMultipleChannels()
	 * @generated
	 * @ordered
	 */
	protected boolean acceptMultipleChannels = ACCEPT_MULTIPLE_CHANNELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestrictionType() <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionType()
	 * @generated
	 * @ordered
	 */
	protected static final RestrictionKind RESTRICTION_TYPE_EDEFAULT = RestrictionKind.EVERYONE;

	/**
	 * The cached value of the '{@link #getRestrictionType() <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionType()
	 * @generated
	 * @ordered
	 */
	protected RestrictionKind restrictionType = RESTRICTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean anonymous = ANONYMOUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedInquiry() <em>Owned Inquiry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInquiry()
	 * @generated
	 * @ordered
	 */
	protected Inquiry ownedInquiry;

	/**
	 * The default value of the '{@link #isBlockRepeat() <em>Block Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCK_REPEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlockRepeat() <em>Block Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockRepeat()
	 * @generated
	 * @ordered
	 */
	protected boolean blockRepeat = BLOCK_REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isModerateFirst() <em>Moderate First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModerateFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODERATE_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModerateFirst() <em>Moderate First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModerateFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean moderateFirst = MODERATE_FIRST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.RESPONSE_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAcceptMultipleChannels() {
		return acceptMultipleChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptMultipleChannels(boolean newAcceptMultipleChannels) {
		boolean oldAcceptMultipleChannels = acceptMultipleChannels;
		acceptMultipleChannels = newAcceptMultipleChannels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS,
					oldAcceptMultipleChannels, acceptMultipleChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionKind getRestrictionType() {
		return restrictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionType(RestrictionKind newRestrictionType) {
		RestrictionKind oldRestrictionType = restrictionType;
		restrictionType = newRestrictionType == null ? RESTRICTION_TYPE_EDEFAULT
				: newRestrictionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE,
					oldRestrictionType, restrictionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnonymous() {
		return anonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnonymous(boolean newAnonymous) {
		boolean oldAnonymous = anonymous;
		anonymous = newAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_RESTRICTION__ANONYMOUS, oldAnonymous,
					anonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inquiry getOwnedInquiry() {
		if (ownedInquiry != null && ownedInquiry.eIsProxy()) {
			InternalEObject oldOwnedInquiry = (InternalEObject) ownedInquiry;
			ownedInquiry = (Inquiry) eResolveProxy(oldOwnedInquiry);
			if (ownedInquiry != oldOwnedInquiry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.RESPONSE_RESTRICTION__OWNED_INQUIRY,
							oldOwnedInquiry, ownedInquiry));
			}
		}
		return ownedInquiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inquiry basicGetOwnedInquiry() {
		return ownedInquiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedInquiry(Inquiry newOwnedInquiry) {
		Inquiry oldOwnedInquiry = ownedInquiry;
		ownedInquiry = newOwnedInquiry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_RESTRICTION__OWNED_INQUIRY,
					oldOwnedInquiry, ownedInquiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlockRepeat() {
		return blockRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockRepeat(boolean newBlockRepeat) {
		boolean oldBlockRepeat = blockRepeat;
		blockRepeat = newBlockRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_RESTRICTION__BLOCK_REPEAT,
					oldBlockRepeat, blockRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModerateFirst() {
		return moderateFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModerateFirst(boolean newModerateFirst) {
		boolean oldModerateFirst = moderateFirst;
		moderateFirst = newModerateFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.RESPONSE_RESTRICTION__MODERATE_FIRST,
					oldModerateFirst, moderateFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS:
			return isAcceptMultipleChannels();
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			return getRestrictionType();
		case TeksPackage.RESPONSE_RESTRICTION__ANONYMOUS:
			return isAnonymous();
		case TeksPackage.RESPONSE_RESTRICTION__OWNED_INQUIRY:
			if (resolve)
				return getOwnedInquiry();
			return basicGetOwnedInquiry();
		case TeksPackage.RESPONSE_RESTRICTION__BLOCK_REPEAT:
			return isBlockRepeat();
		case TeksPackage.RESPONSE_RESTRICTION__MODERATE_FIRST:
			return isModerateFirst();
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
		case TeksPackage.RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS:
			setAcceptMultipleChannels((Boolean) newValue);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			setRestrictionType((RestrictionKind) newValue);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__ANONYMOUS:
			setAnonymous((Boolean) newValue);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__OWNED_INQUIRY:
			setOwnedInquiry((Inquiry) newValue);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__BLOCK_REPEAT:
			setBlockRepeat((Boolean) newValue);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__MODERATE_FIRST:
			setModerateFirst((Boolean) newValue);
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
		case TeksPackage.RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS:
			setAcceptMultipleChannels(ACCEPT_MULTIPLE_CHANNELS_EDEFAULT);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			setRestrictionType(RESTRICTION_TYPE_EDEFAULT);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__ANONYMOUS:
			setAnonymous(ANONYMOUS_EDEFAULT);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__OWNED_INQUIRY:
			setOwnedInquiry((Inquiry) null);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__BLOCK_REPEAT:
			setBlockRepeat(BLOCK_REPEAT_EDEFAULT);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__MODERATE_FIRST:
			setModerateFirst(MODERATE_FIRST_EDEFAULT);
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
		case TeksPackage.RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS:
			return acceptMultipleChannels != ACCEPT_MULTIPLE_CHANNELS_EDEFAULT;
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			return restrictionType != RESTRICTION_TYPE_EDEFAULT;
		case TeksPackage.RESPONSE_RESTRICTION__ANONYMOUS:
			return anonymous != ANONYMOUS_EDEFAULT;
		case TeksPackage.RESPONSE_RESTRICTION__OWNED_INQUIRY:
			return ownedInquiry != null;
		case TeksPackage.RESPONSE_RESTRICTION__BLOCK_REPEAT:
			return blockRepeat != BLOCK_REPEAT_EDEFAULT;
		case TeksPackage.RESPONSE_RESTRICTION__MODERATE_FIRST:
			return moderateFirst != MODERATE_FIRST_EDEFAULT;
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
		result.append(" (acceptMultipleChannels: ");
		result.append(acceptMultipleChannels);
		result.append(", restrictionType: ");
		result.append(restrictionType);
		result.append(", anonymous: ");
		result.append(anonymous);
		result.append(", blockRepeat: ");
		result.append(blockRepeat);
		result.append(", moderateFirst: ");
		result.append(moderateFirst);
		result.append(')');
		return result.toString();
	}

} //ResponseRestrictionImpl
