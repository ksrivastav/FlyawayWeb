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
import model.Member.MemberAccount;
import model.Reservation.Reservation;
import services.Flight.AircraftService;
import services.Flight.AirportService;
import services.Flight.FlightService;
import services.Flight.RouteService;
import services.MasterData.CityService;
import services.MasterData.CountryService;
import services.Member.MemberAccountService;
import services.Reservation.ReservationService;


@Path("/booking")
public class BookingRequestHandler {

	public BookingRequestHandler() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@GET
	@Path("/getBooking/email={email}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMemberAccount()
	{
		MemberAccount member= new MemberAccount();
		member.setEmail("kart.mcr@gmail.com");
		member.setFirstName("kartik");
		member.setLastName("srivastav");
		member.setAccountStatusId(1);
		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		member.setAccountCreationDateTime(now);
		return member.toString();
	}
	
	
	@GET
	@Path("/createBooking/email={email}&flightId={flightId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String createBooking(@PathParam("email") String email , @PathParam("flightId") int flightId)
	{
		int id=0;
		MemberAccountService memberService = new MemberAccountService();		
		MemberAccount memberAccount = memberService.getMemberAccount(email);
		
		FlightMasterDataModel flightData= new FlightMasterDataModel();
		FlightService flightService = new FlightService();
		flightData = flightService.getFlightByFlightId(flightId);
		//return memberAccount.toString();
		
		Reservation reservation = new Reservation();
		reservation.setMemberAccountId(memberAccount.getMemberAccountId());
		reservation.setBookingStatusId(1);
		LocalDateTime now = LocalDateTime.now();  
		reservation.setBookingCreationDateTime(now);
		
		ReservationService resService = new ReservationService();
		id =resService.createReservation(reservation);
		
		return Integer.toString(id);
		
		
		
		
	}
	
	
	
	
	
	
	

}
