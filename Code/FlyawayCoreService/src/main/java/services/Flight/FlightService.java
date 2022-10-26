package services.Flight;



import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helper.AirportList;
import helper.FlightSearchQuery;
import helper.RouteList;
import model.Flight.Airport;
import model.Flight.Flight;
import model.Flight.FlightMasterDataModel;
import model.Flight.Route;
import serviceDAO.hibernate.Flight.AirportDAO;
import serviceDAO.hibernate.Flight.FlightDAO;
import serviceDAO.hibernate.Flight.RouteDAO;


public class FlightService {
	
	private ApplicationContext appContext;

	public FlightService() {

	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("FlightBeans.xml");
	}
	
	public int createFlight(Flight flight)
	{
		int id=0;
		
		try
		{
			setAppContext();
			FlightDAO flightDAO = (FlightDAO) this.appContext.getBean("FlightDAO");
			id = (int)flightDAO.createFlight(flight);			
			return id;
		}
		catch(Exception e)
		{
			System.out.println("Flight creatrion failed : "+ e.getMessage());
			return id;
		}
	}
	
	public Flight getFlightDetails(String flightId)
	{
		setAppContext();
		FlightDAO flightDAO = (FlightDAO) this.appContext.getBean("FlightDAO");
		Flight flight = flightDAO.getFlightDetails(flightId);		
		return flight;
	
	}
	
	public  ArrayList<FlightMasterDataModel> getFlightSearch(FlightSearchQuery flightSearchQuery)
	{
		
		setAppContext();
		
		//set AirportList
		
		
		FlightDAO flightDAO = (FlightDAO) this.appContext.getBean("FlightDAO");
		 ArrayList<FlightMasterDataModel> flightList = flightDAO.flightSearch(flightSearchQuery);		
		return flightList;
	
	}
	
	public ArrayList<FlightMasterDataModel> getAllFlightsMasterData()
	{
		
		setAppContext();
		
		FlightDAO flightDAO = (FlightDAO) this.appContext.getBean("FlightDAO");
		ArrayList<FlightMasterDataModel> flightMasterDataList = flightDAO.getAllFlightMasterData();
		  
		return flightMasterDataList;
		
		
	}
	
	public ArrayList<FlightMasterDataModel> getAllAvailableFlights()
	{
		
		setAppContext();
		
		FlightDAO flightDAO = (FlightDAO) this.appContext.getBean("FlightDAO");
		ArrayList<FlightMasterDataModel> flightMasterDataList = flightDAO.getAllAvailableFlights();
		  
		return flightMasterDataList;
		
		
	}
	
	public FlightMasterDataModel getFlightByFlightId(int flightId)
	{
		
		setAppContext();
		
		FlightDAO flightDAO = (FlightDAO) this.appContext.getBean("FlightDAO");
		FlightMasterDataModel flightMasterData = flightDAO.getFlightByFlightId(flightId);
		  
		return flightMasterData;
		
		
	}

}
