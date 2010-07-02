/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.teksme.model.teks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.teksme.model.teks.TeksPackage
 * @generated
 */
public interface TeksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TeksFactory eINSTANCE = org.teksme.model.teks.impl.TeksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Teks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teks</em>'.
	 * @generated
	 */
	Teks createTeks();

	/**
	 * Returns a new object of class '<em>Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campaign</em>'.
	 * @generated
	 */
	Campaign createCampaign();

	/**
	 * Returns a new object of class '<em>Inquiry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inquiry</em>'.
	 * @generated
	 */
	Inquiry createInquiry();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Confirmation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confirmation</em>'.
	 * @generated
	 */
	Confirmation createConfirmation();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Response Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Restriction</em>'.
	 * @generated
	 */
	ResponseRestriction createResponseRestriction();

	/**
	 * Returns a new object of class '<em>Free Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text</em>'.
	 * @generated
	 */
	FreeText createFreeText();

	/**
	 * Returns a new object of class '<em>Secure Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Text</em>'.
	 * @generated
	 */
	SecureText createSecureText();

	/**
	 * Returns a new object of class '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Choice</em>'.
	 * @generated
	 */
	MultipleChoice createMultipleChoice();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Response Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Detail</em>'.
	 * @generated
	 */
	ResponseDetail createResponseDetail();

	/**
	 * Returns a new object of class '<em>Annotation Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Map Entry</em>'.
	 * @generated
	 */
	AnnotationMapEntry createAnnotationMapEntry();

	/**
	 * Returns a new object of class '<em>Answer Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer Ref</em>'.
	 * @generated
	 */
	AnswerRef createAnswerRef();

	/**
	 * Returns a new object of class '<em>Inbound Text Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inbound Text Message</em>'.
	 * @generated
	 */
	InboundTextMessage createInboundTextMessage();

	/**
	 * Returns a new object of class '<em>Outbound Text Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outbound Text Message</em>'.
	 * @generated
	 */
	OutboundTextMessage createOutboundTextMessage();

	/**
	 * Returns a new object of class '<em>Custom Outbound Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Outbound Message</em>'.
	 * @generated
	 */
	CustomOutboundMessage createCustomOutboundMessage();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report</em>'.
	 * @generated
	 */
	Report createReport();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer</em>'.
	 * @generated
	 */
	Answer createAnswer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TeksPackage getTeksPackage();

} //TeksFactory
