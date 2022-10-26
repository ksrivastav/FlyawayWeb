package model.Reservation;

public class BookingStatus {

	private int bookingStatusId;
	private String bookingStatusCode;
	private String bookingStatusDesc;
	
	
	public BookingStatus() {
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
