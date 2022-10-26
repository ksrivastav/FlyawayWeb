package serviceDAO.hibernate.Flight;

import java.util.ArrayList;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.AirportConverter;
import helper.AirportList;
import model.Flight.Airport;
import serviceDAO.Entity.Flight.AirportEntity;

public class AirportDAO {

	private HibernateTemplate hibTemplate;

	public AirportDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	/*
	 * public int createDocumentType(DocumentType doc) { int id=0;
	 * 
	 * try { Session session = hibTemplate.getSessionFactory().openSession();
	 * DocumentTypeEntity docEntity =
	 * DocumentTypeConverter.convertModelToEntity(doc); session.beginTransaction();
	 * id= (int)session.save(docEntity); session.getTransaction().commit(); return
	 * id;
	 * 
	 * }
	 * 
	 * catch(Exception e) { System.out.println("Passenger creation failed:" +
	 * e.getMessage()); return id; }
	 * 
	 * }
	 */
	
	@SuppressWarnings("unchecked")
	public void getAirportList()
	{
		
		Session session = hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("From AirportEntity order by cityid asc");
		ArrayList<AirportEntity>  airportEntityList = (ArrayList<AirportEntity>) query.getResultList();
		ArrayList<Airport>  airporList = new ArrayList<Airport>();
		airportEntityList.forEach(airportEntity -> {			
			 airporList.add((AirportConverter.convertEntityToModel(airportEntity)));
			
		});
		
		AirportList.setAirportArrayList(airporList);
	
	}
	
	@SuppressWarnings("unchecked")
	public void getAirportHashMap()
	{
		
		Session session = hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("From AirportEntity");
		ArrayList<AirportEntity>  airportEntityList = (ArrayList<AirportEntity>) query.getResultList();
		HashMap<Integer, Airport> airportHashMap  = new HashMap<Integer, Airport>();
		airportEntityList.forEach(airportEntity -> {			
			airportHashMap.put(airportEntity.getAirportId(), AirportConverter.convertEntityToModel(airportEntity));
			
		});
		
		AirportList.setAirportHashMap(airportHashMap);
	
	}
	
	
	

}
