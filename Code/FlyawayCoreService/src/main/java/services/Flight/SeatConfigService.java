package services.Flight;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Flight.Flight;
import model.Flight.SeatConfig;
import serviceDAO.hibernate.Flight.FlightDAO;
import serviceDAO.hibernate.Flight.SeatConfigDAO;

public class SeatConfigService {
	
	private ApplicationContext appContext;

	public SeatConfigService() {

	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}

	public ArrayList<SeatConfig> getSeatConfigs() {
		setAppContext();
		SeatConfigDAO SeatConfigDAO = new SeatConfigDAO();
		SeatConfigDAO = (SeatConfigDAO) this.appContext.getBean("SeatConfigDAO");
		ArrayList<SeatConfig> SeatConfigList = SeatConfigDAO.getSeatConfigList();
		return  SeatConfigList;

	}
	
	public int createSeatConfig(SeatConfig seatConfig)
	{
		int id=0;
		
		try
		{
			setAppContext();
			SeatConfigDAO seatConfigDAO = (SeatConfigDAO) this.appContext.getBean("SeatConfigDAO");
			id = (int)seatConfigDAO.createSeatConfig(seatConfig);			
			return id;
		}
		catch(Exception e)
		{
			System.out.println("Seat Config creatrion failed : "+ e.getMessage());
			return id;
		}
	}
	
	
	

}
