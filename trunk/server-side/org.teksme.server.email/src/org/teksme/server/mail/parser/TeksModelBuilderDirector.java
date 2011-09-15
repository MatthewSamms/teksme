/*
 * Copyright 2010 Creative Works, Inc.
 * Creative Works licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.teksme.server.mail.parser;

import java.io.IOException;

import org.teksme.model.teks.Teks;

public class TeksModelBuilderDirector {

	private TeksBuilder outboundSMSBuilder;

	public void setOutboundSMSBuilder(TeksBuilder sb) {
		outboundSMSBuilder = sb;
	}

	public Teks getTeksModel() {
		return outboundSMSBuilder.getTeksModel();
	}

	public void constructTeksModel() throws IOException {
		outboundSMSBuilder.createNewTeksModel();
		outboundSMSBuilder.buildModelDoc();
		outboundSMSBuilder.buildModelHeader();
		outboundSMSBuilder.buildModelBody();
	}

}
