package services.Reservation;

import java.util.ArrayList;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Reservation.Reservation;
import serviceDAO.hibernate.Reservation.ReservationDAO;

public class ReservationService {

	private ApplicationContext appContext ;
	
	public ReservationService() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("ReservationBeans.xml");
	}
	
	
	public int createReservation(Reservation reservation)
	{
		int id=0;
		
		try
		{
			setAppContext();
			ReservationDAO resDAO = (ReservationDAO) this.appContext.getBean("ReservationDAO");
			id = (int)resDAO.createReservation(reservation);			
			return id;
		}
		catch(Exception e)
		{
			System.out.println("Reservation creatrion failed : "+ e.getMessage());
			return id;
		}
	}
	
	public ArrayList<Reservation> getReservation(String memberAccountId)
	{
		setAppContext();
		ReservationDAO resDAO = (ReservationDAO) this.appContext.getBean("ReservationDAO");
		ArrayList<Reservation> resList = resDAO.getReservation(memberAccountId);		
		return resList;
	}
	
	public Reservation getReservationByBookingReference(String bookingReference)
	{
		
		setAppContext();
		ReservationDAO resDAO = (ReservationDAO) this.appContext.getBean("ReservationDAO");
		Reservation reservation = resDAO.getReservationByBookingReference(bookingReference);
		return reservation;
	}

	

}
