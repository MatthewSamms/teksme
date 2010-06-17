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
import org.teksme.model.teks.Campaign;
import org.teksme.model.teks.ChannelKind;
import org.teksme.model.teks.Choice;
import org.teksme.model.teks.Command;
import org.teksme.model.teks.Comment;
import org.teksme.model.teks.Configuration;
import org.teksme.model.teks.Confirmation;
import org.teksme.model.teks.CustomOutboundMessage;
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.InboundMessage;
import org.teksme.model.teks.Inquiry;
import org.teksme.model.teks.LanguageKind;
import org.teksme.model.teks.Message;
import org.teksme.model.teks.MessageType;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Report;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.ResponseDetail;
import org.teksme.model.teks.ResponseRestriction;
import org.teksme.model.teks.RestrictionKind;
import org.teksme.model.teks.StopCommandKind;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksElement;
import org.teksme.model.teks.TeksFactory;
import org.teksme.model.teks.TeksPackage;

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
	private EClass campaignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teksElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inquiryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

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
	private EClass confirmationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

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
	private EClass freeTextEClass = null;

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
	private EClass annotationEClass = null;

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
	private EClass annotationMapEntryEClass = null;

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
	private EClass customOutboundMessageEClass = null;

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
	private EClass answerEClass = null;

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
	private EEnum messageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stopCommandKindEEnum = null;

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
				.get(eNS_URI)
				: new TeksPackageImpl());

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
	public EReference getTeks_Campaign() {
		return (EReference) teksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_S() {
		return (EReference) teksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeks_InMsg() {
		return (EReference) teksEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeks_AccountID() {
		return (EAttribute) teksEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCampaign() {
		return campaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampaign_Instance() {
		return (EReference) campaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampaign_Responses() {
		return (EReference) campaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampaign_Confirmations() {
		return (EReference) campaignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCampaign_Id() {
		return (EAttribute) campaignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCampaign_AdvertiseIt() {
		return (EReference) campaignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeksElement() {
		return teksElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeksElement_Annotations() {
		return (EReference) teksElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeksElement_Comments() {
		return (EReference) teksElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeksElement_Id() {
		return (EAttribute) teksElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInquiry() {
		return inquiryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInquiry_Title() {
		return (EAttribute) inquiryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInquiry_Note() {
		return (EAttribute) inquiryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInquiry_Choice() {
		return (EReference) inquiryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInquiry_Author() {
		return (EAttribute) inquiryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInquiry_LastModified() {
		return (EAttribute) inquiryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInquiry_Settings() {
		return (EReference) inquiryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_Question() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_Note() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoice_Mandatory() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoice_InquiryRef() {
		return (EReference) choiceEClass.getEStructuralFeatures().get(3);
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
	public EClass getConfirmation() {
		return confirmationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfirmation_AutoReply() {
		return (EReference) confirmationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfirmation_Confirmation() {
		return (EReference) confirmationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfirmation_CustomReply() {
		return (EReference) confirmationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfirmation_ResponseRef() {
		return (EReference) confirmationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ResponseRestrictions() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_InquiryRef() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_ExpirationDate() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_ScheduleStartDate() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_CommunicationChannel() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_SuspendOnFailure() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Language() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_BatchResponseDelivery() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_SynchronousConfirmation() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getResponseRestriction_RestrictionType() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_Anonymous() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseRestriction_OwnedInquiry() {
		return (EReference) responseRestrictionEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_BlockRepeat() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRestriction_ModerateFirst() {
		return (EAttribute) responseRestrictionEClass.getEStructuralFeatures()
				.get(5);
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
	public EReference getFreeText_Answer() {
		return (EReference) freeTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeText_Keyword() {
		return (EAttribute) freeTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeText_AutoKeyword() {
		return (EAttribute) freeTextEClass.getEStructuralFeatures().get(2);
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
	public EReference getMultipleChoice_Answer() {
		return (EReference) multipleChoiceEClass.getEStructuralFeatures()
				.get(0);
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
	public EReference getAnnotation_AnnotatedElement() {
		return (EReference) annotationEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMessage_TextMessage() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Timestamp() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Id() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Type() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Gateway() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Charset() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_HeaderData() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_From() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_To() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(8);
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
	public EClass getOutboundMessage() {
		return outboundMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundMessage_MessageHandler() {
		return (EAttribute) outboundMessageEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomOutboundMessage() {
		return customOutboundMessageEClass;
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
	public EAttribute getComment_ID() {
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
	public EReference getComment_ElementRef() {
		return (EReference) commentEClass.getEStructuralFeatures().get(3);
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
	public EEnum getMessageType() {
		return messageTypeEEnum;
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
		createEReference(teksEClass, TEKS__CAMPAIGN);
		createEReference(teksEClass, TEKS__S);
		createEReference(teksEClass, TEKS__IN_MSG);
		createEAttribute(teksEClass, TEKS__ACCOUNT_ID);

		campaignEClass = createEClass(CAMPAIGN);
		createEReference(campaignEClass, CAMPAIGN__INSTANCE);
		createEReference(campaignEClass, CAMPAIGN__RESPONSES);
		createEReference(campaignEClass, CAMPAIGN__CONFIRMATIONS);
		createEAttribute(campaignEClass, CAMPAIGN__ID);
		createEReference(campaignEClass, CAMPAIGN__ADVERTISE_IT);

		teksElementEClass = createEClass(TEKS_ELEMENT);
		createEReference(teksElementEClass, TEKS_ELEMENT__ANNOTATIONS);
		createEReference(teksElementEClass, TEKS_ELEMENT__COMMENTS);
		createEAttribute(teksElementEClass, TEKS_ELEMENT__ID);

		inquiryEClass = createEClass(INQUIRY);
		createEAttribute(inquiryEClass, INQUIRY__TITLE);
		createEAttribute(inquiryEClass, INQUIRY__NOTE);
		createEReference(inquiryEClass, INQUIRY__CHOICE);
		createEAttribute(inquiryEClass, INQUIRY__AUTHOR);
		createEAttribute(inquiryEClass, INQUIRY__LAST_MODIFIED);
		createEReference(inquiryEClass, INQUIRY__SETTINGS);

		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__QUESTION);
		createEAttribute(choiceEClass, CHOICE__NOTE);
		createEAttribute(choiceEClass, CHOICE__MANDATORY);
		createEReference(choiceEClass, CHOICE__INQUIRY_REF);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__RESPONSE);

		confirmationEClass = createEClass(CONFIRMATION);
		createEReference(confirmationEClass, CONFIRMATION__AUTO_REPLY);
		createEReference(confirmationEClass, CONFIRMATION__CONFIRMATION);
		createEReference(confirmationEClass, CONFIRMATION__CUSTOM_REPLY);
		createEReference(confirmationEClass, CONFIRMATION__RESPONSE_REF);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass,
				CONFIGURATION__RESPONSE_RESTRICTIONS);
		createEReference(configurationEClass, CONFIGURATION__INQUIRY_REF);
		createEAttribute(configurationEClass, CONFIGURATION__EXPIRATION_DATE);
		createEAttribute(configurationEClass,
				CONFIGURATION__SCHEDULE_START_DATE);
		createEAttribute(configurationEClass,
				CONFIGURATION__COMMUNICATION_CHANNEL);
		createEAttribute(configurationEClass, CONFIGURATION__SUSPEND_ON_FAILURE);
		createEAttribute(configurationEClass, CONFIGURATION__LANGUAGE);
		createEAttribute(configurationEClass,
				CONFIGURATION__BATCH_RESPONSE_DELIVERY);
		createEAttribute(configurationEClass,
				CONFIGURATION__SYNCHRONOUS_CONFIRMATION);

		responseRestrictionEClass = createEClass(RESPONSE_RESTRICTION);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__ACCEPT_MULTIPLE_CHANNELS);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__RESTRICTION_TYPE);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__ANONYMOUS);
		createEReference(responseRestrictionEClass,
				RESPONSE_RESTRICTION__OWNED_INQUIRY);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__BLOCK_REPEAT);
		createEAttribute(responseRestrictionEClass,
				RESPONSE_RESTRICTION__MODERATE_FIRST);

		freeTextEClass = createEClass(FREE_TEXT);
		createEReference(freeTextEClass, FREE_TEXT__ANSWER);
		createEAttribute(freeTextEClass, FREE_TEXT__KEYWORD);
		createEAttribute(freeTextEClass, FREE_TEXT__AUTO_KEYWORD);

		multipleChoiceEClass = createEClass(MULTIPLE_CHOICE);
		createEReference(multipleChoiceEClass, MULTIPLE_CHOICE__ANSWER);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__SOURCE);
		createEReference(annotationEClass, ANNOTATION__ENTRY);
		createEReference(annotationEClass, ANNOTATION__ANNOTATED_ELEMENT);

		responseDetailEClass = createEClass(RESPONSE_DETAIL);
		createEAttribute(responseDetailEClass, RESPONSE_DETAIL__DATE_TIME);
		createEReference(responseDetailEClass, RESPONSE_DETAIL__RAW_MESSAGE);
		createEReference(responseDetailEClass, RESPONSE_DETAIL__SET_VALUE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__TEXT_MESSAGE);
		createEAttribute(messageEClass, MESSAGE__TIMESTAMP);
		createEAttribute(messageEClass, MESSAGE__ID);
		createEAttribute(messageEClass, MESSAGE__TYPE);
		createEAttribute(messageEClass, MESSAGE__GATEWAY);
		createEAttribute(messageEClass, MESSAGE__CHARSET);
		createEAttribute(messageEClass, MESSAGE__HEADER_DATA);
		createEAttribute(messageEClass, MESSAGE__FROM);
		createEAttribute(messageEClass, MESSAGE__TO);

		annotationMapEntryEClass = createEClass(ANNOTATION_MAP_ENTRY);
		createEAttribute(annotationMapEntryEClass, ANNOTATION_MAP_ENTRY__KEY);
		createEAttribute(annotationMapEntryEClass, ANNOTATION_MAP_ENTRY__VALUE);

		answerRefEClass = createEClass(ANSWER_REF);
		createEReference(answerRefEClass, ANSWER_REF__CHOICE_REF);
		createEReference(answerRefEClass, ANSWER_REF__ANSWER_REF);
		createEAttribute(answerRefEClass, ANSWER_REF__VALUE);
		createEAttribute(answerRefEClass, ANSWER_REF__ID);

		inboundMessageEClass = createEClass(INBOUND_MESSAGE);
		createEAttribute(inboundMessageEClass, INBOUND_MESSAGE__PART_NUMBER);
		createEAttribute(inboundMessageEClass, INBOUND_MESSAGE__MESSAGE_TYPE);

		outboundMessageEClass = createEClass(OUTBOUND_MESSAGE);
		createEAttribute(outboundMessageEClass,
				OUTBOUND_MESSAGE__MESSAGE_HANDLER);

		customOutboundMessageEClass = createEClass(CUSTOM_OUTBOUND_MESSAGE);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__ID);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEAttribute(commentEClass, COMMENT__DATE_TIME);
		createEReference(commentEClass, COMMENT__ELEMENT_REF);

		reportEClass = createEClass(REPORT);
		createEAttribute(reportEClass, REPORT__HIDE_RESULTS);
		createEAttribute(reportEClass, REPORT__PERCENTAGE_ONLY);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__DEFAULT_HANDLER);
		createEAttribute(commandEClass, COMMAND__ID);
		createEAttribute(commandEClass, COMMAND__NAME);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__TEXT);
		createEAttribute(answerEClass, ANSWER__ID);
		createEAttribute(answerEClass, ANSWER__KEYWORD);
		createEAttribute(answerEClass, ANSWER__AUTO_KEYWORD);
		createEAttribute(answerEClass, ANSWER__DEFAULT_VALUE);
		createEAttribute(answerEClass, ANSWER__SELECTED);

		// Create enums
		languageKindEEnum = createEEnum(LANGUAGE_KIND);
		channelKindEEnum = createEEnum(CHANNEL_KIND);
		restrictionKindEEnum = createEEnum(RESTRICTION_KIND);
		messageTypeEEnum = createEEnum(MESSAGE_TYPE);
		stopCommandKindEEnum = createEEnum(STOP_COMMAND_KIND);
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
		inquiryEClass.getESuperTypes().add(this.getTeksElement());
		choiceEClass.getESuperTypes().add(this.getTeksElement());
		responseEClass.getESuperTypes().add(this.getTeksElement());
		confirmationEClass.getESuperTypes().add(this.getTeksElement());
		freeTextEClass.getESuperTypes().add(this.getChoice());
		multipleChoiceEClass.getESuperTypes().add(this.getChoice());
		inboundMessageEClass.getESuperTypes().add(this.getMessage());
		outboundMessageEClass.getESuperTypes().add(this.getMessage());
		customOutboundMessageEClass.getESuperTypes().add(
				this.getOutboundMessage());

		// Initialize classes and features; add operations and parameters
		initEClass(teksEClass, Teks.class, "Teks", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeks_AppId(), ecorePackage.getEString(), "appId",
				null, 0, 1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTeks_Campaign(), this.getCampaign(), null,
				"campaign", null, 0, 1, Teks.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeks_S(), this.getOutboundMessage(), null, "s", null,
				0, -1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		getTeks_S().getEKeys().add(this.getMessage_Id());
		initEReference(getTeks_InMsg(), this.getInboundMessage(), null,
				"inMsg", null, 0, -1, Teks.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTeks_InMsg().getEKeys().add(this.getMessage_Id());
		initEAttribute(getTeks_AccountID(), ecorePackage.getEString(),
				"accountID", null, 0, 1, Teks.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(campaignEClass, Campaign.class, "Campaign", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCampaign_Instance(), this.getInquiry(), null,
				"instance", null, 0, 1, Campaign.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCampaign_Instance().getEKeys().add(this.getInquiry_Title());
		initEReference(getCampaign_Responses(), this.getResponse(), null,
				"responses", null, 0, 1, Campaign.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCampaign_Confirmations(), this.getConfirmation(),
				null, "confirmations", null, 0, 1, Campaign.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCampaign_Id(), ecorePackage.getEString(), "id", null,
				1, 1, Campaign.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCampaign_AdvertiseIt(), this.getOutboundMessage(),
				null, "advertiseIt", null, 0, 1, Campaign.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teksElementEClass, TeksElement.class, "TeksElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeksElement_Annotations(), this.getAnnotation(), this
				.getAnnotation_AnnotatedElement(), "annotations", null, 0, -1,
				TeksElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTeksElement_Comments(), this.getComment(), this
				.getComment_ElementRef(), "comments", null, 0, -1,
				TeksElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeksElement_Id(), ecorePackage.getEString(), "id",
				null, 1, 1, TeksElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(inquiryEClass, Inquiry.class, "Inquiry", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInquiry_Title(), ecorePackage.getEString(), "title",
				null, 0, 1, Inquiry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInquiry_Note(), ecorePackage.getEString(), "note",
				null, 0, 1, Inquiry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getInquiry_Choice(), this.getChoice(), this
				.getChoice_InquiryRef(), "choice", null, 0, -1, Inquiry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInquiry_Author(), ecorePackage.getEString(),
				"author", null, 0, 1, Inquiry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInquiry_LastModified(), ecorePackage.getEDate(),
				"lastModified", null, 0, 1, Inquiry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInquiry_Settings(), this.getConfiguration(), this
				.getConfiguration_InquiryRef(), "settings", null, 0, 1,
				Inquiry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_Question(), ecorePackage.getEString(),
				"question", null, 0, 1, Choice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoice_Note(), ecorePackage.getEString(), "note",
				null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getChoice_Mandatory(), ecorePackage.getEBoolean(),
				"mandatory", null, 0, 1, Choice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getChoice_InquiryRef(), this.getInquiry(), this
				.getInquiry_Choice(), "inquiryRef", null, 0, 1, Choice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Response(), this.getResponseDetail(), null,
				"response", null, 0, -1, Response.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confirmationEClass, Confirmation.class, "Confirmation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfirmation_AutoReply(), this.getOutboundMessage(),
				null, "autoReply", null, 0, 1, Confirmation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getConfirmation_Confirmation(), this.getConfirmation(),
				null, "confirmation", null, 0, -1, Confirmation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getConfirmation_CustomReply(), this
				.getCustomOutboundMessage(), null, "customReply", null, 0, 1,
				Confirmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConfirmation_ResponseRef(), this.getResponse(), null,
				"responseRef", null, 0, 1, Confirmation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConfirmation_ResponseRef().getEKeys().add(this.getTeksElement_Id());

		initEClass(configurationEClass, Configuration.class, "Configuration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_ResponseRestrictions(), this
				.getResponseRestriction(), null, "responseRestrictions", null,
				0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_InquiryRef(), this.getInquiry(), this
				.getInquiry_Settings(), "inquiryRef", null, 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_ExpirationDate(), ecorePackage
				.getEDate(), "expirationDate", null, 0, 1, Configuration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_ScheduleStartDate(), ecorePackage
				.getEDate(), "scheduleStartDate", null, 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConfiguration_CommunicationChannel(), this
				.getChannelKind(), "communicationChannel", null, 0, -1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConfiguration_SuspendOnFailure(), ecorePackage
				.getEBoolean(), "suspendOnFailure", null, 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConfiguration_Language(), this.getLanguageKind(),
				"language", null, 0, -1, Configuration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_BatchResponseDelivery(), ecorePackage
				.getEBoolean(), "batchResponseDelivery", "false", 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConfiguration_SynchronousConfirmation(), ecorePackage
				.getEBoolean(), "synchronousConfirmation", "true", 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(responseRestrictionEClass, ResponseRestriction.class,
				"ResponseRestriction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseRestriction_AcceptMultipleChannels(),
				ecorePackage.getEBoolean(), "acceptMultipleChannels", null, 0,
				1, ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResponseRestriction_RestrictionType(), this
				.getRestrictionKind(), "restrictionType", null, 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResponseRestriction_Anonymous(), ecorePackage
				.getEBoolean(), "anonymous", "false", 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getResponseRestriction_OwnedInquiry(),
				this.getInquiry(), null, "ownedInquiry", null, 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseRestriction_BlockRepeat(), ecorePackage
				.getEBoolean(), "blockRepeat", null, 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getResponseRestriction_ModerateFirst(), ecorePackage
				.getEBoolean(), "moderateFirst", null, 0, 1,
				ResponseRestriction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(freeTextEClass, FreeText.class, "FreeText", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreeText_Answer(), this.getAnswer(), null, "answer",
				null, 0, 1, FreeText.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeText_Keyword(), ecorePackage.getEString(),
				"keyword", null, 0, 1, FreeText.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeText_AutoKeyword(), ecorePackage.getEBoolean(),
				"autoKeyword", "true", 0, 1, FreeText.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(multipleChoiceEClass, MultipleChoice.class,
				"MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleChoice_Answer(), this.getAnswer(), null,
				"answer", null, 0, -1, MultipleChoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getAnnotation_AnnotatedElement(), this.getTeksElement(),
				this.getTeksElement_Annotations(), "annotatedElement", null, 0,
				1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(messageEClass, Message.class, "Message", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_TextMessage(), ecorePackage.getEString(),
				"textMessage", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Timestamp(), ecorePackage.getEDate(),
				"timestamp", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Id(), ecorePackage.getEString(), "id", null,
				0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_Type(), this.getMessageType(), "type", null,
				0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_Gateway(), ecorePackage.getEString(),
				"gateway", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Charset(), ecorePackage.getEString(),
				"charset", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_HeaderData(), ecorePackage.getEString(),
				"headerData", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_From(), ecorePackage.getEString(), "from",
				null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_To(), ecorePackage.getEString(), "to", null,
				0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

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

		initEClass(answerRefEClass, AnswerRef.class, "AnswerRef", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnswerRef_ChoiceRef(), this.getChoice(), null,
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

		initEClass(inboundMessageEClass, InboundMessage.class,
				"InboundMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInboundMessage_PartNumber(), ecorePackage
				.getEString(), "partNumber", null, 0, 1, InboundMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInboundMessage_MessageType(), ecorePackage
				.getEString(), "messageType", null, 0, 1, InboundMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outboundMessageEClass, OutboundMessage.class,
				"OutboundMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutboundMessage_MessageHandler(), ecorePackage
				.getEString(), "messageHandler", null, 0, 1,
				OutboundMessage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(customOutboundMessageEClass, CustomOutboundMessage.class,
				"CustomOutboundMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_ID(), ecorePackage.getEString(), "ID", null,
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
		initEReference(getComment_ElementRef(), this.getTeksElement(), this
				.getTeksElement_Comments(), "elementRef", null, 0, 1,
				Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
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

		initEEnum(messageTypeEEnum, MessageType.class, "MessageType");
		addEEnumLiteral(messageTypeEEnum, MessageType.SMS);
		addEEnumLiteral(messageTypeEEnum, MessageType.EMAIL);

		initEEnum(stopCommandKindEEnum, StopCommandKind.class,
				"StopCommandKind");
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.STOP);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.END);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.CANCEL);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.UNSUBSCRIBE);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.QUIT);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.STOP_STOP);
		addEEnumLiteral(stopCommandKindEEnum, StopCommandKind.STOP_ALL);

		// Create resource
		createResource(eNS_URI);
	}

} //TeksPackageImpl
