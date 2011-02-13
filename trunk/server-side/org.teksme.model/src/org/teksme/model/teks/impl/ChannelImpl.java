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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.teksme.model.impl.TeksObjectImpl;
import org.teksme.model.teks.Channel;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Channel</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ChannelImpl#getChannelList <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends TeksObjectImpl implements Channel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getChannelList() <em>Channel</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChannelList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> channel;

	/**
	 * The empty value for the '{@link #getChannel() <em>Channel</em>}' array accessor.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String[] CHANNEL_EEMPTY_ARRAY = new String[0];

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getChannel() {
		if (channel == null || channel.isEmpty())
			return CHANNEL_EEMPTY_ARRAY;
		BasicEList<String> list = (BasicEList<String>) channel;
		list.shrink();
		return (String[]) list.data();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannel(int index) {
		return getChannelList().get(index);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannelLength() {
		return channel == null ? 0 : channel.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(String[] newChannel) {
		((BasicEList<String>) getChannelList()).setData(newChannel.length,
				newChannel);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(int index, String element) {
		getChannelList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChannelList() {
		if (channel == null) {
			channel = new EDataTypeUniqueEList<String>(String.class, this,
					TeksPackage.CHANNEL__CHANNEL);
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.CHANNEL__CHANNEL:
			return getChannelList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.CHANNEL__CHANNEL:
			getChannelList().clear();
			getChannelList().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TeksPackage.CHANNEL__CHANNEL:
			getChannelList().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TeksPackage.CHANNEL__CHANNEL:
			return channel != null && !channel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (channel: ");
		result.append(channel);
		result.append(')');
		return result.toString();
	}

} // ChannelImpl
