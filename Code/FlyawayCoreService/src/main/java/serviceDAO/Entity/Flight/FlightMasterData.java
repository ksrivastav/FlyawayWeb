package serviceDAO.Entity.Flight;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;


@Entity
@Immutable
public class FlightMasterData {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="FlightId")
	private int FlightId;
	
	@Column(name="FlightNumber")
    private String FlightNumber;

@Column(name="LocalDepartureDateTime")
    private LocalDateTime LocalDepartureDateTime;

@Column(name="LocalArrivalDateTime")
    private LocalDateTime LocalArrivalDateTime;

@Column(name="SeatCapacity")
    private int  SeatCapacity;



@Column(name="SeatSold")
    private int  SeatSold;

@Column(name="RouteId")
    private int  RouteId;

@Column(name="AircraftId")
    private int AircraftId;

@Column(name="DepAirportName")
private String  DepAirportName;

@Column(name="DepCity")
    private String  DepCity;

@Column(name="ArrCity")
    private String ArrCity;

@Column(name="ArrAirportName")
    private String ArrAirportName;

@Column(name="AircraftType")
    private String AircraftType;

@Column(name="DepAirportId")	
private int DepAirportId;

@Column(name="ArrAirportId")
	private int ArrAirportId;

@Column(name="SeatRemaining")
private int SeatRemaining;

public int getFlightId() {
	return FlightId;
}

public void setFlightId(int flightId) {
	FlightId = flightId;
}

public String getFlightNumber() {
	return FlightNumber;
}

public void setFlightNumber(String flightNumber) {
	FlightNumber = flightNumber;
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

public void setLocalArrivalDateTime(LocalDateTime localArrivalDateTime) {
	LocalArrivalDateTime = localArrivalDateTime;
}

public int getSeatCapacity() {
	return SeatCapacity;
}

public void setSeatCapacity(int seatCapacity) {
	SeatCapacity = seatCapacity;
}

public int getSeatRemaining() {
	return SeatRemaining;
}

public void setSeatRemaining(int seatRemaining) {
	SeatRemaining = seatRemaining;
}

public int getSeatSold() {
	return SeatSold;
}

public void setSeatSold(int seatSold) {
	SeatSold = seatSold;
}

public int getRouteId() {
	return RouteId;
}

public void setRouteId(int routeId) {
	RouteId = routeId;
}

public int getAircraftId() {
	return AircraftId;
}

public void setAircraftId(int aircraftId) {
	AircraftId = aircraftId;
}

public String getDepAirportName() {
	return DepAirportName;
}

public void setDepAirportName(String depAirportName) {
	DepAirportName = depAirportName;
}

public String getDepCity() {
	return DepCity;
}

public void setDepCity(String depCity) {
	DepCity = depCity;
}

public String getArrCity() {
	return ArrCity;
}

public void setArrCity(String arrCity) {
	ArrCity = arrCity;
}

public String getArrAirportName() {
	return ArrAirportName;
}

public void setArrAirportName(String arrAirportName) {
	ArrAirportName = arrAirportName;
}

public String getAircraftType() {
	return AircraftType;
}

public void setAircraftType(String aircraftType) {
	AircraftType = aircraftType;
}

public int getDepAirportId() {
	return DepAirportId;
}

public void setDepAirportId(int depAirportId) {
	DepAirportId = depAirportId;
}

public int getArrAirportId() {
	return ArrAirportId;
}

public void setArrAirportId(int arrAirportId) {
	ArrAirportId = arrAirportId;
}

@Override
public String toString() {
	return "FlightMasterData [FlightId=" + FlightId + ", FlightNumber=" + FlightNumber + ", LocalDepartureDateTime="
			+ LocalDepartureDateTime + ", LocalArrivalDateTime=" + LocalArrivalDateTime + ", SeatCapacity="
			+ SeatCapacity + ", SeatRemaining=" + SeatRemaining + ", SeatSold=" + SeatSold + ", RouteId=" + RouteId
			+ ", AircraftId=" + AircraftId + ", DepAirportName=" + DepAirportName + ", DepCity=" + DepCity
			+ ", ArrCity=" + ArrCity + ", ArrAirportName=" + ArrAirportName + ", AircraftType=" + AircraftType
			+ ", DepAirportId=" + DepAirportId + ", ArrAirportId=" + ArrAirportId + "]";
}



	
}
