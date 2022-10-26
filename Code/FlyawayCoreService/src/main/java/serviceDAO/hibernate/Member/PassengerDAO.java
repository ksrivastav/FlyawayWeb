package serviceDAO.hibernate.Member;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.DocumentTypeConverter;
import entityModelConverion.MemberAccountContactDetailConverter;
import entityModelConverion.PassengerConverter;
import model.Member.MemberAccountContactDetail;
import model.Member.Passenger;
import serviceDAO.Entity.Member.MemberAccountContactDetailEntity;
import serviceDAO.Entity.Member.PassengerEntity;

public class PassengerDAO {
	
	private HibernateTemplate hibTemplate;

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	public PassengerDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int createPassenger(Passenger passenger)
	{
		int id=0;
		
		try
		{
			Session session = hibTemplate.getSessionFactory().openSession();
			PassengerEntity passEntity = PassengerConverter.convertModelToEntity(passenger);
			session.beginTransaction();
			id= (int)session.save(passEntity);
			session.getTransaction().commit();
			return id;
			
		}
		
		catch(Exception e)
		{
			System.out.println("Passenger creation failed:" + e.getMessage());
			return id;
		}
		
		
	}
	
	public Passenger getPassenger(String memberAccountId)
	{
		PassengerEntity passengerEntity = new PassengerEntity();
		Session session = hibTemplate.getSessionFactory().openSession();
		Query querry = session.createQuery(" FROM PassengerEntity where MemberAccountId=: memberAccountId");
		querry.setParameter("memberAccountId", memberAccountId);
		passengerEntity = (PassengerEntity) querry.getSingleResult();
	    Passenger passenger = PassengerConverter.convertEntityTotModel(passengerEntity);			
				
		session.beginTransaction();
		
		return  passenger;
		
	}
	
	public Passenger getPassengerByEmail(String email)
	{
		PassengerEntity passengerEntity = new PassengerEntity();
		Session session = hibTemplate.getSessionFactory().openSession();
		Query querry = session.createQuery(" FROM PassengerEntity where Email=: email");
		querry.setParameter("email", email);
		passengerEntity = (PassengerEntity) querry.getSingleResult();
	    Passenger passenger = PassengerConverter.convertEntityTotModel(passengerEntity);			
				
		session.beginTransaction();
		
		return  passenger;
		
	}
	
	
	public ArrayList<Passenger> getPassengerByBooking(int reservationId)
	{
		ArrayList<PassengerEntity> passengerEntityList = new ArrayList<PassengerEntity>();
		ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
		Session session = hibTemplate.getSessionFactory().openSession();
		session.beginTransaction();	
		Query querry = session.createQuery(" FROM PassengerEntity where ReservationId=: reservationId");
		querry.setParameter("reservationId", reservationId);
		passengerEntityList = (ArrayList<PassengerEntity>) querry.getResultList();
		passengerEntityList.forEach(passengerEntity-> {
			
			 passengerList.add(PassengerConverter.convertEntityTotModel(passengerEntity));
		});
		
		session.getTransaction().commit();			
				
	
		
		return  passengerList;
		
	}
	
	
	
	

}
