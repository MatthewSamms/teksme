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
	 * The feature id for the '<em><b>Outbound Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__OUTBOUND_MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__ACCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__PROFILE = 3;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__SURVEY = 4;

	/**
	 * The feature id for the '<em><b>Inbound Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__INBOUND_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Poll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS__POLL = 6;

	/**
	 * The number of structural features of the '<em>Teks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEKS_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.CommentImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
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
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnnotationImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 2;

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
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnnotationMapEntryImpl <em>Annotation Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnnotationMapEntryImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnnotationMapEntry()
	 * @generated
	 */
	int ANNOTATION_MAP_ENTRY = 3;

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
	 * The meta object id for the '{@link org.teksme.model.teks.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.UserImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getUser()
	 * @generated
	 */
	int USER = 4;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Mobile Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MOBILE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COUNTRY = 5;

	/**
	 * The feature id for the '<em><b>Year Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__YEAR_OF_BIRTH = 6;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COMPANY = 7;

	/**
	 * The feature id for the '<em><b>Website URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WEBSITE_URL = 8;

	/**
	 * The feature id for the '<em><b>Blog URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BLOG_URL = 9;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROFILE = 10;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ProfileImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 5;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__APPLICATION = 0;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ApplicationImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__KEY = 1;

	/**
	 * The feature id for the '<em><b>Shared Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SHARED_SECRET = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Registered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__REGISTERED = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Callback URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CALLBACK_URL = 6;

	/**
	 * The feature id for the '<em><b>Rate Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RATE_LIMITS = 7;

	/**
	 * The feature id for the '<em><b>Profile Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROFILE_REF = 8;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.PollImpl <em>Poll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.PollImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPoll()
	 * @generated
	 */
	int POLL = 7;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Reply Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__REPLY_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__ANNOTATIONS = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__COMMENTS = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__NOTE = 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__AUTHOR = 7;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__LAST_MODIFIED = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__ID = 9;

	/**
	 * The number of structural features of the '<em>Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.SurveyImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__COMMENTS = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NOTE = 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__LAST_MODIFIED = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__ID = 6;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.PollSettingsImpl <em>Poll Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.PollSettingsImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPollSettings()
	 * @generated
	 */
	int POLL_SETTINGS = 9;

	/**
	 * The feature id for the '<em><b>Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__CLOSE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Schedule Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__SCHEDULE_START_DATE = 1;

	/**
	 * The feature id for the '<em><b>Suspend On Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__SUSPEND_ON_FAILURE = 2;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Batch Response Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__BATCH_RESPONSE_DELIVERY = 4;

	/**
	 * The feature id for the '<em><b>Synchronous Confirmation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION = 5;

	/**
	 * The feature id for the '<em><b>Reply Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__REPLY_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Advertise It</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__ADVERTISE_IT = 7;

	/**
	 * The feature id for the '<em><b>Folder ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__FOLDER_ID = 8;

	/**
	 * The feature id for the '<em><b>Sharing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__SHARING = 9;

	/**
	 * The feature id for the '<em><b>Response Restrictions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__RESPONSE_RESTRICTIONS = 10;

	/**
	 * The feature id for the '<em><b>Short Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS__SHORT_NUMBER = 11;

	/**
	 * The number of structural features of the '<em>Poll Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SETTINGS_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ReplyMessageImpl <em>Reply Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ReplyMessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getReplyMessage()
	 * @generated
	 */
	int REPLY_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Confirmation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_MESSAGE__CONFIRMATION = 0;

	/**
	 * The feature id for the '<em><b>Default Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_MESSAGE__DEFAULT_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Custom Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_MESSAGE__CUSTOM_MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Reply Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ResponseImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__ERROR = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ResponseRestrictionImpl <em>Response Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ResponseRestrictionImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponseRestriction()
	 * @generated
	 */
	int RESPONSE_RESTRICTION = 12;

	/**
	 * The feature id for the '<em><b>Accept Multiple Channels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS = 0;

	/**
	 * The feature id for the '<em><b>Communication Channel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Restriction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__RESTRICTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Block Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__BLOCK_REPEAT = 3;

	/**
	 * The feature id for the '<em><b>Moderate First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION__MODERATE_FIRST = 4;

	/**
	 * The number of structural features of the '<em>Response Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_RESTRICTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.PollQuestionImpl <em>Poll Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.PollQuestionImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPollQuestion()
	 * @generated
	 */
	int POLL_QUESTION = 13;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_QUESTION__NOTE = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_QUESTION__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Poll Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_QUESTION__POLL_REF = 2;

	/**
	 * The number of structural features of the '<em>Poll Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_QUESTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.PlainTextImpl <em>Plain Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.PlainTextImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPlainText()
	 * @generated
	 */
	int PLAIN_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__NOTE = POLL_QUESTION__NOTE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__REQUIRED = POLL_QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Poll Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__POLL_REF = POLL_QUESTION__POLL_REF;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__QUESTION = POLL_QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT__KEYWORD = POLL_QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plain Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TEXT_FEATURE_COUNT = POLL_QUESTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.KeywordImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__KEY = 0;

	/**
	 * The feature id for the '<em><b>Auto Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__AUTO_KEYWORD = 1;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.FreeTextImpl <em>Free Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.FreeTextImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getFreeText()
	 * @generated
	 */
	int FREE_TEXT = 16;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__NOTE = PLAIN_TEXT__NOTE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__REQUIRED = PLAIN_TEXT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Poll Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__POLL_REF = PLAIN_TEXT__POLL_REF;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__QUESTION = PLAIN_TEXT__QUESTION;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT__KEYWORD = PLAIN_TEXT__KEYWORD;

	/**
	 * The number of structural features of the '<em>Free Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_FEATURE_COUNT = PLAIN_TEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.SecureTextImpl <em>Secure Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.SecureTextImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getSecureText()
	 * @generated
	 */
	int SECURE_TEXT = 17;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT__NOTE = PLAIN_TEXT__NOTE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT__REQUIRED = PLAIN_TEXT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Poll Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT__POLL_REF = PLAIN_TEXT__POLL_REF;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT__QUESTION = PLAIN_TEXT__QUESTION;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT__KEYWORD = PLAIN_TEXT__KEYWORD;

	/**
	 * The feature id for the '<em><b>Hash Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT__HASH_ALGORITHM = PLAIN_TEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hash Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT__HASH_ENCODING = PLAIN_TEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Secure Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_TEXT_FEATURE_COUNT = PLAIN_TEXT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.MultipleChoiceImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 18;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NOTE = POLL_QUESTION__NOTE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__REQUIRED = POLL_QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Poll Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__POLL_REF = POLL_QUESTION__POLL_REF;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__QUESTION = POLL_QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__ANSWER = POLL_QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Add Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__ADD_OTHER = POLL_QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = POLL_QUESTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnswerImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 19;

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
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__SELECTED = 3;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__KEYWORD = 4;

	/**
	 * The feature id for the '<em><b>Question Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__QUESTION_REF = 5;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ResponseDetailImpl <em>Response Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ResponseDetailImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getResponseDetail()
	 * @generated
	 */
	int RESPONSE_DETAIL = 20;

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
	 * The meta object id for the '{@link org.teksme.model.teks.impl.AnswerRefImpl <em>Answer Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.AnswerRefImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getAnswerRef()
	 * @generated
	 */
	int ANSWER_REF = 21;

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
	 * The meta object id for the '{@link org.teksme.model.teks.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.MessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 22;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CHANNELS = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TO = 2;

	/**
	 * The feature id for the '<em><b>Shout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SHOUT = 3;

	/**
	 * The feature id for the '<em><b>Stop On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__STOP_ON_ERROR = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DATE = 5;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ROUTING = 6;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ATTEMPTS = 7;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ENCODING = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = 9;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.InboundMessageImpl <em>Inbound Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.InboundMessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getInboundMessage()
	 * @generated
	 */
	int INBOUND_MESSAGE = 23;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__FROM = MESSAGE__FROM;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__CHANNELS = MESSAGE__CHANNELS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__TO = MESSAGE__TO;

	/**
	 * The feature id for the '<em><b>Shout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__SHOUT = MESSAGE__SHOUT;

	/**
	 * The feature id for the '<em><b>Stop On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__STOP_ON_ERROR = MESSAGE__STOP_ON_ERROR;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__DATE = MESSAGE__DATE;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__ROUTING = MESSAGE__ROUTING;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__ATTEMPTS = MESSAGE__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__ENCODING = MESSAGE__ENCODING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__ID = MESSAGE__ID;

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
	 * The feature id for the '<em><b>Originator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__ORIGINATOR = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Smsc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE__SMSC_NUMBER = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Inbound Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.OutboundMessageImpl <em>Outbound Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.OutboundMessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getOutboundMessage()
	 * @generated
	 */
	int OUTBOUND_MESSAGE = 24;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__FROM = MESSAGE__FROM;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__CHANNELS = MESSAGE__CHANNELS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__TO = MESSAGE__TO;

	/**
	 * The feature id for the '<em><b>Shout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__SHOUT = MESSAGE__SHOUT;

	/**
	 * The feature id for the '<em><b>Stop On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__STOP_ON_ERROR = MESSAGE__STOP_ON_ERROR;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__DATE = MESSAGE__DATE;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__ROUTING = MESSAGE__ROUTING;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__ATTEMPTS = MESSAGE__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__ENCODING = MESSAGE__ENCODING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__SCHEDULE = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__TIMEOUT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__DELAY = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__CALLBACK = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Concatenated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__CONCATENATED = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Teks Ref</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE__TEKS_REF = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Outbound Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ObjectMessageImpl <em>Object Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ObjectMessageImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getObjectMessage()
	 * @generated
	 */
	int OBJECT_MESSAGE = 25;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__FROM = MESSAGE__FROM;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__CHANNELS = MESSAGE__CHANNELS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__TO = MESSAGE__TO;

	/**
	 * The feature id for the '<em><b>Shout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__SHOUT = MESSAGE__SHOUT;

	/**
	 * The feature id for the '<em><b>Stop On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__STOP_ON_ERROR = MESSAGE__STOP_ON_ERROR;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__DATE = MESSAGE__DATE;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__ROUTING = MESSAGE__ROUTING;

	/**
	 * The feature id for the '<em><b>Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__ATTEMPTS = MESSAGE__ATTEMPTS;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__ENCODING = MESSAGE__ENCODING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE__ID = MESSAGE__ID;

	/**
	 * The number of structural features of the '<em>Object Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ChannelImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 26;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL = 0;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ErrorImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getError()
	 * @generated
	 */
	int ERROR = 27;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__CODE = 2;

	/**
	 * The feature id for the '<em><b>More Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__MORE_INFO = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__URL = 4;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ReportImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 28;

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
	 * The meta object id for the '{@link org.teksme.model.teks.impl.ShoutImpl <em>Shout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.ShoutImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getShout()
	 * @generated
	 */
	int SHOUT = 29;

	/**
	 * The feature id for the '<em><b>This</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOUT__THIS = 0;

	/**
	 * The feature id for the '<em><b>Voice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOUT__VOICE = 1;

	/**
	 * The number of structural features of the '<em>Shout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.impl.CommandImpl
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 30;

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
	 * The meta object id for the '{@link org.teksme.model.teks.LanguageKind <em>Language Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.LanguageKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getLanguageKind()
	 * @generated
	 */
	int LANGUAGE_KIND = 31;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.ChannelKind <em>Channel Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.ChannelKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getChannelKind()
	 * @generated
	 */
	int CHANNEL_KIND = 32;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.RestrictionKind <em>Restriction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.RestrictionKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getRestrictionKind()
	 * @generated
	 */
	int RESTRICTION_KIND = 33;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.StopCommandKind <em>Stop Command Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.StopCommandKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getStopCommandKind()
	 * @generated
	 */
	int STOP_COMMAND_KIND = 34;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.MessageStatuses <em>Message Statuses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.MessageStatuses
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessageStatuses()
	 * @generated
	 */
	int MESSAGE_STATUSES = 35;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.FailureCauses <em>Failure Causes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.FailureCauses
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getFailureCauses()
	 * @generated
	 */
	int FAILURE_CAUSES = 36;

	/**
	 * The meta object id for the '{@link org.teksme.model.teks.SMSGatewayKind <em>SMS Gateway Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @see org.teksme.model.teks.impl.TeksPackageImpl#getSMSGatewayKind()
	 * @generated
	 */
	int SMS_GATEWAY_KIND = 37;

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
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Teks#getOutboundMessageList <em>Outbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outbound Message</em>'.
	 * @see org.teksme.model.teks.Teks#getOutboundMessageList()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_OutboundMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Teks#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see org.teksme.model.teks.Teks#getResponse()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_Response();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Teks#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Account</em>'.
	 * @see org.teksme.model.teks.Teks#getAccount()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_Account();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Teks#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile</em>'.
	 * @see org.teksme.model.teks.Teks#getProfile()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_Profile();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Teks#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Survey</em>'.
	 * @see org.teksme.model.teks.Teks#getSurvey()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_Survey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Teks#getInboundMessageList <em>Inbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inbound Message</em>'.
	 * @see org.teksme.model.teks.Teks#getInboundMessageList()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_InboundMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Teks#getPoll <em>Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poll</em>'.
	 * @see org.teksme.model.teks.Teks#getPoll()
	 * @see #getTeks()
	 * @generated
	 */
	EReference getTeks_Poll();

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
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Comment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.Comment#getId()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Id();

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
	 * Returns the meta object for class '{@link org.teksme.model.teks.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.teksme.model.teks.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.teksme.model.teks.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.teksme.model.teks.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getMobileNumber <em>Mobile Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile Number</em>'.
	 * @see org.teksme.model.teks.User#getMobileNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_MobileNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.teksme.model.teks.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.teksme.model.teks.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.teksme.model.teks.User#getCountry()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getYearOfBirth <em>Year Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Of Birth</em>'.
	 * @see org.teksme.model.teks.User#getYearOfBirth()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_YearOfBirth();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see org.teksme.model.teks.User#getCompany()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Company();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getWebsiteURL <em>Website URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website URL</em>'.
	 * @see org.teksme.model.teks.User#getWebsiteURL()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_WebsiteURL();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.User#getBlogURL <em>Blog URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blog URL</em>'.
	 * @see org.teksme.model.teks.User#getBlogURL()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_BlogURL();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.User#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile</em>'.
	 * @see org.teksme.model.teks.User#getProfile()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Profile();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see org.teksme.model.teks.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Profile#getApplicationList <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application</em>'.
	 * @see org.teksme.model.teks.Profile#getApplicationList()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Application();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.teksme.model.teks.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.teksme.model.teks.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.teksme.model.teks.Application#getKey()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getSharedSecret <em>Shared Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Secret</em>'.
	 * @see org.teksme.model.teks.Application#getSharedSecret()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_SharedSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.teksme.model.teks.Application#getDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getRegistered <em>Registered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered</em>'.
	 * @see org.teksme.model.teks.Application#getRegistered()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Registered();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.teksme.model.teks.Application#getStatus()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getCallbackURL <em>Callback URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback URL</em>'.
	 * @see org.teksme.model.teks.Application#getCallbackURL()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_CallbackURL();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Application#getRateLimits <em>Rate Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Limits</em>'.
	 * @see org.teksme.model.teks.Application#getRateLimits()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_RateLimits();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.Application#getProfileRef <em>Profile Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Profile Ref</em>'.
	 * @see org.teksme.model.teks.Application#getProfileRef()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_ProfileRef();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Poll <em>Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll</em>'.
	 * @see org.teksme.model.teks.Poll
	 * @generated
	 */
	EClass getPoll();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Poll#getQuestionList <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see org.teksme.model.teks.Poll#getQuestionList()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_Question();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Poll#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see org.teksme.model.teks.Poll#getSettings()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Poll#getReplyMessage <em>Reply Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Message</em>'.
	 * @see org.teksme.model.teks.Poll#getReplyMessage()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_ReplyMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Poll#getAnnotationsList <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.teksme.model.teks.Poll#getAnnotationsList()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Poll#getCommentsList <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.teksme.model.teks.Poll#getCommentsList()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Poll#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.teksme.model.teks.Poll#getTitle()
	 * @see #getPoll()
	 * @generated
	 */
	EAttribute getPoll_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Poll#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.teksme.model.teks.Poll#getNote()
	 * @see #getPoll()
	 * @generated
	 */
	EAttribute getPoll_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Poll#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.teksme.model.teks.Poll#getAuthor()
	 * @see #getPoll()
	 * @generated
	 */
	EAttribute getPoll_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Poll#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.teksme.model.teks.Poll#getLastModified()
	 * @see #getPoll()
	 * @generated
	 */
	EAttribute getPoll_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Poll#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.Poll#getId()
	 * @see #getPoll()
	 * @generated
	 */
	EAttribute getPoll_Id();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see org.teksme.model.teks.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Survey#getAnnotationsList <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.teksme.model.teks.Survey#getAnnotationsList()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.Survey#getCommentsList <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see org.teksme.model.teks.Survey#getCommentsList()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Survey#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.teksme.model.teks.Survey#getTitle()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Survey#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.teksme.model.teks.Survey#getNote()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Survey#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.teksme.model.teks.Survey#getAuthor()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Survey#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.teksme.model.teks.Survey#getLastModified()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Survey#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.teksme.model.teks.Survey#getId()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Id();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.PollSettings <em>Poll Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll Settings</em>'.
	 * @see org.teksme.model.teks.PollSettings
	 * @generated
	 */
	EClass getPollSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#getCloseDate <em>Close Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close Date</em>'.
	 * @see org.teksme.model.teks.PollSettings#getCloseDate()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_CloseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#getScheduleStartDate <em>Schedule Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Start Date</em>'.
	 * @see org.teksme.model.teks.PollSettings#getScheduleStartDate()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_ScheduleStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#isSuspendOnFailure <em>Suspend On Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspend On Failure</em>'.
	 * @see org.teksme.model.teks.PollSettings#isSuspendOnFailure()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_SuspendOnFailure();

	/**
	 * Returns the meta object for the attribute list '{@link org.teksme.model.teks.PollSettings#getLanguageList <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see org.teksme.model.teks.PollSettings#getLanguageList()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#isBatchResponseDelivery <em>Batch Response Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Batch Response Delivery</em>'.
	 * @see org.teksme.model.teks.PollSettings#isBatchResponseDelivery()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_BatchResponseDelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#isSynchronousConfirmation <em>Synchronous Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronous Confirmation</em>'.
	 * @see org.teksme.model.teks.PollSettings#isSynchronousConfirmation()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_SynchronousConfirmation();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.PollSettings#getReplyMessage <em>Reply Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reply Message</em>'.
	 * @see org.teksme.model.teks.PollSettings#getReplyMessage()
	 * @see #getPollSettings()
	 * @generated
	 */
	EReference getPollSettings_ReplyMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.PollSettings#getAdvertiseIt <em>Advertise It</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Advertise It</em>'.
	 * @see org.teksme.model.teks.PollSettings#getAdvertiseIt()
	 * @see #getPollSettings()
	 * @generated
	 */
	EReference getPollSettings_AdvertiseIt();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#getFolderID <em>Folder ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder ID</em>'.
	 * @see org.teksme.model.teks.PollSettings#getFolderID()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_FolderID();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#isSharing <em>Sharing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sharing</em>'.
	 * @see org.teksme.model.teks.PollSettings#isSharing()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_Sharing();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.PollSettings#getResponseRestrictions <em>Response Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Restrictions</em>'.
	 * @see org.teksme.model.teks.PollSettings#getResponseRestrictions()
	 * @see #getPollSettings()
	 * @generated
	 */
	EReference getPollSettings_ResponseRestrictions();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollSettings#getShortNumber <em>Short Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Number</em>'.
	 * @see org.teksme.model.teks.PollSettings#getShortNumber()
	 * @see #getPollSettings()
	 * @generated
	 */
	EAttribute getPollSettings_ShortNumber();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.ReplyMessage <em>Reply Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Message</em>'.
	 * @see org.teksme.model.teks.ReplyMessage
	 * @generated
	 */
	EClass getReplyMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.teksme.model.teks.ReplyMessage#getConfirmationList <em>Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Confirmation</em>'.
	 * @see org.teksme.model.teks.ReplyMessage#getConfirmationList()
	 * @see #getReplyMessage()
	 * @generated
	 */
	EReference getReplyMessage_Confirmation();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.ReplyMessage#isDefaultMessage <em>Default Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Message</em>'.
	 * @see org.teksme.model.teks.ReplyMessage#isDefaultMessage()
	 * @see #getReplyMessage()
	 * @generated
	 */
	EAttribute getReplyMessage_DefaultMessage();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.ReplyMessage#getCustomMessage <em>Custom Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Message</em>'.
	 * @see org.teksme.model.teks.ReplyMessage#getCustomMessage()
	 * @see #getReplyMessage()
	 * @generated
	 */
	EReference getReplyMessage_CustomMessage();

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
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Response#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.teksme.model.teks.Response#getError()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Error();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Response#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.teksme.model.teks.Response#getMessage()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Message();

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
	 * Returns the meta object for the attribute list '{@link org.teksme.model.teks.ResponseRestriction#getCommunicationChannelList <em>Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Communication Channel</em>'.
	 * @see org.teksme.model.teks.ResponseRestriction#getCommunicationChannelList()
	 * @see #getResponseRestriction()
	 * @generated
	 */
	EAttribute getResponseRestriction_CommunicationChannel();

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
	 * Returns the meta object for class '{@link org.teksme.model.teks.PollQuestion <em>Poll Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll Question</em>'.
	 * @see org.teksme.model.teks.PollQuestion
	 * @generated
	 */
	EClass getPollQuestion();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollQuestion#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.teksme.model.teks.PollQuestion#getNote()
	 * @see #getPollQuestion()
	 * @generated
	 */
	EAttribute getPollQuestion_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PollQuestion#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.teksme.model.teks.PollQuestion#isRequired()
	 * @see #getPollQuestion()
	 * @generated
	 */
	EAttribute getPollQuestion_Required();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.PollQuestion#getPollRef <em>Poll Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Poll Ref</em>'.
	 * @see org.teksme.model.teks.PollQuestion#getPollRef()
	 * @see #getPollQuestion()
	 * @generated
	 */
	EReference getPollQuestion_PollRef();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.PlainText <em>Plain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Text</em>'.
	 * @see org.teksme.model.teks.PlainText
	 * @generated
	 */
	EClass getPlainText();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.PlainText#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see org.teksme.model.teks.PlainText#getQuestion()
	 * @see #getPlainText()
	 * @generated
	 */
	EAttribute getPlainText_Question();

	/**
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.PlainText#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword</em>'.
	 * @see org.teksme.model.teks.PlainText#getKeyword()
	 * @see #getPlainText()
	 * @generated
	 */
	EReference getPlainText_Keyword();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see org.teksme.model.teks.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Keyword#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.teksme.model.teks.Keyword#getKey()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Keyword#isAutoKeyword <em>Auto Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Keyword</em>'.
	 * @see org.teksme.model.teks.Keyword#isAutoKeyword()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_AutoKeyword();

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
	 * Returns the meta object for class '{@link org.teksme.model.teks.SecureText <em>Secure Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Text</em>'.
	 * @see org.teksme.model.teks.SecureText
	 * @generated
	 */
	EClass getSecureText();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.SecureText#getHashAlgorithm <em>Hash Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Algorithm</em>'.
	 * @see org.teksme.model.teks.SecureText#getHashAlgorithm()
	 * @see #getSecureText()
	 * @generated
	 */
	EAttribute getSecureText_HashAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.SecureText#getHashEncoding <em>Hash Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash Encoding</em>'.
	 * @see org.teksme.model.teks.SecureText#getHashEncoding()
	 * @see #getSecureText()
	 * @generated
	 */
	EAttribute getSecureText_HashEncoding();

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
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.MultipleChoice#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see org.teksme.model.teks.MultipleChoice#getQuestion()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Question();

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
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.MultipleChoice#getAddOther <em>Add Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Other</em>'.
	 * @see org.teksme.model.teks.MultipleChoice#getAddOther()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_AddOther();

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
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Answer#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword</em>'.
	 * @see org.teksme.model.teks.Answer#getKeyword()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Keyword();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.Answer#getQuestionRef <em>Question Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Question Ref</em>'.
	 * @see org.teksme.model.teks.Answer#getQuestionRef()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_QuestionRef();

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
	 * Returns the meta object for class '{@link org.teksme.model.teks.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.teksme.model.teks.Message
	 * @generated
	 */
	EClass getMessage();

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
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Message#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channels</em>'.
	 * @see org.teksme.model.teks.Message#getChannels()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Channels();

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
	 * Returns the meta object for the containment reference '{@link org.teksme.model.teks.Message#getShout <em>Shout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shout</em>'.
	 * @see org.teksme.model.teks.Message#getShout()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Shout();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#isStopOnError <em>Stop On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop On Error</em>'.
	 * @see org.teksme.model.teks.Message#isStopOnError()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_StopOnError();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.teksme.model.teks.Message#getDate()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing</em>'.
	 * @see org.teksme.model.teks.Message#getRouting()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Routing();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getAttempts <em>Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts</em>'.
	 * @see org.teksme.model.teks.Message#getAttempts()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Attempts();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Message#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.teksme.model.teks.Message#getEncoding()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Encoding();

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
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.InboundMessage#getOriginator <em>Originator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originator</em>'.
	 * @see org.teksme.model.teks.InboundMessage#getOriginator()
	 * @see #getInboundMessage()
	 * @generated
	 */
	EAttribute getInboundMessage_Originator();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.InboundMessage#getSmscNumber <em>Smsc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smsc Number</em>'.
	 * @see org.teksme.model.teks.InboundMessage#getSmscNumber()
	 * @see #getInboundMessage()
	 * @generated
	 */
	EAttribute getInboundMessage_SmscNumber();

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
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.OutboundMessage#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule</em>'.
	 * @see org.teksme.model.teks.OutboundMessage#getSchedule()
	 * @see #getOutboundMessage()
	 * @generated
	 */
	EAttribute getOutboundMessage_Schedule();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.OutboundMessage#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.teksme.model.teks.OutboundMessage#getTimeout()
	 * @see #getOutboundMessage()
	 * @generated
	 */
	EAttribute getOutboundMessage_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.OutboundMessage#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see org.teksme.model.teks.OutboundMessage#getDelay()
	 * @see #getOutboundMessage()
	 * @generated
	 */
	EAttribute getOutboundMessage_Delay();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.OutboundMessage#getCallback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback</em>'.
	 * @see org.teksme.model.teks.OutboundMessage#getCallback()
	 * @see #getOutboundMessage()
	 * @generated
	 */
	EAttribute getOutboundMessage_Callback();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.OutboundMessage#isConcatenated <em>Concatenated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concatenated</em>'.
	 * @see org.teksme.model.teks.OutboundMessage#isConcatenated()
	 * @see #getOutboundMessage()
	 * @generated
	 */
	EAttribute getOutboundMessage_Concatenated();

	/**
	 * Returns the meta object for the container reference '{@link org.teksme.model.teks.OutboundMessage#getTeksRef <em>Teks Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Teks Ref</em>'.
	 * @see org.teksme.model.teks.OutboundMessage#getTeksRef()
	 * @see #getOutboundMessage()
	 * @generated
	 */
	EReference getOutboundMessage_TeksRef();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.ObjectMessage <em>Object Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Message</em>'.
	 * @see org.teksme.model.teks.ObjectMessage
	 * @generated
	 */
	EClass getObjectMessage();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org.teksme.model.teks.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute list '{@link org.teksme.model.teks.Channel#getChannelList <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Channel</em>'.
	 * @see org.teksme.model.teks.Channel#getChannelList()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Channel();

	/**
	 * Returns the meta object for class '{@link org.teksme.model.teks.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see org.teksme.model.teks.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Error#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.teksme.model.teks.Error#getStatus()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Error#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.teksme.model.teks.Error#getMessage()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Error#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.teksme.model.teks.Error#getCode()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Error#getMoreInfo <em>More Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info</em>'.
	 * @see org.teksme.model.teks.Error#getMoreInfo()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_MoreInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Error#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.teksme.model.teks.Error#getUrl()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Url();

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
	 * Returns the meta object for class '{@link org.teksme.model.teks.Shout <em>Shout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shout</em>'.
	 * @see org.teksme.model.teks.Shout
	 * @generated
	 */
	EClass getShout();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Shout#getThis <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>This</em>'.
	 * @see org.teksme.model.teks.Shout#getThis()
	 * @see #getShout()
	 * @generated
	 */
	EAttribute getShout_This();

	/**
	 * Returns the meta object for the attribute '{@link org.teksme.model.teks.Shout#getVoice <em>Voice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voice</em>'.
	 * @see org.teksme.model.teks.Shout#getVoice()
	 * @see #getShout()
	 * @generated
	 */
	EAttribute getShout_Voice();

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
	 * Returns the meta object for enum '{@link org.teksme.model.teks.StopCommandKind <em>Stop Command Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stop Command Kind</em>'.
	 * @see org.teksme.model.teks.StopCommandKind
	 * @generated
	 */
	EEnum getStopCommandKind();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.MessageStatuses <em>Message Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Statuses</em>'.
	 * @see org.teksme.model.teks.MessageStatuses
	 * @generated
	 */
	EEnum getMessageStatuses();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.FailureCauses <em>Failure Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Failure Causes</em>'.
	 * @see org.teksme.model.teks.FailureCauses
	 * @generated
	 */
	EEnum getFailureCauses();

	/**
	 * Returns the meta object for enum '{@link org.teksme.model.teks.SMSGatewayKind <em>SMS Gateway Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SMS Gateway Kind</em>'.
	 * @see org.teksme.model.teks.SMSGatewayKind
	 * @generated
	 */
	EEnum getSMSGatewayKind();

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
		 * The meta object literal for the '<em><b>Outbound Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__OUTBOUND_MESSAGE = eINSTANCE.getTeks_OutboundMessage();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__RESPONSE = eINSTANCE.getTeks_Response();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__ACCOUNT = eINSTANCE.getTeks_Account();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__PROFILE = eINSTANCE.getTeks_Profile();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__SURVEY = eINSTANCE.getTeks_Survey();

		/**
		 * The meta object literal for the '<em><b>Inbound Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__INBOUND_MESSAGE = eINSTANCE.getTeks_InboundMessage();

		/**
		 * The meta object literal for the '<em><b>Poll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEKS__POLL = eINSTANCE.getTeks_Poll();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__ID = eINSTANCE.getComment_Id();

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
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.UserImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Mobile Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__MOBILE_NUMBER = eINSTANCE.getUser_MobileNumber();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__COUNTRY = eINSTANCE.getUser_Country();

		/**
		 * The meta object literal for the '<em><b>Year Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__YEAR_OF_BIRTH = eINSTANCE.getUser_YearOfBirth();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__COMPANY = eINSTANCE.getUser_Company();

		/**
		 * The meta object literal for the '<em><b>Website URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__WEBSITE_URL = eINSTANCE.getUser_WebsiteURL();

		/**
		 * The meta object literal for the '<em><b>Blog URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BLOG_URL = eINSTANCE.getUser_BlogURL();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PROFILE = eINSTANCE.getUser_Profile();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ProfileImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__APPLICATION = eINSTANCE.getProfile_Application();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ApplicationImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__KEY = eINSTANCE.getApplication_Key();

		/**
		 * The meta object literal for the '<em><b>Shared Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__SHARED_SECRET = eINSTANCE
				.getApplication_SharedSecret();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESCRIPTION = eINSTANCE
				.getApplication_Description();

		/**
		 * The meta object literal for the '<em><b>Registered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__REGISTERED = eINSTANCE
				.getApplication_Registered();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__STATUS = eINSTANCE.getApplication_Status();

		/**
		 * The meta object literal for the '<em><b>Callback URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__CALLBACK_URL = eINSTANCE
				.getApplication_CallbackURL();

		/**
		 * The meta object literal for the '<em><b>Rate Limits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__RATE_LIMITS = eINSTANCE
				.getApplication_RateLimits();

		/**
		 * The meta object literal for the '<em><b>Profile Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PROFILE_REF = eINSTANCE
				.getApplication_ProfileRef();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.PollImpl <em>Poll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.PollImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPoll()
		 * @generated
		 */
		EClass POLL = eINSTANCE.getPoll();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__QUESTION = eINSTANCE.getPoll_Question();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__SETTINGS = eINSTANCE.getPoll_Settings();

		/**
		 * The meta object literal for the '<em><b>Reply Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__REPLY_MESSAGE = eINSTANCE.getPoll_ReplyMessage();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__ANNOTATIONS = eINSTANCE.getPoll_Annotations();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__COMMENTS = eINSTANCE.getPoll_Comments();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL__TITLE = eINSTANCE.getPoll_Title();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL__NOTE = eINSTANCE.getPoll_Note();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL__AUTHOR = eINSTANCE.getPoll_Author();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL__LAST_MODIFIED = eINSTANCE.getPoll_LastModified();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL__ID = eINSTANCE.getPoll_Id();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.SurveyImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__ANNOTATIONS = eINSTANCE.getSurvey_Annotations();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__COMMENTS = eINSTANCE.getSurvey_Comments();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__TITLE = eINSTANCE.getSurvey_Title();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__NOTE = eINSTANCE.getSurvey_Note();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__AUTHOR = eINSTANCE.getSurvey_Author();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__LAST_MODIFIED = eINSTANCE.getSurvey_LastModified();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__ID = eINSTANCE.getSurvey_Id();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.PollSettingsImpl <em>Poll Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.PollSettingsImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPollSettings()
		 * @generated
		 */
		EClass POLL_SETTINGS = eINSTANCE.getPollSettings();

		/**
		 * The meta object literal for the '<em><b>Close Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__CLOSE_DATE = eINSTANCE
				.getPollSettings_CloseDate();

		/**
		 * The meta object literal for the '<em><b>Schedule Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__SCHEDULE_START_DATE = eINSTANCE
				.getPollSettings_ScheduleStartDate();

		/**
		 * The meta object literal for the '<em><b>Suspend On Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__SUSPEND_ON_FAILURE = eINSTANCE
				.getPollSettings_SuspendOnFailure();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__LANGUAGE = eINSTANCE
				.getPollSettings_Language();

		/**
		 * The meta object literal for the '<em><b>Batch Response Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__BATCH_RESPONSE_DELIVERY = eINSTANCE
				.getPollSettings_BatchResponseDelivery();

		/**
		 * The meta object literal for the '<em><b>Synchronous Confirmation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION = eINSTANCE
				.getPollSettings_SynchronousConfirmation();

		/**
		 * The meta object literal for the '<em><b>Reply Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_SETTINGS__REPLY_MESSAGE = eINSTANCE
				.getPollSettings_ReplyMessage();

		/**
		 * The meta object literal for the '<em><b>Advertise It</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_SETTINGS__ADVERTISE_IT = eINSTANCE
				.getPollSettings_AdvertiseIt();

		/**
		 * The meta object literal for the '<em><b>Folder ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__FOLDER_ID = eINSTANCE
				.getPollSettings_FolderID();

		/**
		 * The meta object literal for the '<em><b>Sharing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__SHARING = eINSTANCE.getPollSettings_Sharing();

		/**
		 * The meta object literal for the '<em><b>Response Restrictions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_SETTINGS__RESPONSE_RESTRICTIONS = eINSTANCE
				.getPollSettings_ResponseRestrictions();

		/**
		 * The meta object literal for the '<em><b>Short Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_SETTINGS__SHORT_NUMBER = eINSTANCE
				.getPollSettings_ShortNumber();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ReplyMessageImpl <em>Reply Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ReplyMessageImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getReplyMessage()
		 * @generated
		 */
		EClass REPLY_MESSAGE = eINSTANCE.getReplyMessage();

		/**
		 * The meta object literal for the '<em><b>Confirmation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_MESSAGE__CONFIRMATION = eINSTANCE
				.getReplyMessage_Confirmation();

		/**
		 * The meta object literal for the '<em><b>Default Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLY_MESSAGE__DEFAULT_MESSAGE = eINSTANCE
				.getReplyMessage_DefaultMessage();

		/**
		 * The meta object literal for the '<em><b>Custom Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_MESSAGE__CUSTOM_MESSAGE = eINSTANCE
				.getReplyMessage_CustomMessage();

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
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__ERROR = eINSTANCE.getResponse_Error();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__MESSAGE = eINSTANCE.getResponse_Message();

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
		 * The meta object literal for the '<em><b>Communication Channel</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL = eINSTANCE
				.getResponseRestriction_CommunicationChannel();

		/**
		 * The meta object literal for the '<em><b>Restriction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_RESTRICTION__RESTRICTION_TYPE = eINSTANCE
				.getResponseRestriction_RestrictionType();

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
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.PollQuestionImpl <em>Poll Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.PollQuestionImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPollQuestion()
		 * @generated
		 */
		EClass POLL_QUESTION = eINSTANCE.getPollQuestion();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_QUESTION__NOTE = eINSTANCE.getPollQuestion_Note();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_QUESTION__REQUIRED = eINSTANCE
				.getPollQuestion_Required();

		/**
		 * The meta object literal for the '<em><b>Poll Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_QUESTION__POLL_REF = eINSTANCE
				.getPollQuestion_PollRef();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.PlainTextImpl <em>Plain Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.PlainTextImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getPlainText()
		 * @generated
		 */
		EClass PLAIN_TEXT = eINSTANCE.getPlainText();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TEXT__QUESTION = eINSTANCE.getPlainText_Question();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_TEXT__KEYWORD = eINSTANCE.getPlainText_Keyword();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.KeywordImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__KEY = eINSTANCE.getKeyword_Key();

		/**
		 * The meta object literal for the '<em><b>Auto Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__AUTO_KEYWORD = eINSTANCE.getKeyword_AutoKeyword();

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
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.SecureTextImpl <em>Secure Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.SecureTextImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getSecureText()
		 * @generated
		 */
		EClass SECURE_TEXT = eINSTANCE.getSecureText();

		/**
		 * The meta object literal for the '<em><b>Hash Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_TEXT__HASH_ALGORITHM = eINSTANCE
				.getSecureText_HashAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Hash Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURE_TEXT__HASH_ENCODING = eINSTANCE
				.getSecureText_HashEncoding();

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
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__QUESTION = eINSTANCE
				.getMultipleChoice_Question();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__ANSWER = eINSTANCE
				.getMultipleChoice_Answer();

		/**
		 * The meta object literal for the '<em><b>Add Other</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__ADD_OTHER = eINSTANCE
				.getMultipleChoice_AddOther();

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
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__KEYWORD = eINSTANCE.getAnswer_Keyword();

		/**
		 * The meta object literal for the '<em><b>Question Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__QUESTION_REF = eINSTANCE.getAnswer_QuestionRef();

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
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.MessageImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__FROM = eINSTANCE.getMessage_From();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__CHANNELS = eINSTANCE.getMessage_Channels();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TO = eINSTANCE.getMessage_To();

		/**
		 * The meta object literal for the '<em><b>Shout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SHOUT = eINSTANCE.getMessage_Shout();

		/**
		 * The meta object literal for the '<em><b>Stop On Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__STOP_ON_ERROR = eINSTANCE.getMessage_StopOnError();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DATE = eINSTANCE.getMessage_Date();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ROUTING = eINSTANCE.getMessage_Routing();

		/**
		 * The meta object literal for the '<em><b>Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ATTEMPTS = eINSTANCE.getMessage_Attempts();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ENCODING = eINSTANCE.getMessage_Encoding();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ID = eINSTANCE.getMessage_Id();

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
		 * The meta object literal for the '<em><b>Originator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_MESSAGE__ORIGINATOR = eINSTANCE
				.getInboundMessage_Originator();

		/**
		 * The meta object literal for the '<em><b>Smsc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_MESSAGE__SMSC_NUMBER = eINSTANCE
				.getInboundMessage_SmscNumber();

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
		 * The meta object literal for the '<em><b>Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_MESSAGE__SCHEDULE = eINSTANCE
				.getOutboundMessage_Schedule();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_MESSAGE__TIMEOUT = eINSTANCE
				.getOutboundMessage_Timeout();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_MESSAGE__DELAY = eINSTANCE
				.getOutboundMessage_Delay();

		/**
		 * The meta object literal for the '<em><b>Callback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_MESSAGE__CALLBACK = eINSTANCE
				.getOutboundMessage_Callback();

		/**
		 * The meta object literal for the '<em><b>Concatenated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTBOUND_MESSAGE__CONCATENATED = eINSTANCE
				.getOutboundMessage_Concatenated();

		/**
		 * The meta object literal for the '<em><b>Teks Ref</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTBOUND_MESSAGE__TEKS_REF = eINSTANCE
				.getOutboundMessage_TeksRef();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ObjectMessageImpl <em>Object Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ObjectMessageImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getObjectMessage()
		 * @generated
		 */
		EClass OBJECT_MESSAGE = eINSTANCE.getObjectMessage();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ChannelImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__CHANNEL = eINSTANCE.getChannel_Channel();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ErrorImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__STATUS = eINSTANCE.getError_Status();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__MESSAGE = eINSTANCE.getError_Message();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__CODE = eINSTANCE.getError_Code();

		/**
		 * The meta object literal for the '<em><b>More Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__MORE_INFO = eINSTANCE.getError_MoreInfo();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__URL = eINSTANCE.getError_Url();

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
		 * The meta object literal for the '{@link org.teksme.model.teks.impl.ShoutImpl <em>Shout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.impl.ShoutImpl
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getShout()
		 * @generated
		 */
		EClass SHOUT = eINSTANCE.getShout();

		/**
		 * The meta object literal for the '<em><b>This</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOUT__THIS = eINSTANCE.getShout_This();

		/**
		 * The meta object literal for the '<em><b>Voice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOUT__VOICE = eINSTANCE.getShout_Voice();

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
		 * The meta object literal for the '{@link org.teksme.model.teks.StopCommandKind <em>Stop Command Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.StopCommandKind
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getStopCommandKind()
		 * @generated
		 */
		EEnum STOP_COMMAND_KIND = eINSTANCE.getStopCommandKind();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.MessageStatuses <em>Message Statuses</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.MessageStatuses
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getMessageStatuses()
		 * @generated
		 */
		EEnum MESSAGE_STATUSES = eINSTANCE.getMessageStatuses();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.FailureCauses <em>Failure Causes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.FailureCauses
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getFailureCauses()
		 * @generated
		 */
		EEnum FAILURE_CAUSES = eINSTANCE.getFailureCauses();

		/**
		 * The meta object literal for the '{@link org.teksme.model.teks.SMSGatewayKind <em>SMS Gateway Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.teksme.model.teks.SMSGatewayKind
		 * @see org.teksme.model.teks.impl.TeksPackageImpl#getSMSGatewayKind()
		 * @generated
		 */
		EEnum SMS_GATEWAY_KIND = eINSTANCE.getSMSGatewayKind();

	}

} //TeksPackage
