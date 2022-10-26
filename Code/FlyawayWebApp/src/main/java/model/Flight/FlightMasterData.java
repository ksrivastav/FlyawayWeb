package model.Flight;

import java.time.LocalDateTime;

public class FlightMasterData {
	
	 private int flightId;
     private String flightNumber;
     private String localDepartureDateTime;
     private String localArrivalDateTime;
    private int routeId;
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	private int  seatCapacity;
     private int  seatRemaining;
     private int  seatSold;
     private int  souteId;
     private int aircraftId;
     private String  depAirportName;
     private String  depCity;
     private String arrCity;
     private String arrAirportName;
     private String aircraftType;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getLocalDepartureDateTime() {
		return localDepartureDateTime;
	}
	public void setLocalDepartureDateTime(String localDepartureDateTime) {
		this.localDepartureDateTime = localDepartureDateTime;
	}
	public String getLocalArrivalDateTime() {
		return localArrivalDateTime;
	}
	public void setLocalArrivalDateTime(String localArrivalDateTime) {
		this.localArrivalDateTime = localArrivalDateTime;
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
	public int getSeatSold() {
		return seatSold;
	}
	public void setSeatSold(int seatSold) {
		this.seatSold = seatSold;
	}
	public int getSouteId() {
		return souteId;
	}
	public void setSouteId(int souteId) {
		this.souteId = souteId;
	}
	public int getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}
	public String getDepAirportName() {
		return depAirportName;
	}
	public void setDepAirportName(String depAirportName) {
		this.depAirportName = depAirportName;
	}
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	public String getArrAirportName() {
		return arrAirportName;
	}
	public void setArrAirportName(String arrAirportName) {
		this.arrAirportName = arrAirportName;
	}
	public String getAircraftType() {
		return aircraftType;
	}
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	@Override
	public String toString() {
		return "FlightMasterData [flightId=" + flightId + ", flightNumber=" + flightNumber + ", localDepartureDateTime="
				+ localDepartureDateTime + ", localArrivalDateTime=" + localArrivalDateTime + ", routeId=" + routeId
				+ ", seatCapacity=" + seatCapacity + ", seatRemaining=" + seatRemaining + ", seatSold=" + seatSold
				+ ", souteId=" + souteId + ", aircraftId=" + aircraftId + ", depAirportName=" + depAirportName
				+ ", depCity=" + depCity + ", arrCity=" + arrCity + ", arrAirportName=" + arrAirportName
				+ ", aircraftType=" + aircraftType + "]";
	}
	
	
	
}
