package serviceDAO.hibernate.Reservation;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.BookingStatusConverter;
import model.Reservation.BookingStatus;
import serviceDAO.Entity.Reservation.BookingStatusEntity;

public class BookingStatusDAO {

	private HibernateTemplate hibTemplate;
	
	

	public BookingStatusDAO() {
		
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<BookingStatus> getBookingStatus()
	{
		Session session = this.hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("FROM BookingStatusEntity");
		ArrayList<BookingStatusEntity> bookingStatusEntityList = (ArrayList<BookingStatusEntity>) query.getResultList();
		ArrayList<BookingStatus> bookingStatusList= new ArrayList<BookingStatus>() ;
		
		bookingStatusEntityList.forEach(bookingStatus -> {
			
			bookingStatusList.add(BookingStatusConverter.convertEntityToModel(bookingStatus));
			
		});
		 
		 return bookingStatusList;
	}
	
}
