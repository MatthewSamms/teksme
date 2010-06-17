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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.teksme.model.teks.Choice;
import org.teksme.model.teks.Inquiry;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ChoiceImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ChoiceImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ChoiceImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ChoiceImpl#getInquiryRef <em>Inquiry Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChoiceImpl extends TeksElementImpl implements Choice {
	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

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
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CHOICE__QUESTION, oldQuestion, question));
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
					TeksPackage.CHOICE__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CHOICE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inquiry getInquiryRef() {
		if (eContainerFeatureID() != TeksPackage.CHOICE__INQUIRY_REF)
			return null;
		return (Inquiry) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inquiry basicGetInquiryRef() {
		if (eContainerFeatureID() != TeksPackage.CHOICE__INQUIRY_REF)
			return null;
		return (Inquiry) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInquiryRef(Inquiry newInquiryRef,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInquiryRef,
				TeksPackage.CHOICE__INQUIRY_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInquiryRef(Inquiry newInquiryRef) {
		if (newInquiryRef != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.CHOICE__INQUIRY_REF && newInquiryRef != null)) {
			if (EcoreUtil.isAncestor(this, newInquiryRef))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInquiryRef != null)
				msgs = ((InternalEObject) newInquiryRef).eInverseAdd(this,
						TeksPackage.INQUIRY__CHOICE, Inquiry.class, msgs);
			msgs = basicSetInquiryRef(newInquiryRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.CHOICE__INQUIRY_REF, newInquiryRef,
					newInquiryRef));
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
		case TeksPackage.CHOICE__INQUIRY_REF:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInquiryRef((Inquiry) otherEnd, msgs);
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
		case TeksPackage.CHOICE__INQUIRY_REF:
			return basicSetInquiryRef(null, msgs);
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
		case TeksPackage.CHOICE__INQUIRY_REF:
			return eInternalContainer().eInverseRemove(this,
					TeksPackage.INQUIRY__CHOICE, Inquiry.class, msgs);
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
		case TeksPackage.CHOICE__QUESTION:
			return getQuestion();
		case TeksPackage.CHOICE__NOTE:
			return getNote();
		case TeksPackage.CHOICE__MANDATORY:
			return isMandatory();
		case TeksPackage.CHOICE__INQUIRY_REF:
			if (resolve)
				return getInquiryRef();
			return basicGetInquiryRef();
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
		case TeksPackage.CHOICE__QUESTION:
			setQuestion((String) newValue);
			return;
		case TeksPackage.CHOICE__NOTE:
			setNote((String) newValue);
			return;
		case TeksPackage.CHOICE__MANDATORY:
			setMandatory((Boolean) newValue);
			return;
		case TeksPackage.CHOICE__INQUIRY_REF:
			setInquiryRef((Inquiry) newValue);
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
		case TeksPackage.CHOICE__QUESTION:
			setQuestion(QUESTION_EDEFAULT);
			return;
		case TeksPackage.CHOICE__NOTE:
			setNote(NOTE_EDEFAULT);
			return;
		case TeksPackage.CHOICE__MANDATORY:
			setMandatory(MANDATORY_EDEFAULT);
			return;
		case TeksPackage.CHOICE__INQUIRY_REF:
			setInquiryRef((Inquiry) null);
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
		case TeksPackage.CHOICE__QUESTION:
			return QUESTION_EDEFAULT == null ? question != null
					: !QUESTION_EDEFAULT.equals(question);
		case TeksPackage.CHOICE__NOTE:
			return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT
					.equals(note);
		case TeksPackage.CHOICE__MANDATORY:
			return mandatory != MANDATORY_EDEFAULT;
		case TeksPackage.CHOICE__INQUIRY_REF:
			return basicGetInquiryRef() != null;
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
		result.append(" (question: ");
		result.append(question);
		result.append(", note: ");
		result.append(note);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
