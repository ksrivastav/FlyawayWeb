package serviceDAO.hibernate.Flight;

import java.util.ArrayList;
import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.RouteConverter;
import entityModelConverion.RouteMasterDataConverter;
import helper.RouteList;
import model.Flight.Route;
import model.Flight.RouteMasterDataModel;
import serviceDAO.Entity.Flight.RouteEntity;
import serviceDAO.Entity.Flight.RouteMasterData;

public class RouteDAO {
	
	private HibernateTemplate hibTemplate;

	public RouteDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	@SuppressWarnings("unchecked")
	public void  getRouteList()
	{
		
		Session session = this.hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("From RouteEntity");
		ArrayList<RouteEntity>  routeEntityList = (ArrayList<RouteEntity>) query.getResultList();
		ArrayList<Route> routeList = new ArrayList<Route>(); 
		routeEntityList.forEach(routeEntity-> {
			
			routeList.add(RouteConverter.convertEntityToModel(routeEntity));
			
		});
		RouteList.setRouteArrayList(routeList);
		
		
	}
	
	public void  getRouteHashMap()
	{
		
		Session session = this.hibTemplate.getSessionFactory().openSession();
		Query query = session.createQuery("From RouteEntity");
		ArrayList<RouteEntity>  routeEntityList = (ArrayList<RouteEntity>) query.getResultList();
		HashMap<String, Route> routeHashMap = new HashMap<String, Route>();
		 
		routeEntityList.forEach(routeEntity-> {
			
			Route route= RouteConverter.convertEntityToModel(routeEntity);
			routeHashMap.put(Integer.toString(route.getrouteId()), route);
			
			
		});
		RouteList.setRouteList(routeHashMap);
		
		
	}
	
	
	public int createRoute(Route route)
	{
		int id = 0;
		
		try {
			
			
			RouteEntity RouteEntity = RouteConverter.convertModelToEntity(route);			
			Session session = hibTemplate.getSessionFactory().openSession();			
			session.beginTransaction();			
			System.out.println(route.toString());
			id = (int) session.save(RouteEntity);			
			session.getTransaction().commit();			
			return id;
		}
		
		catch(Exception e)
		{
			System.out.println("Route Creation Failed : " + e.getMessage());
			return id;
		}
		
		
	}
	
	public ArrayList<RouteMasterDataModel> getAllRouteMasterData()
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();		
		String querryString = "FROM  RouteMasterData";
		Query query = session.createQuery(querryString );			
		@SuppressWarnings("unchecked")
		ArrayList<RouteMasterData>  routeMasterDataEntity = (ArrayList<RouteMasterData>)query.getResultList();		
		ArrayList<RouteMasterDataModel> routeMasterDataList = new ArrayList<RouteMasterDataModel>();
		
		routeMasterDataEntity.forEach(routeEntity-> {
			
			routeMasterDataList.add(RouteMasterDataConverter.convertEntityToModel(routeEntity));
			
		});
		
		return  routeMasterDataList;
		
	}

	
	

}
