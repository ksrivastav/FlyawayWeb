package model.MasterData;

public class City {

	private int cityId;
	private String cityCode;
	private String cityName;
	private int countryId;
	
	
	public City() {
		// TODO Auto-generated constructor stub
	}


	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}


	public String getCityCode() {
		return cityCode;
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public int getCountryId() {
		return countryId;
	}


	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}


	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityCode=" + cityCode + ", cityName=" + cityName + ", countryId="
				+ countryId + "]";
	}
	
	

}
