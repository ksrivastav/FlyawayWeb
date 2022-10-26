package helper;

import java.util.ArrayList;
import java.util.HashMap;

import model.Flight.Route;


public class RouteList {

private static HashMap<String, Route> RouteList = new HashMap<String, Route>();
public static void setRouteList(HashMap<String, Route> routeList) {
	RouteList = routeList;
}

private static ArrayList<Route> RouteArrayList;
	
	public static HashMap<String, Route> getRouteList() {
		return RouteList;
	}

	public static void addRoute(Route route ) {
		RouteList.put(Integer.toString(route.getdepAirportId()) + Integer.toString(route.getarrAirportId()), route);
		//routeArrayList.add(route);
	}
	
	public static ArrayList<Route> getRouteArrayList()
	{
		 return RouteArrayList;
	}
	
	
	public static void setRouteArrayList(ArrayList<Route> routeArrayList) {
		RouteArrayList = routeArrayList;
	}

	public static Route getRoute(String RouteCode)
	{
		 return RouteList.get(RouteCode);
	}
	
	public static int getRouteCodeId(String RouteCode)
	{
		int RouteCodeid;
		
		Route Route = RouteList.get(RouteCode);
		
		RouteCodeid = Route.getrouteId();
		return RouteCodeid;
	}
	
	public RouteList() {
		// TODO Auto-generated constructor stub
	}
	
	

}
