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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import jsonModelConverion.JSONConverter;
import model.Flight.Airport;
import model.Flight.FlightMasterData;
import model.Flight.NewFlight;
import model.Member.MemberAccount;
import model.Member.MemberAccountString;
import model.Member.Passenger;
import model.Member.Passenger2;

@Controller
public class BookingController {

	public BookingController() {
		// TODO Auto-generated constructor stub
	}
	

	@RequestMapping(value="/bookFlightPage", method=RequestMethod.GET)
	public String bookFlight(HttpServletRequest request, HttpServletResponse response, Model model)
	{
		
		return "BookingFlightSearchPage";  //suffix will be automatically added to it
	}
	
	
	
	@RequestMapping(value="/searchFlight", method=RequestMethod.GET)
	public String searchFlight(HttpServletRequest request, HttpServletResponse response, Model model)
	{
		
		String depAirportId = request.getParameter("depAirportId");		
		String depDate = request.getParameter("depDate");
		String arrAirportid = request.getParameter("arrAirportId");
		String numOfPassenger = request.getParameter("numOfPassenger");
		
		System.out.println("arrAirportid "+ arrAirportid );
		
		
		RestTemplate restTemplate =  new RestTemplate();		 	
		ArrayList<FlightMasterData> flightMasterDataList = new ArrayList<FlightMasterData>();		
		String restServicePath = "http://localhost:1234/FlyawayCoreService/fly/flight/flightsearch/depAirportCodeId=" + depAirportId + "&arrAirportCodeId=" + arrAirportid + "&departureDate=" + depDate + "&numberOfPassenger="+ numOfPassenger;
		System.out.println(restServicePath);
		String flightMasterDataText = restTemplate.getForObject(restServicePath, String.class);
		System.out.println(" flightText->" +  flightMasterDataText);	
		
		JSONArray flightMasterDataJsonArray =  new  JSONArray(flightMasterDataText);
		flightMasterDataJsonArray.forEach(flightMasterDataJSONObject-> {
			flightMasterDataList.add(new Gson().fromJson(flightMasterDataJSONObject.toString(), FlightMasterData.class));
			
		});
			
		model.addAttribute("allAvailableFlightsData",flightMasterDataList);
		model.addAttribute("numOfPassenger", numOfPassenger);
		
		 
		
		return "BookingFlightSearchPage";  //suffix will be automatically added to it
	}
	
	
	
	 @ModelAttribute("allAvailableFlightsData")
		private ArrayList<FlightMasterData>  getFlightMasterDataList(Model model)
		{
			//Get list of Routes
		 	RestTemplate restTemplate =  new RestTemplate();		 	
			ArrayList<FlightMasterData> flightMasterDataList = new ArrayList<FlightMasterData>();
			String restServicePath = "http://localhost:1234/FlyawayCoreService/fly/flight/getAllAvailableFlights";
			String flightMasterDataText = restTemplate.getForObject(restServicePath, String.class);
			System.out.println(" flightText->" +  flightMasterDataText);	
			
			JSONArray flightMasterDataJsonArray =  new  JSONArray(flightMasterDataText);
			flightMasterDataJsonArray.forEach(flightMasterDataJSONObject-> {
				flightMasterDataList.add(new Gson().fromJson(flightMasterDataJSONObject.toString(), FlightMasterData.class));
				
			});
				
			model.addAttribute("allAvailableFlightsData",flightMasterDataList);
			
			return  flightMasterDataList ;
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
	 
	 @RequestMapping(value="/createReservation", method=RequestMethod.POST)
		public String createReservation(HttpServletRequest request, HttpServletResponse response, Model model)
		{
			model.addAttribute("numOfPassenger", 2);
			
			String prefix= request.getParameter("prefix");
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String age = request.getParameter("age");
			String gender= request.getParameter("gender");		
			
			RestTemplate restTemplate =  new RestTemplate();	
			
			HttpSession session = request.getSession(false);
			String curemail = session.getAttribute("currentMemberAccountEmail").toString();	
			FlightMasterData flightData = (FlightMasterData)session.getAttribute("selectedFlight");
			model.addAttribute("BookedFlightData", flightData);
			
			String restServicePath = "http://localhost:1234/FlyawayCoreService/fly/booking/createBooking/email=" + curemail  + "&flightId=" + flightData.getFlightId() ;
			System.out.println("restServicePath -> "  + restServicePath );
			String reservationId = restTemplate.getForObject(restServicePath, String.class);
			model.addAttribute("BookingNumber", reservationId);
			
			System.out.println("here -> " + reservationId );
			
			restServicePath = "http://localhost:1234/FlyawayCoreService/fly/member/getMemberAccountDetails/email=" + curemail;
			System.out.println("restServicePath -> "  + restServicePath );
			String MemberAccountDetails  = restTemplate.getForObject(restServicePath, String.class);				
			MemberAccountString memAccount = new Gson().fromJson(MemberAccountDetails, MemberAccountString.class);	
			model.addAttribute("BookingMemberAccountDetails", memAccount);
			System.out.println("herebok -> " +  memAccount.toString()  );
			
			if(reservationId.equals(0))
			{
				model.addAttribute("BookingCreationMessage", "Booking Creation Failed");			
				
			}
			else
			{
				restServicePath = "http://localhost:1234/FlyawayCoreService/fly/member/insertPassenger/memberAccountId=" + memAccount.getMemberAccountId()+ "&flightId=" + flightData.getFlightId() + "&prefix=" + prefix + "&firstName=" +firstName + "&lastName="+ lastName + "&age=" + age + "&gender=" + gender+ "&reservationId=" + reservationId;		
				System.out.println("restServicePath -> "  + restServicePath );
				String passengerId  = restTemplate.getForObject(restServicePath, String.class);
				System.out.println("herep -> " + passengerId  );
				if(passengerId.equals(0))
				{
					model.addAttribute("BookingCreationMessage", "Booking Creation Failed");
				}
				else
				{
					model.addAttribute("BookingCreationMessage", "Booking Creation Successfull");
					
					
					
					
					
					restServicePath = "http://localhost:1234/FlyawayCoreService/fly/member/getPassengersByBooking/reservationId=" + reservationId ;
					System.out.println("restServicePath -> "  + restServicePath );
					String PassengerDetails  = restTemplate.getForObject(restServicePath, String.class);
					System.out.println("herebokpas -> " +   PassengerDetails  );
					ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
					JSONArray passengerJsonArray =  new  JSONArray(PassengerDetails);
					passengerJsonArray.forEach(passengerJSONObject-> {
						passengerList.add(new Gson().fromJson(passengerJSONObject.toString(), Passenger.class));
						
					});
					
					System.out.println("herebokpas -> " +   passengerList.toString()  );
					
					model.addAttribute("BookingPassengerList" , passengerList);
					
					
					
					System.out.println("opop - > " + flightData.toString());
					model.addAttribute("selectedAvailableFlightsData" , flightData);
					
				
					
					 
				}
				
			}
			return "BookingFlightDetailPage";  //suffix will be automatically added to it
		}
		


}
