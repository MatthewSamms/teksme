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
package org.teksme.server.auth;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;

/**
 * 
 * @since 0.5
 *
 */
public class HttpServiceTracker extends ServiceTracker {

	public HttpServiceTracker(BundleContext context) {
		super(context, HttpService.class.getName(), null);
	}
	
	
	public Object addingService(ServiceReference reference) {
	    HttpService httpService = (HttpService) super.addingService(reference);
	    if (httpService == null)
	      return null;
	 
	    try {
	      httpService.registerServlet("/auth", new AuthenticationToken(), null, null);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	 
	    return httpService;
	  }
	
	public void removedService(ServiceReference reference, Object service) {
	    HttpService httpService = (HttpService) service;
	 
	    httpService.unregister("/auth");
	 
	    super.removedService(reference, service);
	  }
}
