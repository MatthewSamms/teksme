/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Choice;
import org.teksme.model.teks.Configuration;
import org.teksme.model.teks.Inquiry;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inquiry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.InquiryImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InquiryImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InquiryImpl#getChoiceList <em>Choice</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InquiryImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InquiryImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.InquiryImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InquiryImpl extends TeksElementImpl implements Inquiry {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoiceList() <em>Choice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceList()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choice;

	/**
	 * The empty value for the '{@link #getChoice() <em>Choice</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected static final Choice[] CHOICE_EEMPTY_ARRAY = new Choice[0];

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected Configuration settings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InquiryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.INQUIRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INQUIRY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INQUIRY__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice[] getChoice() {
		if (choice == null || choice.isEmpty())
			return CHOICE_EEMPTY_ARRAY;
		BasicEList<Choice> list = (BasicEList<Choice>) choice;
		list.shrink();
		return (Choice[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getChoice(int index) {
		return getChoiceList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChoiceLength() {
		return choice == null ? 0 : choice.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(Choice[] newChoice) {
		((BasicEList<Choice>) getChoiceList()).setData(newChoice.length,
				newChoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(int index, Choice element) {
		getChoiceList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoiceList() {
		if (choice == null) {
			choice = new EObjectContainmentWithInverseEList.Resolving<Choice>(
					Choice.class, this, TeksPackage.INQUIRY__CHOICE,
					TeksPackage.CHOICE__INQUIRY_REF);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INQUIRY__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(Date newLastModified) {
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INQUIRY__LAST_MODIFIED, oldLastModified,
					lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getSettings() {
		if (settings != null && settings.eIsProxy()) {
			InternalEObject oldSettings = (InternalEObject) settings;
			settings = (Configuration) eResolveProxy(oldSettings);
			if (settings != oldSettings) {
				InternalEObject newSettings = (InternalEObject) settings;
				NotificationChain msgs = oldSettings.eInverseRemove(this,
						TeksPackage.CONFIGURATION__INQUIRY_REF,
						Configuration.class, null);
				if (newSettings.eInternalContainer() == null) {
					msgs = newSettings.eInverseAdd(this,
							TeksPackage.CONFIGURATION__INQUIRY_REF,
							Configuration.class, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.INQUIRY__SETTINGS, oldSettings,
							settings));
			}
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(Configuration newSettings,
			NotificationChain msgs) {
		Configuration oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.INQUIRY__SETTINGS,
					oldSettings, newSettings);
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
	public void setSettings(Configuration newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject) settings).eInverseRemove(this,
						TeksPackage.CONFIGURATION__INQUIRY_REF,
						Configuration.class, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject) newSettings).eInverseAdd(this,
						TeksPackage.CONFIGURATION__INQUIRY_REF,
						Configuration.class, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.INQUIRY__SETTINGS, newSettings, newSettings));
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
		case TeksPackage.INQUIRY__CHOICE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChoiceList())
					.basicAdd(otherEnd, msgs);
		case TeksPackage.INQUIRY__SETTINGS:
			if (settings != null)
				msgs = ((InternalEObject) settings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.INQUIRY__SETTINGS,
						null, msgs);
			return basicSetSettings((Configuration) otherEnd, msgs);
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
		case TeksPackage.INQUIRY__CHOICE:
			return ((InternalEList<?>) getChoiceList()).basicRemove(otherEnd,
					msgs);
		case TeksPackage.INQUIRY__SETTINGS:
			return basicSetSettings(null, msgs);
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
		case TeksPackage.INQUIRY__TITLE:
			return getTitle();
		case TeksPackage.INQUIRY__NOTE:
			return getNote();
		case TeksPackage.INQUIRY__CHOICE:
			return getChoiceList();
		case TeksPackage.INQUIRY__AUTHOR:
			return getAuthor();
		case TeksPackage.INQUIRY__LAST_MODIFIED:
			return getLastModified();
		case TeksPackage.INQUIRY__SETTINGS:
			if (resolve)
				return getSettings();
			return basicGetSettings();
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
		case TeksPackage.INQUIRY__TITLE:
			setTitle((String) newValue);
			return;
		case TeksPackage.INQUIRY__NOTE:
			setNote((String) newValue);
			return;
		case TeksPackage.INQUIRY__CHOICE:
			getChoiceList().clear();
			getChoiceList().addAll((Collection<? extends Choice>) newValue);
			return;
		case TeksPackage.INQUIRY__AUTHOR:
			setAuthor((String) newValue);
			return;
		case TeksPackage.INQUIRY__LAST_MODIFIED:
			setLastModified((Date) newValue);
			return;
		case TeksPackage.INQUIRY__SETTINGS:
			setSettings((Configuration) newValue);
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
		case TeksPackage.INQUIRY__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case TeksPackage.INQUIRY__NOTE:
			setNote(NOTE_EDEFAULT);
			return;
		case TeksPackage.INQUIRY__CHOICE:
			getChoiceList().clear();
			return;
		case TeksPackage.INQUIRY__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case TeksPackage.INQUIRY__LAST_MODIFIED:
			setLastModified(LAST_MODIFIED_EDEFAULT);
			return;
		case TeksPackage.INQUIRY__SETTINGS:
			setSettings((Configuration) null);
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
		case TeksPackage.INQUIRY__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT
					.equals(title);
		case TeksPackage.INQUIRY__NOTE:
			return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT
					.equals(note);
		case TeksPackage.INQUIRY__CHOICE:
			return choice != null && !choice.isEmpty();
		case TeksPackage.INQUIRY__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT
					.equals(author);
		case TeksPackage.INQUIRY__LAST_MODIFIED:
			return LAST_MODIFIED_EDEFAULT == null ? lastModified != null
					: !LAST_MODIFIED_EDEFAULT.equals(lastModified);
		case TeksPackage.INQUIRY__SETTINGS:
			return settings != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", note: ");
		result.append(note);
		result.append(", author: ");
		result.append(author);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(')');
		return result.toString();
	}

} //InquiryImpl
