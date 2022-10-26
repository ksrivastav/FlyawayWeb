package serviceDAO.hibernate.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.FlightConverter;
import entityModelConverion.FlightMasterDataConverter;
import helper.FlightSearchQuery;
import model.Flight.Flight;
import model.Flight.FlightMasterDataModel;
import serviceDAO.Entity.Flight.FlightEntity;
import serviceDAO.Entity.Flight.FlightMasterData;

public class FlightDAO {

	private HibernateTemplate hibTemplate;

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}
	
	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	
	


	public FlightDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int createFlight(Flight flight)
	{
		int id = 0;
		
		try {
			
			
			FlightEntity FlightEntity = FlightConverter.convertModelToEntity(flight);			
			Session session = hibTemplate.getSessionFactory().openSession();			
			session.beginTransaction();			
			System.out.println(flight.toString());
			id = (int) session.save(FlightEntity);			
			session.getTransaction().commit();			
			return id;
		}
		
		catch(Exception e)
		{
			System.out.println("Member Creation Failed : " + e.getMessage());
			return id;
		}
		
		
	}
	
	
	public Flight getFlightDetails(String flightId)
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();			
		String querryString = "FROM  FlightEntity where FlightId=:flightId ";		
		Query query = session.createQuery(querryString );		
		System.out.println(query.toString());
		query.setParameter("flightId", flightId);
		
		FlightEntity flightEntity = (FlightEntity)query.getSingleResult();
		session.getTransaction().commit();			
		Flight flight = FlightConverter.convertEntityToModel(flightEntity);		
		return flight;
		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<FlightMasterDataModel> flightSearch(FlightSearchQuery flightSearchQuery)
	{
		Session session = hibTemplate.getSessionFactory().openSession();
		session.beginTransaction();		
		String querryString = "FROM FlightMasterData where LocalDepartureDateTime>=: LocalDepartureDateTime and DepAirportId=:DepAirportId and ArrAirportId=:ArrAirportId and SeatRemaining >=:NumberOfPassenger";
		Query query = session.createQuery(querryString);
		query.setParameter("DepAirportId", flightSearchQuery.getDepartureAirportId());
		query.setParameter("ArrAirportId", flightSearchQuery.getArrAirportCodeId());
		query.setParameter("LocalDepartureDateTime", flightSearchQuery.getDepartureDate());
		query.setParameter("NumberOfPassenger", flightSearchQuery.getNumberOfPassneger());
		//query.setParameter("LocalArrivalDateTime", flightSearchQuery.getArrivalDate());
		//query.setParameter("RouteId", flightSearchQuery.getRouteId());
		
		ArrayList<FlightMasterData>  flightMasterDataEntity = (ArrayList<FlightMasterData>)query.getResultList();
		session.getTransaction().commit();	
		ArrayList<FlightMasterDataModel> flightMasterDataList = new ArrayList<FlightMasterDataModel>();	
		
		System.out.println("here it is " +flightMasterDataList.toString());
		flightMasterDataEntity.forEach(flightEntity-> {
			
			flightMasterDataList.add(FlightMasterDataConverter.convertEntityToModel(flightEntity));
			
		});
		
		return flightMasterDataList;
		
		
	}
	
	public ArrayList<FlightMasterDataModel> getAllFlightMasterData()
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();		
		System.out.println("c1");
		String querryString = "FROM  FlightMasterData";
		Query query = session.createQuery(querryString );			
		@SuppressWarnings("unchecked")
		ArrayList<FlightMasterData>  flightMasterDataEntity = (ArrayList<FlightMasterData>)query.getResultList();
		System.out.println("c2");
		ArrayList<FlightMasterDataModel> flightMasterDataList = new ArrayList<FlightMasterDataModel>();
		
		flightMasterDataEntity.forEach(flightEntity-> {
			
			flightMasterDataList.add(FlightMasterDataConverter.convertEntityToModel(flightEntity));
			
		});
		
		return flightMasterDataList;
		
	}
	
	public ArrayList<FlightMasterDataModel> getAllAvailableFlights()
	{
				
		LocalDateTime now = LocalDateTime.now();  
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();	
		String querryString = "FROM  FlightMasterData  where LocalDepartureDateTime>: LocalDepartureDateTime";
		Query query = session.createQuery(querryString);
		query.setParameter("LocalDepartureDateTime",now );				
		@SuppressWarnings("unchecked")
		ArrayList<FlightMasterData>  flightMasterDataEntity = (ArrayList<FlightMasterData>)query.getResultList();
		ArrayList<FlightMasterDataModel> flightMasterDataList = new ArrayList<FlightMasterDataModel>();
		flightMasterDataEntity.forEach(flightEntity-> {
			
			flightMasterDataList.add(FlightMasterDataConverter.convertEntityToModel(flightEntity));
			
		});
		
		return flightMasterDataList;
		
	}
	
	public FlightMasterDataModel getFlightByFlightId(int flightId)
	{
				
		LocalDateTime now = LocalDateTime.now();  
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();	
		String querryString = "FROM  FlightMasterData  where FlightId=: FlightId";
		Query query = session.createQuery(querryString);
		query.setParameter("FlightId",flightId );				
		@SuppressWarnings("unchecked")
		FlightMasterData  flightMasterDataEntity = (FlightMasterData)query.getSingleResult();
		FlightMasterDataModel flightMasterData  = new FlightMasterDataModel();
		flightMasterData  = FlightMasterDataConverter.convertEntityToModel(flightMasterDataEntity);
		return flightMasterData ;
		
	}

	

}
