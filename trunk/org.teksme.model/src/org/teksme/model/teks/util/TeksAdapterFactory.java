/**
 * <copyright>
 * </copyright>
 *
 * $Id$
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
		public Adapter caseCampaign(Campaign object) {
			return createCampaignAdapter();
		}

		@Override
		public Adapter caseTeksElement(TeksElement object) {
			return createTeksElementAdapter();
		}

		@Override
		public Adapter caseInquiry(Inquiry object) {
			return createInquiryAdapter();
		}

		@Override
		public Adapter caseChoice(Choice object) {
			return createChoiceAdapter();
		}

		@Override
		public Adapter caseResponse(Response object) {
			return createResponseAdapter();
		}

		@Override
		public Adapter caseConfirmation(Confirmation object) {
			return createConfirmationAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter caseResponseRestriction(ResponseRestriction object) {
			return createResponseRestrictionAdapter();
		}

		@Override
		public Adapter caseFreeText(FreeText object) {
			return createFreeTextAdapter();
		}

		@Override
		public Adapter caseMultipleChoice(MultipleChoice object) {
			return createMultipleChoiceAdapter();
		}

		@Override
		public Adapter caseAnnotation(Annotation object) {
			return createAnnotationAdapter();
		}

		@Override
		public Adapter caseResponseDetail(ResponseDetail object) {
			return createResponseDetailAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseAnnotationMapEntry(AnnotationMapEntry object) {
			return createAnnotationMapEntryAdapter();
		}

		@Override
		public Adapter caseAnswerRef(AnswerRef object) {
			return createAnswerRefAdapter();
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
		public Adapter caseCustomOutboundMessage(CustomOutboundMessage object) {
			return createCustomOutboundMessageAdapter();
		}

		@Override
		public Adapter caseComment(Comment object) {
			return createCommentAdapter();
		}

		@Override
		public Adapter caseReport(Report object) {
			return createReportAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseAnswer(Answer object) {
			return createAnswerAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Campaign <em>Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Campaign
	 * @generated
	 */
	public Adapter createCampaignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.TeksElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.TeksElement
	 * @generated
	 */
	public Adapter createTeksElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Inquiry <em>Inquiry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Inquiry
	 * @generated
	 */
	public Adapter createInquiryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Confirmation <em>Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Confirmation
	 * @generated
	 */
	public Adapter createConfirmationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.teksme.model.teks.CustomOutboundMessage <em>Custom Outbound Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.teksme.model.teks.CustomOutboundMessage
	 * @generated
	 */
	public Adapter createCustomOutboundMessageAdapter() {
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
