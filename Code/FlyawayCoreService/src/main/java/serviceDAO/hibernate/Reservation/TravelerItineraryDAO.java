package serviceDAO.hibernate.Reservation;


import entityModelConverion.TravelerItineraryConverter;
import java.util.ArrayList;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import model.Reservation.TravelerItinerary;
import serviceDAO.Entity.Reservation.TravelerItineraryEntity;

public class TravelerItineraryDAO {
	
	
	
	private HibernateTemplate hibTemplate;
	
	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	public TravelerItineraryDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int createTravelerItinerary(TravelerItinerary travelerItinerary)
	{
		int id=0;
		
		try
		{
			Session session = this.hibTemplate.getSessionFactory().openSession();
			session.beginTransaction();
			id = (int) session.save(travelerItinerary);
			return id;
			
		}
		catch(Exception e)
		{
			System.out.println("Traveler Itinerary creatrion failed : "+ e.getMessage());
			return id;
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<TravelerItinerary> getTravelerItinerary(String reservationId)
	{
		
		Session session = this.hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("from TravelerItineraryEntity where ReservationId : = reservationId");
		query.setParameter(reservationId, Integer.parseInt(reservationId));
		
		ArrayList<TravelerItineraryEntity> travelerItineraryEntityList = (ArrayList<TravelerItineraryEntity>)query.getResultList();
		ArrayList<TravelerItinerary> travelerItineraryList = new ArrayList<TravelerItinerary>();
		
		travelerItineraryEntityList.forEach((ti)-> {
			travelerItineraryList.add(TravelerItineraryConverter.convertEntityToModel(ti));
		});
		return travelerItineraryList;
	}
	
	/*
	 * public TravelerItinerary getTravelerItinerary(String reservationId) {
	 * 
	 * Session session = this.hibTemplate.getSessionFactory().openSession(); Query
	 * query = session.
	 * createQuery("from ReservationEntity where BookingNumber : = bookingReference"
	 * ); query.setParameter(bookingReference, bookingReference);
	 * 
	 * TravelerItineraryEntity travelerItineraryEntity =
	 * (TravelerItineraryEntity)query.getSingleResult(); return
	 * TravelerItineraryConverter.convertEntityToModel(travelerItineraryEntity); }
	 */

}
