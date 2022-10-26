package serviceDAO.hibernate.MasterData;


import java.util.ArrayList;
import java.util.HashMap;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.CityConverter;
import helper.CityList;
import model.MasterData.City;
import serviceDAO.Entity.MasterData.CityEntity;

import org.hibernate.query.Query;

public class CityDAO {
	
	private HibernateTemplate hibTemplate;

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}

	public CityDAO() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public void getCityList()
	{
		try
		{
			Session session = hibTemplate.getSessionFactory().openSession();
			Query querry = session.createQuery("FROM CityEntity");
			ArrayList<CityEntity> cityEntityList =  (ArrayList<CityEntity>)querry.getResultList();
			
			ArrayList<City> cityList =  (ArrayList<City>)querry.getResultList();
			cityEntityList.forEach(cityEntity-> {
				
				cityList.add(CityConverter.convertEntityToModel(cityEntity));
			});
			
			CityList.setCityArrayList(cityList);
		}
		
		catch(Exception e )
		{
			System.out.println("Country Loading error : " + e.getMessage());
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void getCityHashMap()
	{
		try
		{
			Session session = hibTemplate.getSessionFactory().openSession();
			Query querry = session.createQuery("FROM CityEntity");
			ArrayList<CityEntity> cityEntityList =  (ArrayList<CityEntity>)querry.getResultList();
			
			HashMap<Integer, City> cityhashMap = new HashMap<Integer, City>();
			cityEntityList.forEach(cityEntity-> {
				
				City cityModel = CityConverter.convertEntityToModel(cityEntity);
				cityhashMap.put(cityModel.getCityId(), cityModel);
			});
			
			CityList.setCityList(cityhashMap);
		}
		
		catch(Exception e )
		{
			System.out.println("City Loading error : " + e.getMessage());
		}
		
	}
	
	

}
