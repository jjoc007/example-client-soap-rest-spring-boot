package co.com.jjoc007.microservices.rest.countries;

import com.google.gson.annotations.SerializedName;

public class CountryDTO {

	@SerializedName("name")
	private String name;
	@SerializedName("alpha2_code")
	private String alpha2Code;
	@SerializedName("alpha3_code")
	private String alpha3Code;

	public CountryDTO(String name, String alpha2Code, String alpha3Code) {
		super();
		this.name = name;
		this.alpha2Code = alpha2Code;
		this.alpha3Code = alpha3Code;
	}

	public CountryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlpha2Code() {
		return alpha2Code;
	}

	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	public String getAlpha3Code() {
		return alpha3Code;
	}

	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

}
