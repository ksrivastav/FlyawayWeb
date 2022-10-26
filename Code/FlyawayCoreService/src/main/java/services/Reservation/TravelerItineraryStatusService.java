package services.Reservation;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Reservation.TravelerItineraryStatus;
import serviceDAO.hibernate.Reservation.TravelerItineraryStatusDAO;

public class TravelerItineraryStatusService {
	
	private ApplicationContext appContext ;
	
	
	
	public TravelerItineraryStatusService() {
		
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	

	
	public ArrayList<TravelerItineraryStatus> getTravelerItineraryStatus()
	{
		setAppContext() ;
		TravelerItineraryStatusDAO travelerItineraryStatusDAO = (TravelerItineraryStatusDAO) this.appContext.getBean("TravelerItineraryStatusDAO");
		 ArrayList<TravelerItineraryStatus> travelerItineraryStatusList =  travelerItineraryStatusDAO.getTravelerItineraryStatus(); 
		 return travelerItineraryStatusList;
	}
	
}
