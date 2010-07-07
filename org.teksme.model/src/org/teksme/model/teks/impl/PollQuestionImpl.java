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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.PollQuestion;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.PollQuestionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollQuestionImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollQuestionImpl#getPollRef <em>Poll Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollQuestionImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PollQuestionImpl extends EObjectImpl implements
		PollQuestion {
	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected Keyword keyword;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.POLL_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_QUESTION__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_QUESTION__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poll getPollRef() {
		if (eContainerFeatureID() != TeksPackage.POLL_QUESTION__POLL_REF)
			return null;
		return (Poll) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poll basicGetPollRef() {
		if (eContainerFeatureID() != TeksPackage.POLL_QUESTION__POLL_REF)
			return null;
		return (Poll) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPollRef(Poll newPollRef,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPollRef,
				TeksPackage.POLL_QUESTION__POLL_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollRef(Poll newPollRef) {
		if (newPollRef != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.POLL_QUESTION__POLL_REF && newPollRef != null)) {
			if (EcoreUtil.isAncestor(this, newPollRef))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPollRef != null)
				msgs = ((InternalEObject) newPollRef).eInverseAdd(this,
						TeksPackage.POLL__QUESTION, Poll.class, msgs);
			msgs = basicSetPollRef(newPollRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_QUESTION__POLL_REF, newPollRef, newPollRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword getKeyword() {
		if (keyword != null && keyword.eIsProxy()) {
			InternalEObject oldKeyword = (InternalEObject) keyword;
			keyword = (Keyword) eResolveProxy(oldKeyword);
			if (keyword != oldKeyword) {
				InternalEObject newKeyword = (InternalEObject) keyword;
				NotificationChain msgs = oldKeyword.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_QUESTION__KEYWORD, null,
						null);
				if (newKeyword.eInternalContainer() == null) {
					msgs = newKeyword.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.POLL_QUESTION__KEYWORD, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.POLL_QUESTION__KEYWORD, oldKeyword,
							keyword));
			}
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword basicGetKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyword(Keyword newKeyword,
			NotificationChain msgs) {
		Keyword oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.POLL_QUESTION__KEYWORD,
					oldKeyword, newKeyword);
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
	public void setKeyword(Keyword newKeyword) {
		if (newKeyword != keyword) {
			NotificationChain msgs = null;
			if (keyword != null)
				msgs = ((InternalEObject) keyword).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_QUESTION__KEYWORD, null,
						msgs);
			if (newKeyword != null)
				msgs = ((InternalEObject) newKeyword).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL_QUESTION__KEYWORD, null,
						msgs);
			msgs = basicSetKeyword(newKeyword, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL_QUESTION__KEYWORD, newKeyword, newKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.POLL_QUESTION__POLL_REF:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPollRef((Poll) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case TeksPackage.POLL_QUESTION__POLL_REF:
			return basicSetPollRef(null, msgs);
		case TeksPackage.POLL_QUESTION__KEYWORD:
			return basicSetKeyword(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TeksPackage.POLL_QUESTION__POLL_REF:
			return eInternalContainer().eInverseRemove(this,
					TeksPackage.POLL__QUESTION, Poll.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.POLL_QUESTION__NOTE:
			return getNote();
		case TeksPackage.POLL_QUESTION__REQUIRED:
			return isRequired();
		case TeksPackage.POLL_QUESTION__POLL_REF:
			if (resolve)
				return getPollRef();
			return basicGetPollRef();
		case TeksPackage.POLL_QUESTION__KEYWORD:
			if (resolve)
				return getKeyword();
			return basicGetKeyword();
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
		case TeksPackage.POLL_QUESTION__NOTE:
			setNote((String) newValue);
			return;
		case TeksPackage.POLL_QUESTION__REQUIRED:
			setRequired((Boolean) newValue);
			return;
		case TeksPackage.POLL_QUESTION__POLL_REF:
			setPollRef((Poll) newValue);
			return;
		case TeksPackage.POLL_QUESTION__KEYWORD:
			setKeyword((Keyword) newValue);
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
		case TeksPackage.POLL_QUESTION__NOTE:
			setNote(NOTE_EDEFAULT);
			return;
		case TeksPackage.POLL_QUESTION__REQUIRED:
			setRequired(REQUIRED_EDEFAULT);
			return;
		case TeksPackage.POLL_QUESTION__POLL_REF:
			setPollRef((Poll) null);
			return;
		case TeksPackage.POLL_QUESTION__KEYWORD:
			setKeyword((Keyword) null);
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
		case TeksPackage.POLL_QUESTION__NOTE:
			return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT
					.equals(note);
		case TeksPackage.POLL_QUESTION__REQUIRED:
			return required != REQUIRED_EDEFAULT;
		case TeksPackage.POLL_QUESTION__POLL_REF:
			return basicGetPollRef() != null;
		case TeksPackage.POLL_QUESTION__KEYWORD:
			return keyword != null;
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
		result.append(" (note: ");
		result.append(note);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //PollQuestionImpl
