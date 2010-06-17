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

import org.teksme.model.teks.Answer;
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.FreeTextImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.FreeTextImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.FreeTextImpl#isAutoKeyword <em>Auto Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreeTextImpl extends ChoiceImpl implements FreeText {
	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected Answer answer;

	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoKeyword() <em>Auto Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_KEYWORD_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoKeyword() <em>Auto Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoKeyword()
	 * @generated
	 * @ordered
	 */
	protected boolean autoKeyword = AUTO_KEYWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.FREE_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getAnswer() {
		if (answer != null && answer.eIsProxy()) {
			InternalEObject oldAnswer = (InternalEObject) answer;
			answer = (Answer) eResolveProxy(oldAnswer);
			if (answer != oldAnswer) {
				InternalEObject newAnswer = (InternalEObject) answer;
				NotificationChain msgs = oldAnswer.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.FREE_TEXT__ANSWER,
						null, null);
				if (newAnswer.eInternalContainer() == null) {
					msgs = newAnswer.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.FREE_TEXT__ANSWER, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.FREE_TEXT__ANSWER, oldAnswer, answer));
			}
		}
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer basicGetAnswer() {
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswer(Answer newAnswer,
			NotificationChain msgs) {
		Answer oldAnswer = answer;
		answer = newAnswer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.FREE_TEXT__ANSWER, oldAnswer,
					newAnswer);
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
	public void setAnswer(Answer newAnswer) {
		if (newAnswer != answer) {
			NotificationChain msgs = null;
			if (answer != null)
				msgs = ((InternalEObject) answer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.FREE_TEXT__ANSWER,
						null, msgs);
			if (newAnswer != null)
				msgs = ((InternalEObject) newAnswer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.FREE_TEXT__ANSWER,
						null, msgs);
			msgs = basicSetAnswer(newAnswer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.FREE_TEXT__ANSWER, newAnswer, newAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(String newKeyword) {
		String oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.FREE_TEXT__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoKeyword() {
		return autoKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoKeyword(boolean newAutoKeyword) {
		boolean oldAutoKeyword = autoKeyword;
		autoKeyword = newAutoKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.FREE_TEXT__AUTO_KEYWORD, oldAutoKeyword,
					autoKeyword));
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
		case TeksPackage.FREE_TEXT__ANSWER:
			return basicSetAnswer(null, msgs);
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
		case TeksPackage.FREE_TEXT__ANSWER:
			if (resolve)
				return getAnswer();
			return basicGetAnswer();
		case TeksPackage.FREE_TEXT__KEYWORD:
			return getKeyword();
		case TeksPackage.FREE_TEXT__AUTO_KEYWORD:
			return isAutoKeyword();
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
		case TeksPackage.FREE_TEXT__ANSWER:
			setAnswer((Answer) newValue);
			return;
		case TeksPackage.FREE_TEXT__KEYWORD:
			setKeyword((String) newValue);
			return;
		case TeksPackage.FREE_TEXT__AUTO_KEYWORD:
			setAutoKeyword((Boolean) newValue);
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
		case TeksPackage.FREE_TEXT__ANSWER:
			setAnswer((Answer) null);
			return;
		case TeksPackage.FREE_TEXT__KEYWORD:
			setKeyword(KEYWORD_EDEFAULT);
			return;
		case TeksPackage.FREE_TEXT__AUTO_KEYWORD:
			setAutoKeyword(AUTO_KEYWORD_EDEFAULT);
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
		case TeksPackage.FREE_TEXT__ANSWER:
			return answer != null;
		case TeksPackage.FREE_TEXT__KEYWORD:
			return KEYWORD_EDEFAULT == null ? keyword != null
					: !KEYWORD_EDEFAULT.equals(keyword);
		case TeksPackage.FREE_TEXT__AUTO_KEYWORD:
			return autoKeyword != AUTO_KEYWORD_EDEFAULT;
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
		result.append(" (keyword: ");
		result.append(keyword);
		result.append(", autoKeyword: ");
		result.append(autoKeyword);
		result.append(')');
		return result.toString();
	}

} //FreeTextImpl
