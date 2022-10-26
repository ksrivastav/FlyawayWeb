package serviceDAO.Entity.Flight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Aircraft")
public class AircraftEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AircraftId")
	private int aircraftId;
	
	@Column(name="AircraftType")
	private String aircraftType;
	
	@Column(name="SeatConfigId")
	private int seatConfigId;
	

	public AircraftEntity() {
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
