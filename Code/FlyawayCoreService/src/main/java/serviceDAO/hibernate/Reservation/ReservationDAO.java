package serviceDAO.hibernate.Reservation;

import entityModelConverion.ReservationConverter;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import model.Reservation.Reservation;
import serviceDAO.Entity.Reservation.ReservationEntity;

public class ReservationDAO {
	
	
	
	private HibernateTemplate hibTemplate;
	
	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	public ReservationDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int createReservation(Reservation reservation)
	{
		int id=0;
		
		try
		{
			Session session = this.hibTemplate.getSessionFactory().openSession();
			ReservationEntity resEntity = entityModelConverion.ReservationConverter.convertModelToEntity(reservation);
			session.beginTransaction();
			id = (int)session.save(resEntity);
			return id;
		}
		catch(Exception e)
		{
			System.out.println("Reservation creatrion failed : "+ e.getMessage());
			return id;
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Reservation> getReservation(String memberAccountId)
	{
		
		Session session = this.hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("from ReservationEntity where MemberAccountId : = memberAccountId");
		query.setParameter(memberAccountId, Integer.parseInt(memberAccountId));
		
		ArrayList<ReservationEntity> resEntityList = (ArrayList<ReservationEntity>)query.getResultList();
		ArrayList<Reservation> resList = new ArrayList<Reservation>();
		
		resEntityList.forEach((res)-> {
			resList.add(ReservationConverter.convertEntityToModel(res));
		});
		return resList;
	}
	
	public Reservation getReservationByBookingReference(String bookingReference)
	{
		
		Session session = this.hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("from ReservationEntity where BookingNumber : = bookingReference");
		query.setParameter(bookingReference, bookingReference);
		
		ReservationEntity resEntity = (ReservationEntity)query.getSingleResult();
		return ReservationConverter.convertEntityToModel(resEntity);	
	}

}
