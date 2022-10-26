package services.Reservation;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Reservation.TravelerItinerary;
import serviceDAO.hibernate.Reservation.TravelerItineraryDAO;

public class TravelerItineraryService {

	private ApplicationContext appContext ;
	
	public TravelerItineraryService() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	
	public int createTravelerItinerary(TravelerItinerary travelerItinerary)
	{
		setAppContext();
		int id=0;
		try {
			TravelerItineraryDAO travelerItineraryDAO = (TravelerItineraryDAO) this.appContext.getBean("TravelerItineraryDAO");
			id = travelerItineraryDAO.createTravelerItinerary(travelerItinerary); 
			return id;
			
		}
		catch(Exception e)
		{
			System.out.println("TravelerItinerary creatrion failed : "+ e.getMessage());
			return id;
		}
	}
	
	public ArrayList<TravelerItinerary> getTravelerItinerary(String reservationId)
	{
		setAppContext();
		
		try {
			TravelerItineraryDAO travelerItineraryDAO = (TravelerItineraryDAO) this.appContext.getBean("TravelerItineraryDAO");
			ArrayList<TravelerItinerary> travelerItineraryList  = travelerItineraryDAO.getTravelerItinerary(reservationId); 
			return travelerItineraryList;
			
		}
		catch(Exception e)
		{
			System.out.println("TravelerItinerary creatrion failed : "+ e.getMessage());
			return null;
			
		}
		
	}

}
