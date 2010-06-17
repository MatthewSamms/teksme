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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Annotation;
import org.teksme.model.teks.Comment;
import org.teksme.model.teks.TeksElement;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.TeksElementImpl#getAnnotationsList <em>Annotations</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksElementImpl#getCommentsList <em>Comments</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.TeksElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TeksElementImpl extends EObjectImpl implements
		TeksElement {
	/**
	 * The cached value of the '{@link #getAnnotationsList() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The empty value for the '{@link #getAnnotations() <em>Annotations</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final Annotation[] ANNOTATIONS_EEMPTY_ARRAY = new Annotation[0];

	/**
	 * The cached value of the '{@link #getCommentsList() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The empty value for the '{@link #getComments() <em>Comments</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final Comment[] COMMENTS_EEMPTY_ARRAY = new Comment[0];

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeksElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.TEKS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation[] getAnnotations() {
		if (annotations == null || annotations.isEmpty())
			return ANNOTATIONS_EEMPTY_ARRAY;
		BasicEList<Annotation> list = (BasicEList<Annotation>) annotations;
		list.shrink();
		return (Annotation[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotations(int index) {
		return getAnnotationsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnnotationsLength() {
		return annotations == null ? 0 : annotations.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(Annotation[] newAnnotations) {
		((BasicEList<Annotation>) getAnnotationsList()).setData(
				newAnnotations.length, newAnnotations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(int index, Annotation element) {
		getAnnotationsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotationsList() {
		if (annotations == null) {
			annotations = new EObjectContainmentWithInverseEList.Resolving<Annotation>(
					Annotation.class, this,
					TeksPackage.TEKS_ELEMENT__ANNOTATIONS,
					TeksPackage.ANNOTATION__ANNOTATED_ELEMENT);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment[] getComments() {
		if (comments == null || comments.isEmpty())
			return COMMENTS_EEMPTY_ARRAY;
		BasicEList<Comment> list = (BasicEList<Comment>) comments;
		list.shrink();
		return (Comment[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComments(int index) {
		return getCommentsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommentsLength() {
		return comments == null ? 0 : comments.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(Comment[] newComments) {
		((BasicEList<Comment>) getCommentsList()).setData(newComments.length,
				newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(int index, Comment element) {
		getCommentsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentsList() {
		if (comments == null) {
			comments = new EObjectContainmentWithInverseEList.Resolving<Comment>(
					Comment.class, this, TeksPackage.TEKS_ELEMENT__COMMENTS,
					TeksPackage.COMMENT__ELEMENT_REF);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.TEKS_ELEMENT__ID, oldId, id));
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
		case TeksPackage.TEKS_ELEMENT__ANNOTATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAnnotationsList())
					.basicAdd(otherEnd, msgs);
		case TeksPackage.TEKS_ELEMENT__COMMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCommentsList())
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
		case TeksPackage.TEKS_ELEMENT__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotationsList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.TEKS_ELEMENT__COMMENTS:
			return ((InternalEList<?>) getCommentsList()).basicRemove(otherEnd,
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
		case TeksPackage.TEKS_ELEMENT__ANNOTATIONS:
			return getAnnotationsList();
		case TeksPackage.TEKS_ELEMENT__COMMENTS:
			return getCommentsList();
		case TeksPackage.TEKS_ELEMENT__ID:
			return getId();
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
		case TeksPackage.TEKS_ELEMENT__ANNOTATIONS:
			getAnnotationsList().clear();
			getAnnotationsList().addAll(
					(Collection<? extends Annotation>) newValue);
			return;
		case TeksPackage.TEKS_ELEMENT__COMMENTS:
			getCommentsList().clear();
			getCommentsList().addAll((Collection<? extends Comment>) newValue);
			return;
		case TeksPackage.TEKS_ELEMENT__ID:
			setId((String) newValue);
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
		case TeksPackage.TEKS_ELEMENT__ANNOTATIONS:
			getAnnotationsList().clear();
			return;
		case TeksPackage.TEKS_ELEMENT__COMMENTS:
			getCommentsList().clear();
			return;
		case TeksPackage.TEKS_ELEMENT__ID:
			setId(ID_EDEFAULT);
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
		case TeksPackage.TEKS_ELEMENT__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TeksPackage.TEKS_ELEMENT__COMMENTS:
			return comments != null && !comments.isEmpty();
		case TeksPackage.TEKS_ELEMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TeksElementImpl
