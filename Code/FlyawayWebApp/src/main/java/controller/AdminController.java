package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import model.Flight.Aircraft;
import model.Flight.Airport;
import model.Flight.FlightMasterData;
import model.Flight.NewFlight;
import model.Flight.Route;
import model.Flight.RouteMasterDataModel;
import model.MasterData.City;
import model.Member.AdminAccount;
import model.Member.AdminAccountOutput;

import com.google.gson.Gson;

import jsonModelConverion.JSONConverter;

@Controller
public class AdminController {

	public AdminController() {
		// TODO Auto-generated constructor stub
	}
	
	ModelAndView model;
	@RequestMapping(value="/createAdmin", method=RequestMethod.POST)
	public String createAdmin(HttpServletRequest request, HttpServletResponse response, Model model)
	{
		try
		{
			String restServicePath="http://localhost:1234/FlyawayCoreService/fly/member/newAdmin/email=" + request.getParameter("email") + "&firstName=" + request.getParameter("firstName")+ "&lastName=" + request.getParameter("lastName") + "&password=" + request.getParameter("password");
			System.out.println(restServicePath);
			RestTemplate restTemp = new RestTemplate();
			String responseText=restTemp.getForObject(restServicePath, String.class);
			System.out.println("admin"+ responseText);
			if (responseText.equals("0"))
			{
				model.addAttribute("createAdminError", "Admin creation failed. Please try again");
			} 
			else
			{
				model.addAttribute("createAdminSuccessfull", "Admin created, please login");
			}
			
		}
		catch(Exception e )
		{
			return "AdminPortal";
		}
		return "AdminPortal";  //suffix will be automatically added to it
	}
	
	@RequestMapping(value="/updateAdmin", method=RequestMethod.POST)
	public String updateAdmin(HttpServletRequest request, HttpServletResponse response, Model modelAttr)
	{
		String curEmail= request.getParameter("email");
		try
		{
			
			String restServicePath="http://localhost:1234/FlyawayCoreService/fly/member/updateAdmin/email=" + request.getParameter("email") + "&firstName=" + request.getParameter("firstName")+ "&lastName=" + request.getParameter("lastName") + "&password=" + request.getParameter("password");
			System.out.println(restServicePath);
			RestTemplate restTemp = new RestTemplate();
			String responseText=restTemp.getForObject(restServicePath, String.class);
			System.out.println("admin"+ responseText);
			if (responseText.equals("0"))
			{
				getAdminAccount(modelAttr,curEmail);
				modelAttr.addAttribute("updateAdminError", "Admin update failed. Please try again");
			} 
			else
			{
				getAdminAccount(modelAttr,curEmail);
				modelAttr.addAttribute("updateAdminSuccessfull", "Admin update, please login");
			}
			
		}
		catch(Exception e )
		{
			getAdminAccount(modelAttr,curEmail);
			return "AdminAccountUpdate";
		}
		return "AdminAccountUpdate";  //suffix will be automatically added to it
	}
	
	
	
	@RequestMapping(value="/createFlight", method=RequestMethod.POST)
	public String createFlight(HttpServletRequest request, HttpServletResponse response, Model model){
		int a =1;
		
		NewFlight newFlight = new NewFlight();
		newFlight.setDepAirportCodeId(Integer.parseInt(request.getParameter("depAirport")));
		newFlight.setLocalDepartureDate(request.getParameter("depDate"));
		newFlight.setLocalDepartureTime(request.getParameter("depTime"));
		
		newFlight.setArrAirportCodeId(Integer.parseInt(request.getParameter("arrAirport")));
		newFlight.setLocalArrivalDate(request.getParameter("arrDate"));
		newFlight.setLocalArrivalTime(request.getParameter("arrTime"));
		
		newFlight.setAircraftId(Integer.parseInt(request.getParameter("aircraft")));
		newFlight.setFlightNumber(request.getParameter("flightNumber"));
		
		
		//Call api to create flight
		String restServicePath="http://localhost:1234/FlyawayCoreService/fly/flight/createFlight/" + newFlight.toString();
		System.out.println(restServicePath);
		RestTemplate restTemp = new RestTemplate();
		String responseText=restTemp.getForObject(restServicePath, String.class);	
		System.out.println(responseText);
		System.out.println(newFlight.toString());
		if( responseText.equals(0))
		{
			return "AdminCreateFlight";
			
		}
		else
		{
			return "AdminFlightManagement";
		}
		
		
	}
	
	@RequestMapping(value="/manageFlight", method=RequestMethod.GET)
	public String manageFlight(HttpServletRequest request, HttpServletResponse response, Model model)
	{
		return "AdminFlightManagement";
	}
	
	 @RequestMapping(value="/viewAirports", method=RequestMethod.GET)
		public String viewAirports(HttpServletRequest request, HttpServletResponse response, Model model)
		{
			return "AdminAirportsManagement";
		}
	 
	 @RequestMapping(value="/viewRoutes", method=RequestMethod.GET)
		public String viewRoutes(HttpServletRequest request, HttpServletResponse response, Model model)
		{
			return "AdminRoutesManagement";
		}

	 @RequestMapping(value="/manageAdminAccount", method=RequestMethod.GET)
		public String viewAdmin(HttpServletRequest request, HttpServletResponse response, Model model)
		{
			 HttpSession session = request.getSession(false);
			 String curEmail = session.getAttribute("currentMemberAccountEmail").toString();
			 System.out.println("sesion email->"+  curEmail);
			 getAdminAccount(model,curEmail);
			 
			 return "AdminAccountUpdate";
		}

	
	
	
	
	
	// models attributes
	 @ModelAttribute
		private ArrayList<Route> getRouteList(Model model)
		{
			//Get list of Routes
					ArrayList<Route> routeList = new ArrayList<Route>();
					String restServicePath="http://localhost:1234/FlyawayCoreService/fly/home/getRouteList";
					RestTemplate restTemplate =  new RestTemplate();
					String routeText = restTemplate.getForObject(restServicePath, String.class);
					
					JSONArray routeJsonArray =  new  JSONArray(routeText);
					routeJsonArray.forEach(routeJSONObject-> {
						routeList.add(new Gson().fromJson(routeJSONObject.toString(), Route.class));
						
					});
				
					model.addAttribute("routeList",routeList);
					return routeList;
		}
		 
