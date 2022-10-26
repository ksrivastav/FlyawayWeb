package serviceDAO.Entity.Flight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Route")
public class RouteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="RouteId")
	private int routeId;
	
	@Column(name="DepAirportId")
	private int depAirportId;
	
	@Column(name="ArrAirportId")
	private int arrAirportId;

	public RouteEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getrouteId() {
		return this.routeId;
	}

	public void setrouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getdepAirportId() {
		return this.depAirportId;
	}

	public void setdepAirportId(int depAirportId) {
		this.depAirportId = depAirportId;
	}

	public int getarrAirportId() {
		return this.arrAirportId;
	}

	public void setarrAirportId(int arrAirportId) {
		this.arrAirportId = arrAirportId;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", depAirportId=" + depAirportId + ", arrAirportId=" + arrAirportId + "]";
	}
	
	

}
