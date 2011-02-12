/**
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version 
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 */
package org.teksme.model.teks.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.Channel;
import org.teksme.model.teks.Message;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.model.teks.Shout;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getToList <em>To</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getShout <em>Shout</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#isStopOnError <em>Stop On Error</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getAttempts <em>Attempts</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MessageImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MessageImpl extends TeksObjectImpl implements Message {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected Channel channels;

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
	 * The cached value of the '{@link #getShout() <em>Shout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShout()
	 * @generated
	 * @ordered
	 */
	protected Shout shout;

	/**
	 * The default value of the '{@link #isStopOnError() <em>Stop On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopOnError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOP_ON_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStopOnError() <em>Stop On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStopOnError()
	 * @generated
	 * @ordered
	 */
	protected boolean stopOnError = STOP_ON_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected static final SMSGatewayKind ROUTING_EDEFAULT = SMSGatewayKind.CLICKATELL;

	/**
	 * The cached value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected SMSGatewayKind routing = ROUTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTEMPTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttempts() <em>Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttempts()
	 * @generated
	 * @ordered
	 */
	protected int attempts = ATTEMPTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

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
	public Channel getChannels() {
		if (channels != null && ((EObject) channels).eIsProxy()) {
			InternalEObject oldChannels = (InternalEObject) channels;
			channels = (Channel) eResolveProxy(oldChannels);
			if (channels != oldChannels) {
				InternalEObject newChannels = (InternalEObject) channels;
				NotificationChain msgs = oldChannels.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__CHANNELS,
						null, null);
				if (newChannels.eInternalContainer() == null) {
					msgs = newChannels.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.MESSAGE__CHANNELS, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.MESSAGE__CHANNELS, oldChannels,
							channels));
			}
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetChannels() {
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(Channel newChannels,
			NotificationChain msgs) {
		Channel oldChannels = channels;
		channels = newChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.MESSAGE__CHANNELS,
					oldChannels, newChannels);
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
	public void setChannels(Channel newChannels) {
		if (newChannels != channels) {
			NotificationChain msgs = null;
			if (channels != null)
				msgs = ((InternalEObject) channels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__CHANNELS,
						null, msgs);
			if (newChannels != null)
				msgs = ((InternalEObject) newChannels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__CHANNELS,
						null, msgs);
			msgs = basicSetChannels(newChannels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__CHANNELS, newChannels, newChannels));
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
	public Shout getShout() {
		if (shout != null && ((EObject) shout).eIsProxy()) {
			InternalEObject oldShout = (InternalEObject) shout;
			shout = (Shout) eResolveProxy(oldShout);
			if (shout != oldShout) {
				InternalEObject newShout = (InternalEObject) shout;
				NotificationChain msgs = oldShout.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__SHOUT,
						null, null);
				if (newShout.eInternalContainer() == null) {
					msgs = newShout.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.MESSAGE__SHOUT, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.MESSAGE__SHOUT, oldShout, shout));
			}
		}
		return shout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shout basicGetShout() {
		return shout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShout(Shout newShout,
			NotificationChain msgs) {
		Shout oldShout = shout;
		shout = newShout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.MESSAGE__SHOUT, oldShout,
					newShout);
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
	public void setShout(Shout newShout) {
		if (newShout != shout) {
			NotificationChain msgs = null;
			if (shout != null)
				msgs = ((InternalEObject) shout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__SHOUT,
						null, msgs);
			if (newShout != null)
				msgs = ((InternalEObject) newShout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.MESSAGE__SHOUT,
						null, msgs);
			msgs = basicSetShout(newShout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__SHOUT, newShout, newShout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStopOnError() {
		return stopOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopOnError(boolean newStopOnError) {
		boolean oldStopOnError = stopOnError;
		stopOnError = newStopOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__STOP_ON_ERROR, oldStopOnError,
					stopOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSGatewayKind getRouting() {
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(SMSGatewayKind newRouting) {
		SMSGatewayKind oldRouting = routing;
		routing = newRouting == null ? ROUTING_EDEFAULT : newRouting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__ROUTING, oldRouting, routing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttempts() {
		return attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttempts(int newAttempts) {
		int oldAttempts = attempts;
		attempts = newAttempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MESSAGE__ATTEMPTS, oldAttempts, attempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.MESSAGE__CHANNELS:
			return basicSetChannels(null, msgs);
		case TeksPackage.MESSAGE__SHOUT:
			return basicSetShout(null, msgs);
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
		case TeksPackage.MESSAGE__FROM:
			return getFrom();
		case TeksPackage.MESSAGE__CHANNELS:
			if (resolve)
				return getChannels();
			return basicGetChannels();
		case TeksPackage.MESSAGE__TO:
			return getToList();
		case TeksPackage.MESSAGE__SHOUT:
			if (resolve)
				return getShout();
			return basicGetShout();
		case TeksPackage.MESSAGE__STOP_ON_ERROR:
			return isStopOnError();
		case TeksPackage.MESSAGE__DATE:
			return getDate();
		case TeksPackage.MESSAGE__ROUTING:
			return getRouting();
		case TeksPackage.MESSAGE__ATTEMPTS:
			return getAttempts();
		case TeksPackage.MESSAGE__ENCODING:
			return getEncoding();
		case TeksPackage.MESSAGE__ID:
			return getId();
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
		case TeksPackage.MESSAGE__FROM:
			setFrom((String) newValue);
			return;
		case TeksPackage.MESSAGE__CHANNELS:
			setChannels((Channel) newValue);
			return;
		case TeksPackage.MESSAGE__TO:
			getToList().clear();
			getToList().addAll((Collection<? extends String>) newValue);
			return;
		case TeksPackage.MESSAGE__SHOUT:
			setShout((Shout) newValue);
			return;
		case TeksPackage.MESSAGE__STOP_ON_ERROR:
			setStopOnError((Boolean) newValue);
			return;
		case TeksPackage.MESSAGE__DATE:
			setDate((Date) newValue);
			return;
		case TeksPackage.MESSAGE__ROUTING:
			setRouting((SMSGatewayKind) newValue);
			return;
		case TeksPackage.MESSAGE__ATTEMPTS:
			setAttempts((Integer) newValue);
			return;
		case TeksPackage.MESSAGE__ENCODING:
			setEncoding((String) newValue);
			return;
		case TeksPackage.MESSAGE__ID:
			setId((String) newValue);
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
		case TeksPackage.MESSAGE__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__CHANNELS:
			setChannels((Channel) null);
			return;
		case TeksPackage.MESSAGE__TO:
			getToList().clear();
			return;
		case TeksPackage.MESSAGE__SHOUT:
			setShout((Shout) null);
			return;
		case TeksPackage.MESSAGE__STOP_ON_ERROR:
			setStopOnError(STOP_ON_ERROR_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__ROUTING:
			setRouting(ROUTING_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__ATTEMPTS:
			setAttempts(ATTEMPTS_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__ENCODING:
			setEncoding(ENCODING_EDEFAULT);
			return;
		case TeksPackage.MESSAGE__ID:
			setId(ID_EDEFAULT);
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
		case TeksPackage.MESSAGE__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT
					.equals(from);
		case TeksPackage.MESSAGE__CHANNELS:
			return channels != null;
		case TeksPackage.MESSAGE__TO:
			return to != null && !to.isEmpty();
		case TeksPackage.MESSAGE__SHOUT:
			return shout != null;
		case TeksPackage.MESSAGE__STOP_ON_ERROR:
			return stopOnError != STOP_ON_ERROR_EDEFAULT;
		case TeksPackage.MESSAGE__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT
					.equals(date);
		case TeksPackage.MESSAGE__ROUTING:
			return routing != ROUTING_EDEFAULT;
		case TeksPackage.MESSAGE__ATTEMPTS:
			return attempts != ATTEMPTS_EDEFAULT;
		case TeksPackage.MESSAGE__ENCODING:
			return ENCODING_EDEFAULT == null ? encoding != null
					: !ENCODING_EDEFAULT.equals(encoding);
		case TeksPackage.MESSAGE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", stopOnError: ");
		result.append(stopOnError);
		result.append(", date: ");
		result.append(date);
		result.append(", routing: ");
		result.append(routing);
		result.append(", attempts: ");
		result.append(attempts);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
