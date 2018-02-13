package co.com.jjoc007.microservices.rest.countries;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ResponseCountryAPI {

	@SerializedName("messages")
	List<String> messages;
	@SerializedName("result")
	List<CountryDTO> result;
	
	public ResponseCountryAPI(List<String> messages, List<CountryDTO> result) {
		super();
		this.messages = messages;
		this.result = result;
	}
	public ResponseCountryAPI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	public List<CountryDTO> getResult() {
		return result;
	}
	public void setResult(List<CountryDTO> result) {
		this.result = result;
	}
	
	
	
}
