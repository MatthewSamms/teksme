/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksFactory
 * @model kind="package"
 * @generated
 */
public interface TeksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "teks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://teksme.org/meta/1.0.0/teks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "teks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TeksPackage eINSTANCE = org.teksme.model.teks.impl.TeksPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.TeksImpl <em>Teks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.TeksImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getTeks()
	 * @generated
	 */
	int TEKS = 0;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__APP_ID = 0;

	/**
	 * The feature id for the '<em><b>Campaign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__CAMPAIGN = 1;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__S = 2;

	/**
	 * The feature id for the '<em><b>In Msg</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__IN_MSG = 3;

	/**
	 * The feature id for the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__ACCOUNT_ID = 4;

	/**
	 * The number of structural features of the '<em>Teks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.CampaignImpl <em>Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.CampaignImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getCampaign()
	 * @generated
	 */
	int CAMPAIGN = 1;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__RESPONSES = 1;

	/**
	 * The feature id for the '<em><b>Confirmations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__CONFIRMATIONS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__ID = 3;

	/**
	 * The feature id for the '<em><b>Advertise It</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN__ADVERTISE_IT = 4;

	/**
	 * The number of structural features of the '<em>Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.TeksElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.TeksElementImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getTeksElement()
	 * @generated
	 */
	int TEKS_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS_ELEMENT__COMMENTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS_ELEMENT__ID = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.InquiryImpl <em>Inquiry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.InquiryImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getInquiry()
	 * @generated
	 */
	int INQUIRY = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__ANNOTATIONS = TEKS_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__COMMENTS = TEKS_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__ID = TEKS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__TITLE = TEKS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__NOTE = TEKS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__CHOICE = TEKS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__AUTHOR = TEKS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__LAST_MODIFIED = TEKS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY__SETTINGS = TEKS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Inquiry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INQUIRY_FEATURE_COUNT = TEKS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ChoiceImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ANNOTATIONS = TEKS_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__COMMENTS = TEKS_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ID = TEKS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__QUESTION = TEKS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NOTE = TEKS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MANDATORY = TEKS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inquiry Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__INQUIRY_REF = TEKS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = TEKS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ResponseImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__ANNOTATIONS = TEKS_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__COMMENTS = TEKS_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__ID = TEKS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE = TEKS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = TEKS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ConfirmationImpl <em>Confirmation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ConfirmationImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getConfirmation()
	 * @generated
	 */
	int CONFIRMATION = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION__ANNOTATIONS = TEKS_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION__COMMENTS = TEKS_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION__ID = TEKS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Auto Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION__AUTO_REPLY = TEKS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Confirmation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION__CONFIRMATION = TEKS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Reply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION__CUSTOM_REPLY = TEKS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Response Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION__RESPONSE_REF = TEKS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Confirmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_FEATURE_COUNT = TEKS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ConfigurationImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Response Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__RESPONSE_RESTRICTIONS = 0;

	/**
	 * The feature id for the '<em><b>Inquiry Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INQUIRY_REF = 1;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__EXPIRATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Schedule Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SCHEDULE_START_DATE = 3;

	/**
	 * The feature id for the '<em><b>Communication Channel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMMUNICATION_CHANNEL = 4;

	/**
	 * The feature id for the '<em><b>Suspend On Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SUSPEND_ON_FAILURE = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Batch Response Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BATCH_RESPONSE_DELIVERY = 7;

	/**
	 * The feature id for the '<em><b>Synchronous Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SYNCHRONOUS_CONFIRMATION = 8;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ResponseRestrictionImpl <em>Response Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ResponseRestrictionImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponseRestriction()
	 * @generated
	 */
	int RESPONSE_RESTRICTION = 8;

	/**
	 * The feature id for the '<em><b>Accept Multiple Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS = 0;

	/**
	 * The feature id for the '<em><b>Restriction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__RESTRICTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__ANONYMOUS = 2;

	/**
	 * The feature id for the '<em><b>Owned Inquiry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__OWNED_INQUIRY = 3;

	/**
	 * The feature id for the '<em><b>Block Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__BLOCK_REPEAT = 4;

	/**
	 * The feature id for the '<em><b>Moderate First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__MODERATE_FIRST = 5;

	/**
	 * The number of structural features of the '<em>Response Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.FreeTextImpl <em>Free Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.FreeTextImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getFreeText()
	 * @generated
	 */
	int FREE_TEXT = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__ANNOTATIONS = CHOICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__COMMENTS = CHOICE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__ID = CHOICE__ID;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__QUESTION = CHOICE__QUESTION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__NOTE = CHOICE__NOTE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__MANDATORY = CHOICE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Inquiry Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__INQUIRY_REF = CHOICE__INQUIRY_REF;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__ANSWER = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__KEYWORD = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__AUTO_KEYWORD = CHOICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Free Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.MultipleChoiceImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__ANNOTATIONS = CHOICE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__COMMENTS = CHOICE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__ID = CHOICE__ID;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__QUESTION = CHOICE__QUESTION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NOTE = CHOICE__NOTE;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__MANDATORY = CHOICE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Inquiry Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__INQUIRY_REF = CHOICE__INQUIRY_REF;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__ANSWER = CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = CHOICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnnotationImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATED_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ResponseDetailImpl <em>Response Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ResponseDetailImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponseDetail()
	 * @generated
	 */
	int RESPONSE_DETAIL = 12;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DETAIL__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Raw Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DETAIL__RAW_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DETAIL__SET_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Response Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DETAIL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.MessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 13;

	/**
	 * The feature id for the '<em><b>Text Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TEXT_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__GATEWAY = 4;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CHARSET = 5;

	/**
	 * The feature id for the '<em><b>Header Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__HEADER_DATA = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FROM = 7;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TO = 8;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnnotationMapEntryImpl <em>Annotation Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnnotationMapEntryImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnnotationMapEntry()
	 * @generated
	 */
	int ANNOTATION_MAP_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnswerRefImpl <em>Answer Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnswerRefImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnswerRef()
	 * @generated
	 */
	int ANSWER_REF = 15;

	/**
	 * The feature id for the '<em><b>Choice Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF__CHOICE_REF = 0;

	/**
	 * The feature id for the '<em><b>Answer Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF__ANSWER_REF = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF__ID = 3;

	/**
	 * The number of structural features of the '<em>Answer Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.InboundMessageImpl <em>Inbound Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.InboundMessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getInboundMessage()
	 * @generated
	 */
	int INBOUND_MESSAGE = 16;

	/**
	 * The feature id for the '<em><b>Text Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__TEXT_MESSAGE = MESSAGE__TEXT_MESSAGE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__TIMESTAMP = MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__TYPE = MESSAGE__TYPE;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__GATEWAY = MESSAGE__GATEWAY;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__CHARSET = MESSAGE__CHARSET;

	/**
	 * The feature id for the '<em><b>Header Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__HEADER_DATA = MESSAGE__HEADER_DATA;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__FROM = MESSAGE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__TO = MESSAGE__TO;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__PART_NUMBER = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__MESSAGE_TYPE = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inbound Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.OutboundMessageImpl <em>Outbound Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.OutboundMessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getOutboundMessage()
	 * @generated
	 */
	int OUTBOUND_MESSAGE = 17;

	/**
	 * The feature id for the '<em><b>Text Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__TEXT_MESSAGE = MESSAGE__TEXT_MESSAGE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__TIMESTAMP = MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__TYPE = MESSAGE__TYPE;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__GATEWAY = MESSAGE__GATEWAY;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__CHARSET = MESSAGE__CHARSET;

	/**
	 * The feature id for the '<em><b>Header Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__HEADER_DATA = MESSAGE__HEADER_DATA;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__FROM = MESSAGE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__TO = MESSAGE__TO;

	/**
	 * The feature id for the '<em><b>Message Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__MESSAGE_HANDLER = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Outbound Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.CustomOutboundMessageImpl <em>Custom Outbound Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.CustomOutboundMessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getCustomOutboundMessage()
	 * @generated
	 */
	int CUSTOM_OUTBOUND_MESSAGE = 18;

	/**
	 * The feature id for the '<em><b>Text Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__TEXT_MESSAGE = OUTBOUND_MESSAGE__TEXT_MESSAGE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__TIMESTAMP = OUTBOUND_MESSAGE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__ID = OUTBOUND_MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__TYPE = OUTBOUND_MESSAGE__TYPE;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__GATEWAY = OUTBOUND_MESSAGE__GATEWAY;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__CHARSET = OUTBOUND_MESSAGE__CHARSET;

	/**
	 * The feature id for the '<em><b>Header Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__HEADER_DATA = OUTBOUND_MESSAGE__HEADER_DATA;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__FROM = OUTBOUND_MESSAGE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__TO = OUTBOUND_MESSAGE__TO;

	/**
	 * The feature id for the '<em><b>Message Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE__MESSAGE_HANDLER = OUTBOUND_MESSAGE__MESSAGE_HANDLER;

	/**
	 * The number of structural features of the '<em>Custom Outbound Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OUTBOUND_MESSAGE_FEATURE_COUNT = OUTBOUND_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.CommentImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 1;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__DATE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Element Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ELEMENT_REF = 3;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ReportImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 20;

	/**
	 * The feature id for the '<em><b>Hide Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__HIDE_RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Percentage Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__PERCENTAGE_ONLY = 1;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.CommandImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 21;

	/**
	 * The feature id for the '<em><b>Default Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DEFAULT_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnswerImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 22;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ID = 1;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__KEYWORD = 2;

	/**
	 * The feature id for the '<em><b>Auto Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__AUTO_KEYWORD = 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__DEFAULT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__SELECTED = 5;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.LanguageKind <em>Language Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.LanguageKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getLanguageKind()
	 * @generated
	 */
	int LANGUAGE_KIND = 23;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.ChannelKind <em>Channel Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.ChannelKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getChannelKind()
	 * @generated
	 */
	int CHANNEL_KIND = 24;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.RestrictionKind <em>Restriction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.RestrictionKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getRestrictionKind()
	 * @generated
	 */
	int RESTRICTION_KIND = 25;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.MessageType
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.StopCommandKind <em>Stop Command Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.StopCommandKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getStopCommandKind()
	 * @generated
	 */
	int STOP_COMMAND_KIND = 27;

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Teks <em>Teks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teks</em>'.
	 * @see org.teksme.model.teks.Teks
	 * @generated
	 */
	EClass getTeks();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Teks#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.teksme.model.teks.Teks#getAppId()
	 * @see #getTeks()
	 * @generated
	 */
	EAttribute getTeks_AppId();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Teks#getCampaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Campaign</em>'.
	 * @see org.teksme.model.teks.Teks#getCampaign()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_Campaign();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Teks#getSList <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see org.teksme.model.teks.Teks#getSList()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_S();

	/**
	 * Returns the meta object for the reference list '{@link org.teksme.model.teks.Teks#getInMsgList <em>In Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Msg</em>'.
	 * @see org.teksme.model.teks.Teks#getInMsgList()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_InMsg();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Teks#getAccountID <em>Account ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account ID</em>'.
	 * @see org.teksme.model.teks.Teks#getAccountID()
	 * @see #getTeks()
	 * @generated
	 */
	EAttribute getTeks_AccountID();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Campaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign</em>'.
	 * @see org.teksme.model.teks.Campaign
	 * @generated
	 */
	EClass getCampaign();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Campaign#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance</em>'.
	 * @see org.teksme.model.teks.Campaign#getInstance()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Instance();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Campaign#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responses</em>'.
	 * @see org.teksme.model.teks.Campaign#getResponses()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Responses();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Campaign#getConfirmations <em>Confirmations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confirmations</em>'.
	 * @see org.teksme.model.teks.Campaign#getConfirmations()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_Confirmations();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Campaign#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.Campaign#getId()
	 * @see #getCampaign()
	 * @generated
	 */
	EAttribute getCampaign_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Campaign#getAdvertiseIt <em>Advertise It</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advertise It</em>'.
	 * @see org.teksme.model.teks.Campaign#getAdvertiseIt()
	 * @see #getCampaign()
	 * @generated
	 */
	EReference getCampaign_AdvertiseIt();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.TeksElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.teksme.model.teks.TeksElement
	 * @generated
	 */
	EClass getTeksElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.TeksElement#getAnnotationsList <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.teksme.model.teks.TeksElement#getAnnotationsList()
	 * @see #getTeksElement()
	 * @generated
	 */
	EReference getTeksElement_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.TeksElement#getCommentsList <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.teksme.model.teks.TeksElement#getCommentsList()
	 * @see #getTeksElement()
	 * @generated
	 */
	EReference getTeksElement_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.TeksElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.TeksElement#getId()
	 * @see #getTeksElement()
	 * @generated
	 */
	EAttribute getTeksElement_Id();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Inquiry <em>Inquiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inquiry</em>'.
	 * @see org.teksme.model.teks.Inquiry
	 * @generated
	 */
	EClass getInquiry();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Inquiry#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.teksme.model.teks.Inquiry#getTitle()
	 * @see #getInquiry()
	 * @generated
	 */
	EAttribute getInquiry_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Inquiry#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.teksme.model.teks.Inquiry#getNote()
	 * @see #getInquiry()
	 * @generated
	 */
	EAttribute getInquiry_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Inquiry#getChoiceList <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see org.teksme.model.teks.Inquiry#getChoiceList()
	 * @see #getInquiry()
	 * @generated
	 */
	EReference getInquiry_Choice();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Inquiry#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.teksme.model.teks.Inquiry#getAuthor()
	 * @see #getInquiry()
	 * @generated
	 */
	EAttribute getInquiry_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Inquiry#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.teksme.model.teks.Inquiry#getLastModified()
	 * @see #getInquiry()
	 * @generated
	 */
	EAttribute getInquiry_LastModified();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Inquiry#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.teksme.model.teks.Inquiry#getSettings()
	 * @see #getInquiry()
	 * @generated
	 */
	EReference getInquiry_Settings();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see org.teksme.model.teks.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Choice#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see org.teksme.model.teks.Choice#getQuestion()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Question();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Choice#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.teksme.model.teks.Choice#getNote()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Choice#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.teksme.model.teks.Choice#isMandatory()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Mandatory();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.Choice#getInquiryRef <em>Inquiry Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inquiry Ref</em>'.
	 * @see org.teksme.model.teks.Choice#getInquiryRef()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_InquiryRef();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see org.teksme.model.teks.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Response#getResponseList <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response</em>'.
	 * @see org.teksme.model.teks.Response#getResponseList()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Response();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Confirmation <em>Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confirmation</em>'.
	 * @see org.teksme.model.teks.Confirmation
	 * @generated
	 */
	EClass getConfirmation();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Confirmation#getAutoReply <em>Auto Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Reply</em>'.
	 * @see org.teksme.model.teks.Confirmation#getAutoReply()
	 * @see #getConfirmation()
	 * @generated
	 */
	EReference getConfirmation_AutoReply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Confirmation#getConfirmationList <em>Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Confirmation</em>'.
	 * @see org.teksme.model.teks.Confirmation#getConfirmationList()
	 * @see #getConfirmation()
	 * @generated
	 */
	EReference getConfirmation_Confirmation();

	/**
	 * Returns the meta object for the reference '{@link org.teksme.model.teks.Confirmation#getCustomReply <em>Custom Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Reply</em>'.
	 * @see org.teksme.model.teks.Confirmation#getCustomReply()
	 * @see #getConfirmation()
	 * @generated
	 */
	EReference getConfirmation_CustomReply();

	/**
	 * Returns the meta object for the reference '{@link org.teksme.model.teks.Confirmation#getResponseRef <em>Response Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Ref</em>'.
	 * @see org.teksme.model.teks.Confirmation#getResponseRef()
	 * @see #getConfirmation()
	 * @generated
	 */
	EReference getConfirmation_ResponseRef();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.teksme.model.teks.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Configuration#getResponseRestrictions <em>Response Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Restrictions</em>'.
	 * @see org.teksme.model.teks.Configuration#getResponseRestrictions()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_ResponseRestrictions();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.Configuration#getInquiryRef <em>Inquiry Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inquiry Ref</em>'.
	 * @see org.teksme.model.teks.Configuration#getInquiryRef()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_InquiryRef();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Configuration#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see org.teksme.model.teks.Configuration#getExpirationDate()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Configuration#getScheduleStartDate <em>Schedule Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Start Date</em>'.
	 * @see org.teksme.model.teks.Configuration#getScheduleStartDate()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_ScheduleStartDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.teksme.model.teks.Configuration#getCommunicationChannelList <em>Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Communication Channel</em>'.
	 * @see org.teksme.model.teks.Configuration#getCommunicationChannelList()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_CommunicationChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Configuration#isSuspendOnFailure <em>Suspend On Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend On Failure</em>'.
	 * @see org.teksme.model.teks.Configuration#isSuspendOnFailure()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_SuspendOnFailure();

	/**
	 * Returns the meta object for the attribute list '{@link org.teksme.model.teks.Configuration#getLanguageList <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see org.teksme.model.teks.Configuration#getLanguageList()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Configuration#isBatchResponseDelivery <em>Batch Response Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Response Delivery</em>'.
	 * @see org.teksme.model.teks.Configuration#isBatchResponseDelivery()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_BatchResponseDelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Configuration#isSynchronousConfirmation <em>Synchronous Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous Confirmation</em>'.
	 * @see org.teksme.model.teks.Configuration#isSynchronousConfirmation()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_SynchronousConfirmation();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.ResponseRestriction <em>Response Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Restriction</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction
	 * @generated
	 */
	EClass getResponseRestriction();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.ResponseRestriction#isAcceptMultipleChannels <em>Accept Multiple Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Multiple Channels</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction#isAcceptMultipleChannels()
	 * @see #getResponseRestriction()
	 * @generated
	 */
	EAttribute getResponseRestriction_AcceptMultipleChannels();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.ResponseRestriction#getRestrictionType <em>Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restriction Type</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction#getRestrictionType()
	 * @see #getResponseRestriction()
	 * @generated
	 */
	EAttribute getResponseRestriction_RestrictionType();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.ResponseRestriction#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction#isAnonymous()
	 * @see #getResponseRestriction()
	 * @generated
	 */
	EAttribute getResponseRestriction_Anonymous();

	/**
	 * Returns the meta object for the reference '{@link org.teksme.model.teks.ResponseRestriction#getOwnedInquiry <em>Owned Inquiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Inquiry</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction#getOwnedInquiry()
	 * @see #getResponseRestriction()
	 * @generated
	 */
	EReference getResponseRestriction_OwnedInquiry();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.ResponseRestriction#isBlockRepeat <em>Block Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Repeat</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction#isBlockRepeat()
	 * @see #getResponseRestriction()
	 * @generated
	 */
	EAttribute getResponseRestriction_BlockRepeat();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.ResponseRestriction#isModerateFirst <em>Moderate First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moderate First</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction#isModerateFirst()
	 * @see #getResponseRestriction()
	 * @generated
	 */
	EAttribute getResponseRestriction_ModerateFirst();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.FreeText <em>Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text</em>'.
	 * @see org.teksme.model.teks.FreeText
	 * @generated
	 */
	EClass getFreeText();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.FreeText#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answer</em>'.
	 * @see org.teksme.model.teks.FreeText#getAnswer()
	 * @see #getFreeText()
	 * @generated
	 */
	EReference getFreeText_Answer();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.FreeText#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.teksme.model.teks.FreeText#getKeyword()
	 * @see #getFreeText()
	 * @generated
	 */
	EAttribute getFreeText_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.FreeText#isAutoKeyword <em>Auto Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Keyword</em>'.
	 * @see org.teksme.model.teks.FreeText#isAutoKeyword()
	 * @see #getFreeText()
	 * @generated
	 */
	EAttribute getFreeText_AutoKeyword();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see org.teksme.model.teks.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.MultipleChoice#getAnswerList <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see org.teksme.model.teks.MultipleChoice#getAnswerList()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Answer();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.teksme.model.teks.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Annotation#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see org.teksme.model.teks.Annotation#getAnnotation()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Annotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.teksme.model.teks.Annotation#getSource()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Annotation#getEntryList <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.teksme.model.teks.Annotation#getEntryList()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Entry();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.Annotation#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Annotated Element</em>'.
	 * @see org.teksme.model.teks.Annotation#getAnnotatedElement()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotatedElement();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.ResponseDetail <em>Response Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Detail</em>'.
	 * @see org.teksme.model.teks.ResponseDetail
	 * @generated
	 */
	EClass getResponseDetail();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.ResponseDetail#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see org.teksme.model.teks.ResponseDetail#getDateTime()
	 * @see #getResponseDetail()
	 * @generated
	 */
	EAttribute getResponseDetail_DateTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.ResponseDetail#getRawMessage <em>Raw Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Raw Message</em>'.
	 * @see org.teksme.model.teks.ResponseDetail#getRawMessage()
	 * @see #getResponseDetail()
	 * @generated
	 */
	EReference getResponseDetail_RawMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.ResponseDetail#getSetValueList <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Value</em>'.
	 * @see org.teksme.model.teks.ResponseDetail#getSetValueList()
	 * @see #getResponseDetail()
	 * @generated
	 */
	EReference getResponseDetail_SetValue();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.teksme.model.teks.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getTextMessage <em>Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Message</em>'.
	 * @see org.teksme.model.teks.Message#getTextMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_TextMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.teksme.model.teks.Message#getTimestamp()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.Message#getId()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.teksme.model.teks.Message#getTypeList <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see org.teksme.model.teks.Message#getTypeList()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see org.teksme.model.teks.Message#getGateway()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Gateway();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.teksme.model.teks.Message#getCharset()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getHeaderData <em>Header Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Data</em>'.
	 * @see org.teksme.model.teks.Message#getHeaderData()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_HeaderData();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.teksme.model.teks.Message#getFrom()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_From();

	/**
	 * Returns the meta object for the attribute list '{@link org.teksme.model.teks.Message#getToList <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>To</em>'.
	 * @see org.teksme.model.teks.Message#getToList()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_To();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.AnnotationMapEntry <em>Annotation Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Map Entry</em>'.
	 * @see org.teksme.model.teks.AnnotationMapEntry
	 * @generated
	 */
	EClass getAnnotationMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.AnnotationMapEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.teksme.model.teks.AnnotationMapEntry#getKey()
	 * @see #getAnnotationMapEntry()
	 * @generated
	 */
	EAttribute getAnnotationMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.AnnotationMapEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.teksme.model.teks.AnnotationMapEntry#getValue()
	 * @see #getAnnotationMapEntry()
	 * @generated
	 */
	EAttribute getAnnotationMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.AnswerRef <em>Answer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Ref</em>'.
	 * @see org.teksme.model.teks.AnswerRef
	 * @generated
	 */
	EClass getAnswerRef();

	/**
	 * Returns the meta object for the reference '{@link org.teksme.model.teks.AnswerRef#getChoiceRef <em>Choice Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Choice Ref</em>'.
	 * @see org.teksme.model.teks.AnswerRef#getChoiceRef()
	 * @see #getAnswerRef()
	 * @generated
	 */
	EReference getAnswerRef_ChoiceRef();

	/**
	 * Returns the meta object for the reference '{@link org.teksme.model.teks.AnswerRef#getAnswerRef <em>Answer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Answer Ref</em>'.
	 * @see org.teksme.model.teks.AnswerRef#getAnswerRef()
	 * @see #getAnswerRef()
	 * @generated
	 */
	EReference getAnswerRef_AnswerRef();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.AnswerRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.teksme.model.teks.AnswerRef#getValue()
	 * @see #getAnswerRef()
	 * @generated
	 */
	EAttribute getAnswerRef_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.AnswerRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.AnswerRef#getId()
	 * @see #getAnswerRef()
	 * @generated
	 */
	EAttribute getAnswerRef_Id();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.InboundMessage <em>Inbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Message</em>'.
	 * @see org.teksme.model.teks.InboundMessage
	 * @generated
	 */
	EClass getInboundMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.InboundMessage#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see org.teksme.model.teks.InboundMessage#getPartNumber()
	 * @see #getInboundMessage()
	 * @generated
	 */
	EAttribute getInboundMessage_PartNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.InboundMessage#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see org.teksme.model.teks.InboundMessage#getMessageType()
	 * @see #getInboundMessage()
	 * @generated
	 */
	EAttribute getInboundMessage_MessageType();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.OutboundMessage <em>Outbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound Message</em>'.
	 * @see org.teksme.model.teks.OutboundMessage
	 * @generated
	 */
	EClass getOutboundMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.OutboundMessage#getMessageHandler <em>Message Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Handler</em>'.
	 * @see org.teksme.model.teks.OutboundMessage#getMessageHandler()
	 * @see #getOutboundMessage()
	 * @generated
	 */
	EAttribute getOutboundMessage_MessageHandler();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.CustomOutboundMessage <em>Custom Outbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Outbound Message</em>'.
	 * @see org.teksme.model.teks.CustomOutboundMessage
	 * @generated
	 */
	EClass getCustomOutboundMessage();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.teksme.model.teks.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Comment#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.teksme.model.teks.Comment#getID()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.teksme.model.teks.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Comment#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see org.teksme.model.teks.Comment#getDateTime()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_DateTime();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.Comment#getElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element Ref</em>'.
	 * @see org.teksme.model.teks.Comment#getElementRef()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_ElementRef();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see org.teksme.model.teks.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Report#isHideResults <em>Hide Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Results</em>'.
	 * @see org.teksme.model.teks.Report#isHideResults()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_HideResults();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Report#isPercentageOnly <em>Percentage Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Only</em>'.
	 * @see org.teksme.model.teks.Report#isPercentageOnly()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_PercentageOnly();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see org.teksme.model.teks.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Command#getDefaultHandler <em>Default Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Handler</em>'.
	 * @see org.teksme.model.teks.Command#getDefaultHandler()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_DefaultHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Command#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.teksme.model.teks.Command#getID()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.teksme.model.teks.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see org.teksme.model.teks.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Answer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.teksme.model.teks.Answer#getText()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Answer#isId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.Answer#isId()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Answer#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.teksme.model.teks.Answer#getKeyword()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Answer#isAutoKeyword <em>Auto Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Keyword</em>'.
	 * @see org.teksme.model.teks.Answer#isAutoKeyword()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_AutoKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Answer#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.teksme.model.teks.Answer#getDefaultValue()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Answer#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.teksme.model.teks.Answer#isSelected()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Selected();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.LanguageKind <em>Language Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Kind</em>'.
	 * @see org.teksme.model.teks.LanguageKind
	 * @generated
	 */
	EEnum getLanguageKind();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.ChannelKind <em>Channel Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Channel Kind</em>'.
	 * @see org.teksme.model.teks.ChannelKind
	 * @generated
	 */
	EEnum getChannelKind();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.RestrictionKind <em>Restriction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Restriction Kind</em>'.
	 * @see org.teksme.model.teks.RestrictionKind
	 * @generated
	 */
	EEnum getRestrictionKind();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see org.teksme.model.teks.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.StopCommandKind <em>Stop Command Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stop Command Kind</em>'.
	 * @see org.teksme.model.teks.StopCommandKind
	 * @generated
	 */
	EEnum getStopCommandKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TeksFactory getTeksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.TeksImpl <em>Teks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.TeksImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getTeks()
		 * @generated
		 */
		EClass TEKS = eINSTANCE.getTeks();

		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEKS__APP_ID = eINSTANCE.getTeks_AppId();

		/**
		 * The meta object literal for the '<em><b>Campaign</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__CAMPAIGN = eINSTANCE.getTeks_Campaign();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__S = eINSTANCE.getTeks_S();

		/**
		 * The meta object literal for the '<em><b>In Msg</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__IN_MSG = eINSTANCE.getTeks_InMsg();

		/**
		 * The meta object literal for the '<em><b>Account ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEKS__ACCOUNT_ID = eINSTANCE.getTeks_AccountID();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.CampaignImpl <em>Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.CampaignImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getCampaign()
		 * @generated
		 */
		EClass CAMPAIGN = eINSTANCE.getCampaign();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN__INSTANCE = eINSTANCE.getCampaign_Instance();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN__RESPONSES = eINSTANCE.getCampaign_Responses();

		/**
		 * The meta object literal for the '<em><b>Confirmations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN__CONFIRMATIONS = eINSTANCE
				.getCampaign_Confirmations();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN__ID = eINSTANCE.getCampaign_Id();

		/**
		 * The meta object literal for the '<em><b>Advertise It</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN__ADVERTISE_IT = eINSTANCE.getCampaign_AdvertiseIt();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.TeksElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.TeksElementImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getTeksElement()
		 * @generated
		 */
		EClass TEKS_ELEMENT = eINSTANCE.getTeksElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS_ELEMENT__ANNOTATIONS = eINSTANCE
				.getTeksElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS_ELEMENT__COMMENTS = eINSTANCE.getTeksElement_Comments();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEKS_ELEMENT__ID = eINSTANCE.getTeksElement_Id();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.InquiryImpl <em>Inquiry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.InquiryImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getInquiry()
		 * @generated
		 */
		EClass INQUIRY = eINSTANCE.getInquiry();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INQUIRY__TITLE = eINSTANCE.getInquiry_Title();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INQUIRY__NOTE = eINSTANCE.getInquiry_Note();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INQUIRY__CHOICE = eINSTANCE.getInquiry_Choice();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INQUIRY__AUTHOR = eINSTANCE.getInquiry_Author();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INQUIRY__LAST_MODIFIED = eINSTANCE.getInquiry_LastModified();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INQUIRY__SETTINGS = eINSTANCE.getInquiry_Settings();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ChoiceImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__QUESTION = eINSTANCE.getChoice_Question();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__NOTE = eINSTANCE.getChoice_Note();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__MANDATORY = eINSTANCE.getChoice_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Inquiry Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__INQUIRY_REF = eINSTANCE.getChoice_InquiryRef();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ResponseImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE = eINSTANCE.getResponse_Response();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ConfirmationImpl <em>Confirmation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ConfirmationImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getConfirmation()
		 * @generated
		 */
		EClass CONFIRMATION = eINSTANCE.getConfirmation();

		/**
		 * The meta object literal for the '<em><b>Auto Reply</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIRMATION__AUTO_REPLY = eINSTANCE
				.getConfirmation_AutoReply();

		/**
		 * The meta object literal for the '<em><b>Confirmation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIRMATION__CONFIRMATION = eINSTANCE
				.getConfirmation_Confirmation();

		/**
		 * The meta object literal for the '<em><b>Custom Reply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIRMATION__CUSTOM_REPLY = eINSTANCE
				.getConfirmation_CustomReply();

		/**
		 * The meta object literal for the '<em><b>Response Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIRMATION__RESPONSE_REF = eINSTANCE
				.getConfirmation_ResponseRef();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ConfigurationImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Response Restrictions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__RESPONSE_RESTRICTIONS = eINSTANCE
				.getConfiguration_ResponseRestrictions();

		/**
		 * The meta object literal for the '<em><b>Inquiry Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INQUIRY_REF = eINSTANCE
				.getConfiguration_InquiryRef();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__EXPIRATION_DATE = eINSTANCE
				.getConfiguration_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Schedule Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__SCHEDULE_START_DATE = eINSTANCE
				.getConfiguration_ScheduleStartDate();

		/**
		 * The meta object literal for the '<em><b>Communication Channel</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__COMMUNICATION_CHANNEL = eINSTANCE
				.getConfiguration_CommunicationChannel();

		/**
		 * The meta object literal for the '<em><b>Suspend On Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__SUSPEND_ON_FAILURE = eINSTANCE
				.getConfiguration_SuspendOnFailure();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LANGUAGE = eINSTANCE
				.getConfiguration_Language();

		/**
		 * The meta object literal for the '<em><b>Batch Response Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__BATCH_RESPONSE_DELIVERY = eINSTANCE
				.getConfiguration_BatchResponseDelivery();

		/**
		 * The meta object literal for the '<em><b>Synchronous Confirmation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__SYNCHRONOUS_CONFIRMATION = eINSTANCE
				.getConfiguration_SynchronousConfirmation();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ResponseRestrictionImpl <em>Response Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ResponseRestrictionImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponseRestriction()
		 * @generated
		 */
		EClass RESPONSE_RESTRICTION = eINSTANCE.getResponseRestriction();

		/**
		 * The meta object literal for the '<em><b>Accept Multiple Channels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS = eINSTANCE
				.getResponseRestriction_AcceptMultipleChannels();

		/**
		 * The meta object literal for the '<em><b>Restriction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_RESTRICTION__RESTRICTION_TYPE = eINSTANCE
				.getResponseRestriction_RestrictionType();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_RESTRICTION__ANONYMOUS = eINSTANCE
				.getResponseRestriction_Anonymous();

		/**
		 * The meta object literal for the '<em><b>Owned Inquiry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_RESTRICTION__OWNED_INQUIRY = eINSTANCE
				.getResponseRestriction_OwnedInquiry();

		/**
		 * The meta object literal for the '<em><b>Block Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_RESTRICTION__BLOCK_REPEAT = eINSTANCE
				.getResponseRestriction_BlockRepeat();

		/**
		 * The meta object literal for the '<em><b>Moderate First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_RESTRICTION__MODERATE_FIRST = eINSTANCE
				.getResponseRestriction_ModerateFirst();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.FreeTextImpl <em>Free Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.FreeTextImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getFreeText()
		 * @generated
		 */
		EClass FREE_TEXT = eINSTANCE.getFreeText();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_TEXT__ANSWER = eINSTANCE.getFreeText_Answer();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_TEXT__KEYWORD = eINSTANCE.getFreeText_Keyword();

		/**
		 * The meta object literal for the '<em><b>Auto Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_TEXT__AUTO_KEYWORD = eINSTANCE
				.getFreeText_AutoKeyword();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.MultipleChoiceImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__ANSWER = eINSTANCE
				.getMultipleChoice_Answer();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.AnnotationImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__ANNOTATION = eINSTANCE
				.getAnnotation_Annotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__SOURCE = eINSTANCE.getAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ENTRY = eINSTANCE.getAnnotation_Entry();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATED_ELEMENT = eINSTANCE
				.getAnnotation_AnnotatedElement();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ResponseDetailImpl <em>Response Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ResponseDetailImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponseDetail()
		 * @generated
		 */
		EClass RESPONSE_DETAIL = eINSTANCE.getResponseDetail();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DETAIL__DATE_TIME = eINSTANCE
				.getResponseDetail_DateTime();

		/**
		 * The meta object literal for the '<em><b>Raw Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DETAIL__RAW_MESSAGE = eINSTANCE
				.getResponseDetail_RawMessage();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DETAIL__SET_VALUE = eINSTANCE
				.getResponseDetail_SetValue();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.MessageImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Text Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TEXT_MESSAGE = eINSTANCE.getMessage_TextMessage();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TIMESTAMP = eINSTANCE.getMessage_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ID = eINSTANCE.getMessage_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__GATEWAY = eINSTANCE.getMessage_Gateway();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CHARSET = eINSTANCE.getMessage_Charset();

		/**
		 * The meta object literal for the '<em><b>Header Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__HEADER_DATA = eINSTANCE.getMessage_HeaderData();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__FROM = eINSTANCE.getMessage_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TO = eINSTANCE.getMessage_To();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.AnnotationMapEntryImpl <em>Annotation Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.AnnotationMapEntryImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnnotationMapEntry()
		 * @generated
		 */
		EClass ANNOTATION_MAP_ENTRY = eINSTANCE.getAnnotationMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MAP_ENTRY__KEY = eINSTANCE
				.getAnnotationMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MAP_ENTRY__VALUE = eINSTANCE
				.getAnnotationMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.AnswerRefImpl <em>Answer Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.AnswerRefImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnswerRef()
		 * @generated
		 */
		EClass ANSWER_REF = eINSTANCE.getAnswerRef();

		/**
		 * The meta object literal for the '<em><b>Choice Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER_REF__CHOICE_REF = eINSTANCE.getAnswerRef_ChoiceRef();

		/**
		 * The meta object literal for the '<em><b>Answer Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER_REF__ANSWER_REF = eINSTANCE.getAnswerRef_AnswerRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_REF__VALUE = eINSTANCE.getAnswerRef_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER_REF__ID = eINSTANCE.getAnswerRef_Id();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.InboundMessageImpl <em>Inbound Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.InboundMessageImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getInboundMessage()
		 * @generated
		 */
		EClass INBOUND_MESSAGE = eINSTANCE.getInboundMessage();

		/**
		 * The meta object literal for the '<em><b>Part Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_MESSAGE__PART_NUMBER = eINSTANCE
				.getInboundMessage_PartNumber();

		/**
		 * The meta object literal for the '<em><b>Message Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_MESSAGE__MESSAGE_TYPE = eINSTANCE
				.getInboundMessage_MessageType();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.OutboundMessageImpl <em>Outbound Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.OutboundMessageImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getOutboundMessage()
		 * @generated
		 */
		EClass OUTBOUND_MESSAGE = eINSTANCE.getOutboundMessage();

		/**
		 * The meta object literal for the '<em><b>Message Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_MESSAGE__MESSAGE_HANDLER = eINSTANCE
				.getOutboundMessage_MessageHandler();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.CustomOutboundMessageImpl <em>Custom Outbound Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.CustomOutboundMessageImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getCustomOutboundMessage()
		 * @generated
		 */
		EClass CUSTOM_OUTBOUND_MESSAGE = eINSTANCE.getCustomOutboundMessage();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.CommentImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__ID = eINSTANCE.getComment_ID();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__DATE_TIME = eINSTANCE.getComment_DateTime();

		/**
		 * The meta object literal for the '<em><b>Element Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__ELEMENT_REF = eINSTANCE.getComment_ElementRef();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ReportImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>Hide Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__HIDE_RESULTS = eINSTANCE.getReport_HideResults();

		/**
		 * The meta object literal for the '<em><b>Percentage Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__PERCENTAGE_ONLY = eINSTANCE
				.getReport_PercentageOnly();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.CommandImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Default Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DEFAULT_HANDLER = eINSTANCE
				.getCommand_DefaultHandler();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__ID = eINSTANCE.getCommand_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.AnswerImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TEXT = eINSTANCE.getAnswer_Text();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__ID = eINSTANCE.getAnswer_Id();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__KEYWORD = eINSTANCE.getAnswer_Keyword();

		/**
		 * The meta object literal for the '<em><b>Auto Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__AUTO_KEYWORD = eINSTANCE.getAnswer_AutoKeyword();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__DEFAULT_VALUE = eINSTANCE.getAnswer_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__SELECTED = eINSTANCE.getAnswer_Selected();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.LanguageKind <em>Language Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.LanguageKind
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getLanguageKind()
		 * @generated
		 */
		EEnum LANGUAGE_KIND = eINSTANCE.getLanguageKind();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.ChannelKind <em>Channel Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.ChannelKind
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getChannelKind()
		 * @generated
		 */
		EEnum CHANNEL_KIND = eINSTANCE.getChannelKind();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.RestrictionKind <em>Restriction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.RestrictionKind
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getRestrictionKind()
		 * @generated
		 */
		EEnum RESTRICTION_KIND = eINSTANCE.getRestrictionKind();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.MessageType <em>Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.MessageType
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessageType()
		 * @generated
		 */
		EEnum MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.StopCommandKind <em>Stop Command Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.StopCommandKind
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getStopCommandKind()
		 * @generated
		 */
		EEnum STOP_COMMAND_KIND = eINSTANCE.getStopCommandKind();

	}

} //TeksPackage
