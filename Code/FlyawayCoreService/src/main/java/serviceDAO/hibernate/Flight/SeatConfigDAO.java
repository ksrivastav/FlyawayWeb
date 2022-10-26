package serviceDAO.hibernate.Flight;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.SeatConfigConverter;
import model.Flight.SeatConfig;
import serviceDAO.Entity.Flight.SeatConfigEntity;

public class SeatConfigDAO {
	
	private HibernateTemplate hibTemplate;

	public SeatConfigDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<SeatConfig> getSeatConfigList()
	{
		
		Session session = this.hibTemplate.getSessionFactory().openSession();
		@SuppressWarnings("rawtypes")
		Query query = session.createQuery("From AirportEntity");
		ArrayList<SeatConfigEntity>  seatConfigEntityList = (ArrayList<SeatConfigEntity>) query.getResultList();
		ArrayList<SeatConfig> seatConfigList = new  ArrayList<SeatConfig>();
		seatConfigEntityList.forEach(seatConfigEntity -> {
			
			seatConfigList.add(SeatConfigConverter.convertEntityToModel(seatConfigEntity));
		});
		return  seatConfigList;
	}
	
	
	public int createSeatConfig(SeatConfig seatConfig)
	{
		int id=0;
		try {
		SeatConfigEntity seatConfigEntity = SeatConfigConverter.convertModelToEntity(seatConfig);
		Session session = this.hibTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		id = (int)session.save(seatConfigEntity);
		return id;
		}
		catch(Exception e)
		{
			System.out.println("Seact Config creation failed : " + e.getMessage());
			return id;
		}
	}

}
