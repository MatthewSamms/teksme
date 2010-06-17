/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.teksme.model.teks.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeksFactoryImpl extends EFactoryImpl implements TeksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TeksFactory init() {
		try {
			TeksFactory theTeksFactory = (TeksFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://teksme.org/meta/1.0.0/teks");
			if (theTeksFactory != null) {
				return theTeksFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TeksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TeksPackage.TEKS:
			return createTeks();
		case TeksPackage.CAMPAIGN:
			return createCampaign();
		case TeksPackage.INQUIRY:
			return createInquiry();
		case TeksPackage.RESPONSE:
			return createResponse();
		case TeksPackage.CONFIRMATION:
			return createConfirmation();
		case TeksPackage.CONFIGURATION:
			return createConfiguration();
		case TeksPackage.RESPONSE_RESTRICTION:
			return createResponseRestriction();
		case TeksPackage.FREE_TEXT:
			return createFreeText();
		case TeksPackage.MULTIPLE_CHOICE:
			return createMultipleChoice();
		case TeksPackage.ANNOTATION:
			return createAnnotation();
		case TeksPackage.RESPONSE_DETAIL:
			return createResponseDetail();
		case TeksPackage.ANNOTATION_MAP_ENTRY:
			return createAnnotationMapEntry();
		case TeksPackage.ANSWER_REF:
			return createAnswerRef();
		case TeksPackage.INBOUND_MESSAGE:
			return createInboundMessage();
		case TeksPackage.OUTBOUND_MESSAGE:
			return createOutboundMessage();
		case TeksPackage.CUSTOM_OUTBOUND_MESSAGE:
			return createCustomOutboundMessage();
		case TeksPackage.COMMENT:
			return createComment();
		case TeksPackage.REPORT:
			return createReport();
		case TeksPackage.COMMAND:
			return createCommand();
		case TeksPackage.ANSWER:
			return createAnswer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TeksPackage.LANGUAGE_KIND:
			return createLanguageKindFromString(eDataType, initialValue);
		case TeksPackage.CHANNEL_KIND:
			return createChannelKindFromString(eDataType, initialValue);
		case TeksPackage.RESTRICTION_KIND:
			return createRestrictionKindFromString(eDataType, initialValue);
		case TeksPackage.MESSAGE_TYPE:
			return createMessageTypeFromString(eDataType, initialValue);
		case TeksPackage.STOP_COMMAND_KIND:
			return createStopCommandKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TeksPackage.LANGUAGE_KIND:
			return convertLanguageKindToString(eDataType, instanceValue);
		case TeksPackage.CHANNEL_KIND:
			return convertChannelKindToString(eDataType, instanceValue);
		case TeksPackage.RESTRICTION_KIND:
			return convertRestrictionKindToString(eDataType, instanceValue);
		case TeksPackage.MESSAGE_TYPE:
			return convertMessageTypeToString(eDataType, instanceValue);
		case TeksPackage.STOP_COMMAND_KIND:
			return convertStopCommandKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teks createTeks() {
		TeksImpl teks = new TeksImpl();
		return teks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Campaign createCampaign() {
		CampaignImpl campaign = new CampaignImpl();
		return campaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inquiry createInquiry() {
		InquiryImpl inquiry = new InquiryImpl();
		return inquiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Confirmation createConfirmation() {
		ConfirmationImpl confirmation = new ConfirmationImpl();
		return confirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseRestriction createResponseRestriction() {
		ResponseRestrictionImpl responseRestriction = new ResponseRestrictionImpl();
		return responseRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeText createFreeText() {
		FreeTextImpl freeText = new FreeTextImpl();
		return freeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDetail createResponseDetail() {
		ResponseDetailImpl responseDetail = new ResponseDetailImpl();
		return responseDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMapEntry createAnnotationMapEntry() {
		AnnotationMapEntryImpl annotationMapEntry = new AnnotationMapEntryImpl();
		return annotationMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRef createAnswerRef() {
		AnswerRefImpl answerRef = new AnswerRefImpl();
		return answerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundMessage createInboundMessage() {
		InboundMessageImpl inboundMessage = new InboundMessageImpl();
		return inboundMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundMessage createOutboundMessage() {
		OutboundMessageImpl outboundMessage = new OutboundMessageImpl();
		return outboundMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomOutboundMessage createCustomOutboundMessage() {
		CustomOutboundMessageImpl customOutboundMessage = new CustomOutboundMessageImpl();
		return customOutboundMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Report createReport() {
		ReportImpl report = new ReportImpl();
		return report;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageKind createLanguageKindFromString(EDataType eDataType,
			String initialValue) {
		LanguageKind result = LanguageKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind createChannelKindFromString(EDataType eDataType,
			String initialValue) {
		ChannelKind result = ChannelKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionKind createRestrictionKindFromString(EDataType eDataType,
			String initialValue) {
		RestrictionKind result = RestrictionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestrictionKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeFromString(EDataType eDataType,
			String initialValue) {
		MessageType result = MessageType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopCommandKind createStopCommandKindFromString(EDataType eDataType,
			String initialValue) {
		StopCommandKind result = StopCommandKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName()
					+ "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStopCommandKindToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeksPackage getTeksPackage() {
		return (TeksPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TeksPackage getPackage() {
		return TeksPackage.eINSTANCE;
	}

} //TeksFactoryImpl
