package serviceDAO.hibernate.Reservation;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.TravelerItineraryStatusConverter;
import model.Reservation.TravelerItineraryStatus;
import serviceDAO.Entity.Reservation.TravelerItineraryEntity;
import serviceDAO.Entity.Reservation.TravelerItineraryStatusEntity;

public class TravelerItineraryStatusDAO {
	
	private HibernateTemplate hibTemplate;
	
	
	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}


	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}


	@SuppressWarnings("unchecked")
	public ArrayList<TravelerItineraryStatus> getTravelerItineraryStatus()
	{
		Session session = this.hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("FROM TravelerItineraryStatusEntity");
		ArrayList<TravelerItineraryStatusEntity> travelerItineraryStatusEntityList =(ArrayList<TravelerItineraryStatusEntity>) query.getResultList();
		ArrayList<TravelerItineraryStatus> travelerItineraryStatusList = new ArrayList<TravelerItineraryStatus>();  
		travelerItineraryStatusEntityList.forEach(travelerItineraryStatusEntity-> {
			
			travelerItineraryStatusList.add(TravelerItineraryStatusConverter.convertEntityToModel(travelerItineraryStatusEntity));
			
		});
		 return travelerItineraryStatusList;
	}
	
}
