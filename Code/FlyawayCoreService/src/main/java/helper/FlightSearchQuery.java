package helper;

import java.time.LocalDateTime;
import java.util.Date;

public class FlightSearchQuery {

	public FlightSearchQuery() {
		// TODO Auto-generated constructor stub
	}
	
	private int departureAirportId;
	private int arrAirportCodeId;
	private LocalDateTime departureDate;	
	private int numberOfPassneger;	
	private int RouteId;
	public int getDepartureAirportId() {
		return departureAirportId;
	}
	public void setDepartureAirportId(int departureAirportId) {
		this.departureAirportId = departureAirportId;
	}
	public int getArrAirportCodeId() {
		return arrAirportCodeId;
	}
	public void setArrAirportCodeId(int arrAirportCodeId) {
		this.arrAirportCodeId = arrAirportCodeId;
	}
	public LocalDateTime getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDate = departureDate;
	}
	public int getNumberOfPassneger() {
		return numberOfPassneger;
	}
	public void setNumberOfPassneger(int numberOfPassneger) {
		this.numberOfPassneger = numberOfPassneger;
	}
	public int getRouteId() {
		return RouteId;
	}
	public void setRouteId(int routeId) {
		RouteId = routeId;
	}
	
	
	

}
