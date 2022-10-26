package serviceDAO.Entity.Flight;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flight")
public class FlightEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FlightId")
	private int FlightId;
	
	@Column(name="AircraftId")
	private int aircraftId;
	
	@Column(name="FlightNumber")
	private String flightNumber;
	
	@Column(name="RouteId")
	private int RouteId;
	
	@Column(name="LocalDepartureDateTime")
	private LocalDateTime LocalDepartureDateTime;
	
	@Column(name="LocalArrivalDateTime")
	private LocalDateTime LocalArrivalDateTime;
	
	@Column(name="SeatSold")
	private int seatSold;
	
	@Column(name="SeatCapacity")
	private int seatCapacity;
	
	@Column(name="SeatRemaining")
	private int seatRemaining;
	

	public FlightEntity() {
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


	@Override
	public String toString() {
		return "Flight [FlightId=" + FlightId + ", aircraftId=" + aircraftId + ", flightNumber=" + flightNumber
				+ ", RouteId=" + RouteId + ", LocalDepartureDateTime=" + LocalDepartureDateTime
				+ ", LocalArrivalDateTime=" + LocalArrivalDateTime + ", seatSold=" + seatSold
				+ ", seatCapacity=" + seatCapacity + ", seatRemaining=" + seatRemaining + "]";
	}
	
	
	

}
