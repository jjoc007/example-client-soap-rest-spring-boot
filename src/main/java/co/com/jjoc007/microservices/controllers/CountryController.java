package co.com.jjoc007.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import co.com.jjoc007.microservices.rest.config.RetrofitConfig;
import co.com.jjoc007.microservices.rest.countries.RestResponse;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

	private final RetrofitConfig retrofitConfig;
	
	@Autowired
	public CountryController(RetrofitConfig retrofitConfig) {
		this.retrofitConfig = retrofitConfig;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public RestResponse getCountries() {
		return this.retrofitConfig.GetAllCountries();
	}
	
}
