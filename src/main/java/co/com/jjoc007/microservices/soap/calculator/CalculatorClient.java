package co.com.jjoc007.microservices.soap.calculator;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CalculatorClient extends WebServiceGatewaySupport{

	@Value("${bocc.occiauto.client.calculator.endpoint}")
	private String endPointCalculator;
	
	@Value("${bocc.occiauto.client.calculator.soapaction.add}")
	private String soapActionAdd;
	
	public AddResponse add(Integer a, Integer b) {

		Add request = new Add();
		request.setIntA(a);
		request.setIntB(b);

		AddResponse response = (AddResponse) getWebServiceTemplate()
				.marshalSendAndReceive(endPointCalculator,
						request,
						new SoapActionCallback(soapActionAdd));

		return response;
	}
	
}