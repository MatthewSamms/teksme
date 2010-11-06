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
package org.teksme.model.teks.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.teksme.model.teks.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage
 * @generated
 */
public class TeksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TeksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TeksPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeksSwitch<Adapter> modelSwitch = new TeksSwitch<Adapter>() {
		@Override
		public Adapter caseTeks(Teks object) {
			return createTeksAdapter();
		}

		@Override
		public Adapter caseComment(Comment object) {
			return createCommentAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseAnnotationMapEntry(AnnotationMapEntry object) {
			return createAnnotationMapEntryAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseDeveloper(Developer object) {
			return createDeveloperAdapter();
		}

		@Override
		public Adapter casePoll(Poll object) {
			return createPollAdapter();
		}

		@Override
		public Adapter caseSurvey(Survey object) {
			return createSurveyAdapter();
		}

		@Override
		public Adapter casePollSettings(PollSettings object) {
			return createPollSettingsAdapter();
		}

		@Override
		public Adapter caseReplyMessage(ReplyMessage object) {
			return createReplyMessageAdapter();
		}

		@Override
		public Adapter caseResponse(Response object) {
			return createResponseAdapter();
		}

		@Override
		public Adapter caseResponseRestriction(ResponseRestriction object) {
			return createResponseRestrictionAdapter();
		}

		@Override
		public Adapter casePollQuestion(PollQuestion object) {
			return createPollQuestionAdapter();
		}

		@Override
		public Adapter casePlainText(PlainText object) {
			return createPlainTextAdapter();
		}

		@Override
		public Adapter caseKeyword(Keyword object) {
			return createKeywordAdapter();
		}

		@Override
		public Adapter caseFreeText(FreeText object) {
			return createFreeTextAdapter();
		}

		@Override
		public Adapter caseSecureText(SecureText object) {
			return createSecureTextAdapter();
		}

		@Override
		public Adapter caseMultipleChoice(MultipleChoice object) {
			return createMultipleChoiceAdapter();
		}

		@Override
		public Adapter caseAnswer(Answer object) {
			return createAnswerAdapter();
		}

		@Override
		public Adapter caseResponseDetail(ResponseDetail object) {
			return createResponseDetailAdapter();
		}

		@Override
		public Adapter caseObjectMessage(ObjectMessage object) {
			return createObjectMessageAdapter();
		}

		@Override
		public Adapter caseAnswerRef(AnswerRef object) {
			return createAnswerRefAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseInboundMessage(InboundMessage object) {
			return createInboundMessageAdapter();
		}

		@Override
		public Adapter caseOutboundMessage(OutboundMessage object) {
			return createOutboundMessageAdapter();
		}

		@Override
		public Adapter caseChannel(Channel object) {
			return createChannelAdapter();
		}

		@Override
		public Adapter caseReport(Report object) {
			return createReportAdapter();
		}

		@Override
		public Adapter caseShout(Shout object) {
			return createShoutAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Teks <em>Teks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Teks
	 * @generated
	 */
	public Adapter createTeksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.AnnotationMapEntry <em>Annotation Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.AnnotationMapEntry
	 * @generated
	 */
	public Adapter createAnnotationMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Developer
	 * @generated
	 */
	public Adapter createDeveloperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Poll <em>Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Poll
	 * @generated
	 */
	public Adapter createPollAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Survey
	 * @generated
	 */
	public Adapter createSurveyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.PollSettings <em>Poll Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.PollSettings
	 * @generated
	 */
	public Adapter createPollSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.ReplyMessage <em>Reply Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.ReplyMessage
	 * @generated
	 */
	public Adapter createReplyMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.ResponseRestriction <em>Response Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.ResponseRestriction
	 * @generated
	 */
	public Adapter createResponseRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.PollQuestion <em>Poll Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.PollQuestion
	 * @generated
	 */
	public Adapter createPollQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.PlainText <em>Plain Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.PlainText
	 * @generated
	 */
	public Adapter createPlainTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Keyword
	 * @generated
	 */
	public Adapter createKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.FreeText <em>Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.FreeText
	 * @generated
	 */
	public Adapter createFreeTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.SecureText <em>Secure Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.SecureText
	 * @generated
	 */
	public Adapter createSecureTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.MultipleChoice
	 * @generated
	 */
	public Adapter createMultipleChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.ResponseDetail <em>Response Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.ResponseDetail
	 * @generated
	 */
	public Adapter createResponseDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.ObjectMessage <em>Object Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.ObjectMessage
	 * @generated
	 */
	public Adapter createObjectMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.AnswerRef <em>Answer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.AnswerRef
	 * @generated
	 */
	public Adapter createAnswerRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.InboundMessage <em>Inbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.InboundMessage
	 * @generated
	 */
	public Adapter createInboundMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.OutboundMessage <em>Outbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.OutboundMessage
	 * @generated
	 */
	public Adapter createOutboundMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Report
	 * @generated
	 */
	public Adapter createReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Shout <em>Shout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Shout
	 * @generated
	 */
	public Adapter createShoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TeksAdapterFactory
