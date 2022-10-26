package services.Member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Member.MemberAccountAddress;
import serviceDAO.hibernate.Member.MemberAccountAddressDAO;

public class MemberAccountAddressService {

	private ApplicationContext appContext ;
	
	public MemberAccountAddressService() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	
	public int createMemberAccountAddress (MemberAccountAddress memberAddress)
	{
		int id=0;
		setAppContext();
		try{
			
			MemberAccountAddressDAO memberAddressDAO = (MemberAccountAddressDAO)this.appContext.getBean("MemberAccountAddressDAO");
			id = memberAddressDAO.createMemberAccountAddress(memberAddress);
			return id;
			
		}
		catch(Exception e)
		{
			System.out.println("Member address creation failed : " + e.getMessage());
			return id ;
		}
	
	}
	
	public MemberAccountAddress getMemberAccountAddres(String memberAccountId)
	{
		setAppContext();
		System.out.println(memberAccountId.toString());		
		MemberAccountAddressDAO memberAccountAddressDAO = (MemberAccountAddressDAO)this.appContext.getBean("MemberAccountAddressDAO");
		MemberAccountAddress memberAccountAddres = memberAccountAddressDAO.getMemberAccountAddress(memberAccountId);
		return memberAccountAddres;
	}
	
	

}
