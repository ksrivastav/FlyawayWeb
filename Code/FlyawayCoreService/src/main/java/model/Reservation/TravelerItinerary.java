package model.Reservation;

public class TravelerItinerary {
	
	private int travelerItineraryId;
	private int reservationId;
	private int pasengerId;
	private int flightId;
	private String seatNumber;
	private Boolean isActive;
	private int travelerItineraryStatusId;
	private boolean checkedInFlag;
	private boolean boardedFlag;
	private String boardedNumber;
	
	

	public TravelerItinerary() {
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
