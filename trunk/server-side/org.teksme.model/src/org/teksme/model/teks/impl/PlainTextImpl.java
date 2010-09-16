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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.PlainText;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.PlainTextImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PlainTextImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PlainTextImpl extends PollQuestionImpl implements
		PlainText {
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
	protected PlainTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.PLAIN_TEXT;
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
					TeksPackage.PLAIN_TEXT__QUESTION, oldQuestion, question));
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
								- TeksPackage.PLAIN_TEXT__KEYWORD, null, null);
				if (newKeyword.eInternalContainer() == null) {
					msgs = newKeyword.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.PLAIN_TEXT__KEYWORD, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.PLAIN_TEXT__KEYWORD, oldKeyword,
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
					Notification.SET, TeksPackage.PLAIN_TEXT__KEYWORD,
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
								- TeksPackage.PLAIN_TEXT__KEYWORD, null, msgs);
			if (newKeyword != null)
				msgs = ((InternalEObject) newKeyword).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.PLAIN_TEXT__KEYWORD, null, msgs);
			msgs = basicSetKeyword(newKeyword, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.PLAIN_TEXT__KEYWORD, newKeyword, newKeyword));
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
		case TeksPackage.PLAIN_TEXT__KEYWORD:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.PLAIN_TEXT__QUESTION:
			return getQuestion();
		case TeksPackage.PLAIN_TEXT__KEYWORD:
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
		case TeksPackage.PLAIN_TEXT__QUESTION:
			setQuestion((String) newValue);
			return;
		case TeksPackage.PLAIN_TEXT__KEYWORD:
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
		case TeksPackage.PLAIN_TEXT__QUESTION:
			setQuestion(QUESTION_EDEFAULT);
			return;
		case TeksPackage.PLAIN_TEXT__KEYWORD:
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
		case TeksPackage.PLAIN_TEXT__QUESTION:
			return QUESTION_EDEFAULT == null ? question != null
					: !QUESTION_EDEFAULT.equals(question);
		case TeksPackage.PLAIN_TEXT__KEYWORD:
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
		result.append(" (question: ");
		result.append(question);
		result.append(')');
		return result.toString();
	}

} //PlainTextImpl
