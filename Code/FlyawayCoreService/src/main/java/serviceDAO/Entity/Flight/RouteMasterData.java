package serviceDAO.Entity.Flight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class RouteMasterData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="RouteId")
	private int routeId;
	
	@Column(name="DepAirportId")
	private int depAirportId;
	
	@Column(name="ArrAirportId")
	private int arrAirportId;
	
	@Column(name="DepAirportName")
	private String depAirportName;
	
	@Column(name="DepCityName")
	private String depCityName;	
	
	@Column(name="ArrAirportName")
	private String arrAirportName;
	
	@Column(name="ArrCityName")
	private String arrCityName;
	

	public RouteMasterData() {
		// TODO Auto-generated constructor stub
	}


	public int getRouteId() {
		return routeId;
	}


	public int getDepAirportId() {
		return depAirportId;
	}


	public int getArrAirportId() {
		return arrAirportId;
	}


	public String getDepAirportName() {
		return depAirportName;
	}


	public String getDepCityName() {
		return depCityName;
	}


	public String getArrAirportName() {
		return arrAirportName;
	}


	public String getArrCityName() {
		return arrCityName;
	}


	


	

}
