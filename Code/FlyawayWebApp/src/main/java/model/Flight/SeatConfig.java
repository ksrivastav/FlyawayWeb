package model.Flight;

public class SeatConfig {
	
	private int seatConfigId;
	private int totalSeats;
	private int sellableSeats;

	public SeatConfig() {
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
