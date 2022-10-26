package services.Flight;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Flight.FlightMasterDataModel;
import model.Flight.Route;
import model.Flight.RouteMasterDataModel;
import serviceDAO.hibernate.Flight.FlightDAO;
import serviceDAO.hibernate.Flight.RouteDAO;

public class RouteService {
	
	private ApplicationContext appContext;

	public RouteService () {

	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("FlightBeans.xml");
	}

	public void getRoutes() {
		
		try {
			
		
		setAppContext();
		RouteDAO routeDAO = new RouteDAO();
		routeDAO = (RouteDAO) this.appContext.getBean("RouteDAO");
		routeDAO.getRouteList();	
		}
		catch(Exception e)
		{
			System.out.println("Error loading Routes" + e.getMessage());
		}

	}
	public int createRoute(Route route)
	{
	
		setAppContext();
		RouteDAO routeDAO = new RouteDAO();
		routeDAO = (RouteDAO) this.appContext.getBean("RouteDAO");
		int id =routeDAO.createRoute(route);
		return id;
		
		
	}
	
	public ArrayList<RouteMasterDataModel> getAllRoutesMasterData()
	{
		
		setAppContext();		
		RouteDAO routeDAO = new RouteDAO();
		routeDAO = (RouteDAO) this.appContext.getBean("RouteDAO");
		ArrayList<RouteMasterDataModel> routeMasterDataList = routeDAO.getAllRouteMasterData();		  
		return routeMasterDataList;	
		
	}
	
	

}
