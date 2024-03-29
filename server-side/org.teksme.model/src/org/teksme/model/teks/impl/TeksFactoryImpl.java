/**
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version 
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.teksme.model.teks.MessageStatuses;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.ObjectMessage;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.Poll;
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
			return (EObject) createTeks();
		case TeksPackage.COMMENT:
			return (EObject) createComment();
		case TeksPackage.ANNOTATION:
			return (EObject) createAnnotation();
		case TeksPackage.ANNOTATION_MAP_ENTRY:
			return (EObject) createAnnotationMapEntry();
		case TeksPackage.USER:
			return (EObject) createUser();
		case TeksPackage.PROFILE:
			return (EObject) createProfile();
		case TeksPackage.APPLICATION:
			return (EObject) createApplication();
		case TeksPackage.POLL:
			return (EObject) createPoll();
		case TeksPackage.SURVEY:
			return (EObject) createSurvey();
		case TeksPackage.POLL_SETTINGS:
			return (EObject) createPollSettings();
		case TeksPackage.REPLY_MESSAGE:
			return (EObject) createReplyMessage();
		case TeksPackage.RESPONSE:
			return (EObject) createResponse();
		case TeksPackage.RESPONSE_RESTRICTION:
			return (EObject) createResponseRestriction();
		case TeksPackage.KEYWORD:
			return (EObject) createKeyword();
		case TeksPackage.FREE_TEXT:
			return (EObject) createFreeText();
		case TeksPackage.SECURE_TEXT:
			return (EObject) createSecureText();
		case TeksPackage.MULTIPLE_CHOICE:
			return (EObject) createMultipleChoice();
		case TeksPackage.ANSWER:
			return (EObject) createAnswer();
		case TeksPackage.RESPONSE_DETAIL:
			return (EObject) createResponseDetail();
		case TeksPackage.ANSWER_REF:
			return (EObject) createAnswerRef();
		case TeksPackage.INBOUND_MESSAGE:
			return (EObject) createInboundMessage();
		case TeksPackage.OUTBOUND_MESSAGE:
			return (EObject) createOutboundMessage();
		case TeksPackage.OBJECT_MESSAGE:
			return (EObject) createObjectMessage();
		case TeksPackage.CHANNEL:
			return (EObject) createChannel();
		case TeksPackage.ERROR:
			return (EObject) createError();
		case TeksPackage.REPORT:
			return (EObject) createReport();
		case TeksPackage.SHOUT:
			return (EObject) createShout();
		case TeksPackage.COMMAND:
			return (EObject) createCommand();
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
		case TeksPackage.STOP_COMMAND_KIND:
			return createStopCommandKindFromString(eDataType, initialValue);
		case TeksPackage.MESSAGE_STATUSES:
			return createMessageStatusesFromString(eDataType, initialValue);
		case TeksPackage.FAILURE_CAUSES:
			return createFailureCausesFromString(eDataType, initialValue);
		case TeksPackage.SMS_GATEWAY_KIND:
			return createSMSGatewayKindFromString(eDataType, initialValue);
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
		case TeksPackage.STOP_COMMAND_KIND:
			return convertStopCommandKindToString(eDataType, instanceValue);
		case TeksPackage.MESSAGE_STATUSES:
			return convertMessageStatusesToString(eDataType, instanceValue);
		case TeksPackage.FAILURE_CAUSES:
			return convertFailureCausesToString(eDataType, instanceValue);
		case TeksPackage.SMS_GATEWAY_KIND:
			return convertSMSGatewayKindToString(eDataType, instanceValue);
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
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
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
	public AnnotationMapEntry createAnnotationMapEntry() {
		AnnotationMapEntryImpl annotationMapEntry = new AnnotationMapEntryImpl();
		return annotationMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poll createPoll() {
		PollImpl poll = new PollImpl();
		return poll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSettings createPollSettings() {
		PollSettingsImpl pollSettings = new PollSettingsImpl();
		return pollSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyMessage createReplyMessage() {
		ReplyMessageImpl replyMessage = new ReplyMessageImpl();
		return replyMessage;
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
	public ResponseRestriction createResponseRestriction() {
		ResponseRestrictionImpl responseRestriction = new ResponseRestrictionImpl();
		return responseRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeyword() {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
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
	public SecureText createSecureText() {
		SecureTextImpl secureText = new SecureTextImpl();
		return secureText;
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
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
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
	public ObjectMessage createObjectMessage() {
		ObjectMessageImpl objectMessage = new ObjectMessageImpl();
		return objectMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.teksme.model.teks.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
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
	public Shout createShout() {
		ShoutImpl shout = new ShoutImpl();
		return shout;
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
	public MessageStatuses createMessageStatusesFromString(EDataType eDataType,
			String initialValue) {
		MessageStatuses result = MessageStatuses.get(initialValue);
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
	public String convertMessageStatusesToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureCauses createFailureCausesFromString(EDataType eDataType,
			String initialValue) {
		FailureCauses result = FailureCauses.get(initialValue);
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
	public String convertFailureCausesToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SMSGatewayKind createSMSGatewayKindFromString(EDataType eDataType,
			String initialValue) {
		SMSGatewayKind result = SMSGatewayKind.get(initialValue);
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
	public String convertSMSGatewayKindToString(EDataType eDataType,
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
