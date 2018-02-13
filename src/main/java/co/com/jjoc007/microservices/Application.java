package co.com.jjoc007.microservices;

import java.util.Locale;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import co.com.jjoc007.microservices.rest.config.RetrofitConfig;
import co.com.jjoc007.microservices.soap.config.SoapCalculatorConfig;

@SpringBootApplication
@ComponentScan(basePackageClasses = { SoapCalculatorConfig.class, RetrofitConfig.class }, basePackages = { "co.com.jjoc007.microservices",
		"co.com.jjoc007.microservices.controllers" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		TimeZone.setDefault(TimeZone.getTimeZone("America/Bogota"));
		Locale.setDefault(Locale.forLanguageTag("es_CO"));
	}

}
