package serviceDAO.Entity.Reservation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GenerationType;

@Entity
@Table(name="TravelerItinerary")
public class TravelerItineraryEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TravelerItineraryId")
	private int travelerItineraryId;
	
	@Column(name="ReservationId")
	private int reservationId;
	
	@Column(name="PassengerId")
	private int pasengerId;
	
	@Column(name="FlightId")
	private int flightId;
	
	@Column(name="SeatNumber")
	private String seatNumber;
	
	@Column(name="isActive")
	private Boolean isActive;
	
	@Column(name="TravelerItineraryStatusId")
	private int travelerItineraryStatusId;
	
	@Column(name="CheckedInFlag")
	private boolean checkedInFlag;
	
	@Column(name="BoardedFlag")
	private boolean boardedFlag;
	
	
	@Column(name="BoardedNumber")
	private String boardedNumber;
	
	

	public TravelerItineraryEntity() {
		// TODO Auto-generated constructor stub
	}



	public int getTravelerItineraryId() {
		return travelerItineraryId;
	}



	public void setTravelerItineraryId(int travelerItineraryId) {
		this.travelerItineraryId = travelerItineraryId;
	}



	public int getReservationId() {
		return reservationId;
	}



	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}



	public int getPasengerId() {
		return pasengerId;
	}



	public void setPasengerId(int pasengerId) {
		this.pasengerId = pasengerId;
	}



	public int getFlightId() {
		return flightId;
	}



	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}



	public String getSeatNumber() {
		return seatNumber;
	}



	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}



	public Boolean getIsActive() {
		return isActive;
	}



	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}



	public int getTravelerItineraryStatusId() {
		return travelerItineraryStatusId;
	}



	public void setTravelerItineraryStatusId(int travelerItineraryStatusId) {
		this.travelerItineraryStatusId = travelerItineraryStatusId;
	}



	public boolean isCheckedInFlag() {
		return checkedInFlag;
	}



	public void setCheckedInFlag(boolean checkedInFlag) {
		this.checkedInFlag = checkedInFlag;
	}



	public boolean isBoardedFlag() {
		return boardedFlag;
	}



	public void setBoardedFlag(boolean boardedFlag) {
		this.boardedFlag = boardedFlag;
	}



	public String getboardedNumber() {
		return boardedNumber;
	}



	public void setboardedNumber(String boardedNumber) {
		this.boardedNumber = boardedNumber;
	}



	@Override
	public String toString() {
		return "TravelerItinerary [travelerItineraryId=" + travelerItineraryId + ", reservationId=" + reservationId
				+ ", pasengerId=" + pasengerId + ", flightId=" + flightId + ", seatNumber=" + seatNumber + ", isActive="
				+ isActive + ", travelerItineraryStatusId=" + travelerItineraryStatusId + ", checkedInFlag="
				+ checkedInFlag + ", boardedFlag=" + boardedFlag + ", boardedNumber=" + boardedNumber + "]";
	}
	
	

}
