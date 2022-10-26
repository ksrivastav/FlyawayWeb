package services.Flight;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Flight.Airport;
import serviceDAO.hibernate.Flight.AirportDAO;

public class AirportService {
	
	private ApplicationContext appContext;

	public AirportService () {

	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("FlightBeans.xml");
	}

	public void getAirports() {
		
		try {
			
			setAppContext();
			AirportDAO airportDAO = new AirportDAO();
			airportDAO = (AirportDAO) this.appContext.getBean("AirportDAO");
			airportDAO.getAirportList();			
		}
		
		catch(Exception e )
		{
			System.out.println("AirportLoading ; Failed" + e.getMessage());
		}
		
	}
		
	public void getAirportHashMap() {
			
			try {
				
				setAppContext();
				AirportDAO airportDAO = new AirportDAO();
				airportDAO = (AirportDAO) this.appContext.getBean("AirportDAO");
				airportDAO.getAirportHashMap();			
			}
			
			catch(Exception e )
			{
				System.out.println("AirportLoading ; Failed" + e.getMessage());
			}
			
		}
		

}
