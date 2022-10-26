package requestHandler;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import helper.AircraftList;
import helper.AirportList;
import helper.CityList;
import helper.CountryList;
import helper.FlightSearchQuery;
import helper.RouteList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jsonModelConverion.JSONConverter;
import model.Flight.Aircraft;
import model.Flight.Airport;
import model.Flight.Flight;
import model.Flight.FlightMasterDataModel;
import model.Flight.Route;
import model.Flight.RouteMasterDataModel;
import model.MasterData.City;
import model.MasterData.Country;
import services.Flight.AircraftService;
import services.Flight.AirportService;
import services.Flight.FlightService;
import services.Flight.RouteService;
import services.MasterData.CityService;
import services.MasterData.CountryService;


@Path("/flight")
public class FlightRequestHandler {

	public FlightRequestHandler() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@GET
	@Path("/getNewdum")
	@Produces(MediaType.TEXT_PLAIN)
	public String getdumm()
	{
		//BUILD ROUTE DATA
		RouteService routeService = new RouteService();
		routeService.getRoutes();		 
		ArrayList<Route> RouteArrayList= RouteList.getRouteArrayList();
		
		
		//BUILD AIRPORT DATA
		AirportService airportService = new AirportService();
		airportService.getAirports();	
		HashMap<Integer, Airport> AirportHashMap =  AirportList.getAirportHashMap();
		

		//BUILD COUNTRY DATA
		CountryService countryService = new CountryService();
		countryService.getCountryList();
		//String countryList =  countryJConv.listToJSON(CountryList.getCountryArrayList()).toString();
		
		
		//BUILD CITY DATA
		CityService cityService = new CityService();
		cityService.getCityList();		 
		//String cityList =  jConv.listToJSON(CityList.getCityArrayList()).toString();
		
		
		//BUILD AIRCRAFT DATA
		AircraftService aircraftService = new AircraftService();
		aircraftService.getAircraftList();		 
		//String aircraftList =  aircraftJConv.listToJSON(AircraftList.getAircraftList()).toString();
		return "aircraftList";
	}
	
	@GET
	@Path("/getNewFlightMasterData")
	@Produces(MediaType.TEXT_PLAIN)
	public String getNewFlightMasterData()
	{

		
		
		//BUILD AIRPORT DATA
		AirportService airportService = new AirportService();
		airportService.getAirports();	
		ArrayList<Airport> AirportArrayList =  AirportList.getAirportArrayList();
		

		//BUILD COUNTRY DATA
		CountryService countryService = new CountryService();
		countryService.getCountryList();
		//String countryList =  countryJConv.listToJSON(CountryList.getCountryArrayList()).toString();
		
		
		//BUILD CITY DATA
		CityService cityService = new CityService();
		cityService.getCityList();		 
		//String cityList =  jConv.listToJSON(CityList.getCityArrayList()).toString();
		
		
		//BUILD AIRCRAFT DATA
		AircraftService aircraftService = new AircraftService();
		aircraftService.getAircraftList();		 
		//String aircraftList =  aircraftJConv.listToJSON(AircraftList.getAircraftList()).toString();
		return "aircraftList";
	}
	
	
	@GET
	@Path("/createFlight/depAirportCodeId={depAirportCodeId}&arrAirportCodeId={arrAirportCodeId}&aircraftId={aircraftId}&flightNumber={flightNumber}&localDepartureDate={localDepartureDate}&localArrivalDate={localArrivalDate}&localDepartureTime={localDepartureTime}&localArrivalTime={localArrivalTime}")
	@Produces(MediaType.TEXT_PLAIN)
	public String  createFlight(@PathParam("depAirportCodeId") int depAirportCodeId, @PathParam("arrAirportCodeId") int arrAirportCodeId,@PathParam("aircraftId") int aircraftId, @PathParam("localDepartureDate") String localDepartureDate,@PathParam("localDepartureTime") String localDepartureTime, @PathParam("localArrivalDate") String localArrivalDate, @PathParam("localArrivalTime") String localArrivalTime, @PathParam("flightNumber") String flightNumber)
	{
		
		Flight flight = new Flight();
		
		flight.setaircraftId(aircraftId);
		flight.setFlightNumber(flightNumber);
		
		RouteService routeService = new RouteService();
		routeService.getRoutes();	
		ArrayList<Route> routeArrayList;		
		routeArrayList = RouteList.getRouteArrayList();
		
		routeArrayList.forEach(route->{
			
		if(route.getdepAirportId()== depAirportCodeId && route.getarrAirportId()== arrAirportCodeId)	
		{
			flight.setRouteId(route.getrouteId());
		}
		else
		{
			flight.setRouteId(0);
		}
		} );
		
		if(flight.getRouteId()==0)
		{
			
			Route route = new Route();
			route.setdepAirportId(depAirportCodeId);
			route.setarrAirportId(arrAirportCodeId);
			int routeId = routeService.createRoute(route);
			flight.setRouteId(routeId);
			
		}
		
		
		String depDateTimeString = localDepartureDate  + " " +  localDepartureTime;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
		LocalDateTime depDateTime = LocalDateTime.parse(depDateTimeString, formatter);		
		String arrDateTimeString =  localArrivalDate + " " + localArrivalTime;		
		LocalDateTime arrDateTime = LocalDateTime.parse(arrDateTimeString, formatter);
		String str = depAirportCodeId +  arrAirportCodeId +  aircraftId + localDepartureDate +  localDepartureTime + localArrivalDate + localArrivalTime;
		flight.setLocalDepartureDateTime(depDateTime);
		flight.setLocalArrivalDateTime(arrDateTime);
		flight.setSeatCapacity(180);
		flight.setSeatRemaining(180);
		flight.setSeatSold(0);
		
		FlightService flightService = new FlightService();
		int flightid = flightService.createFlight(flight);
		
		System.out.println(flightid);
		
		
		
		return Integer.toString(flightid);
	
	}
	
	
	@GET
	@Path("/getAllFlightMasterData")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllFlightMasterData()
	{
		
		FlightService flightService = new FlightService();		
		ArrayList<FlightMasterDataModel> flightMasterData = flightService.getAllFlightsMasterData();
		System.out.println(flightMasterData.toString());
		
		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<FlightMasterDataModel> jConv  = new JSONConverter<FlightMasterDataModel>();
		String flightMasterDataList =  jConv.listToJSON(flightMasterData).toString();
		System.out.println(flightMasterDataList);
		return flightMasterDataList;	

	
	}
	
