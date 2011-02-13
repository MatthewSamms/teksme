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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.teksme.model.teks.Annotation;
import org.teksme.model.teks.AnnotationMapEntry;
import org.teksme.model.teks.Answer;
import org.teksme.model.teks.AnswerRef;
import org.teksme.model.teks.Application;
import org.teksme.model.teks.Channel;
import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Command;
import org.teksme.model.teks.Comment;
import org.teksme.model.teks.FailureCauses;
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.InboundMessage;
import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.LanguageKind;
import org.teksme.model.teks.Message;
import org.teksme.model.teks.MessageStatuses;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.ObjectMessage;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.PlainText;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.PollQuestion;
import org.teksme.model.teks.PollSettings;
import org.teksme.model.teks.Profile;
import org.teksme.model.teks.ReplyMessage;
import org.teksme.model.teks.Report;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.ResponseDetail;
import org.teksme.model.teks.ResponseRestriction;
import org.teksme.model.teks.RestrictionKind;
import org.teksme.model.teks.SMSGatewayKind;
import org.teksme.model.teks.SecureText;
import org.teksme.model.teks.Shout;
import org.teksme.model.teks.StopCommandKind;
import org.teksme.model.teks.Survey;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeksPackageImpl extends EPackageImpl implements TeksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseRestrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inboundMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restrictionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stopCommandKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageStatusesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureCausesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smsGatewayKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.teksme.model.teks.TeksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TeksPackageImpl() {
		super(eNS_URI, TeksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TeksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TeksPackage init() {
		if (isInited)
			return (TeksPackage) EPackage.Registry.INSTANCE
					.getEPackage(TeksPackage.eNS_URI);

		// Obtain or create and register package
		TeksPackageImpl theTeksPackage = (TeksPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TeksPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new TeksPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTeksPackage.createPackageContents();

		// Initialize created meta-data
		theTeksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTeksPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TeksPackage.eNS_URI, theTeksPackage);
		return theTeksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeks() {
		return teksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_OutboundMessage() {
		return (EReference) teksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Response() {
		return (EReference) teksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Account() {
		return (EReference) teksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Profile() {
		return (EReference) teksEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Survey() {
		return (EReference) teksEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_InboundMessage() {
		return (EReference) teksEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Poll() {
		return (EReference) teksEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Id() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_DateTime() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Annotation() {
		return (EAttribute) annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Source() {
		return (EAttribute) annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Entry() {
		return (EReference) annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationMapEntry() {
		return annotationMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationMapEntry_Key() {
		return (EAttribute) annotationMapEntryEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationMapEntry_Value() {
		return (EAttribute) annotationMapEntryEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_LastName() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_MobileNumber() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Country() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_YearOfBirth() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Company() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_WebsiteURL() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_BlogURL() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Profile() {
		return (EReference) userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Application() {
		return (EReference) profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Key() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_SharedSecret() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Description() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Registered() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Status() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_CallbackURL() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_RateLimits() {
		return (EAttribute) applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_ProfileRef() {
		return (EReference) applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoll() {
		return pollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoll_Question() {
		return (EReference) pollEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoll_Settings() {
		return (EReference) pollEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoll_ReplyMessage() {
		return (EReference) pollEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoll_Annotations() {
		return (EReference) pollEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoll_Comments() {
		return (EReference) pollEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoll_Title() {
		return (EAttribute) pollEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoll_Note() {
		return (EAttribute) pollEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoll_Author() {
		return (EAttribute) pollEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoll_LastModified() {
		return (EAttribute) pollEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoll_Id() {
		return (EAttribute) pollEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurvey() {
		return surveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurvey_Annotations() {
		return (EReference) surveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurvey_Comments() {
		return (EReference) surveyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_Title() {
		return (EAttribute) surveyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_Note() {
		return (EAttribute) surveyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_Author() {
		return (EAttribute) surveyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_LastModified() {
		return (EAttribute) surveyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_Id() {
		return (EAttribute) surveyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollSettings() {
		return pollSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_CloseDate() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_ScheduleStartDate() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_SuspendOnFailure() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_Language() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_BatchResponseDelivery() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_SynchronousConfirmation() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollSettings_ReplyMessage() {
		return (EReference) pollSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollSettings_AdvertiseIt() {
		return (EReference) pollSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_FolderID() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_Sharing() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollSettings_ResponseRestrictions() {
		return (EReference) pollSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollSettings_ShortNumber() {
		return (EAttribute) pollSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyMessage() {
		return replyMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyMessage_Confirmation() {
		return (EReference) replyMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplyMessage_DefaultMessage() {
		return (EAttribute) replyMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyMessage_CustomMessage() {
		return (EReference) replyMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_Error() {
		return (EReference) responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_Message() {
		return (EAttribute) responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseRestriction() {
		return responseRestrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_AcceptMultipleChannels() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_CommunicationChannel() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_RestrictionType() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_BlockRepeat() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_ModerateFirst() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollQuestion() {
		return pollQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollQuestion_Note() {
		return (EAttribute) pollQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollQuestion_Required() {
		return (EAttribute) pollQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollQuestion_PollRef() {
		return (EReference) pollQuestionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainText() {
		return plainTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainText_Question() {
		return (EAttribute) plainTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainText_Keyword() {
		return (EReference) plainTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyword() {
		return keywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyword_Key() {
		return (EAttribute) keywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyword_AutoKeyword() {
		return (EAttribute) keywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeText() {
		return freeTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecureText() {
		return secureTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureText_HashAlgorithm() {
		return (EAttribute) secureTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecureText_HashEncoding() {
		return (EAttribute) secureTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleChoice() {
		return multipleChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleChoice_Question() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleChoice_Answer() {
		return (EReference) multipleChoiceEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleChoice_AddOther() {
		return (EReference) multipleChoiceEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Text() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Id() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_DefaultValue() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Selected() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswer_Keyword() {
		return (EReference) answerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswer_QuestionRef() {
		return (EReference) answerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseDetail() {
		return responseDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseDetail_DateTime() {
		return (EAttribute) responseDetailEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDetail_RawMessage() {
		return (EReference) responseDetailEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDetail_SetValue() {
		return (EReference) responseDetailEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswerRef() {
		return answerRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswerRef_ChoiceRef() {
		return (EReference) answerRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnswerRef_AnswerRef() {
		return (EReference) answerRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswerRef_Value() {
		return (EAttribute) answerRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswerRef_Id() {
		return (EAttribute) answerRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_From() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Channels() {
		return (EReference) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_To() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Shout() {
		return (EReference) messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_StopOnError() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Date() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Attempts() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Encoding() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Id() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInboundMessage() {
		return inboundMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundMessage_PartNumber() {
		return (EAttribute) inboundMessageEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundMessage_MessageType() {
		return (EAttribute) inboundMessageEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundMessage_Originator() {
		return (EAttribute) inboundMessageEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundMessage_SmscNumber() {
		return (EAttribute) inboundMessageEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundMessage() {
		return outboundMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundMessage_Schedule() {
		return (EAttribute) outboundMessageEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundMessage_Timeout() {
		return (EAttribute) outboundMessageEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundMessage_Delay() {
		return (EAttribute) outboundMessageEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundMessage_Routing() {
		return (EAttribute) outboundMessageEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundMessage_Callback() {
		return (EAttribute) outboundMessageEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundMessage_Concatenated() {
		return (EAttribute) outboundMessageEClass.getEStructuralFeatures().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundMessage_TeksRef() {
		return (EReference) outboundMessageEClass.getEStructuralFeatures().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectMessage() {
		return objectMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Channel() {
		return (EAttribute) channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Status() {
		return (EAttribute) errorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Message() {
		return (EAttribute) errorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Code() {
		return (EAttribute) errorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_MoreInfo() {
		return (EAttribute) errorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_Url() {
		return (EAttribute) errorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReport() {
		return reportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_HideResults() {
		return (EAttribute) reportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReport_PercentageOnly() {
		return (EAttribute) reportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShout() {
		return shoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShout_This() {
		return (EAttribute) shoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShout_Voice() {
		return (EAttribute) shoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_DefaultHandler() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_ID() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Name() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguageKind() {
		return languageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannelKind() {
		return channelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestrictionKind() {
		return restrictionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStopCommandKind() {
		return stopCommandKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageStatuses() {
		return messageStatusesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFailureCauses() {
		return failureCausesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSMSGatewayKind() {
		return smsGatewayKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeksFactory getTeksFactory() {
		return (TeksFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		teksEClass = createEClass(TEKS);
		createEReference(teksEClass, TEKS__OUTBOUND_MESSAGE);
		createEReference(teksEClass, TEKS__RESPONSE);
		createEReference(teksEClass, TEKS__ACCOUNT);
		createEReference(teksEClass, TEKS__PROFILE);
		createEReference(teksEClass, TEKS__SURVEY);
		createEReference(teksEClass, TEKS__INBOUND_MESSAGE);
		createEReference(teksEClass, TEKS__POLL);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__ID);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEAttribute(commentEClass, COMMENT__DATE_TIME);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__SOURCE);
		createEReference(annotationEClass, ANNOTATION__ENTRY);

		annotationMapEntryEClass = createEClass(ANNOTATION_MAP_ENTRY);
		createEAttribute(annotationMapEntryEClass, ANNOTATION_MAP_ENTRY__KEY);
		createEAttribute(annotationMapEntryEClass, ANNOTATION_MAP_ENTRY__VALUE);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);
		createEAttribute(userEClass, USER__MOBILE_NUMBER);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__PASSWORD);
		createEAttribute(userEClass, USER__COUNTRY);
		createEAttribute(userEClass, USER__YEAR_OF_BIRTH);
		createEAttribute(userEClass, USER__COMPANY);
		createEAttribute(userEClass, USER__WEBSITE_URL);
		createEAttribute(userEClass, USER__BLOG_URL);
		createEReference(userEClass, USER__PROFILE);

		profileEClass = createEClass(PROFILE);
		createEReference(profileEClass, PROFILE__APPLICATION);

		applicationEClass = createEClass(APPLICATION);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__KEY);
		createEAttribute(applicationEClass, APPLICATION__SHARED_SECRET);
		createEAttribute(applicationEClass, APPLICATION__DESCRIPTION);
		createEAttribute(applicationEClass, APPLICATION__REGISTERED);
		createEAttribute(applicationEClass, APPLICATION__STATUS);
		createEAttribute(applicationEClass, APPLICATION__CALLBACK_URL);
		createEAttribute(applicationEClass, APPLICATION__RATE_LIMITS);
		createEReference(applicationEClass, APPLICATION__PROFILE_REF);

		pollEClass = createEClass(POLL);
		createEReference(pollEClass, POLL__QUESTION);
		createEReference(pollEClass, POLL__SETTINGS);
		createEReference(pollEClass, POLL__REPLY_MESSAGE);
		createEReference(pollEClass, POLL__ANNOTATIONS);
		createEReference(pollEClass, POLL__COMMENTS);
		createEAttribute(pollEClass, POLL__TITLE);
		createEAttribute(pollEClass, POLL__NOTE);
		createEAttribute(pollEClass, POLL__AUTHOR);
		createEAttribute(pollEClass, POLL__LAST_MODIFIED);
		createEAttribute(pollEClass, POLL__ID);

		surveyEClass = createEClass(SURVEY);
		createEReference(surveyEClass, SURVEY__ANNOTATIONS);
		createEReference(surveyEClass, SURVEY__COMMENTS);
		createEAttribute(surveyEClass, SURVEY__TITLE);
		createEAttribute(surveyEClass, SURVEY__NOTE);
		createEAttribute(surveyEClass, SURVEY__AUTHOR);
		createEAttribute(surveyEClass, SURVEY__LAST_MODIFIED);
		createEAttribute(surveyEClass, SURVEY__ID);

		pollSettingsEClass = createEClass(POLL_SETTINGS);
		createEAttribute(pollSettingsEClass, POLL_SETTINGS__CLOSE_DATE);
		createEAttribute(pollSettingsEClass, POLL_SETTINGS__SCHEDULE_START_DATE);
		createEAttribute(pollSettingsEClass, POLL_SETTINGS__SUSPEND_ON_FAILURE);
		createEAttribute(pollSettingsEClass, POLL_SETTINGS__LANGUAGE);
		createEAttribute(pollSettingsEClass,
				POLL_SETTINGS__BATCH_RESPONSE_DELIVERY);
		createEAttribute(pollSettingsEClass,
				POLL_SETTINGS__SYNCHRONOUS_CONFIRMATION);
		createEReference(pollSettingsEClass, POLL_SETTINGS__REPLY_MESSAGE);
		createEReference(pollSettingsEClass, POLL_SETTINGS__ADVERTISE_IT);
		createEAttribute(pollSettingsEClass, POLL_SETTINGS__FOLDER_ID);
		createEAttribute(pollSettingsEClass, POLL_SETTINGS__SHARING);
		createEReference(pollSettingsEClass,
				POLL_SETTINGS__RESPONSE_RESTRICTIONS);
		createEAttribute(pollSettingsEClass, POLL_SETTINGS__SHORT_NUMBER);

		replyMessageEClass = createEClass(REPLY_MESSAGE);
		createEReference(replyMessageEClass, REPLY_MESSAGE__CONFIRMATION);
		createEAttribute(replyMessageEClass, REPLY_MESSAGE__DEFAULT_MESSAGE);
		createEReference(replyMessageEClass, REPLY_MESSAGE__CUSTOM_MESSAGE);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__ERROR);
		createEAttribute(responseEClass, RESPONSE__MESSAGE);

		responseRestrictionEClass = createEClass(RESPONSE_RESTRICTION);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__COMMUNICATION_CHANNEL);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__RESTRICTION_TYPE);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__BLOCK_REPEAT);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__MODERATE_FIRST);

		pollQuestionEClass = createEClass(POLL_QUESTION);
		createEAttribute(pollQuestionEClass, POLL_QUESTION__NOTE);
		createEAttribute(pollQuestionEClass, POLL_QUESTION__REQUIRED);
		createEReference(pollQuestionEClass, POLL_QUESTION__POLL_REF);

		plainTextEClass = createEClass(PLAIN_TEXT);
		createEAttribute(plainTextEClass, PLAIN_TEXT__QUESTION);
		createEReference(plainTextEClass, PLAIN_TEXT__KEYWORD);

		keywordEClass = createEClass(KEYWORD);
		createEAttribute(keywordEClass, KEYWORD__KEY);
		createEAttribute(keywordEClass, KEYWORD__AUTO_KEYWORD);

		freeTextEClass = createEClass(FREE_TEXT);

		secureTextEClass = createEClass(SECURE_TEXT);
		createEAttribute(secureTextEClass, SECURE_TEXT__HASH_ALGORITHM);
		createEAttribute(secureTextEClass, SECURE_TEXT__HASH_ENCODING);

		multipleChoiceEClass = createEClass(MULTIPLE_CHOICE);
		createEAttribute(multipleChoiceEClass, MULTIPLE_CHOICE__QUESTION);
		createEReference(multipleChoiceEClass, MULTIPLE_CHOICE__ANSWER);
		createEReference(multipleChoiceEClass, MULTIPLE_CHOICE__ADD_OTHER);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__TEXT);
		createEAttribute(answerEClass, ANSWER__ID);
		createEAttribute(answerEClass, ANSWER__DEFAULT_VALUE);
		createEAttribute(answerEClass, ANSWER__SELECTED);
		createEReference(answerEClass, ANSWER__KEYWORD);
		createEReference(answerEClass, ANSWER__QUESTION_REF);

		responseDetailEClass = createEClass(RESPONSE_DETAIL);
		createEAttribute(responseDetailEClass, RESPONSE_DETAIL__DATE_TIME);
		createEReference(responseDetailEClass, RESPONSE_DETAIL__RAW_MESSAGE);
		createEReference(responseDetailEClass, RESPONSE_DETAIL__SET_VALUE);

		answerRefEClass = createEClass(ANSWER_REF);
		createEReference(answerRefEClass, ANSWER_REF__CHOICE_REF);
		createEReference(answerRefEClass, ANSWER_REF__ANSWER_REF);
		createEAttribute(answerRefEClass, ANSWER_REF__VALUE);
		createEAttribute(answerRefEClass, ANSWER_REF__ID);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__FROM);
		createEReference(messageEClass, MESSAGE__CHANNELS);
		createEAttribute(messageEClass, MESSAGE__TO);
		createEReference(messageEClass, MESSAGE__SHOUT);
		createEAttribute(messageEClass, MESSAGE__STOP_ON_ERROR);
		createEAttribute(messageEClass, MESSAGE__DATE);
		createEAttribute(messageEClass, MESSAGE__ATTEMPTS);
		createEAttribute(messageEClass, MESSAGE__ENCODING);
		createEAttribute(messageEClass, MESSAGE__ID);

		inboundMessageEClass = createEClass(INBOUND_MESSAGE);
		createEAttribute(inboundMessageEClass, INBOUND_MESSAGE__PART_NUMBER);
		createEAttribute(inboundMessageEClass, INBOUND_MESSAGE__MESSAGE_TYPE);
		createEAttribute(inboundMessageEClass, INBOUND_MESSAGE__ORIGINATOR);
		createEAttribute(inboundMessageEClass, INBOUND_MESSAGE__SMSC_NUMBER);

		outboundMessageEClass = createEClass(OUTBOUND_MESSAGE);
		createEAttribute(outboundMessageEClass, OUTBOUND_MESSAGE__SCHEDULE);
		createEAttribute(outboundMessageEClass, OUTBOUND_MESSAGE__TIMEOUT);
		createEAttribute(outboundMessageEClass, OUTBOUND_MESSAGE__DELAY);
		createEAttribute(outboundMessageEClass, OUTBOUND_MESSAGE__ROUTING);
		createEAttribute(outboundMessageEClass, OUTBOUND_MESSAGE__CALLBACK);
		createEAttribute(outboundMessageEClass, OUTBOUND_MESSAGE__CONCATENATED);
		createEReference(outboundMessageEClass, OUTBOUND_MESSAGE__TEKS_REF);

		objectMessageEClass = createEClass(OBJECT_MESSAGE);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__CHANNEL);

		errorEClass = createEClass(ERROR);
		createEAttribute(errorEClass, ERROR__STATUS);
		createEAttribute(errorEClass, ERROR__MESSAGE);
		createEAttribute(errorEClass, ERROR__CODE);
		createEAttribute(errorEClass, ERROR__MORE_INFO);
		createEAttribute(errorEClass, ERROR__URL);

		reportEClass = createEClass(REPORT);
		createEAttribute(reportEClass, REPORT__HIDE_RESULTS);
		createEAttribute(reportEClass, REPORT__PERCENTAGE_ONLY);

		shoutEClass = createEClass(SHOUT);
		createEAttribute(shoutEClass, SHOUT__THIS);
		createEAttribute(shoutEClass, SHOUT__VOICE);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__DEFAULT_HANDLER);
		createEAttribute(commandEClass, COMMAND__ID);
		createEAttribute(commandEClass, COMMAND__NAME);

		// Create enums
		languageKindEEnum = createEEnum(LANGUAGE_KIND);
		channelKindEEnum = createEEnum(CHANNEL_KIND);
		restrictionKindEEnum = createEEnum(RESTRICTION_KIND);
		stopCommandKindEEnum = createEEnum(STOP_COMMAND_KIND);
		messageStatusesEEnum = createEEnum(MESSAGE_STATUSES);
		failureCausesEEnum = createEEnum(FAILURE_CAUSES);
		smsGatewayKindEEnum = createEEnum(SMS_GATEWAY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		plainTextEClass.getESuperTypes().add(this.getPollQuestion());
		freeTextEClass.getESuperTypes().add(this.getPlainText());
		secureTextEClass.getESuperTypes().add(this.getPlainText());
		multipleChoiceEClass.getESuperTypes().add(this.getPollQuestion());
		inboundMessageEClass.getESuperTypes().add(this.getMessage());
		outboundMessageEClass.getESuperTypes().add(this.getMessage());
		objectMessageEClass.getESuperTypes().add(this.getMessage());

		// Initialize classes and features; add operations and parameters
		initEClass(teksEClass, Teks.class, "Teks", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeks_OutboundMessage(), this.getOutboundMessage(),
				this.getOutboundMessage_TeksRef(), "outboundMessage", null, 0,
				-1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Response(), this.getResponse(), null,
				"response", null, 0, 1, Teks.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Account(), this.getUser(), null, "account",
				null, 0, 1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Profile(), this.getProfile(), null, "profile",
				null, 0, 1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Survey(), this.getSurvey(), null, "survey",
				null, 0, 1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_InboundMessage(), this.getInboundMessage(),
				null, "inboundMessage", null, 0, -1, Teks.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Poll(), this.getPoll(), null, "poll", null, 0,
				1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Id(), ecorePackage.getEString(), "id", null,
				0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getComment_Body(), ecorePackage.getEString(), "body",
				null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getComment_DateTime(), ecorePackage.getEDate(),
				"dateTime", null, 0, 1, Comment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Annotation(), ecorePackage.getEString(),
				"annotation", null, 0, 1, Annotation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Source(), ecorePackage.getEString(),
				"source", null, 0, 1, Annotation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Entry(), this.getAnnotationMapEntry(),
				null, "entry", null, 0, -1, Annotation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationMapEntryEClass, AnnotationMapEntry.class,
				"AnnotationMapEntry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationMapEntry_Key(), ecorePackage.getEString(),
				"key", null, 0, 1, AnnotationMapEntry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationMapEntry_Value(),
				ecorePackage.getEString(), "value", null, 0, 1,
				AnnotationMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_FirstName(), ecorePackage.getEString(),
				"firstName", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastName(), ecorePackage.getEString(),
				"lastName", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_MobileNumber(), ecorePackage.getEString(),
				"mobileNumber", null, 1, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email",
				null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUser_Password(), ecorePackage.getEString(),
				"password", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Country(), ecorePackage.getEString(), "country",
				null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUser_YearOfBirth(), ecorePackage.getEInt(),
				"yearOfBirth", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Company(), ecorePackage.getEString(), "company",
				null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUser_WebsiteURL(), ecorePackage.getEString(),
				"websiteURL", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_BlogURL(), ecorePackage.getEString(), "blogURL",
				null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUser_Profile(), this.getProfile(), null, "profile",
				null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfile_Application(), this.getApplication(),
				this.getApplication_ProfileRef(), "application", null, 0, -1,
				Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(),
				"name", null, 1, 1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Key(), ecorePackage.getEString(), "key",
				null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getApplication_SharedSecret(),
				ecorePackage.getEString(), "sharedSecret", null, 1, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Description(), ecorePackage.getEString(),
				"description", null, 0, 1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Registered(), ecorePackage.getEDate(),
				"registered", null, 1, 1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Status(), ecorePackage.getEString(),
				"status", null, 1, 1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_CallbackURL(), ecorePackage.getEString(),
				"callbackURL", null, 0, 1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_RateLimits(), ecorePackage.getEInt(),
				"rateLimits", null, 0, 1, Application.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_ProfileRef(), this.getProfile(),
				this.getProfile_Application(), "profileRef", null, 0, 1,
				Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pollEClass, Poll.class, "Poll", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoll_Question(), this.getPollQuestion(),
				this.getPollQuestion_PollRef(), "question", null, 0, -1,
				Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPoll_Settings(), this.getPollSettings(), null,
				"settings", null, 0, 1, Poll.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoll_ReplyMessage(), this.getReplyMessage(), null,
				"replyMessage", null, 0, 1, Poll.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoll_Annotations(), this.getAnnotation(), null,
				"annotations", null, 0, -1, Poll.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPoll_Comments(), this.getComment(), null, "comments",
				null, 0, -1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoll_Title(), ecorePackage.getEString(), "title",
				null, 0, 1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPoll_Note(), ecorePackage.getEString(), "note", null,
				0, 1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoll_Author(), ecorePackage.getEString(), "author",
				null, 0, 1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPoll_LastModified(), ecorePackage.getEDate(),
				"lastModified", null, 0, 1, Poll.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoll_Id(), ecorePackage.getEString(), "id", null, 0,
				1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyEClass, Survey.class, "Survey", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurvey_Annotations(), this.getAnnotation(), null,
				"annotations", null, 0, -1, Survey.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurvey_Comments(), this.getComment(), null,
				"comments", null, 0, -1, Survey.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_Title(), ecorePackage.getEString(), "title",
				null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSurvey_Note(), ecorePackage.getEString(), "note",
				null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSurvey_Author(), ecorePackage.getEString(), "author",
				null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSurvey_LastModified(), ecorePackage.getEDate(),
				"lastModified", null, 0, 1, Survey.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_Id(), ecorePackage.getEString(), "id", null,
				0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollSettingsEClass, PollSettings.class, "PollSettings",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollSettings_CloseDate(), ecorePackage.getEDate(),
				"closeDate", null, 0, 1, PollSettings.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollSettings_ScheduleStartDate(),
				ecorePackage.getEDate(), "scheduleStartDate", null, 0, 1,
				PollSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollSettings_SuspendOnFailure(),
				ecorePackage.getEBoolean(), "suspendOnFailure", null, 0, 1,
				PollSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollSettings_Language(), this.getLanguageKind(),
				"language", null, 0, -1, PollSettings.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollSettings_BatchResponseDelivery(),
				ecorePackage.getEBoolean(), "batchResponseDelivery", "true", 0,
				1, PollSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPollSettings_SynchronousConfirmation(),
				ecorePackage.getEBoolean(), "synchronousConfirmation", "true",
				0, 1, PollSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPollSettings_ReplyMessage(), this.getReplyMessage(),
				null, "replyMessage", null, 0, 1, PollSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPollSettings_AdvertiseIt(),
				this.getOutboundMessage(), null, "advertiseIt", null, 0, 1,
				PollSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollSettings_FolderID(), ecorePackage.getEString(),
				"folderID", null, 0, 1, PollSettings.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollSettings_Sharing(), ecorePackage.getEBoolean(),
				"sharing", null, 0, 1, PollSettings.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPollSettings_ResponseRestrictions(),
				this.getResponseRestriction(), null, "responseRestrictions",
				null, 0, 1, PollSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollSettings_ShortNumber(), ecorePackage.getEInt(),
				"shortNumber", null, 0, 1, PollSettings.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(replyMessageEClass, ReplyMessage.class, "ReplyMessage",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplyMessage_Confirmation(), this.getReplyMessage(),
				null, "confirmation", null, 0, -1, ReplyMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getReplyMessage_DefaultMessage(),
				ecorePackage.getEBoolean(), "defaultMessage", "false", 0, 1,
				ReplyMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplyMessage_CustomMessage(),
				this.getOutboundMessage(), null, "customMessage", null, 0, 1,
				ReplyMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Error(), this.getError(), null, "error",
				null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_Message(), ecorePackage.getEString(),
				"message", null, 1, 1, Response.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(responseRestrictionEClass, ResponseRestriction.class,
				"ResponseRestriction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseRestriction_AcceptMultipleChannels(),
				ecorePackage.getEBoolean(), "acceptMultipleChannels", null, 0,
				1, ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResponseRestriction_CommunicationChannel(),
				this.getChannelKind(), "communicationChannel", null, 0, -1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResponseRestriction_RestrictionType(),
				this.getRestrictionKind(), "restrictionType", null, 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResponseRestriction_BlockRepeat(),
				ecorePackage.getEBoolean(), "blockRepeat", null, 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResponseRestriction_ModerateFirst(),
				ecorePackage.getEBoolean(), "moderateFirst", null, 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pollQuestionEClass, PollQuestion.class, "PollQuestion",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollQuestion_Note(), ecorePackage.getEString(),
				"note", null, 0, 1, PollQuestion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollQuestion_Required(), ecorePackage.getEBoolean(),
				"required", null, 0, 1, PollQuestion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPollQuestion_PollRef(), this.getPoll(),
				this.getPoll_Question(), "pollRef", null, 0, 1,
				PollQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(plainTextEClass, PlainText.class, "PlainText", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainText_Question(), ecorePackage.getEString(),
				"question", null, 0, 1, PlainText.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPlainText_Keyword(), this.getKeyword(), null,
				"keyword", null, 0, 1, PlainText.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordEClass, Keyword.class, "Keyword", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyword_Key(), ecorePackage.getEString(), "key",
				null, 0, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKeyword_AutoKeyword(), ecorePackage.getEBoolean(),
				"autoKeyword", "true", 0, 1, Keyword.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(freeTextEClass, FreeText.class, "FreeText", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(secureTextEClass, SecureText.class, "SecureText",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecureText_HashAlgorithm(),
				ecorePackage.getEString(), "hashAlgorithm", null, 0, 1,
				SecureText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecureText_HashEncoding(), ecorePackage.getEString(),
				"hashEncoding", null, 0, 1, SecureText.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(multipleChoiceEClass, MultipleChoice.class,
				"MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultipleChoice_Question(), ecorePackage.getEString(),
				"question", null, 0, 1, MultipleChoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleChoice_Answer(), this.getAnswer(),
				this.getAnswer_QuestionRef(), "answer", null, 0, -1,
				MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleChoice_AddOther(), this.getFreeText(), null,
				"addOther", null, 0, 1, MultipleChoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_Text(), ecorePackage.getEString(), "text",
				null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAnswer_Id(), ecorePackage.getEBoolean(), "id", null,
				1, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_DefaultValue(), ecorePackage.getEString(),
				"defaultValue", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Selected(), ecorePackage.getEBoolean(),
				"selected", "false", 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAnswer_Keyword(), this.getKeyword(), null, "keyword",
				null, 0, 1, Answer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnswer_QuestionRef(), this.getMultipleChoice(),
				this.getMultipleChoice_Answer(), "questionRef", null, 0, 1,
				Answer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(responseDetailEClass, ResponseDetail.class,
				"ResponseDetail", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseDetail_DateTime(), ecorePackage.getEDate(),
				"dateTime", null, 0, 1, ResponseDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDetail_RawMessage(),
				this.getInboundMessage(), null, "rawMessage", null, 0, 1,
				ResponseDetail.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDetail_SetValue(), this.getAnswerRef(), null,
				"setValue", null, 0, -1, ResponseDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getResponseDetail_SetValue().getEKeys().add(this.getAnswerRef_Id());

		initEClass(answerRefEClass, AnswerRef.class, "AnswerRef", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnswerRef_ChoiceRef(), this.getPollQuestion(), null,
				"choiceRef", null, 0, 1, AnswerRef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnswerRef_AnswerRef(), this.getAnswer(), null,
				"answerRef", null, 0, 1, AnswerRef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswerRef_Value(), ecorePackage.getEString(),
				"value", null, 0, 1, AnswerRef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswerRef_Id(), ecorePackage.getEString(), "id",
				null, 1, 1, AnswerRef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_From(), ecorePackage.getEString(), "from",
				null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMessage_Channels(), this.getChannel(), null,
				"channels", null, 1, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_To(), ecorePackage.getEString(), "to", null,
				1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMessage_Shout(), this.getShout(), null, "shout",
				null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_StopOnError(), ecorePackage.getEBoolean(),
				"stopOnError", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Date(), ecorePackage.getEDate(), "date",
				null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_Attempts(), ecorePackage.getEInt(),
				"attempts", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Encoding(), ecorePackage.getEString(),
				"encoding", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Id(), ecorePackage.getEString(), "id", null,
				0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(inboundMessageEClass, InboundMessage.class,
				"InboundMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInboundMessage_PartNumber(),
				ecorePackage.getEString(), "partNumber", null, 0, 1,
				InboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInboundMessage_MessageType(),
				ecorePackage.getEString(), "messageType", null, 0, 1,
				InboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInboundMessage_Originator(),
				ecorePackage.getEString(), "originator", null, 0, 1,
				InboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInboundMessage_SmscNumber(),
				ecorePackage.getEString(), "smscNumber", null, 0, 1,
				InboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(outboundMessageEClass, OutboundMessage.class,
				"OutboundMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutboundMessage_Schedule(), ecorePackage.getEDate(),
				"schedule", null, 0, 1, OutboundMessage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundMessage_Timeout(), ecorePackage.getEFloat(),
				"timeout", null, 0, 1, OutboundMessage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundMessage_Delay(), ecorePackage.getEInt(),
				"delay", null, 0, 1, OutboundMessage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundMessage_Routing(), this.getSMSGatewayKind(),
				"routing", null, 0, 1, OutboundMessage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutboundMessage_Callback(),
				ecorePackage.getEString(), "callback", null, 0, 1,
				OutboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundMessage_Concatenated(),
				ecorePackage.getEBoolean(), "concatenated", null, 0, 1,
				OutboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOutboundMessage_TeksRef(), this.getTeks(),
				this.getTeks_OutboundMessage(), "teksRef", null, 0, 1,
				OutboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectMessageEClass, ObjectMessage.class, "ObjectMessage",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_Channel(), ecorePackage.getEString(),
				"channel", null, 1, -1, Channel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(errorEClass, org.teksme.model.teks.Error.class, "Error",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getError_Status(), ecorePackage.getEInt(), "status",
				null, 1, 1, org.teksme.model.teks.Error.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Message(), ecorePackage.getEString(),
				"message", null, 1, 1, org.teksme.model.teks.Error.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Code(), ecorePackage.getEInt(), "code", null,
				1, 1, org.teksme.model.teks.Error.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_MoreInfo(), ecorePackage.getEString(),
				"moreInfo", null, 1, 1, org.teksme.model.teks.Error.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getError_Url(), ecorePackage.getEString(), "url", null,
				0, 1, org.teksme.model.teks.Error.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReport_HideResults(), ecorePackage.getEBoolean(),
				"hideResults", null, 0, 1, Report.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getReport_PercentageOnly(), ecorePackage.getEBoolean(),
				"percentageOnly", null, 0, 1, Report.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(shoutEClass, Shout.class, "Shout", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShout_This(), ecorePackage.getEString(), "this",
				null, 0, 1, Shout.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getShout_Voice(), ecorePackage.getEString(), "voice",
				null, 0, 1, Shout.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_DefaultHandler(), ecorePackage.getEString(),
				"defaultHandler", null, 0, 1, Command.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommand_ID(), ecorePackage.getEString(), "ID", null,
				0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCommand_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languageKindEEnum, LanguageKind.class, "LanguageKind");
		addEEnumLiteral(languageKindEEnum, LanguageKind.EN_US);
		addEEnumLiteral(languageKindEEnum, LanguageKind.PT_BR);

		initEEnum(channelKindEEnum, ChannelKind.class, "ChannelKind");
		addEEnumLiteral(channelKindEEnum, ChannelKind.SMS);
		addEEnumLiteral(channelKindEEnum, ChannelKind.EMAIL);
		addEEnumLiteral(channelKindEEnum, ChannelKind.WEB);
		addEEnumLiteral(channelKindEEnum, ChannelKind.TWITTER);
		addEEnumLiteral(channelKindEEnum, ChannelKind.WEB_WIDGET);
		addEEnumLiteral(channelKindEEnum, ChannelKind.IVR);
		addEEnumLiteral(channelKindEEnum, ChannelKind.MMS);
		addEEnumLiteral(channelKindEEnum, ChannelKind.GTALK);
		addEEnumLiteral(channelKindEEnum, ChannelKind.MSN);

		initEEnum(restrictionKindEEnum, RestrictionKind.class,
				"RestrictionKind");
		addEEnumLiteral(restrictionKindEEnum, RestrictionKind.EVERYONE);
		addEEnumLiteral(restrictionKindEEnum, RestrictionKind.RIGESTERED_USER);

		initEEnum(stopCommandKindEEnum, StopCommandKind.class,
				"StopCommandKind");
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.STOP);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.END);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.CANCEL);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.UNSUBSCRIBE);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.QUIT);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.STOP_STOP);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.STOP_ALL);

		initEEnum(messageStatusesEEnum, MessageStatuses.class,
				"MessageStatuses");
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.MSG_UNKNOWN);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.MSG_QUEUED);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.DELIVERED_GATEWAY);
		addEEnumLiteral(messageStatusesEEnum,
				MessageStatuses.RECEIVED_BY_RECIPIENT);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.ERROR_WITH_MSG);
		addEEnumLiteral(messageStatusesEEnum,
				MessageStatuses.USER_CANCELLED_MSG);
		addEEnumLiteral(messageStatusesEEnum,
				MessageStatuses.ERROR_DELIVERING_MSG);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.SENT);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.ROUTING_ERROR);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.MSG_EXPIRED);
		addEEnumLiteral(messageStatusesEEnum,
				MessageStatuses.MSG_QUEUED_FOR_LATER_DELIVERY);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.UNSENT);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.FAILED);

		initEEnum(failureCausesEEnum, FailureCauses.class, "FailureCauses");
		addEEnumLiteral(failureCausesEEnum, FailureCauses.NO_ERROR);
		addEEnumLiteral(failureCausesEEnum, FailureCauses.BAD_NUMBER);
		addEEnumLiteral(failureCausesEEnum, FailureCauses.BAD_FORMAT);
		addEEnumLiteral(failureCausesEEnum, FailureCauses.GATEWAY_FAILURE);
		addEEnumLiteral(failureCausesEEnum, FailureCauses.NO_CREDIT);
		addEEnumLiteral(failureCausesEEnum, FailureCauses.GATEWAY_AUTH);
		addEEnumLiteral(failureCausesEEnum, FailureCauses.NO_ROUTE);
		addEEnumLiteral(failureCausesEEnum, FailureCauses.UNKNOWN);

		initEEnum(smsGatewayKindEEnum, SMSGatewayKind.class, "SMSGatewayKind");
		addEEnumLiteral(smsGatewayKindEEnum, SMSGatewayKind.CLICKATELL);
		addEEnumLiteral(smsGatewayKindEEnum, SMSGatewayKind.DIGICEL);
		addEEnumLiteral(smsGatewayKindEEnum, SMSGatewayKind.MOVISTAR_PERU);
		addEEnumLiteral(smsGatewayKindEEnum, SMSGatewayKind.MODEM);
		addEEnumLiteral(smsGatewayKindEEnum, SMSGatewayKind.BULKSMS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(getUser_FirstName(), source, new String[] { "kind",
				"element", "name", "firstName" });
		addAnnotation(getUser_LastName(), source, new String[] { "kind",
				"element", "name", "lastName" });
		addAnnotation(getUser_MobileNumber(), source, new String[] { "kind",
				"element", "name", "mobileNumber" });
		addAnnotation(getUser_Email(), source, new String[] { "kind",
				"element", "name", "email" });
		addAnnotation(getUser_Password(), source, new String[] { "kind",
				"element", "name", "password" });
		addAnnotation(getUser_Country(), source, new String[] { "kind",
				"element", "name", "country" });
		addAnnotation(getUser_YearOfBirth(), source, new String[] { "kind",
				"element", "name", "yearOfBirth" });
		addAnnotation(getUser_Company(), source, new String[] { "kind",
				"element", "name", "company" });
		addAnnotation(getUser_WebsiteURL(), source, new String[] { "kind",
				"element", "name", "websiteURL" });
		addAnnotation(getUser_BlogURL(), source, new String[] { "kind",
				"element", "name", "blogURL" });
		addAnnotation(getApplication_Name(), source, new String[] { "kind",
				"element", "name", "name" });
		addAnnotation(getApplication_Key(), source, new String[] { "kind",
				"element", "name", "key" });
		addAnnotation(getApplication_SharedSecret(), source, new String[] {
				"kind", "element", "name", "sharedSecret" });
		addAnnotation(getApplication_Description(), source, new String[] {
				"kind", "element", "name", "description" });
		addAnnotation(getApplication_Registered(), source, new String[] {
				"kind", "element", "name", "registered" });
		addAnnotation(getApplication_Status(), source, new String[] { "kind",
				"element", "name", "status" });
		addAnnotation(getApplication_CallbackURL(), source, new String[] {
				"kind", "element", "name", "callbackURL" });
		addAnnotation(getApplication_RateLimits(), source, new String[] {
				"kind", "element", "name", "rateLimits" });
		addAnnotation(getResponse_Message(), source, new String[] { "kind",
				"element", "name", "message" });
		addAnnotation(getMessage_From(), source, new String[] { "kind",
				"element", "name", "from" });
		addAnnotation(getMessage_To(), source, new String[] { "kind",
				"element", "name", "to" });
		addAnnotation(getMessage_StopOnError(), source, new String[] { "kind",
				"element", "name", "stopOnError" });
		addAnnotation(getMessage_Date(), source, new String[] { "kind",
				"element", "name", "date" });
		addAnnotation(getMessage_Attempts(), source, new String[] { "kind",
				"element", "name", "attempts" });
		addAnnotation(getMessage_Encoding(), source, new String[] { "kind",
				"element", "name", "encoding" });
		addAnnotation(getMessage_Id(), source, new String[] { "kind",
				"element", "name", "id" });
		addAnnotation(getOutboundMessage_Schedule(), source, new String[] {
				"kind", "element", "name", "schedule" });
		addAnnotation(getOutboundMessage_Timeout(), source, new String[] {
				"kind", "element", "name", "timeout" });
		addAnnotation(getOutboundMessage_Delay(), source, new String[] {
				"kind", "element", "name", "delay" });
		addAnnotation(getOutboundMessage_Routing(), source, new String[] {
				"kind", "element", "name", "routing" });
		addAnnotation(getOutboundMessage_Callback(), source, new String[] {
				"kind", "element", "name", "callback" });
		addAnnotation(getOutboundMessage_Concatenated(), source, new String[] {
				"kind", "element", "name", "concatenated" });
		addAnnotation(getChannel_Channel(), source, new String[] { "kind",
				"element", "name", "channel" });
		addAnnotation(getError_Status(), source, new String[] { "kind",
				"element", "name", "status" });
		addAnnotation(getError_Message(), source, new String[] { "kind",
				"element", "name", "message" });
		addAnnotation(getError_Code(), source, new String[] { "kind",
				"element", "name", "code" });
		addAnnotation(getError_MoreInfo(), source, new String[] { "kind",
				"element", "name", "moreInfo" });
		addAnnotation(getError_Url(), source, new String[] { "kind", "element",
				"name", "url" });
	}

} //TeksPackageImpl
