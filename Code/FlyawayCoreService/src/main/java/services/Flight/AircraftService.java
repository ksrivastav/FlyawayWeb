package services.Flight;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helper.AircraftList;
import model.Flight.Aircraft;
import serviceDAO.hibernate.Flight.AircraftDAO;

public class AircraftService {

	private ApplicationContext appContext;

	public AircraftService() {

	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("FlightBeans.xml");
	}

	public ArrayList<Aircraft> getAircraftList() {
		setAppContext();
		AircraftDAO aircraftDAO = new AircraftDAO();
		aircraftDAO = (AircraftDAO) this.appContext.getBean("AircraftDAO");
		ArrayList<Aircraft> aircraftList = aircraftDAO.getAircraftList();
		AircraftList.setAircraftList(aircraftList);
		return aircraftList;

	}

}
