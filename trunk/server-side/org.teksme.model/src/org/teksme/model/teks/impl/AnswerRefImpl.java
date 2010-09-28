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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.Answer;
import org.teksme.model.teks.AnswerRef;
import org.teksme.model.teks.PollQuestion;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.AnswerRefImpl#getChoiceRef <em>Choice Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerRefImpl#getAnswerRef <em>Answer Ref</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerRefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerRefImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerRefImpl extends TeksObjectImpl implements AnswerRef {
	/**
	 * The cached value of the '{@link #getChoiceRef() <em>Choice Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceRef()
	 * @generated
	 * @ordered
	 */
	protected PollQuestion choiceRef;

	/**
	 * The cached value of the '{@link #getAnswerRef() <em>Answer Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerRef()
	 * @generated
	 * @ordered
	 */
	protected Answer answerRef;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	protected AnswerRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.ANSWER_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollQuestion getChoiceRef() {
		if (choiceRef != null && ((EObject) choiceRef).eIsProxy()) {
			InternalEObject oldChoiceRef = (InternalEObject) choiceRef;
			choiceRef = (PollQuestion) eResolveProxy(oldChoiceRef);
			if (choiceRef != oldChoiceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.ANSWER_REF__CHOICE_REF, oldChoiceRef,
							choiceRef));
			}
		}
		return choiceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollQuestion basicGetChoiceRef() {
		return choiceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoiceRef(PollQuestion newChoiceRef) {
		PollQuestion oldChoiceRef = choiceRef;
		choiceRef = newChoiceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER_REF__CHOICE_REF, oldChoiceRef, choiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getAnswerRef() {
		if (answerRef != null && ((EObject) answerRef).eIsProxy()) {
			InternalEObject oldAnswerRef = (InternalEObject) answerRef;
			answerRef = (Answer) eResolveProxy(oldAnswerRef);
			if (answerRef != oldAnswerRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.ANSWER_REF__ANSWER_REF, oldAnswerRef,
							answerRef));
			}
		}
		return answerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer basicGetAnswerRef() {
		return answerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerRef(Answer newAnswerRef) {
		Answer oldAnswerRef = answerRef;
		answerRef = newAnswerRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER_REF__ANSWER_REF, oldAnswerRef, answerRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER_REF__VALUE, oldValue, value));
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
					TeksPackage.ANSWER_REF__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.ANSWER_REF__CHOICE_REF:
			if (resolve)
				return getChoiceRef();
			return basicGetChoiceRef();
		case TeksPackage.ANSWER_REF__ANSWER_REF:
			if (resolve)
				return getAnswerRef();
			return basicGetAnswerRef();
		case TeksPackage.ANSWER_REF__VALUE:
			return getValue();
		case TeksPackage.ANSWER_REF__ID:
			return getId();
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
		case TeksPackage.ANSWER_REF__CHOICE_REF:
			setChoiceRef((PollQuestion) newValue);
			return;
		case TeksPackage.ANSWER_REF__ANSWER_REF:
			setAnswerRef((Answer) newValue);
			return;
		case TeksPackage.ANSWER_REF__VALUE:
			setValue((String) newValue);
			return;
		case TeksPackage.ANSWER_REF__ID:
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
		case TeksPackage.ANSWER_REF__CHOICE_REF:
			setChoiceRef((PollQuestion) null);
			return;
		case TeksPackage.ANSWER_REF__ANSWER_REF:
			setAnswerRef((Answer) null);
			return;
		case TeksPackage.ANSWER_REF__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case TeksPackage.ANSWER_REF__ID:
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
		case TeksPackage.ANSWER_REF__CHOICE_REF:
			return choiceRef != null;
		case TeksPackage.ANSWER_REF__ANSWER_REF:
			return answerRef != null;
		case TeksPackage.ANSWER_REF__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT
					.equals(value);
		case TeksPackage.ANSWER_REF__ID:
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
		result.append(" (value: ");
		result.append(value);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AnswerRefImpl
