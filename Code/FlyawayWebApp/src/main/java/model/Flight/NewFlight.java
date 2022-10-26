package model.Flight;

public class NewFlight {

	public NewFlight() {
		// TODO Auto-generated constructor stub
	}
	
	private int depAirportCodeId;
	private int arrAirportCodeId;
	private int aircraftId;
	private String flightNumber;	
	//private LocalDateTime LocalDepartureDateTime;
	//private LocalDateTime LocalArrivalDateTime;
	private String  localDepartureDate;
	private String localArrivalDate;
	
	private String  localDepartureTime;
	private String localArrivalTime;
	public int getDepAirportCodeId() {
		return depAirportCodeId;
	}
	public void setDepAirportCodeId(int depAirportCodeId) {
		this.depAirportCodeId = depAirportCodeId;
	}
	public int getArrAirportCodeId() {
		return arrAirportCodeId;
	}
	public void setArrAirportCodeId(int arrAirportCodeId) {
		this.arrAirportCodeId = arrAirportCodeId;
	}
	public int getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getLocalDepartureDate() {
		return localDepartureDate;
	}
	public void setLocalDepartureDate(String localDepartureDate) {
		this.localDepartureDate = localDepartureDate;
	}
	public String getLocalArrivalDate() {
		return localArrivalDate;
	}
	public void setLocalArrivalDate(String localArrivalDate) {
		this.localArrivalDate = localArrivalDate;
	}
	public String getLocalDepartureTime() {
		return localDepartureTime;
	}
	public void setLocalDepartureTime(String localDepartureTime) {
		this.localDepartureTime = localDepartureTime;
	}
	public String getLocalArrivalTime() {
		return localArrivalTime;
	}
	public void setLocalArrivalTime(String localArrivalTime) {
		this.localArrivalTime = localArrivalTime;
	}
	@Override
	public String toString() {
		
		String str= "depAirportCodeId=" + depAirportCodeId + "&arrAirportCodeId=" + arrAirportCodeId
				+ "&aircraftId=" + aircraftId + "&flightNumber=" + flightNumber + "&localDepartureDate="
				+ localDepartureDate + "&localArrivalDate=" + localArrivalDate + "&localDepartureTime="
				+ localDepartureTime + "&localArrivalTime=" + localArrivalTime;
		return str;
	}
	

}
