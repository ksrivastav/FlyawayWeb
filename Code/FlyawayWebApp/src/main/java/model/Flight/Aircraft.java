package model.Flight;

public class Aircraft {
	
	private int aircraftId;
	private String aircraftType;
	private int totalSeats;
	private int sellableSeats;
	

	public Aircraft() {
		// TODO Auto-generated constructor stub
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


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public int getSellableSeats() {
		return sellableSeats;
	}


	public void setSellableSeats(int sellableSeats) {
		this.sellableSeats = sellableSeats;
	}


	@Override
	public String toString() {
		return "Aircraft [aircraftId=" + aircraftId + ", aircraftType=" + aircraftType + ", totalSeats=" + totalSeats
				+ ", sellableSeats=" + sellableSeats + "]";
	}


	
	

}
