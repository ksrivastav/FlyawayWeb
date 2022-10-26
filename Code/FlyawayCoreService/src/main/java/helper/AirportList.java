package helper;


import java.util.ArrayList;
import java.util.HashMap;
import model.Flight.*;

public class AirportList {

	private static HashMap<Integer, Airport> AirportHashMap = new HashMap<Integer, Airport>();
	private static ArrayList<Airport> AirportArrayList ;
	
	public static HashMap<Integer, Airport> getAirportHashMap() {
		return AirportHashMap;
	}
	
	
	
	public static void setAirportArrayList(ArrayList<Airport> airportArrayList) {
		AirportArrayList = airportArrayList;
	}



	public static ArrayList<Airport> getAirportArrayList() {
		return AirportArrayList;
	}
	

	public static void setAirportHashMap(HashMap<Integer, Airport> airportList ) {
		AirportHashMap= airportList;
		
	}
	
	public static Airport getAirport(int airportCodeId)
	{
		 return AirportHashMap.get(airportCodeId);
	}
	
	/*
	 * public static int getAirportCodeId(int airportCodeid) { int airportCodeid;
	 * 
	 * Airport airport = AirportHashMap.get(airportCodeId);
	 * 
	 * airportCodeid = airport.getAiportId(); return airportCodeid; }
	 */
	

}
