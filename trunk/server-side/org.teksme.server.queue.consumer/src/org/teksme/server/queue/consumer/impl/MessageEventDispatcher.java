/**
 * Copyright 2010 T�ksMe, Inc.
 * T�ksMe licenses this file to you under the Apache License, version
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

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.teksme.server.queue.consumer.MessageListener;


public class MessageEventDispatcher<M> {

	private List<MessageListener<M>> listeners = new CopyOnWriteArrayList<MessageListener<M>>();

	public void addListener(MessageListener<M> listener) {
		listeners.add(listener);
	}

	public void removeListener(MessageListener<M> listener) {
		listeners.remove(listener);
	}

	public void fire(M event) {
		for (MessageListener<M> listener : listeners) {
			listener.onMessage(event);
		}
	}
}