/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Command;
import org.teksme.model.teks.Comment;
import org.teksme.model.teks.FailureCauses;
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.InboundTextMessage;
import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.LanguageKind;
import org.teksme.model.teks.Message;
import org.teksme.model.teks.MessageStatuses;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.OutboundTextMessage;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.PollQuestion;
import org.teksme.model.teks.PollSettings;
import org.teksme.model.teks.ReplyMessage;
import org.teksme.model.teks.Report;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.ResponseDetail;
import org.teksme.model.teks.ResponseRestriction;
import org.teksme.model.teks.RestrictionKind;
import org.teksme.model.teks.SecureText;
import org.teksme.model.teks.StopCommandKind;
import org.teksme.model.teks.Survey;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.Text;
import org.teksme.model.teks.UserProfile;

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
	private EClass userProfileEClass = null;

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
	private EClass textEClass = null;

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
	private EClass messageEClass = null;

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
	private EClass inboundTextMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundTextMessageEClass = null;

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
	public EAttribute getTeks_AppId() {
		return (EAttribute) teksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_UserProfile() {
		return (EReference) teksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Poll() {
		return (EReference) teksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Survey() {
		return (EReference) teksEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_Responses() {
		return (EReference) teksEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_OutboundMessage() {
		return (EReference) teksEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_InboundMessage() {
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
	public EClass getUserProfile() {
		return userProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProfile_Id() {
		return (EAttribute) userProfileEClass.getEStructuralFeatures().get(0);
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
	public EReference getResponse_Response() {
		return (EReference) responseEClass.getEStructuralFeatures().get(0);
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
	public EReference getPollQuestion_Keyword() {
		return (EReference) pollQuestionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Question() {
		return (EAttribute) textEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAnswer_Keyword() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_AutoKeyword() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_DefaultValue() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Selected() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(5);
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
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Id() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Text() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Timestamp() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Encoding() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_CommunicationChannel() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_GatewayId() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageCharCount() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(6);
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
	public EClass getInboundTextMessage() {
		return inboundTextMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundTextMessage_PartNumber() {
		return (EAttribute) inboundTextMessageEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundTextMessage_MessageType() {
		return (EAttribute) inboundTextMessageEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundTextMessage_Originator() {
		return (EAttribute) inboundTextMessageEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundTextMessage_SmscNumber() {
		return (EAttribute) inboundTextMessageEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundTextMessage() {
		return outboundTextMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_From() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_Recipient() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_StatusReport() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_Priority() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_RetryCount() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_MessageStatus() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_FailureCause() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_ValidityPeriod() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_DispatchDate() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundTextMessage_RefNo() {
		return (EAttribute) outboundTextMessageEClass.getEStructuralFeatures()
				.get(9);
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
		createEAttribute(teksEClass, TEKS__APP_ID);
		createEReference(teksEClass, TEKS__USER_PROFILE);
		createEReference(teksEClass, TEKS__POLL);
		createEReference(teksEClass, TEKS__SURVEY);
		createEReference(teksEClass, TEKS__RESPONSES);
		createEReference(teksEClass, TEKS__OUTBOUND_MESSAGE);
		createEReference(teksEClass, TEKS__INBOUND_MESSAGE);

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

		userProfileEClass = createEClass(USER_PROFILE);
		createEAttribute(userProfileEClass, USER_PROFILE__ID);

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
		createEReference(responseEClass, RESPONSE__RESPONSE);

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
		createEReference(pollQuestionEClass, POLL_QUESTION__KEYWORD);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__QUESTION);

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
		createEAttribute(answerEClass, ANSWER__KEYWORD);
		createEAttribute(answerEClass, ANSWER__AUTO_KEYWORD);
		createEAttribute(answerEClass, ANSWER__DEFAULT_VALUE);
		createEAttribute(answerEClass, ANSWER__SELECTED);

		responseDetailEClass = createEClass(RESPONSE_DETAIL);
		createEAttribute(responseDetailEClass, RESPONSE_DETAIL__DATE_TIME);
		createEReference(responseDetailEClass, RESPONSE_DETAIL__RAW_MESSAGE);
		createEReference(responseDetailEClass, RESPONSE_DETAIL__SET_VALUE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__ID);
		createEAttribute(messageEClass, MESSAGE__TEXT);
		createEAttribute(messageEClass, MESSAGE__TIMESTAMP);
		createEAttribute(messageEClass, MESSAGE__ENCODING);
		createEAttribute(messageEClass, MESSAGE__COMMUNICATION_CHANNEL);
		createEAttribute(messageEClass, MESSAGE__GATEWAY_ID);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_CHAR_COUNT);

		answerRefEClass = createEClass(ANSWER_REF);
		createEReference(answerRefEClass, ANSWER_REF__CHOICE_REF);
		createEReference(answerRefEClass, ANSWER_REF__ANSWER_REF);
		createEAttribute(answerRefEClass, ANSWER_REF__VALUE);
		createEAttribute(answerRefEClass, ANSWER_REF__ID);

		inboundTextMessageEClass = createEClass(INBOUND_TEXT_MESSAGE);
		createEAttribute(inboundTextMessageEClass,
				INBOUND_TEXT_MESSAGE__PART_NUMBER);
		createEAttribute(inboundTextMessageEClass,
				INBOUND_TEXT_MESSAGE__MESSAGE_TYPE);
		createEAttribute(inboundTextMessageEClass,
				INBOUND_TEXT_MESSAGE__ORIGINATOR);
		createEAttribute(inboundTextMessageEClass,
				INBOUND_TEXT_MESSAGE__SMSC_NUMBER);

		outboundTextMessageEClass = createEClass(OUTBOUND_TEXT_MESSAGE);
		createEAttribute(outboundTextMessageEClass, OUTBOUND_TEXT_MESSAGE__FROM);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__RECIPIENT);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__STATUS_REPORT);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__PRIORITY);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__RETRY_COUNT);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__MESSAGE_STATUS);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__FAILURE_CAUSE);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__VALIDITY_PERIOD);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__DISPATCH_DATE);
		createEAttribute(outboundTextMessageEClass,
				OUTBOUND_TEXT_MESSAGE__REF_NO);

		reportEClass = createEClass(REPORT);
		createEAttribute(reportEClass, REPORT__HIDE_RESULTS);
		createEAttribute(reportEClass, REPORT__PERCENTAGE_ONLY);

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
		textEClass.getESuperTypes().add(this.getPollQuestion());
		freeTextEClass.getESuperTypes().add(this.getText());
		secureTextEClass.getESuperTypes().add(this.getText());
		multipleChoiceEClass.getESuperTypes().add(this.getPollQuestion());
		inboundTextMessageEClass.getESuperTypes().add(this.getMessage());
		outboundTextMessageEClass.getESuperTypes().add(this.getMessage());

		// Initialize classes and features; add operations and parameters
		initEClass(teksEClass, Teks.class, "Teks", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeks_AppId(), ecorePackage.getEString(), "appId",
				null, 0, 1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTeks_UserProfile(), this.getUserProfile(), null,
				"userProfile", null, 0, 1, Teks.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Poll(), this.getPoll(), null, "poll", null, 0,
				1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Survey(), this.getSurvey(), null, "survey",
				null, 0, 1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_Responses(), this.getResponse(), null,
				"responses", null, 0, 1, Teks.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_OutboundMessage(),
				this.getOutboundTextMessage(), null, "outboundMessage", null,
				0, -1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		getTeks_OutboundMessage().getEKeys().add(this.getMessage_Id());
		initEReference(getTeks_InboundMessage(), this.getInboundTextMessage(),
				null, "inboundMessage", null, 0, -1, Teks.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTeks_InboundMessage().getEKeys().add(this.getMessage_Id());

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

		initEClass(userProfileEClass, UserProfile.class, "UserProfile",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProfile_Id(), ecorePackage.getEString(), "id",
				null, 0, 1, UserProfile.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

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
				this.getOutboundTextMessage(), null, "advertiseIt", null, 0, 1,
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
				this.getOutboundTextMessage(), null, "customMessage", null, 0,
				1, ReplyMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Response(), this.getResponseDetail(), null,
				"response", null, 0, -1, Response.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getPollQuestion_Keyword(), this.getKeyword(), null,
				"keyword", null, 0, 1, PollQuestion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Question(), ecorePackage.getEString(),
				"question", null, 0, 1, Text.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

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
		initEReference(getMultipleChoice_Answer(), this.getAnswer(), null,
				"answer", null, 0, -1, MultipleChoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
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
		initEAttribute(getAnswer_Keyword(), ecorePackage.getEString(),
				"keyword", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_AutoKeyword(), ecorePackage.getEBoolean(),
				"autoKeyword", "true", 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_DefaultValue(), ecorePackage.getEString(),
				"defaultValue", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Selected(), ecorePackage.getEBoolean(),
				"selected", "false", 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(responseDetailEClass, ResponseDetail.class,
				"ResponseDetail", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseDetail_DateTime(), ecorePackage.getEDate(),
				"dateTime", null, 0, 1, ResponseDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDetail_RawMessage(),
				this.getInboundTextMessage(), null, "rawMessage", null, 0, 1,
				ResponseDetail.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDetail_SetValue(), this.getAnswerRef(), null,
				"setValue", null, 0, -1, ResponseDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getResponseDetail_SetValue().getEKeys().add(this.getAnswerRef_Id());

		initEClass(messageEClass, Message.class, "Message", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Id(), ecorePackage.getEString(), "id", null,
				0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_Text(), ecorePackage.getEString(), "text",
				null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_Timestamp(), ecorePackage.getEDate(),
				"timestamp", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Encoding(), ecorePackage.getEString(),
				"encoding", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_CommunicationChannel(),
				this.getChannelKind(), "communicationChannel", null, 0, -1,
				Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_GatewayId(), ecorePackage.getEString(),
				"gatewayId", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_MessageCharCount(),
				ecorePackage.getEString(), "messageCharCount", null, 0, 1,
				Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		getAnswerRef_AnswerRef().getEKeys().add(this.getAnswer_Keyword());
		initEAttribute(getAnswerRef_Value(), ecorePackage.getEString(),
				"value", null, 0, 1, AnswerRef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswerRef_Id(), ecorePackage.getEString(), "id",
				null, 1, 1, AnswerRef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(inboundTextMessageEClass, InboundTextMessage.class,
				"InboundTextMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInboundTextMessage_PartNumber(),
				ecorePackage.getEString(), "partNumber", null, 0, 1,
				InboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInboundTextMessage_MessageType(),
				ecorePackage.getEString(), "messageType", null, 0, 1,
				InboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInboundTextMessage_Originator(),
				ecorePackage.getEString(), "originator", null, 0, 1,
				InboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInboundTextMessage_SmscNumber(),
				ecorePackage.getEString(), "smscNumber", null, 0, 1,
				InboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(outboundTextMessageEClass, OutboundTextMessage.class,
				"OutboundTextMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutboundTextMessage_From(),
				ecorePackage.getEString(), "from", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_Recipient(),
				ecorePackage.getEString(), "recipient", null, 0, -1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_StatusReport(),
				ecorePackage.getEBoolean(), "statusReport", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_Priority(),
				ecorePackage.getEInt(), "priority", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_RetryCount(),
				ecorePackage.getEInt(), "retryCount", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_MessageStatus(),
				this.getMessageStatuses(), "messageStatus", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_FailureCause(),
				this.getFailureCauses(), "failureCause", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_ValidityPeriod(),
				ecorePackage.getEInt(), "validityPeriod", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_DispatchDate(),
				ecorePackage.getEDate(), "dispatchDate", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOutboundTextMessage_RefNo(),
				ecorePackage.getEString(), "refNo", null, 0, 1,
				OutboundTextMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

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
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.UNSENT);
		addEEnumLiteral(messageStatusesEEnum, MessageStatuses.SENT);
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

		// Create resource
		createResource(eNS_URI);
	}

} //TeksPackageImpl