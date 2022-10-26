package serviceDAO.hibernate.MasterData;

import org.springframework.orm.hibernate5.HibernateTemplate;

import serviceDAO.Entity.Flight.AircraftEntity;
import serviceDAO.Entity.MasterData.CountryEntity;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.query.Query;
import helper.CountryList;
import model.MasterData.Country;
import entityModelConverion.CountryConverter;

public class CountryDAO {
	
	private HibernateTemplate hibTemplate;
	

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}


	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	

	public CountryDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void getCountryList()
	{
		try {
			Session session = hibTemplate.getSessionFactory().openSession();
			Query query = session.createQuery("From CountryEntity");
			@SuppressWarnings("unchecked")
			ArrayList<CountryEntity> countryEntityList = (ArrayList<CountryEntity>)query.getResultList();
			ArrayList<Country> countryList = new ArrayList<Country>();
			countryEntityList.forEach(countryEntity -> {
				
				countryList.add(CountryConverter.convertEntityToModel(countryEntity));
				
			});
			
			CountryList.setCountryArrayList(countryList);
			
		}
		catch(Exception e )
		{
			System.out.println("Country Loading error : " + e.getMessage());
		}
		
	}
	

}
