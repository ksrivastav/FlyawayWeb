package model.MasterData;

public class Country {
	
	private int countryId;
	private String countryCode;
	private String countryName;
	

	public Country() {
		// TODO Auto-generated constructor stub
	}


	public int getCountryId() {
		return countryId;
	}


	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryCode=" + countryCode + ", countryName=" + countryName
				+ "]";
	}
	
	

}
