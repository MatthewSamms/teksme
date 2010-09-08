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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Annotation;
import org.teksme.model.teks.Application;
import org.teksme.model.teks.Comment;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getAnnotationsList <em>Annotations</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getCommentsList <em>Comments</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getSupportEmail <em>Support Email</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#isPrivateInstall <em>Private Install</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getWebsiteURL <em>Website URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.ApplicationImpl#getWebsiteName <em>Website Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
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
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected static final String API_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApiKey() <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKey()
	 * @generated
	 * @ordered
	 */
	protected String apiKey = API_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String secretKey = SECRET_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportEmail() <em>Support Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportEmail() <em>Support Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportEmail()
	 * @generated
	 * @ordered
	 */
	protected String supportEmail = SUPPORT_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected String contactEmail = CONTACT_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivateInstall() <em>Private Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivateInstall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_INSTALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivateInstall() <em>Private Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivateInstall()
	 * @generated
	 * @ordered
	 */
	protected boolean privateInstall = PRIVATE_INSTALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteURL() <em>Website URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteURL()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteURL() <em>Website URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteURL()
	 * @generated
	 * @ordered
	 */
	protected String websiteURL = WEBSITE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsiteName() <em>Website Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsiteName() <em>Website Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsiteName()
	 * @generated
	 * @ordered
	 */
	protected String websiteName = WEBSITE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.APPLICATION;
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
			annotations = new EObjectContainmentEList.Resolving<Annotation>(
					Annotation.class, this,
					TeksPackage.APPLICATION__ANNOTATIONS);
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
			comments = new EObjectContainmentEList.Resolving<Comment>(
					Comment.class, this, TeksPackage.APPLICATION__COMMENTS);
		}
		return comments;
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
					TeksPackage.APPLICATION__TITLE, oldTitle, title));
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
					TeksPackage.APPLICATION__NOTE, oldNote, note));
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
					TeksPackage.APPLICATION__AUTHOR, oldAuthor, author));
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
					TeksPackage.APPLICATION__LAST_MODIFIED, oldLastModified,
					lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiKey(String newApiKey) {
		String oldApiKey = apiKey;
		apiKey = newApiKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__API_KEY, oldApiKey, apiKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretKey(String newSecretKey) {
		String oldSecretKey = secretKey;
		secretKey = newSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__SECRET_KEY, oldSecretKey,
					secretKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportEmail() {
		return supportEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportEmail(String newSupportEmail) {
		String oldSupportEmail = supportEmail;
		supportEmail = newSupportEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__SUPPORT_EMAIL, oldSupportEmail,
					supportEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactEmail(String newContactEmail) {
		String oldContactEmail = contactEmail;
		contactEmail = newContactEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__CONTACT_EMAIL, oldContactEmail,
					contactEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivateInstall() {
		return privateInstall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateInstall(boolean newPrivateInstall) {
		boolean oldPrivateInstall = privateInstall;
		privateInstall = newPrivateInstall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__PRIVATE_INSTALL,
					oldPrivateInstall, privateInstall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsiteURL() {
		return websiteURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteURL(String newWebsiteURL) {
		String oldWebsiteURL = websiteURL;
		websiteURL = newWebsiteURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__WEBSITE_URL, oldWebsiteURL,
					websiteURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsiteName() {
		return websiteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsiteName(String newWebsiteName) {
		String oldWebsiteName = websiteName;
		websiteName = newWebsiteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.APPLICATION__WEBSITE_NAME, oldWebsiteName,
					websiteName));
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
		case TeksPackage.APPLICATION__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotationsList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.APPLICATION__COMMENTS:
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
		case TeksPackage.APPLICATION__ANNOTATIONS:
			return getAnnotationsList();
		case TeksPackage.APPLICATION__COMMENTS:
			return getCommentsList();
		case TeksPackage.APPLICATION__TITLE:
			return getTitle();
		case TeksPackage.APPLICATION__NOTE:
			return getNote();
		case TeksPackage.APPLICATION__AUTHOR:
			return getAuthor();
		case TeksPackage.APPLICATION__LAST_MODIFIED:
			return getLastModified();
		case TeksPackage.APPLICATION__APP_ID:
			return getAppId();
		case TeksPackage.APPLICATION__API_KEY:
			return getApiKey();
		case TeksPackage.APPLICATION__SECRET_KEY:
			return getSecretKey();
		case TeksPackage.APPLICATION__SUPPORT_EMAIL:
			return getSupportEmail();
		case TeksPackage.APPLICATION__CONTACT_EMAIL:
			return getContactEmail();
		case TeksPackage.APPLICATION__PRIVATE_INSTALL:
			return isPrivateInstall();
		case TeksPackage.APPLICATION__WEBSITE_URL:
			return getWebsiteURL();
		case TeksPackage.APPLICATION__WEBSITE_NAME:
			return getWebsiteName();
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
		case TeksPackage.APPLICATION__ANNOTATIONS:
			getAnnotationsList().clear();
			getAnnotationsList().addAll(
					(Collection<? extends Annotation>) newValue);
			return;
		case TeksPackage.APPLICATION__COMMENTS:
			getCommentsList().clear();
			getCommentsList().addAll((Collection<? extends Comment>) newValue);
			return;
		case TeksPackage.APPLICATION__TITLE:
			setTitle((String) newValue);
			return;
		case TeksPackage.APPLICATION__NOTE:
			setNote((String) newValue);
			return;
		case TeksPackage.APPLICATION__AUTHOR:
			setAuthor((String) newValue);
			return;
		case TeksPackage.APPLICATION__LAST_MODIFIED:
			setLastModified((Date) newValue);
			return;
		case TeksPackage.APPLICATION__APP_ID:
			setAppId((String) newValue);
			return;
		case TeksPackage.APPLICATION__API_KEY:
			setApiKey((String) newValue);
			return;
		case TeksPackage.APPLICATION__SECRET_KEY:
			setSecretKey((String) newValue);
			return;
		case TeksPackage.APPLICATION__SUPPORT_EMAIL:
			setSupportEmail((String) newValue);
			return;
		case TeksPackage.APPLICATION__CONTACT_EMAIL:
			setContactEmail((String) newValue);
			return;
		case TeksPackage.APPLICATION__PRIVATE_INSTALL:
			setPrivateInstall((Boolean) newValue);
			return;
		case TeksPackage.APPLICATION__WEBSITE_URL:
			setWebsiteURL((String) newValue);
			return;
		case TeksPackage.APPLICATION__WEBSITE_NAME:
			setWebsiteName((String) newValue);
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
		case TeksPackage.APPLICATION__ANNOTATIONS:
			getAnnotationsList().clear();
			return;
		case TeksPackage.APPLICATION__COMMENTS:
			getCommentsList().clear();
			return;
		case TeksPackage.APPLICATION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__NOTE:
			setNote(NOTE_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__LAST_MODIFIED:
			setLastModified(LAST_MODIFIED_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__APP_ID:
			setAppId(APP_ID_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__API_KEY:
			setApiKey(API_KEY_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__SECRET_KEY:
			setSecretKey(SECRET_KEY_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__SUPPORT_EMAIL:
			setSupportEmail(SUPPORT_EMAIL_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__CONTACT_EMAIL:
			setContactEmail(CONTACT_EMAIL_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__PRIVATE_INSTALL:
			setPrivateInstall(PRIVATE_INSTALL_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__WEBSITE_URL:
			setWebsiteURL(WEBSITE_URL_EDEFAULT);
			return;
		case TeksPackage.APPLICATION__WEBSITE_NAME:
			setWebsiteName(WEBSITE_NAME_EDEFAULT);
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
		case TeksPackage.APPLICATION__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TeksPackage.APPLICATION__COMMENTS:
			return comments != null && !comments.isEmpty();
		case TeksPackage.APPLICATION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT
					.equals(title);
		case TeksPackage.APPLICATION__NOTE:
			return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT
					.equals(note);
		case TeksPackage.APPLICATION__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT
					.equals(author);
		case TeksPackage.APPLICATION__LAST_MODIFIED:
			return LAST_MODIFIED_EDEFAULT == null ? lastModified != null
					: !LAST_MODIFIED_EDEFAULT.equals(lastModified);
		case TeksPackage.APPLICATION__APP_ID:
			return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT
					.equals(appId);
		case TeksPackage.APPLICATION__API_KEY:
			return API_KEY_EDEFAULT == null ? apiKey != null
					: !API_KEY_EDEFAULT.equals(apiKey);
		case TeksPackage.APPLICATION__SECRET_KEY:
			return SECRET_KEY_EDEFAULT == null ? secretKey != null
					: !SECRET_KEY_EDEFAULT.equals(secretKey);
		case TeksPackage.APPLICATION__SUPPORT_EMAIL:
			return SUPPORT_EMAIL_EDEFAULT == null ? supportEmail != null
					: !SUPPORT_EMAIL_EDEFAULT.equals(supportEmail);
		case TeksPackage.APPLICATION__CONTACT_EMAIL:
			return CONTACT_EMAIL_EDEFAULT == null ? contactEmail != null
					: !CONTACT_EMAIL_EDEFAULT.equals(contactEmail);
		case TeksPackage.APPLICATION__PRIVATE_INSTALL:
			return privateInstall != PRIVATE_INSTALL_EDEFAULT;
		case TeksPackage.APPLICATION__WEBSITE_URL:
			return WEBSITE_URL_EDEFAULT == null ? websiteURL != null
					: !WEBSITE_URL_EDEFAULT.equals(websiteURL);
		case TeksPackage.APPLICATION__WEBSITE_NAME:
			return WEBSITE_NAME_EDEFAULT == null ? websiteName != null
					: !WEBSITE_NAME_EDEFAULT.equals(websiteName);
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
		result.append(", appId: ");
		result.append(appId);
		result.append(", apiKey: ");
		result.append(apiKey);
		result.append(", secretKey: ");
		result.append(secretKey);
		result.append(", supportEmail: ");
		result.append(supportEmail);
		result.append(", contactEmail: ");
		result.append(contactEmail);
		result.append(", privateInstall: ");
		result.append(privateInstall);
		result.append(", websiteURL: ");
		result.append(websiteURL);
		result.append(", websiteName: ");
		result.append(websiteName);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
