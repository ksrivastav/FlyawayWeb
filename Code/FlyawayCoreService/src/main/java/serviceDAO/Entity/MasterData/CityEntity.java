package serviceDAO.Entity.MasterData;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="City")
public class CityEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CityId")
	private int cityId;
	
	@Column(name="CityCode")
	private String cityCode;
	
	@Column(name="CityName")
	private String cityName;
	
	@Column(name="CountryId")
	private int countryId;
	
	
	public CityEntity() {
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
