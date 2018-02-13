package co.com.jjoc007.microservices.rest.countries;

import retrofit.http.GET;

public interface CountryAPI {

	@GET("/country/get/all")
	RestResponse getCountries();

}
