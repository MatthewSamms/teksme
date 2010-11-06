/*
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.teksme.server.queue.consumer.impl;

import java.lang.reflect.ParameterizedType;
import java.util.logging.Logger;

import org.teksme.model.teks.Message;
import org.teksme.model.teks.ObjectMessage;
import org.teksme.model.teks.Shout;
import org.teksme.server.queue.consumer.DeadLetterQueueHandler;
import org.teksme.server.queue.consumer.MessageListener;

public abstract class TeksMessageHandler<T> implements MessageListener<Message> {

	private static Logger logger = Logger.getLogger(TeksMessageHandler.class.getName());

	private final Class<?> expectedType;

	private DeadLetterQueueHandler deadLetterHandler;

	public TeksMessageHandler() {
		final ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		expectedType = (Class<?>) parameterizedType.getActualTypeArguments()[0];
	}

	public void onMessage(final Message message) {

		logger.info("Handling queue message...");

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

	protected DeadLetterQueueHandler getDeadLetterHandler() {
		return deadLetterHandler;
	}

	private boolean matchesExpectedType(final Object obj) {
		return obj != null && expectedType.isAssignableFrom(obj.getClass());
	}

	private Object extractPayload(final Message message) {
		if (message instanceof ObjectMessage) {
			// return ((ObjectMessage) message).getObject();
		} else if (message instanceof Shout) {
			return ((Shout) message).getThis();
		} else {
			throw new IllegalStateException("Error extracting payload", new MessageHandlerException());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private void invokeConsume(final Object obj) {
		consume((T) obj);
	}

	protected abstract void consume(T obj);

}
