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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.teksme.model.teks.Report;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ReportImpl#isHideResults <em>Hide Results</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ReportImpl#isPercentageOnly <em>Percentage Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportImpl extends EObjectImpl implements Report {
	/**
	 * The default value of the '{@link #isHideResults() <em>Hide Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideResults()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_RESULTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideResults() <em>Hide Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideResults()
	 * @generated
	 * @ordered
	 */
	protected boolean hideResults = HIDE_RESULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPercentageOnly() <em>Percentage Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPercentageOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERCENTAGE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPercentageOnly() <em>Percentage Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPercentageOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean percentageOnly = PERCENTAGE_ONLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideResults() {
		return hideResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideResults(boolean newHideResults) {
		boolean oldHideResults = hideResults;
		hideResults = newHideResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.REPORT__HIDE_RESULTS, oldHideResults,
					hideResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPercentageOnly() {
		return percentageOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOnly(boolean newPercentageOnly) {
		boolean oldPercentageOnly = percentageOnly;
		percentageOnly = newPercentageOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.REPORT__PERCENTAGE_ONLY, oldPercentageOnly,
					percentageOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.REPORT__HIDE_RESULTS:
			return isHideResults();
		case TeksPackage.REPORT__PERCENTAGE_ONLY:
			return isPercentageOnly();
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
		case TeksPackage.REPORT__HIDE_RESULTS:
			setHideResults((Boolean) newValue);
			return;
		case TeksPackage.REPORT__PERCENTAGE_ONLY:
			setPercentageOnly((Boolean) newValue);
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
		case TeksPackage.REPORT__HIDE_RESULTS:
			setHideResults(HIDE_RESULTS_EDEFAULT);
			return;
		case TeksPackage.REPORT__PERCENTAGE_ONLY:
			setPercentageOnly(PERCENTAGE_ONLY_EDEFAULT);
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
		case TeksPackage.REPORT__HIDE_RESULTS:
			return hideResults != HIDE_RESULTS_EDEFAULT;
		case TeksPackage.REPORT__PERCENTAGE_ONLY:
			return percentageOnly != PERCENTAGE_ONLY_EDEFAULT;
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
		result.append(" (hideResults: ");
		result.append(hideResults);
		result.append(", percentageOnly: ");
		result.append(percentageOnly);
		result.append(')');
		return result.toString();
	}

} //ReportImpl
