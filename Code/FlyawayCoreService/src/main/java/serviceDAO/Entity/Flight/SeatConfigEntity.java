package serviceDAO.Entity.Flight;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SeatConfig")
public class SeatConfigEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SeatConfigId")
	private int seatConfigId;
	
	@Column(name="TotalSeats")
	private int totalSeats;
	
	@Column(name="SellableSeats")
	private int sellableSeats;

	public SeatConfigEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getSeatConfigId() {
		return seatConfigId;
	}

	public void setSeatConfigId(int seatConfigId) {
		this.seatConfigId = seatConfigId;
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
		return "SeatConfig [seatConfigId=" + seatConfigId + ", totalSeats=" + totalSeats + ", sellableSeats="
				+ sellableSeats + "]";
	}
	
	

}
