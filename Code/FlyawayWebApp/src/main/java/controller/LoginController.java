package controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import model.Flight.Aircraft;
import model.Flight.Airport;
import model.Flight.Route;
import model.MasterData.City;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value="/adminPortal", method=RequestMethod.GET)
	public String adminLoginPage(HttpServletRequest request, HttpServletResponse response) 
	{
		
		return "AdminPortal";
		
	}
	@RequestMapping(value="/adminLogin", method=RequestMethod.GET)
	public String adminLogin(HttpServletRequest request, HttpServletResponse response, Model model) 
	{
		String curEmail=request.getParameter("email");
		String curPassword = request.getParameter("password");
		System.out.println(request.getParameter("email")+ "&password=" + request.getParameter("password"));
		String restServicePath="http://localhost:1234/FlyawayCoreService/fly/member/loginAdmin/email="+ request.getParameter("email")+ "&password=" + request.getParameter("password");
		System.out.println(restServicePath);
		RestTemplate restTemp = new RestTemplate();
		String adminAccountText = restTemp.getForObject(restServicePath, String.class);
		
		System.out.println(adminAccountText);
		
		if(adminAccountText.equals("0"))
		{
			model.addAttribute("loginAdminError", "Login failed. Please try again");
			return "AdminPortal";
		}
		else
		{
			JSONObject obj = new JSONObject(adminAccountText);
			
			String adminName = obj.getString("firstName");	
			
			HttpSession session = request.getSession();
			session.setAttribute("currentMemberAccountEmail", curEmail);
			session.setAttribute("curPassword", curPassword);
			System.out.println(adminName);
			
			System.out.println(response);
			return "AdminDashboard";
			
		}
		
		  //suffix will be automatically added to it
	}
	
		
		
		

	

}
