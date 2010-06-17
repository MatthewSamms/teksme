package org.teksme.server.comm.queues;

import java.lang.reflect.ParameterizedType;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.jboss.ejb3.annotation.ResourceAdapter;
import org.teksme.server.comm.DeadLetterHandler;

@MessageDriven(name = "TeksMessageHandler", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/testQueue") })
@TransactionManagement(value = TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
@ResourceAdapter("hornetq-ra.rar")
public abstract class TeksMessageHandler<T> implements MessageListener {

	private final Class<?> expectedType;

	@EJB
	private DeadLetterHandler deadLetterHandler;

	public TeksMessageHandler() {
		final ParameterizedType parameterizedType = (ParameterizedType) getClass()
				.getGenericSuperclass();
		expectedType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
	}

	public void onMessage(final Message message) {
		if (matchesExpectedType(message)) {
			invokeConsume(message);
		} else {
			final Object payload = extractPayload(message);
			if (matchesExpectedType(payload)) {
				invokeConsume(payload);
			} else {
				deadLetterHandler.invalidMessageType(message);
			}
		}
	}

	protected DeadLetterHandler getDeadLetterHandler() {
		return deadLetterHandler;
	}

	private boolean matchesExpectedType(final Object obj) {
		return obj != null && expectedType.isAssignableFrom(obj.getClass());
	}

	private Object extractPayload(final Message message) {
		try {
			if (message instanceof ObjectMessage) {
				return ((ObjectMessage) message).getObject();
			} else if (message instanceof TextMessage) {
				return ((TextMessage) message).getText();
			}
			return null;
		} catch (JMSException e) {
			throw new IllegalStateException("Error extracting payload", e);
		}
	}

	@SuppressWarnings("unchecked")
	private void invokeConsume(final Object obj) {
		consume((T) obj);
	}

	protected abstract void consume(T obj);

}
