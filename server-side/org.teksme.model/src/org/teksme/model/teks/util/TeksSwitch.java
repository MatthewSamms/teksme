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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.teksme.model.teks.Annotation;
import org.teksme.model.teks.AnnotationMapEntry;
import org.teksme.model.teks.Answer;
import org.teksme.model.teks.AnswerRef;
import org.teksme.model.teks.Channel;
import org.teksme.model.teks.Command;
import org.teksme.model.teks.Comment;
import org.teksme.model.teks.Developer;
import org.teksme.model.teks.FreeText;
import org.teksme.model.teks.InboundMessage;
import org.teksme.model.teks.Keyword;
import org.teksme.model.teks.Message;
import org.teksme.model.teks.MultipleChoice;
import org.teksme.model.teks.ObjectMessage;
import org.teksme.model.teks.OutboundMessage;
import org.teksme.model.teks.PlainText;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.PollQuestion;
import org.teksme.model.teks.PollSettings;
import org.teksme.model.teks.ReplyMessage;
import org.teksme.model.teks.Report;
import org.teksme.model.teks.Response;
import org.teksme.model.teks.ResponseDetail;
import org.teksme.model.teks.ResponseRestriction;
import org.teksme.model.teks.SecureText;
import org.teksme.model.teks.Shout;
import org.teksme.model.teks.Survey;
import org.teksme.model.teks.Teks;
import org.teksme.model.teks.TeksPackage;
import org.teksme.model.teks.User;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage
 * @generated
 */
public class TeksSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static TeksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public TeksSwitch() {
		if (modelPackage == null) {
			modelPackage = TeksPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TeksPackage.TEKS: {
			Teks teks = (Teks) theEObject;
			T result = caseTeks(teks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.COMMENT: {
			Comment comment = (Comment) theEObject;
			T result = caseComment(comment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.ANNOTATION: {
			Annotation annotation = (Annotation) theEObject;
			T result = caseAnnotation(annotation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.ANNOTATION_MAP_ENTRY: {
			AnnotationMapEntry annotationMapEntry = (AnnotationMapEntry) theEObject;
			T result = caseAnnotationMapEntry(annotationMapEntry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.DEVELOPER: {
			Developer developer = (Developer) theEObject;
			T result = caseDeveloper(developer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.POLL: {
			Poll poll = (Poll) theEObject;
			T result = casePoll(poll);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.SURVEY: {
			Survey survey = (Survey) theEObject;
			T result = caseSurvey(survey);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.POLL_SETTINGS: {
			PollSettings pollSettings = (PollSettings) theEObject;
			T result = casePollSettings(pollSettings);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.REPLY_MESSAGE: {
			ReplyMessage replyMessage = (ReplyMessage) theEObject;
			T result = caseReplyMessage(replyMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.RESPONSE: {
			Response response = (Response) theEObject;
			T result = caseResponse(response);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.RESPONSE_RESTRICTION: {
			ResponseRestriction responseRestriction = (ResponseRestriction) theEObject;
			T result = caseResponseRestriction(responseRestriction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.POLL_QUESTION: {
			PollQuestion pollQuestion = (PollQuestion) theEObject;
			T result = casePollQuestion(pollQuestion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.PLAIN_TEXT: {
			PlainText plainText = (PlainText) theEObject;
			T result = casePlainText(plainText);
			if (result == null)
				result = casePollQuestion(plainText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.KEYWORD: {
			Keyword keyword = (Keyword) theEObject;
			T result = caseKeyword(keyword);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.FREE_TEXT: {
			FreeText freeText = (FreeText) theEObject;
			T result = caseFreeText(freeText);
			if (result == null)
				result = casePlainText(freeText);
			if (result == null)
				result = casePollQuestion(freeText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.SECURE_TEXT: {
			SecureText secureText = (SecureText) theEObject;
			T result = caseSecureText(secureText);
			if (result == null)
				result = casePlainText(secureText);
			if (result == null)
				result = casePollQuestion(secureText);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.MULTIPLE_CHOICE: {
			MultipleChoice multipleChoice = (MultipleChoice) theEObject;
			T result = caseMultipleChoice(multipleChoice);
			if (result == null)
				result = casePollQuestion(multipleChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.ANSWER: {
			Answer answer = (Answer) theEObject;
			T result = caseAnswer(answer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.RESPONSE_DETAIL: {
			ResponseDetail responseDetail = (ResponseDetail) theEObject;
			T result = caseResponseDetail(responseDetail);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.OBJECT_MESSAGE: {
			ObjectMessage objectMessage = (ObjectMessage) theEObject;
			T result = caseObjectMessage(objectMessage);
			if (result == null)
				result = caseMessage(objectMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.ANSWER_REF: {
			AnswerRef answerRef = (AnswerRef) theEObject;
			T result = caseAnswerRef(answerRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.INBOUND_MESSAGE: {
			InboundMessage inboundMessage = (InboundMessage) theEObject;
			T result = caseInboundMessage(inboundMessage);
			if (result == null)
				result = caseMessage(inboundMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.OUTBOUND_MESSAGE: {
			OutboundMessage outboundMessage = (OutboundMessage) theEObject;
			T result = caseOutboundMessage(outboundMessage);
			if (result == null)
				result = caseMessage(outboundMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.CHANNEL: {
			Channel channel = (Channel) theEObject;
			T result = caseChannel(channel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.ERROR: {
			org.teksme.model.teks.Error error = (org.teksme.model.teks.Error) theEObject;
			T result = caseError(error);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.REPORT: {
			Report report = (Report) theEObject;
			T result = caseReport(report);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.SHOUT: {
			Shout shout = (Shout) theEObject;
			T result = caseShout(shout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TeksPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Teks</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Teks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeks(Teks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Map Entry</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMapEntry(AnnotationMapEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>User</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Developer</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Developer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeveloper(Developer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Poll</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Poll</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoll(Poll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Survey</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Survey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurvey(Survey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll Settings</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollSettings(PollSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Message</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyMessage(ReplyMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Restriction</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseRestriction(ResponseRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poll Question</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poll Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollQuestion(PollQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Text</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainText(PlainText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyword(Keyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Text</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeText(FreeText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secure Text</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secure Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecureText(SecureText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoice(MultipleChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Detail</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDetail(ResponseDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Message</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectMessage(ObjectMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Ref</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerRef(AnswerRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbound Message</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbound Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInboundMessage(InboundMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outbound Message</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outbound Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutboundMessage(OutboundMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(org.teksme.model.teks.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReport(Report object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shout</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShout(Shout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // TeksSwitch
