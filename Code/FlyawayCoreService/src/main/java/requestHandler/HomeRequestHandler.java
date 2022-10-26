package requestHandler;

import helper.AircraftList;
import helper.AirportList;
import helper.CityList;
import helper.CountryList;
import helper.RouteList;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jsonModelConverion.JSONConverter;
import model.Flight.Aircraft;
import model.Flight.Airport;
import model.Flight.Route;
import model.MasterData.City;
import model.MasterData.Country;
import services.Flight.AircraftService;
import services.Flight.AirportService;
import services.Flight.FlightService;
import services.Flight.RouteService;
import services.MasterData.CityService;
import services.MasterData.CountryService;


@Path("/home")
public class HomeRequestHandler {

	public HomeRequestHandler() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Hello");
	}
	
	@GET
	@Path("/start")
	@Produces(MediaType.TEXT_HTML)
	public String home()
	{
		
		AirportService airportService = new AirportService();
		airportService.getAirports();		 
		System.out.println("Airport Loaded" + AirportList.getAirportArrayList().size());
		
		RouteService routeService = new RouteService();
		routeService.getRoutes();
		System.out.println("Route Loaded" + RouteList.getRouteList().size());
		
		
		CountryService countryService = new CountryService();
		countryService.getCountryList();
		System.out.println("Country Loaded" + CountryList.getCountryList().size());
		
		CityService cityService = new CityService();
		cityService.getCityList();
		System.out.println("City Loaded" + CityList.getCityList().size());
			
		
		return "index";
	}
	
	@GET
	@Path("/loadMasterData")
	@Produces(MediaType.TEXT_PLAIN)
	public String loadMasterData()
	{
		AirportService airportService = new AirportService();
		airportService.getAirports();		 
		System.out.println("Airport Loaded" + AirportList.getAirportArrayList().size());
		
		RouteService routeService = new RouteService();
		routeService.getRoutes();
		System.out.println("Route Loaded" + RouteList.getRouteList().size());
		
		
		CountryService countryService = new CountryService();
		countryService.getCountryList();
		System.out.println("Country Loaded" + CountryList.getCountryList().size());
		
		CityService cityService = new CityService();
		cityService.getCityList();
		System.out.println("City Loaded" + CityList.getCityList().size());
			
		
		return Integer.toString(CityList.getCityList().size());

		
	}
	
	@GET
	@Path("/getRouteList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getRouteList()
	{
		
		RouteService routeService = new RouteService();
		routeService.getRoutes();		 
		System.out.println
		("Route Loaded" + RouteList.getRouteList().size());

		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<Route> jConv  = new JSONConverter<Route>();
		String routeList =  jConv.listToJSON(RouteList.getRouteArrayList()).toString();
		System.out.println(routeList);
		return routeList;		
	}
	
	
	
	@GET
	@Path("/getAirportList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAirportArraytList()
	{
	
		CityService cityService = new CityService();
		cityService.getCityHashMap();
		System.out.println("City Loaded" + CityList.getCityList().size());
		
		AirportService airportService = new AirportService();
		airportService.getAirports();		 
		System.out.println("Airport Loaded" + AirportList.getAirportArrayList().size());

		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<Airport> jConv  = new JSONConverter<Airport>();
		String airportList =  jConv.listToJSON(AirportList.getAirportArrayList()).toString();
		System.out.println(airportList);
		return airportList;

		
	}
	
	@GET
	@Path("/getAirportMasterData")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAirportMasterData()
	{
	
		AirportService airportService = new AirportService();
		airportService.getAirports();		 
		System.out.println("Airport Loaded" + AirportList.getAirportArrayList().size());
		
		CountryService countryService = new CountryService();
		countryService.getCountryList();
		System.out.println("Country Loaded" + CountryList.getCountryList().size());
		
		CityService cityService = new CityService();
		cityService.getCityHashMap();
		System.out.println("City Loaded" + CityList.getCityList().size());
		
		
		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<Airport> jConv  = new JSONConverter<Airport>();
		String airportList =  jConv.listToJSON(AirportList.getAirportArrayList()).toString();
		System.out.println(airportList);
		return airportList;

		
	}
	
	
	@GET
	@Path("/getCountryList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCountryArraytList()
	{
	
		CountryService countryService = new CountryService();
		countryService.getCountryList();		 
		System.out.println("Country Loaded" + CountryList.getCountryList().size());

		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<Country> jConv  = new JSONConverter<Country>();
		String countryList =  jConv.listToJSON(CountryList.getCountryArrayList()).toString();
		System.out.println(countryList);
		return countryList;

		
	}
	
	@GET
	@Path("/getCityList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCityArraytList()
	{
	
		CityService cityService = new CityService();
		cityService.getCityList();		 
		System.out.println("City Loaded" + CityList.getCityList().size());

		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<City> jConv  = new JSONConverter<City>();
		String cityList =  jConv.listToJSON(CityList.getCityArrayList()).toString();
		System.out.println(cityList);
		return 	cityList;

		
	}
	
	@GET
	@Path("/getAircraftList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAircraftArraytList()
	{
	
		AircraftService aircraftService = new AircraftService();
		aircraftService.getAircraftList();		 
		System.out.println("Aircraft Loaded" + AircraftList.getAircraftList().size());
		//JSONConverter.modelToJSON(adminAccount).toString()
		JSONConverter<Aircraft> jConv  = new JSONConverter<Aircraft>();
		String aircraftList =  jConv.listToJSON(AircraftList.getAircraftList()).toString();
		System.out.println(aircraftList);
		return 	aircraftList;

		
	}
	
	@GET
	@Path("/getAllFlightList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllFlightList()
	{
		FlightService flightService = new FlightService();
		return "hello";

		
		
		
	}
	

	
	



}
