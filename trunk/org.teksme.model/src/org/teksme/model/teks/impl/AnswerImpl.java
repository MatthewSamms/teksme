/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.teksme.model.teks.Answer;
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
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#isAutoKeyword <em>Auto Keyword</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnswerImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerImpl extends EObjectImpl implements Answer {
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
					TeksPackage.ANSWER__KEYWORD, oldKeyword, keyword));
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
					TeksPackage.ANSWER__AUTO_KEYWORD, oldAutoKeyword,
					autoKeyword));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.ANSWER__TEXT:
			return getText();
		case TeksPackage.ANSWER__ID:
			return isId();
		case TeksPackage.ANSWER__KEYWORD:
			return getKeyword();
		case TeksPackage.ANSWER__AUTO_KEYWORD:
			return isAutoKeyword();
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			return getDefaultValue();
		case TeksPackage.ANSWER__SELECTED:
			return isSelected();
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
		case TeksPackage.ANSWER__KEYWORD:
			setKeyword((String) newValue);
			return;
		case TeksPackage.ANSWER__AUTO_KEYWORD:
			setAutoKeyword((Boolean) newValue);
			return;
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case TeksPackage.ANSWER__SELECTED:
			setSelected((Boolean) newValue);
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
		case TeksPackage.ANSWER__KEYWORD:
			setKeyword(KEYWORD_EDEFAULT);
			return;
		case TeksPackage.ANSWER__AUTO_KEYWORD:
			setAutoKeyword(AUTO_KEYWORD_EDEFAULT);
			return;
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case TeksPackage.ANSWER__SELECTED:
			setSelected(SELECTED_EDEFAULT);
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
		case TeksPackage.ANSWER__KEYWORD:
			return KEYWORD_EDEFAULT == null ? keyword != null
					: !KEYWORD_EDEFAULT.equals(keyword);
		case TeksPackage.ANSWER__AUTO_KEYWORD:
			return autoKeyword != AUTO_KEYWORD_EDEFAULT;
		case TeksPackage.ANSWER__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null
					: !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case TeksPackage.ANSWER__SELECTED:
			return selected != SELECTED_EDEFAULT;
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
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", autoKeyword: ");
		result.append(autoKeyword);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //AnswerImpl
