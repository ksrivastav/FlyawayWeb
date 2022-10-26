package model.Flight;

import java.time.LocalDateTime;

public class Flight {
	
	private int FlightId;
	private int aircraftId;
	private String flightNumber;
	private String RouteId;
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


	public String getRouteId() {
		return RouteId;
	}


	public void setRouteId(String routeId) {
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


	@Override
	public String toString() {
		return "Flight [FlightId=" + FlightId + ", aircraftId=" + aircraftId + ", flightNumber=" + flightNumber
				+ ", RouteId=" + RouteId + ", LocalDepartureDateTime=" + LocalDepartureDateTime
				+ ", LocalArrivalDateTime=" + LocalArrivalDateTime + ", seatSold=" + seatSold
				+ ", seatCapacity=" + seatCapacity + ", seatRemaining=" + seatRemaining + "]";
	}
	
	
	

}
