package serviceDAO.hibernate.Flight;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.AircraftConverter;
import model.Flight.Aircraft;
import serviceDAO.Entity.Flight.AircraftEntity;

public class AircraftDAO {
	
	private HibernateTemplate hibTemplate;

	public AircraftDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Aircraft> getAircraftList()
	{
		
		Session session = hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("From AircraftEntity");
		ArrayList<AircraftEntity>  aircraftEntityList = (ArrayList<AircraftEntity>) query.getResultList();
		ArrayList<Aircraft>  aircraftList = new ArrayList<Aircraft>();
		aircraftEntityList.forEach(airportEntity-> {
			
			aircraftList.add(AircraftConverter.convertEntityToModel(airportEntity));
		});
		
		return  aircraftList;
	}
}
