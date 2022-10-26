package services.Member;

import model.Member.AdminAccount;
import model.Member.MemberAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import serviceDAO.hibernate.Member.AdminAccountDAO;
import serviceDAO.hibernate.Member.MemberAccountDAO;


public class AdminAccountService {
	
	private ApplicationContext appContext ;

	
	public AdminAccountService() {
		// TODO Auto-generated constructor stub		
	}
	
	private void setAppContext()
	{
		
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	
	public int createAdmin(AdminAccount memAccount)
	{
		int id=0;
		try {
			
			setAppContext();			
			AdminAccountDAO AdminAccountDAO = new AdminAccountDAO();
			AdminAccountDAO=(AdminAccountDAO) this.appContext.getBean("AdminAccountDAO");			
			id = AdminAccountDAO.createAdmin(memAccount);
			return id;
			
		}
		catch(Exception e)
		{
			System.out.println("Admin Creation Failed : " + e.getMessage());
			return id;
			
		}
		
		
	}
	
	public AdminAccount getAdminAccount(String email)
	{
		try {
			
			setAppContext();
			AdminAccountDAO AdminAccountDAO = new AdminAccountDAO();
			AdminAccountDAO=(AdminAccountDAO)this.appContext.getBean("AdminAccountDAO");
			AdminAccount AdminAccount = AdminAccountDAO.getAdminAccountDetails(email);
			return AdminAccount;
		}
		catch(Exception e)
		{
			System.out.println("Admin Account retireval : failed: " + e.getMessage());
			return null;
		}
		
	}
	
	public int updateAdmin(AdminAccount memAccount)
	{
		int id=0;
		try {
			
			setAppContext();			
			AdminAccountDAO AdminAccountDAO = new AdminAccountDAO();
			AdminAccountDAO=(AdminAccountDAO) this.appContext.getBean("AdminAccountDAO");			
			id = AdminAccountDAO.updateAdmin(memAccount);
			return id;
			
		}
		catch(Exception e)
		{
			System.out.println("Admin update Failed : " + e.getMessage());
			return id;
			
		}
		
		
	}
	

}
