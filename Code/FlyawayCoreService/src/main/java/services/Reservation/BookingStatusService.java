package services.Reservation;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import model.Reservation.BookingStatus;
import serviceDAO.hibernate.Reservation.BookingStatusDAO;

public class BookingStatusService {

	private ApplicationContext appContext ;
	
	
	
	public BookingStatusService() {
		
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	

	
	public ArrayList<BookingStatus> getBookingStatus()
	{
		setAppContext() ;
		BookingStatusDAO bookingStatusDAO = (BookingStatusDAO) this.appContext.getBean("BookingStatusDAO");
		ArrayList<BookingStatus> bookingStatusList =  bookingStatusDAO.getBookingStatus(); 
		return bookingStatusList;
	}
	
}
