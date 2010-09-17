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

package org.teksme.server.jms.queues;

import java.lang.reflect.ParameterizedType;
import java.util.logging.Logger;

import org.teksme.model.teks.Message;

public abstract class TeksMessageHandler{//<T> implements MessageListener {

	Logger logger = Logger.getLogger("TeksMessageHandler");

	private final Class<?> expectedType;

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
//		try {
//			if (message instanceof ObjectMessage) {
//				return ((ObjectMessage) message).getObject();
//			} else if (message instanceof TextMessage) {
//				return ((TextMessage) message).getText();
//			}
			return null;
//		} catch (JMSException e) {
//			throw new IllegalStateException("Error extracting payload", e);
//		}
	}

	private void invokeConsume(final Object obj) {
		//consume((T) obj);
	}

	protected abstract void consume(Object obj);

}
