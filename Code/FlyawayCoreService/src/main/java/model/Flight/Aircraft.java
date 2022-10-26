package model.Flight;

public class Aircraft {
	
	private int aircraftId;
	private String aircraftType;
	private int seatConfigId;
	

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


	public int getseatConfigId() {
		return this.seatConfigId;
	}


	public void setseatConfigId(int seatConfigId) {
		this.seatConfigId = seatConfigId;
	}


	@Override
	public String toString() {
		return "Aircraft [aircraftId=" + aircraftId + ", aircraftType=" + aircraftType + ", seatConfigId="
				+ seatConfigId + "]";
	}
	
	

}
