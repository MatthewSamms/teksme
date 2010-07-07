/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.teksme.model.teks.ChannelKind;
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
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ResponseRestrictionImpl#getRestrictionType <em>Restriction Type</em>}</li>
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
	public ChannelKind[] getCommunicationChannel() {
		if (communicationChannel == null || communicationChannel.isEmpty())
			return COMMUNICATION_CHANNEL_EEMPTY_ARRAY;
		BasicEList<ChannelKind> list = (BasicEList<ChannelKind>) communicationChannel;
		list.shrink();
		return (ChannelKind[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind getCommunicationChannel(int index) {
		return getCommunicationChannelList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommunicationChannelLength() {
		return communicationChannel == null ? 0 : communicationChannel.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationChannel(ChannelKind[] newCommunicationChannel) {
		((BasicEList<ChannelKind>) getCommunicationChannelList()).setData(
				newCommunicationChannel.length, newCommunicationChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationChannel(int index, ChannelKind element) {
		getCommunicationChannelList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelKind> getCommunicationChannelList() {
		if (communicationChannel == null) {
			communicationChannel = new EDataTypeUniqueEList<ChannelKind>(
					ChannelKind.class, this,
					TeksPackage.RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL);
		}
		return communicationChannel;
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
		case TeksPackage.RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL:
			return getCommunicationChannelList();
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			return getRestrictionType();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS:
			setAcceptMultipleChannels((Boolean) newValue);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			getCommunicationChannelList().addAll(
					(Collection<? extends ChannelKind>) newValue);
			return;
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			setRestrictionType((RestrictionKind) newValue);
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
		case TeksPackage.RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL:
			getCommunicationChannelList().clear();
			return;
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			setRestrictionType(RESTRICTION_TYPE_EDEFAULT);
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
		case TeksPackage.RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL:
			return communicationChannel != null
					&& !communicationChannel.isEmpty();
		case TeksPackage.RESPONSE_RESTRICTION__RESTRICTION_TYPE:
			return restrictionType != RESTRICTION_TYPE_EDEFAULT;
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
		result.append(", communicationChannel: ");
		result.append(communicationChannel);
		result.append(", restrictionType: ");
		result.append(restrictionType);
		result.append(", blockRepeat: ");
		result.append(blockRepeat);
		result.append(", moderateFirst: ");
		result.append(moderateFirst);
		result.append(')');
		return result.toString();
	}

} //ResponseRestrictionImpl
