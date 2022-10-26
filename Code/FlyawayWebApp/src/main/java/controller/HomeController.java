package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
public class HomeController {

	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showHome()
	{
		String restServicePath="http://localhost:1234/FlyawayCoreService/fly/home/loadMasterData";
		RestTemplate restTemp = new RestTemplate();
		String response=restTemp.getForObject(restServicePath, String.class);
		System.out.println(response);
		return "Home";  //suffix will be automatically added to it
	}
	
	@RequestMapping("/home")
	public void showHome1()
	{
		
		//System.out.println("Home1");  //suffix will be automatically added to it
	}

}
