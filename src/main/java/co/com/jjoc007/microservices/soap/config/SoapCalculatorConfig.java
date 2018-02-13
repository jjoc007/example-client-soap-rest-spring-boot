package co.com.jjoc007.microservices.soap.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import co.com.jjoc007.microservices.soap.calculator.CalculatorClient;

@Configuration
public class SoapCalculatorConfig {
	
	@Value("${bocc.occiauto.client.calculator.endpoint}")
	private String endPointCalculator;
	
	@Value("${bocc.occiauto.client.calculator.package.sources}")
	private String packageGeneratedSources;
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath(packageGeneratedSources);
		return marshaller;
	}

	@Bean
	public CalculatorClient calculatorClient(Jaxb2Marshaller marshaller) {
		CalculatorClient client = new CalculatorClient();
		client.setDefaultUri(endPointCalculator);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
