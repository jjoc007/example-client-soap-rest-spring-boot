package co.com.jjoc007.microservices.rest.countries;

import com.google.gson.annotations.SerializedName;

public class RestResponse {

	@SerializedName("RestResponse")
	ResponseCountryAPI responseCountryAPI;

	public RestResponse(ResponseCountryAPI responseCountryAPI) {
		super();
		this.responseCountryAPI = responseCountryAPI;
	}

	public RestResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseCountryAPI getResponseCountryAPI() {
		return responseCountryAPI;
	}

	public void setResponseCountryAPI(ResponseCountryAPI responseCountryAPI) {
		this.responseCountryAPI = responseCountryAPI;
	}
	
	
	
}
