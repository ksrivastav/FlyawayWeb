package model.Flight;

public class Route {
	
	private int routeId;
	private int depAirportId;
	private int arrAirportId;

	public Route() {
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
