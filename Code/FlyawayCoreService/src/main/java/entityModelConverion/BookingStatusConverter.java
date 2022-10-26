package entityModelConverion;

import model.Reservation.BookingStatus;
import serviceDAO.Entity.Reservation.BookingStatusEntity;

public class BookingStatusConverter {

	
	public static  BookingStatus convertEntityToModel (BookingStatusEntity bookingStatusEntity)
	{
				
		BookingStatus bookingStatusModel = new BookingStatus();
		bookingStatusModel.setBookingStatusCode(bookingStatusEntity.getBookingStatusCode());
		bookingStatusModel.setBookingStatusDesc(bookingStatusEntity.getBookingStatusDesc());
		bookingStatusModel.setBookingStatusId(bookingStatusEntity.getBookingStatusId());
		return bookingStatusModel;
		
		
	}
	
	public static  BookingStatusEntity convertModelToEntity ( BookingStatus bookingStatusModel)
	{
				
		BookingStatusEntity bookingStatusEntity = new BookingStatusEntity();
		bookingStatusEntity.setBookingStatusCode(bookingStatusModel.getBookingStatusCode());
		bookingStatusEntity.setBookingStatusDesc(bookingStatusModel.getBookingStatusDesc());
		bookingStatusEntity.setBookingStatusId(bookingStatusModel.getBookingStatusId());
		return bookingStatusEntity;
		
		
	}



}
