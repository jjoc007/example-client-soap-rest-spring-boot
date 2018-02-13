package co.com.jjoc007.microservices.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.com.jjoc007.microservices.soap.calculator.Add;
import co.com.jjoc007.microservices.soap.calculator.CalculatorClient;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

	private final CalculatorClient calculatorClient;

	@Autowired
	public CalculatorController(CalculatorClient calculatorClient) {
		this.calculatorClient = calculatorClient;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Integer add(@RequestBody Add add) {
		return calculatorClient.add(add.getIntA(), add.getIntB()).getAddResult();
	}
	
}
