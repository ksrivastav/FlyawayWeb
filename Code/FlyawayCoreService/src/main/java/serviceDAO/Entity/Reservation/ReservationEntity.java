package serviceDAO.Entity.Reservation;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class ReservationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ReservationId")
	private int reservationId;	
	

	
	@Column(name="MemberAccountId")
	private int memberAccountId;
	
	@Column(name="BookingStatusId")
	private int bookingStatusId;
	
	@Column(name="BookingCreationDateTime")
	private LocalDateTime bookingCreationDateTime;
	
	@Column(name="BookingUpdateDateTime")
	private LocalDateTime bookingUpdateDateTime;
	


	public ReservationEntity() {
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



	@Override
	public String toString() {
		return "ReservationEntity [reservationId=" + reservationId + ", memberAccountId=" + memberAccountId
				+ ", bookingStatusId=" + bookingStatusId + ", bookingCreationDateTime=" + bookingCreationDateTime
				+ ", bookingUpdateDateTime=" + bookingUpdateDateTime + "]";
	}
	
	
	



	

}
