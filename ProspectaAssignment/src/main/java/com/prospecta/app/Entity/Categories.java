package com.prospecta.app.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Categories {
	
	private String API;
	private String description;
	private String auth;
	private Boolean https;
	private String cors;
	private String categories;
	
	
	public Categories() {
		super();
	}
	
	
	public Categories(String aPI, String description, String auth, Boolean https, String cors, String categories) {
		super();
		API = aPI;
		this.description = description;
		this.auth = auth;
		this.https = https;
		this.cors = cors;
		this.categories = categories;
	}


	public String getAPI() {
		return API;
	}

	public void setAPI(String aPI) {
		API = aPI;
	}



	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}




	public String getAuth() {
		return auth;
	}




	public void setAuth(String auth) {
		this.auth = auth;
	}




	public Boolean getHttps() {
		return https;
	}




	public void setHttps(Boolean https) {
		this.https = https;
	}




	public String getCors() {
		return cors;
	}




	public void setCors(String cors) {
		this.cors = cors;
	}




	public String getCategories() {
		return categories;
	}




	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	
	
}
