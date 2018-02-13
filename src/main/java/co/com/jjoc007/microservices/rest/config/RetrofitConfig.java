package co.com.jjoc007.microservices.rest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.com.jjoc007.microservices.rest.countries.CountryAPI;
import co.com.jjoc007.microservices.rest.countries.RestResponse;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

@Configuration
public class RetrofitConfig {

	@Value("${bocc.occiauto.client.countries.endpoint}")
	private String endPointCountries;

	@Bean
	public RestResponse GetAllCountries() {

		Gson gson = new GsonBuilder().create();

		RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(endPointCountries)
				.setConverter(new GsonConverter(gson)).build();

		CountryAPI service = restAdapter.create(CountryAPI.class);

		RestResponse response = service.getCountries();

		return response;
	}

}
