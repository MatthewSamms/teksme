/**
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version 
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.teksme.model.impl.TeksObjectImpl;

import org.teksme.model.teks.Answer;
import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#isId <em>Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#getQuestionRef <em>Question Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerImpl extends TeksObjectImpl implements Answer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
	protected boolean id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

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
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(boolean newId) {
		boolean oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER__DEFAULT_VALUE, oldDefaultValue,
					defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword getKeyword() {
		if (keyword != null && ((EObject) keyword).eIsProxy()) {
			InternalEObject oldKeyword = (InternalEObject) keyword;
			keyword = (Keyword) eResolveProxy(oldKeyword);
			if (keyword != oldKeyword) {
				InternalEObject newKeyword = (InternalEObject) keyword;
				NotificationChain msgs = oldKeyword.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.ANSWER__KEYWORD,
						null, null);
				if (newKeyword.eInternalContainer() == null) {
					msgs = newKeyword.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.ANSWER__KEYWORD, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.ANSWER__KEYWORD, oldKeyword, keyword));
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
					Notification.SET, TeksPackage.ANSWER__KEYWORD, oldKeyword,
					newKeyword);
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
						EOPPOSITE_FEATURE_BASE - TeksPackage.ANSWER__KEYWORD,
						null, msgs);
			if (newKeyword != null)
				msgs = ((InternalEObject) newKeyword).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.ANSWER__KEYWORD,
						null, msgs);
			msgs = basicSetKeyword(newKeyword, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER__KEYWORD, newKeyword, newKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice getQuestionRef() {
		if (eContainerFeatureID() != TeksPackage.ANSWER__QUESTION_REF)
			return null;
		return (MultipleChoice) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice basicGetQuestionRef() {
		if (eContainerFeatureID() != TeksPackage.ANSWER__QUESTION_REF)
			return null;
		return (MultipleChoice) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionRef(MultipleChoice newQuestionRef,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newQuestionRef,
				TeksPackage.ANSWER__QUESTION_REF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionRef(MultipleChoice newQuestionRef) {
		if (newQuestionRef != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.ANSWER__QUESTION_REF && newQuestionRef != null)) {
			if (EcoreUtil.isAncestor(this, (EObject) newQuestionRef))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuestionRef != null)
				msgs = ((InternalEObject) newQuestionRef).eInverseAdd(this,
						TeksPackage.MULTIPLE_CHOICE__ANSWER,
						MultipleChoice.class, msgs);
			msgs = basicSetQuestionRef(newQuestionRef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANSWER__QUESTION_REF, newQuestionRef,
					newQuestionRef));
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
		case TeksPackage.ANSWER__QUESTION_REF:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetQuestionRef((MultipleChoice) otherEnd, msgs);
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
		case TeksPackage.ANSWER__KEYWORD:
			return basicSetKeyword(null, msgs);
		case TeksPackage.ANSWER__QUESTION_REF:
			return basicSetQuestionRef(null, msgs);
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
		case TeksPackage.ANSWER__QUESTION_REF:
			return eInternalContainer().eInverseRemove(this,
					TeksPackage.MULTIPLE_CHOICE__ANSWER, MultipleChoice.class,
					msgs);
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
		case TeksPackage.ANSWER__TEXT:
			return getText();
		case TeksPackage.ANSWER__ID:
			return isId();
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			return getDefaultValue();
		case TeksPackage.ANSWER__SELECTED:
			return isSelected();
		case TeksPackage.ANSWER__KEYWORD:
			if (resolve)
				return getKeyword();
			return basicGetKeyword();
		case TeksPackage.ANSWER__QUESTION_REF:
			if (resolve)
				return getQuestionRef();
			return basicGetQuestionRef();
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
		case TeksPackage.ANSWER__TEXT:
			setText((String) newValue);
			return;
		case TeksPackage.ANSWER__ID:
			setId((Boolean) newValue);
			return;
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case TeksPackage.ANSWER__SELECTED:
			setSelected((Boolean) newValue);
			return;
		case TeksPackage.ANSWER__KEYWORD:
			setKeyword((Keyword) newValue);
			return;
		case TeksPackage.ANSWER__QUESTION_REF:
			setQuestionRef((MultipleChoice) newValue);
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
		case TeksPackage.ANSWER__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case TeksPackage.ANSWER__ID:
			setId(ID_EDEFAULT);
			return;
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case TeksPackage.ANSWER__SELECTED:
			setSelected(SELECTED_EDEFAULT);
			return;
		case TeksPackage.ANSWER__KEYWORD:
			setKeyword((Keyword) null);
			return;
		case TeksPackage.ANSWER__QUESTION_REF:
			setQuestionRef((MultipleChoice) null);
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
		case TeksPackage.ANSWER__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT
					.equals(text);
		case TeksPackage.ANSWER__ID:
			return id != ID_EDEFAULT;
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null
					: !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case TeksPackage.ANSWER__SELECTED:
			return selected != SELECTED_EDEFAULT;
		case TeksPackage.ANSWER__KEYWORD:
			return keyword != null;
		case TeksPackage.ANSWER__QUESTION_REF:
			return basicGetQuestionRef() != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", id: ");
		result.append(id);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //AnswerImpl
