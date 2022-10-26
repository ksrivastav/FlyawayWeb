package model.Flight;

import model.MasterData.City;
import model.MasterData.Country;

public class Airport {

	private int aiportId;
	private String airportCode;
	private String airportName;
	private int cityid;
	private int countryId;
	private String cityName;
	private String countryName;
	private City city;
	private Country country;
	;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	public Airport() {
		// TODO Auto-generated constructor stub
	}
	public int getAiportId() {
		return aiportId;
	}
	public void setAiportId(int aiportId) {
		this.aiportId = aiportId;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
		//City city = CityList.getCity(cityid);
	//	setCity(city);
		
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	
	
	
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Airport [aiportId=" + aiportId + ", airportCode=" + airportCode + ", cityid=" + cityid + ", countryId="
				+ countryId + "]";
	}
	
	

}
