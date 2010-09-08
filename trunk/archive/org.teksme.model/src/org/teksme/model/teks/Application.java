/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.teksme.model.teks.Application#getAnnotationsList <em>Annotations</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getCommentsList <em>Comments</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getTitle <em>Title</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getSupportEmail <em>Support Email</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#isPrivateInstall <em>Private Install</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getWebsiteURL <em>Website URL</em>}</li>
 *   <li>{@link org.teksme.model.teks.Application#getWebsiteName <em>Website Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.teksme.model.teks.TeksPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Annotation[] getAnnotations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Annotation getAnnotations(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getAnnotationsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAnnotations(Annotation[] newAnnotations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setAnnotations(int index, Annotation element);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Annotations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Annotation> getAnnotationsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Comment[] getComments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Comment getComments(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	int getCommentsLength();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setComments(Comment[] newComments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setComments(int index, Comment element);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.teksme.model.teks.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Comments()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Comment> getCommentsList();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_LastModified()
	 * @model
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_AppId()
	 * @model
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_ApiKey()
	 * @model
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key</em>' attribute.
	 * @see #setSecretKey(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_SecretKey()
	 * @model
	 * @generated
	 */
	String getSecretKey();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getSecretKey <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key</em>' attribute.
	 * @see #getSecretKey()
	 * @generated
	 */
	void setSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Support Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Email</em>' attribute.
	 * @see #setSupportEmail(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_SupportEmail()
	 * @model
	 * @generated
	 */
	String getSupportEmail();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getSupportEmail <em>Support Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Email</em>' attribute.
	 * @see #getSupportEmail()
	 * @generated
	 */
	void setSupportEmail(String value);

	/**
	 * Returns the value of the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Email</em>' attribute.
	 * @see #setContactEmail(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_ContactEmail()
	 * @model
	 * @generated
	 */
	String getContactEmail();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getContactEmail <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Email</em>' attribute.
	 * @see #getContactEmail()
	 * @generated
	 */
	void setContactEmail(String value);

	/**
	 * Returns the value of the '<em><b>Private Install</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Install</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Install</em>' attribute.
	 * @see #setPrivateInstall(boolean)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_PrivateInstall()
	 * @model
	 * @generated
	 */
	boolean isPrivateInstall();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#isPrivateInstall <em>Private Install</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Install</em>' attribute.
	 * @see #isPrivateInstall()
	 * @generated
	 */
	void setPrivateInstall(boolean value);

	/**
	 * Returns the value of the '<em><b>Website URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website URL</em>' attribute.
	 * @see #setWebsiteURL(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_WebsiteURL()
	 * @model
	 * @generated
	 */
	String getWebsiteURL();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getWebsiteURL <em>Website URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website URL</em>' attribute.
	 * @see #getWebsiteURL()
	 * @generated
	 */
	void setWebsiteURL(String value);

	/**
	 * Returns the value of the '<em><b>Website Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website Name</em>' attribute.
	 * @see #setWebsiteName(String)
	 * @see org.teksme.model.teks.TeksPackage#getApplication_WebsiteName()
	 * @model
	 * @generated
	 */
	String getWebsiteName();

	/**
	 * Sets the value of the '{@link org.teksme.model.teks.Application#getWebsiteName <em>Website Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Name</em>' attribute.
	 * @see #getWebsiteName()
	 * @generated
	 */
	void setWebsiteName(String value);

} // Application
