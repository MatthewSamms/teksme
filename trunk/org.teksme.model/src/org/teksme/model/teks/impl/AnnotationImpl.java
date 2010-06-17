/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Annotation;
import org.teksme.model.teks.AnnotationMapEntry;
import org.teksme.model.teks.TeksElement;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.AnnotationImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnnotationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnnotationImpl#getEntryList <em>Entry</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.AnnotationImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends EObjectImpl implements Annotation {
	/**
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected String annotation = ANNOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryList() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryList()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationMapEntry> entry;

	/**
	 * The empty value for the '{@link #getEntry() <em>Entry</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected static final AnnotationMapEntry[] ENTRY_EEMPTY_ARRAY = new AnnotationMapEntry[0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(String newAnnotation) {
		String oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANNOTATION__ANNOTATION, oldAnnotation,
					annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANNOTATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMapEntry[] getEntry() {
		if (entry == null || entry.isEmpty())
			return ENTRY_EEMPTY_ARRAY;
		BasicEList<AnnotationMapEntry> list = (BasicEList<AnnotationMapEntry>) entry;
		list.shrink();
		return (AnnotationMapEntry[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMapEntry getEntry(int index) {
		return getEntryList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEntryLength() {
		return entry == null ? 0 : entry.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(AnnotationMapEntry[] newEntry) {
		((BasicEList<AnnotationMapEntry>) getEntryList()).setData(
				newEntry.length, newEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(int index, AnnotationMapEntry element) {
		getEntryList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotationMapEntry> getEntryList() {
		if (entry == null) {
			entry = new EObjectContainmentEList.Resolving<AnnotationMapEntry>(
					AnnotationMapEntry.class, this,
					TeksPackage.ANNOTATION__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeksElement getAnnotatedElement() {
		if (eContainerFeatureID() != TeksPackage.ANNOTATION__ANNOTATED_ELEMENT)
			return null;
		return (TeksElement) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeksElement basicGetAnnotatedElement() {
		if (eContainerFeatureID() != TeksPackage.ANNOTATION__ANNOTATED_ELEMENT)
			return null;
		return (TeksElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotatedElement(
			TeksElement newAnnotatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAnnotatedElement,
				TeksPackage.ANNOTATION__ANNOTATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatedElement(TeksElement newAnnotatedElement) {
		if (newAnnotatedElement != eInternalContainer()
				|| (eContainerFeatureID() != TeksPackage.ANNOTATION__ANNOTATED_ELEMENT && newAnnotatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotatedElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotatedElement != null)
				msgs = ((InternalEObject) newAnnotatedElement).eInverseAdd(
						this, TeksPackage.TEKS_ELEMENT__ANNOTATIONS,
						TeksElement.class, msgs);
			msgs = basicSetAnnotatedElement(newAnnotatedElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.ANNOTATION__ANNOTATED_ELEMENT,
					newAnnotatedElement, newAnnotatedElement));
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
		case TeksPackage.ANNOTATION__ANNOTATED_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAnnotatedElement((TeksElement) otherEnd, msgs);
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
		case TeksPackage.ANNOTATION__ENTRY:
			return ((InternalEList<?>) getEntryList()).basicRemove(otherEnd,
					msgs);
		case TeksPackage.ANNOTATION__ANNOTATED_ELEMENT:
			return basicSetAnnotatedElement(null, msgs);
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
		case TeksPackage.ANNOTATION__ANNOTATED_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					TeksPackage.TEKS_ELEMENT__ANNOTATIONS, TeksElement.class,
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
		case TeksPackage.ANNOTATION__ANNOTATION:
			return getAnnotation();
		case TeksPackage.ANNOTATION__SOURCE:
			return getSource();
		case TeksPackage.ANNOTATION__ENTRY:
			return getEntryList();
		case TeksPackage.ANNOTATION__ANNOTATED_ELEMENT:
			if (resolve)
				return getAnnotatedElement();
			return basicGetAnnotatedElement();
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
		case TeksPackage.ANNOTATION__ANNOTATION:
			setAnnotation((String) newValue);
			return;
		case TeksPackage.ANNOTATION__SOURCE:
			setSource((String) newValue);
			return;
		case TeksPackage.ANNOTATION__ENTRY:
			getEntryList().clear();
			getEntryList().addAll(
					(Collection<? extends AnnotationMapEntry>) newValue);
			return;
		case TeksPackage.ANNOTATION__ANNOTATED_ELEMENT:
			setAnnotatedElement((TeksElement) newValue);
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
		case TeksPackage.ANNOTATION__ANNOTATION:
			setAnnotation(ANNOTATION_EDEFAULT);
			return;
		case TeksPackage.ANNOTATION__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case TeksPackage.ANNOTATION__ENTRY:
			getEntryList().clear();
			return;
		case TeksPackage.ANNOTATION__ANNOTATED_ELEMENT:
			setAnnotatedElement((TeksElement) null);
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
		case TeksPackage.ANNOTATION__ANNOTATION:
			return ANNOTATION_EDEFAULT == null ? annotation != null
					: !ANNOTATION_EDEFAULT.equals(annotation);
		case TeksPackage.ANNOTATION__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT
					.equals(source);
		case TeksPackage.ANNOTATION__ENTRY:
			return entry != null && !entry.isEmpty();
		case TeksPackage.ANNOTATION__ANNOTATED_ELEMENT:
			return basicGetAnnotatedElement() != null;
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
		result.append(" (annotation: ");
		result.append(annotation);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //AnnotationImpl
