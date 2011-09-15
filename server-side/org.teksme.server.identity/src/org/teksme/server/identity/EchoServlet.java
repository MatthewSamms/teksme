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
package org.teksme.server.identity;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.teksme.server.identity.provider.TeksOAuthProvider;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthMessage;
import net.oauth.server.OAuthServlet;

public class EchoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		try {
			OAuthMessage requestMessage = OAuthServlet.getMessage(request, null);
			OAuthAccessor accessor = TeksOAuthProvider.getAccessor(requestMessage);
			TeksOAuthProvider.VALIDATOR.validateMessage(requestMessage, accessor);
			String userId = (String) accessor.getProperty("user");

			response.setContentType("text/plain");
			PrintWriter out = response.getWriter();
			out.println("[Your UserId:" + userId + "]");
			for (Object item : request.getParameterMap().entrySet()) {
				@SuppressWarnings("rawtypes")
				Map.Entry parameter = (Map.Entry) item;
				String[] values = (String[]) parameter.getValue();
				for (String value : values) {
					out.println(parameter.getKey() + ": " + value);
				}
			}
			out.close();

		} catch (Exception e) {
			TeksOAuthProvider.handleException(e, request, response, false);
		}
	}

	private static final long serialVersionUID = 1L;

}
