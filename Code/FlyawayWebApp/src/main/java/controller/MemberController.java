package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import model.Flight.Airport;
import model.Flight.FlightMasterData;

@Controller
public class MemberController {

	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/newMemberAccount", method=RequestMethod.GET)
	public String createMemberAccount(HttpServletRequest request, HttpServletResponse response, Model model)
	{
		
		String accountHolderFirstName = request.getParameter("firstName");
		String accountHolderLastName= request.getParameter("lastName");
		String email = request.getParameter("Email");
		String contact = request.getParameter("Contact");	
		String password = request.getParameter("Password");	
		
		String restServicePath="http://localhost:1234/FlyawayCoreService/fly/member/newMemberAccount/firstName=" + accountHolderFirstName + "&lastName=" + accountHolderLastName + "&email=" + email +  "&password="+  password  ;
		System.out.println(restServicePath);
		RestTemplate restTemp = new RestTemplate();
		String responseText =restTemp.getForObject(restServicePath, String.class);		
		System.out.println(response);
		
		if (responseText.equals("0"))
		{
			model.addAttribute("createMemberAccountError", "Member Account creation failed. Please try again");
		} 
		else
		{
			model.addAttribute("createMemberAccountSuccessfull", "Member Account created, please login");
		}
	
		
		return "MemberAccountPage";  //suffix will be automatically added to it
		
	}
	
	@RequestMapping(value="/loginMemberAccount", method=RequestMethod.GET)
	public String loginMemberAccount(HttpServletRequest request, HttpServletResponse response, Model model)
	{
		

		String email = request.getParameter("email");
		String password = request.getParameter("password");	
		
		String restServicePath="http://localhost:1234/FlyawayCoreService/fly/member/loginMemberAccount/email=" + email + "&password="+  password ;
		System.out.println(restServicePath);
		RestTemplate restTemp = new RestTemplate();
		String responseText =restTemp.getForObject(restServicePath, String.class);
		if(responseText.equals("0"))
		{
			model.addAttribute("loginMemberError", "Login failed. Please try again");
			return "MemberAccountPage";
		}
		else
		{
						
			HttpSession session = request.getSession();
			session.setAttribute("currentMemberAccountEmail", email);
			session.setAttribute("curMemberAccountPassword", password);		
			 
			 
			 	FlightMasterData flightData = (FlightMasterData)session.getAttribute("selectedFlight");
			 	System.out.println("here-> " + flightData.toString());
			model.addAttribute("selectedAvailableFlightsData" , flightData);
			return "BookingFlightPassengerDetails";
			
		}
		
		
	}
	@RequestMapping(value="/memberAccountDetails", method=RequestMethod.GET)
	public String memberAccountDetails(HttpServletRequest request, HttpServletResponse response, Model model)
	{
		FlightMasterData flightData = new FlightMasterData();
		flightData.setFlightId(Integer.parseInt(request.getParameter("flightId")));
		flightData.setFlightNumber(request.getParameter("flightNumber"));
		flightData.setLocalDepartureDateTime(request.getParameter("localDepartureDateTime"));
		flightData.setLocalArrivalDateTime(request.getParameter("localArrivalDateTime"));		      						      				
		flightData.setDepAirportName(request.getParameter("depAirportName"));
		flightData.setDepCity(request.getParameter("depCity"));
		flightData.setArrAirportName(request.getParameter("arrAirportName"));
		flightData.setArrCity(request.getParameter("arrCity"));


		HttpSession session = request.getSession();
		session.setAttribute("selectedFlight", flightData);
		
		
		return "MemberAccountPage";
	
	}
	


}
