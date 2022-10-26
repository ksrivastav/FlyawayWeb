package serviceDAO.Entity.Flight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Airport")
public class AirportEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AirportId")
	private int airportId;
	
	@Column(name="AirportCode")
	private String airportCode;
	
	@Column(name="Cityid")
	private int cityid;
	
	@Column(name="AirportName")
	private String airportName;
	
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	@Column(name="CountryId")
	private int countryId;
	public AirportEntity() {
		// TODO Auto-generated constructor stub
	}
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int aiportId) {
		this.airportId = aiportId;
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
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "Airport [aiportId=" + airportId + ", airportCode=" + airportCode + ", cityid=" + cityid + ", countryId="
				+ countryId + "]";
	}
	
	

}
