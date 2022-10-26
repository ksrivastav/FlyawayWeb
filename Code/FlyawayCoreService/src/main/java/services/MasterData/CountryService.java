package services.MasterData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import serviceDAO.hibernate.MasterData.CountryDAO;

public class CountryService {

	private  ApplicationContext appContext;
	
	public CountryService() {
		// TODO Auto-generated constructor stub
	}
	public ApplicationContext getAppContext() {
		return appContext;
	}
	public void setAppContext() {
		this.appContext =  new ClassPathXmlApplicationContext("MasterDataBeans.xml");
	}
	
	public void  getCountryList() {
		setAppContext();
		CountryDAO countryDAO = new CountryDAO();
		countryDAO = (CountryDAO) this.appContext.getBean("CountryDAO");
		countryDAO.getCountryList();

	}

}
