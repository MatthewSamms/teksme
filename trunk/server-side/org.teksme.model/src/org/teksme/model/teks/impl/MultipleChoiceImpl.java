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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Answer;
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.MultipleChoiceImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MultipleChoiceImpl#getAnswerList <em>Answer</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.MultipleChoiceImpl#getAddOther <em>Add Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleChoiceImpl extends PollQuestionImpl implements
		MultipleChoice {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2485431295447072301L;

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
	 * The cached value of the '{@link #getAnswerList() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerList()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> answer;

	/**
	 * The empty value for the '{@link #getAnswer() <em>Answer</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final Answer[] ANSWER_EEMPTY_ARRAY = new Answer[0];

	/**
	 * The cached value of the '{@link #getAddOther() <em>Add Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddOther()
	 * @generated
	 * @ordered
	 */
	protected FreeText addOther;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.MULTIPLE_CHOICE;
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
					TeksPackage.MULTIPLE_CHOICE__QUESTION, oldQuestion,
					question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer[] getAnswer() {
		if (answer == null || answer.isEmpty())
			return ANSWER_EEMPTY_ARRAY;
		BasicEList<Answer> list = (BasicEList<Answer>) answer;
		list.shrink();
		return (Answer[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getAnswer(int index) {
		return getAnswerList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnswerLength() {
		return answer == null ? 0 : answer.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswer(Answer[] newAnswer) {
		((BasicEList<Answer>) getAnswerList()).setData(newAnswer.length,
				newAnswer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswer(int index, Answer element) {
		getAnswerList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Answer> getAnswerList() {
		if (answer == null) {
			answer = new EObjectContainmentWithInverseEList.Resolving<Answer>(
					Answer.class, this, TeksPackage.MULTIPLE_CHOICE__ANSWER,
					TeksPackage.ANSWER__QUESTION_REF);
		}
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeText getAddOther() {
		if (addOther != null && ((EObject) addOther).eIsProxy()) {
			InternalEObject oldAddOther = (InternalEObject) addOther;
			addOther = (FreeText) eResolveProxy(oldAddOther);
			if (addOther != oldAddOther) {
				InternalEObject newAddOther = (InternalEObject) addOther;
				NotificationChain msgs = oldAddOther.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.MULTIPLE_CHOICE__ADD_OTHER, null,
						null);
				if (newAddOther.eInternalContainer() == null) {
					msgs = newAddOther.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.MULTIPLE_CHOICE__ADD_OTHER, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.MULTIPLE_CHOICE__ADD_OTHER,
							oldAddOther, addOther));
			}
		}
		return addOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeText basicGetAddOther() {
		return addOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddOther(FreeText newAddOther,
			NotificationChain msgs) {
		FreeText oldAddOther = addOther;
		addOther = newAddOther;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.MULTIPLE_CHOICE__ADD_OTHER,
					oldAddOther, newAddOther);
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
	public void setAddOther(FreeText newAddOther) {
		if (newAddOther != addOther) {
			NotificationChain msgs = null;
			if (addOther != null)
				msgs = ((InternalEObject) addOther).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.MULTIPLE_CHOICE__ADD_OTHER, null,
						msgs);
			if (newAddOther != null)
				msgs = ((InternalEObject) newAddOther).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.MULTIPLE_CHOICE__ADD_OTHER, null,
						msgs);
			msgs = basicSetAddOther(newAddOther, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.MULTIPLE_CHOICE__ADD_OTHER, newAddOther,
					newAddOther));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAnswerList())
					.basicAdd(otherEnd, msgs);
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
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			return ((InternalEList<?>) getAnswerList()).basicRemove(otherEnd,
					msgs);
		case TeksPackage.MULTIPLE_CHOICE__ADD_OTHER:
			return basicSetAddOther(null, msgs);
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
		case TeksPackage.MULTIPLE_CHOICE__QUESTION:
			return getQuestion();
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			return getAnswerList();
		case TeksPackage.MULTIPLE_CHOICE__ADD_OTHER:
			if (resolve)
				return getAddOther();
			return basicGetAddOther();
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
		case TeksPackage.MULTIPLE_CHOICE__QUESTION:
			setQuestion((String) newValue);
			return;
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			getAnswerList().clear();
			getAnswerList().addAll((Collection<? extends Answer>) newValue);
			return;
		case TeksPackage.MULTIPLE_CHOICE__ADD_OTHER:
			setAddOther((FreeText) newValue);
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
		case TeksPackage.MULTIPLE_CHOICE__QUESTION:
			setQuestion(QUESTION_EDEFAULT);
			return;
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			getAnswerList().clear();
			return;
		case TeksPackage.MULTIPLE_CHOICE__ADD_OTHER:
			setAddOther((FreeText) null);
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
		case TeksPackage.MULTIPLE_CHOICE__QUESTION:
			return QUESTION_EDEFAULT == null ? question != null
					: !QUESTION_EDEFAULT.equals(question);
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			return answer != null && !answer.isEmpty();
		case TeksPackage.MULTIPLE_CHOICE__ADD_OTHER:
			return addOther != null;
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
		result.append(')');
		return result.toString();
	}

} //MultipleChoiceImpl