		 @ModelAttribute
			private ArrayList<Airport> getAirportList(Model model)
			{
				//Get list of Routes
			 	RestTemplate restTemplate =  new RestTemplate();
			 	ArrayList<Airport> airportList = new ArrayList<Airport>();
			 	String restServicePath = "http://localhost:1234/FlyawayCoreService/fly/home/getAirportList";
				String airportText = restTemplate.getForObject(restServicePath, String.class);		
				JSONArray airportJsonArray =  new  JSONArray(airportText);
				airportJsonArray.forEach(airportJSONObject-> {
					airportList.add(new Gson().fromJson(airportJSONObject.toString(), Airport.class));
					
				});
				
				
				model.addAttribute("airportList",airportList);
					return  airportList ;
			}
		 
		 @ModelAttribute("aircraftList")
			private ArrayList<Aircraft>  getAircrafttList(Model model)
			{
				//Get list of Routes
			 	RestTemplate restTemplate =  new RestTemplate();		 	
				ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();
				String restServicePath = "http://localhost:1234/FlyawayCoreService/fly/home/getAircraftList";
				String aircraftText = restTemplate.getForObject(restServicePath, String.class);
				System.out.println(" aircraftText->" +  aircraftText);	
				JSONArray aircraftJsonArray =  new  JSONArray(aircraftText);
				aircraftJsonArray.forEach(aircraftJSONObject-> {
					aircraftList.add(new Gson().fromJson(aircraftJSONObject.toString(), Aircraft.class));
					
				});
				
				model.addAttribute("aircraftList",aircraftList);
				return  aircraftList ;
			}
		 
		 @ModelAttribute
		 private ArrayList<City> getCityList(Model model)
			{
				//Get list of Routes
			 	RestTemplate restTemplate =  new RestTemplate();
			 	ArrayList<City> cityList = new ArrayList<City>();
			 	String restServicePath = "http://localhost:1234/FlyawayCoreService/fly/home/getCityList";
				String cityText = restTemplate.getForObject(restServicePath, String.class);		
				JSONArray cityJsonArray =  new  JSONArray(cityText);
				cityJsonArray.forEach(cityJSONObject-> {
					cityList.add(new Gson().fromJson(cityJSONObject.toString(), City.class));
					
				});
				
				model.addAttribute("cityList",cityList);
					return  cityList ;
			}
		 
		 @ModelAttribute("flightMasterData")
			private ArrayList<FlightMasterData>  getFlightMasterDataList(Model model)
			{
				//Get list of Routes
			 	RestTemplate restTemplate =  new RestTemplate();		 	
				ArrayList<FlightMasterData> flightMasterDataList = new ArrayList<FlightMasterData>();
				String restServicePath = "http://localhost:1234/FlyawayCoreService/fly/flight/getAllFlightMasterData";
				String flightMasterDataText = restTemplate.getForObject(restServicePath, String.class);
				System.out.println(" flightText->" +  flightMasterDataText);	
				
				JSONArray flightMasterDataJsonArray =  new  JSONArray(flightMasterDataText);
				flightMasterDataJsonArray.forEach(flightMasterDataJSONObject-> {
					flightMasterDataList.add(new Gson().fromJson(flightMasterDataJSONObject.toString(), FlightMasterData.class));
					
				});
					
				model.addAttribute("flightMasterData",flightMasterDataList);
				return  flightMasterDataList ;
			}
		 
		 @ModelAttribute
			private ArrayList<RouteMasterDataModel> getRouteMasterDataList(Model model)
			{
				//Get list of Routes
						ArrayList<RouteMasterDataModel> routeMasterDataModelist = new ArrayList<RouteMasterDataModel>();
						String restServicePath="http://localhost:1234/FlyawayCoreService/fly/flight/getAllRouteMasterData";
						RestTemplate restTemplate =  new RestTemplate();
						String routeText = restTemplate.getForObject(restServicePath, String.class);
						
						JSONArray routeJsonArray =  new  JSONArray(routeText);
						routeJsonArray.forEach(routeJSONObject-> {
							routeMasterDataModelist.add(new Gson().fromJson(routeJSONObject.toString(), RouteMasterDataModel.class));
							
						});
						
						
					
						model.addAttribute("routeMasterDataList",routeMasterDataModelist);
						return routeMasterDataModelist;
			}
		 
		 
			private AdminAccountOutput getAdminAccount(Model model, String email)
			{
				//Get list of Routes
						AdminAccountOutput AdminAccount = new AdminAccountOutput();
						String restServicePath="http://localhost:1234/FlyawayCoreService/fly/member/getAdmin/email="+ email;
						
						System.out.println(restServicePath);
						RestTemplate restTemplate =  new RestTemplate();
						String adminAccountText = restTemplate.getForObject(restServicePath, String.class);
						System.out.println(adminAccountText);
						Gson gson= JSONConverter.getGSonObject();						
						AdminAccount= gson.fromJson(adminAccountText, AdminAccountOutput.class);
						
						System.out.println(AdminAccount.toString());
						
					
						model.addAttribute("currAdminAccount",AdminAccount);
						return AdminAccount;
			}
			 
		 
		 
		 
		

	
	
	
	

}
