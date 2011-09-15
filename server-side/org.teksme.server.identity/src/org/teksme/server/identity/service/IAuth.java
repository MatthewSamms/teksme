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
package org.teksme.server.identity.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.teksme.model.teks.User;

/**
 * 
 * @since 0.5
 * 
 */
public interface IAuth {

	/**
	 * Check if it is a valid token
	 * 
	 * @param request
	 * @return
	 */
	public boolean isValidToken(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

	public User getAuthUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException;

	public void refreshOAuthConsumersCache(User user);

}
