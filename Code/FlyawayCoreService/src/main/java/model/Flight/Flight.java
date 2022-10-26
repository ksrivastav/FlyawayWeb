package model.Flight;

import java.time.LocalDateTime;

public class Flight {
	
	private int FlightId;
	private int aircraftId;
	private String flightNumber;
	private int RouteId;	
	private String aircraftType;
	private String depAirportCodeName;
	private String arrAirportCodeName;
	private LocalDateTime LocalDepartureDateTime;
	private LocalDateTime LocalArrivalDateTime;
	private int seatSold;
	private int seatCapacity;
	private int seatRemaining;
	

	public Flight() {
		// TODO Auto-generated constructor stub
	}


	public int getFlightId() {
		return FlightId;
	}


	public void setFlightId(int flightId) {
		FlightId = flightId;
	}


	public int getaircraftId() {
		return this.aircraftId;
	}


	public void setaircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public int getRouteId() {
		return RouteId;
	}


	public void setRouteId(int routeId) {
		RouteId = routeId;
	}


	public LocalDateTime getLocalDepartureDateTime() {
		return LocalDepartureDateTime;
	}


	public void setLocalDepartureDateTime(LocalDateTime localDepartureDateTime) {
		LocalDepartureDateTime = localDepartureDateTime;
	}


	public LocalDateTime getLocalArrivalDateTime() {
		return LocalArrivalDateTime;
	}


	public void setLocalArrivalDateTime(LocalDateTime LocalArrivalDateTime) {
		this.LocalArrivalDateTime = LocalArrivalDateTime;
	}


	public int getSeatSold() {
		return seatSold;
	}


	public void setSeatSold(int seatSold) {
		this.seatSold = seatSold;
	}


	public int getSeatCapacity() {
		return seatCapacity;
	}


	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}


	public int getSeatRemaining() {
		return seatRemaining;
	}


	public void setSeatRemaining(int seatRemaining) {
		this.seatRemaining = seatRemaining;
	}
	
	


	public int getAircraftId() {
		return aircraftId;
	}


	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}


	public String getAircraftType() {
		return aircraftType;
	}


	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}


	public String getDepAirportCodeName() {
		return depAirportCodeName;
	}


	public void setDepAirportCodeName(String depAirportCodeName) {
		this.depAirportCodeName = depAirportCodeName;
	}


	public String getArrAirportCodeName() {
		return arrAirportCodeName;
	}


	public void setArrAirportCodeName(String arrAirportCodeName) {
		this.arrAirportCodeName = arrAirportCodeName;
	}


	@Override
	public String toString() {
		return "Flight [FlightId=" + FlightId + ", aircraftId=" + aircraftId + ", flightNumber=" + flightNumber
				+ ", RouteId=" + RouteId + ", LocalDepartureDateTime=" + LocalDepartureDateTime
				+ ", LocalArrivalDateTime=" + LocalArrivalDateTime + ", seatSold=" + seatSold
				+ ", seatCapacity=" + seatCapacity + ", seatRemaining=" + seatRemaining + "]";
	}
	
	
	

}