	@GET
	@Path("/getAllRouteMasterData")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllRouteMasterData()
	{
		RouteService routeService = new RouteService();		
		ArrayList<RouteMasterDataModel> routeMasterData = routeService.getAllRoutesMasterData();
		System.out.println(routeMasterData.toString());
		
		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<RouteMasterDataModel> jConv  = new JSONConverter<RouteMasterDataModel>();
		String routeMasterDataList =  jConv.listToJSON(routeMasterData).toString();
		System.out.println(routeMasterDataList);
		return routeMasterDataList;	
		
		
	
	}
	
	@GET
	@Path("/getAllAvailableFlights")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllAvailableFlights()
	{
		FlightService flightService = new FlightService();		
		ArrayList<FlightMasterDataModel> flightMasterData = flightService.getAllAvailableFlights();
		System.out.println("here-> "+flightMasterData.toString());
		
		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<FlightMasterDataModel> jConv  = new JSONConverter<FlightMasterDataModel>();
		String flightMasterDataList =  jConv.listToJSON(flightMasterData).toString();
		System.out.println(flightMasterDataList);
		return flightMasterDataList;	
	}
	
	
	@GET
	@Path("/flightsearch/depAirportCodeId={depAirportCodeId}&arrAirportCodeId={arrAirportCodeId}&departureDate={departureDate}&numberOfPassenger={numberOfPassenger}")
	@Produces(MediaType.TEXT_PLAIN)
	public  String  getFlightSearch(@PathParam("depAirportCodeId") int depAirportCodeId, @PathParam("arrAirportCodeId") int arrAirportCodeId, @PathParam("departureDate")String departureDate, @PathParam("numberOfPassenger") int numberOfPassenger)
	{
		//@PathParam("returnDate") String returnDate
		departureDate = departureDate + " " + "00:00";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); 
		LocalDateTime depDateTime = LocalDateTime.parse(departureDate, formatter);
		FlightSearchQuery flightSearchQuery = new FlightSearchQuery();
		flightSearchQuery.setDepartureAirportId(depAirportCodeId);
		flightSearchQuery.setArrAirportCodeId(arrAirportCodeId);
		flightSearchQuery.setDepartureDate(depDateTime);
		flightSearchQuery.setNumberOfPassneger(numberOfPassenger);	
		//	System.out.println("Search Flight failed -> " + e.getMessage());
		ArrayList<FlightMasterDataModel> flightMasterData = new ArrayList<FlightMasterDataModel>();
		FlightService flightService = new FlightService();
		flightMasterData = flightService.getFlightSearch(flightSearchQuery);
		
		JSONConverter<FlightMasterDataModel> jConv  = new JSONConverter<FlightMasterDataModel>();
		String flightMasterDataList =  jConv.listToJSON(flightMasterData).toString();
		System.out.println(flightMasterDataList);			
		return   flightMasterDataList;
		
	
	}
	
	
	@GET
	@Path("/getFlightByFlightId/flightId={flightId}")
	@Produces(MediaType.TEXT_PLAIN)
	public  String  getFlightByFlightId(@PathParam("flightId") int flightId)
	{
		//@PathParam("returnDate") String returnDate

	
			
		//	System.out.println("Search Flight failed -> " + e.getMessage());
		FlightMasterDataModel flightMasterData = new FlightMasterDataModel();
		FlightService flightService = new FlightService();
		flightMasterData = flightService.getFlightByFlightId(flightId);
		
		JSONConverter<FlightMasterDataModel> jConv  = new JSONConverter<FlightMasterDataModel>();
		String flightMasterDataRes =  jConv.modelToJSON(flightMasterData).toString();
		System.out.println(flightMasterDataRes);			
		return   flightMasterDataRes;
		
	
	}
	
	
	
	
	
	
	

}
