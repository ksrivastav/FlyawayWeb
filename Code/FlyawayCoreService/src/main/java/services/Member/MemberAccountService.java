package services.Member;

import model.Member.MemberAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import serviceDAO.hibernate.Member.MemberAccountDAO;


public class MemberAccountService {
	
	private ApplicationContext appContext ;

	
	public MemberAccountService() {
		// TODO Auto-generated constructor stub		
	}
	
	private void setAppContext()
	{
		
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	
	public int createMember(MemberAccount memAccount)
	{
		int id=0;
		try {
			
			setAppContext();			
			MemberAccountDAO memberAccountDAO = new MemberAccountDAO();
			memberAccountDAO=(MemberAccountDAO) this.appContext.getBean("MemberDAO");			
			id = memberAccountDAO.createMember(memAccount);
			return id;
			
		}
		catch(Exception e)
		{
			System.out.println("Member Creation Failed : " + e.getMessage());
			return id;
			
		}
		
		
	}
	
	public MemberAccount getMemberAccount(String email)
	{
		try {
			
			setAppContext();
			MemberAccountDAO memberAccountDAO = new MemberAccountDAO();
			memberAccountDAO=(MemberAccountDAO)this.appContext.getBean("MemberDAO");
			MemberAccount memberAccount = memberAccountDAO.getMemberAccountDetails(email);
			return memberAccount;
		}
		catch(Exception e)
		{
			System.out.println("Member Account retireval : failed: " + e.getMessage());
			return null;
		}
		
	}

}
