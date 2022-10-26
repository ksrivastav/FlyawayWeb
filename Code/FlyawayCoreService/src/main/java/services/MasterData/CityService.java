package services.MasterData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import serviceDAO.hibernate.MasterData.CityDAO;

public class CityService {

	public CityService() {
		// TODO Auto-generated constructor stub
	}
	
	private  ApplicationContext appContext;
	
	
	public ApplicationContext getAppContext() {
		return appContext;
	}
	public void setAppContext() {
		this.appContext =  new ClassPathXmlApplicationContext("MasterDataBeans.xml");
	}
	
	public void  getCityList() {
		setAppContext();
		CityDAO cityDAO = new CityDAO();
		cityDAO = (CityDAO) this.appContext.getBean("CityDAO");
		cityDAO.getCityList();

	}
	
	public void getCityHashMap()
	{
		setAppContext();
		CityDAO cityDAO = new CityDAO();
		cityDAO = (CityDAO) this.appContext.getBean("CityDAO");
		cityDAO.getCityHashMap();
		
	}


}
