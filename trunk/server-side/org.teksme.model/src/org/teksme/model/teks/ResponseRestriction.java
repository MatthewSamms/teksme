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
package org.teksme.model.teks;

import org.eclipse.emf.common.util.EList;

import org.teksme.model.TeksObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#isAcceptMultipleChannels <em>Accept Multiple Channels</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#getCommunicationChannelList <em>Communication Channel</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#getRestrictionType <em>Restriction Type</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#isBlockRepeat <em>Block Repeat</em>}</li>
 *   <li>{@link org.teksme.model.teks.ResponseRestriction#isModerateFirst <em>Moderate First</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction()
 * @model
 * @extends TeksObject
 * @generated
 */
public interface ResponseRestriction extends TeksObject {
	/**
	 * Returns the value of the '<em><b>Accept Multiple Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Multiple Channels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Multiple Channels</em>' attribute.
	 * @see #setAcceptMultipleChannels(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_AcceptMultipleChannels()
	 * @model
	 * @generated
	 */
	boolean isAcceptMultipleChannels();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#isAcceptMultipleChannels <em>Accept Multiple Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Multiple Channels</em>' attribute.
	 * @see #isAcceptMultipleChannels()
	 * @generated
	 */
	void setAcceptMultipleChannels(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChannelKind[] getCommunicationChannel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChannelKind getCommunicationChannel(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getCommunicationChannelLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCommunicationChannel(ChannelKind[] newCommunicationChannel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCommunicationChannel(int index, ChannelKind element);

	/**
	 * Returns the value of the '<em><b>Communication Channel</b></em>' attribute list.
	 * The list contents are of type {@link org.teksme.model.teks.ChannelKind}.
	 * The literals are from the enumeration {@link org.teksme.model.teks.ChannelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Channel</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Channel</em>' attribute list.
	 * @see org.teksme.model.teks.ChannelKind
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_CommunicationChannel()
	 * @model
	 * @generated
	 */
	EList<ChannelKind> getCommunicationChannelList();

	/**
	 * Returns the value of the '<em><b>Restriction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.teksme.model.teks.RestrictionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Type</em>' attribute.
	 * @see org.teksme.model.teks.RestrictionKind
	 * @see #setRestrictionType(RestrictionKind)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_RestrictionType()
	 * @model
	 * @generated
	 */
	RestrictionKind getRestrictionType();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#getRestrictionType <em>Restriction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Type</em>' attribute.
	 * @see org.teksme.model.teks.RestrictionKind
	 * @see #getRestrictionType()
	 * @generated
	 */
	void setRestrictionType(RestrictionKind value);

	/**
	 * Returns the value of the '<em><b>Block Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Repeat</em>' attribute.
	 * @see #setBlockRepeat(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_BlockRepeat()
	 * @model
	 * @generated
	 */
	boolean isBlockRepeat();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#isBlockRepeat <em>Block Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Repeat</em>' attribute.
	 * @see #isBlockRepeat()
	 * @generated
	 */
	void setBlockRepeat(boolean value);

	/**
	 * Returns the value of the '<em><b>Moderate First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moderate First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderate First</em>' attribute.
	 * @see #setModerateFirst(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getResponseRestriction_ModerateFirst()
	 * @model
	 * @generated
	 */
	boolean isModerateFirst();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.ResponseRestriction#isModerateFirst <em>Moderate First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderate First</em>' attribute.
	 * @see #isModerateFirst()
	 * @generated
	 */
	void setModerateFirst(boolean value);

} // ResponseRestriction
