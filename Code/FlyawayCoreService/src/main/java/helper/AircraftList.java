package helper;

import java.util.ArrayList;
import java.util.HashMap;

import model.Flight.Aircraft;


public class AircraftList {

private static ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();
	
	public static ArrayList<Aircraft> getAircraftList() {
		return aircraftList;
	}

	public static void addAircraft(Aircraft aircraft ) {
		aircraftList.add(aircraft);
	}
	
	public static void setAircraftList(ArrayList<Aircraft> aircraftArrayList)
	{
		aircraftList = aircraftArrayList;
		
	}
	

	
	/*
	 * public static Aircraft getAircraft(String AircraftCode) { return
	 * AircraftList.get(AircraftCode);
	 * }
	 */
	
	/*
	 * public static int getAircraftCodeId(String AircraftCode) { int
	 * AircraftCodeid;
	 * 
	 * Aircraft Aircraft = AircraftList.get(AircraftCode);
	 * 
	 * AircraftCodeid = Aircraft.getaircraftId(); return AircraftCodeid; }
	 */
	public AircraftList() {
		// TODO Auto-generated constructor stub
	}
	
	

}
