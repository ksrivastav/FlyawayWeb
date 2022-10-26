package serviceDAO.Entity.Reservation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookingStatus")
public class BookingStatusEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BookingStatusId")
	private int bookingStatusId;
	
	@Column(name="BookingStatusCode")
	private String bookingStatusCode;
	
	@Column(name="BookingStatusDesc")
	private String bookingStatusDesc;
	
	
	public BookingStatusEntity() {
		// TODO Auto-generated constructor stub
		
	}


	public int getBookingStatusId() {
		return bookingStatusId;
	}


	public void setBookingStatusId(int bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}


	public String getBookingStatusCode() {
		return bookingStatusCode;
	}


	public void setBookingStatusCode(String bookingStatusCode) {
		this.bookingStatusCode = bookingStatusCode;
	}


	public String getBookingStatusDesc() {
		return bookingStatusDesc;
	}


	public void setBookingStatusDesc(String bookingStatusDesc) {
		this.bookingStatusDesc = bookingStatusDesc;
	}


	@Override
	public String toString() {
		return "BookingStatus [bookingStatusId=" + bookingStatusId + ", bookingStatusCode=" + bookingStatusCode
				+ ", bookingStatusDesc=" + bookingStatusDesc + "]";
	}
	
	

}
