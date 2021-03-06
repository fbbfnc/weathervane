/*
Copyright (c) 2017 VMware, Inc. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.vmware.weathervane.auction.representation.configuration;

import java.util.List;

import org.springframework.hateoas.ResourceSupport;

import com.vmware.weathervane.auction.model.configuration.AppServer;
import com.vmware.weathervane.auction.model.configuration.WebServer;


public class ChangeConfigurationResponse extends ResourceSupport {
	private String status;
	private String message;
	
	private List<AppServer> appServersRemoved;
	private List<WebServer> webServersRemoved;
	private List<Long> addedAppServerIds = null;
	private List<Long> addedWebServerIds = null;
	
	public String getStatus() {
		return status;
	}
	public List<AppServer> getAppServersRemoved() {
		return appServersRemoved;
	}
	public List<WebServer> getWebServersRemoved() {
		return webServersRemoved;
	}
	public void setAppServersRemoved(List<AppServer> appServersRemoved) {
		this.appServersRemoved = appServersRemoved;
	}
	public void setWebServersRemoved(List<WebServer> webServersRemoved) {
		this.webServersRemoved = webServersRemoved;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Long> getAddedAppServerIds() {
		return addedAppServerIds;
	}
	public List<Long> getAddedWebServerIds() {
		return addedWebServerIds;
	}
	public void setAddedAppServerIds(List<Long> addedAppServerIds) {
		this.addedAppServerIds = addedAppServerIds;
	}
	public void setAddedWebServerIds(List<Long> addedWebServerIds) {
		this.addedWebServerIds = addedWebServerIds;
	}
	
}
