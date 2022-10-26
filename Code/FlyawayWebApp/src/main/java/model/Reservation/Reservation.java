package model.Reservation;

import java.time.LocalDateTime;

public class Reservation {
	
	private int reservationId;		
	private int memberAccountId;
	private int bookingStatusId;
	private LocalDateTime bookingCreationDateTime;
	private LocalDateTime bookingUpdateDateTime;


	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}



	public int getMemberAccountId() {
		return memberAccountId;
	}

	public void setMemberAccountId(int memberAccountId) {
		this.memberAccountId = memberAccountId;
	}

	public int getBookingStatusId() {
		return bookingStatusId;
	}

	public void setBookingStatusId(int bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}

	public LocalDateTime getBookingCreationDateTime() {
		return bookingCreationDateTime;
	}

	public void setBookingCreationDateTime(LocalDateTime bookingCreationDateTime) {
		this.bookingCreationDateTime = bookingCreationDateTime;
	}

	public LocalDateTime getBookingUpdateDateTime() {
		return bookingUpdateDateTime;
	}

	public void setBookingUpdateDateTime(LocalDateTime bookingUpdateDateTime) {
		this.bookingUpdateDateTime = bookingUpdateDateTime;
	}


	

}
