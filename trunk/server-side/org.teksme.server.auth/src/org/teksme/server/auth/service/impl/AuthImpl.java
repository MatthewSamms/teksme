/**
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

package org.teksme.server.auth.service.impl;

import javax.servlet.http.HttpServletRequest;

import net.oauth.OAuthAccessor;
import net.oauth.OAuthMessage;
import net.oauth.server.OAuthServlet;

import org.teksme.server.auth.provider.TeksmeOAuthProvider;
import org.teksme.server.auth.service.IAuth;

/**
 * 
 * @since 0.5
 *
 */
public class AuthImpl implements IAuth {

	public boolean isValidToke(HttpServletRequest request) {
		try {
			OAuthMessage requestMessage = OAuthServlet.getMessage(request, null);

			OAuthAccessor accessor = TeksmeOAuthProvider.getAccessor(requestMessage);
			
			if (!Boolean.TRUE.equals(accessor.getProperty("authorized")) || accessor.getProperty("user")==null ) {
				return false;
			}
			return true;

		} catch (Exception e) {
			//TODO check
			e.printStackTrace();
			return false;
		}
	}

}
