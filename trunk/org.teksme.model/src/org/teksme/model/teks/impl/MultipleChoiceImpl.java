/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Answer;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.MultipleChoiceImpl#getAnswerList <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleChoiceImpl extends ChoiceImpl implements MultipleChoice {
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
			answer = new EObjectContainmentEList.Resolving<Answer>(
					Answer.class, this, TeksPackage.MULTIPLE_CHOICE__ANSWER);
		}
		return answer;
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
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			return getAnswerList();
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
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			getAnswerList().clear();
			getAnswerList().addAll((Collection<? extends Answer>) newValue);
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
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			getAnswerList().clear();
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
		case TeksPackage.MULTIPLE_CHOICE__ANSWER:
			return answer != null && !answer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultipleChoiceImpl
