package model.Flight;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FlightMasterDataModel {
	
	 
	 private int flightId;
     private String flightNumber;
     private LocalDateTime localDepartureDateTime;
     private LocalDateTime localArrivalDateTime;
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
     private int depAirportId;
     private int arrAirportId;
     private int routeId;
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
	public LocalDateTime getLocalDepartureDateTime() {
		return localDepartureDateTime;
	}
	public void setLocalDepartureDateTime(LocalDateTime localDepartureDateTime) {
		this.localDepartureDateTime = localDepartureDateTime;
	}
	public LocalDateTime getLocalArrivalDateTime() {
		return localArrivalDateTime;
	}
	public void setLocalArrivalDateTime(LocalDateTime localArrivalDateTime) {
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
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public int getDepAirportId() {
		return depAirportId;
	}
	public void setDepAirportId(int depAirportId) {
		this.depAirportId = depAirportId;
	}
	public int getArrAirportId() {
		return arrAirportId;
	}
	public void setArrAirportId(int arrAirportId) {
		this.arrAirportId = arrAirportId;
	}
     
	
     
	
	
}
