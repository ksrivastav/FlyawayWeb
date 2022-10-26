package services.Member;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Member.Passenger;
import serviceDAO.hibernate.Member.PassengerDAO;

public class PassengerService {
	
	private ApplicationContext appContext ;
	

	public ApplicationContext getAppContext() {
		return appContext;
	}


	private void setAppContext()
	{
		
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	

	public PassengerService() {
		// TODO Auto-generated constructor stub
	}
	
	public int createPassenger(Passenger passenger)
	{
		setAppContext();			
		PassengerDAO passengerDAO = new PassengerDAO();
		passengerDAO=(PassengerDAO) this.appContext.getBean("PassengerDAO");	
		int id = passengerDAO.createPassenger(passenger);
		return id;
	}
	
	public Passenger getPassenger(String memberAccountId)
	{
		setAppContext();			
		PassengerDAO passengerDAO = new PassengerDAO();
		passengerDAO=(PassengerDAO) this.appContext.getBean("PassengerDAO");	
		Passenger passenger = passengerDAO.getPassenger(memberAccountId);
		return passenger;
	}
	
	public  ArrayList<Passenger> getPassengerByBooking(int reservationId)
	{
		setAppContext();			
		PassengerDAO passengerDAO = new PassengerDAO();
		passengerDAO=(PassengerDAO) this.appContext.getBean("PassengerDAO");	
		ArrayList<Passenger> passenger = passengerDAO.getPassengerByBooking(reservationId);
		return passenger;
	}
	
	
	
	

}
