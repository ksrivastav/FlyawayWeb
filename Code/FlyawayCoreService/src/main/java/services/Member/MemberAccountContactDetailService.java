package services.Member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Member.MemberAccountContactDetail;
import serviceDAO.hibernate.Member.MemberAccountContactDetailDAO;

public class MemberAccountContactDetailService {

	private ApplicationContext appContext ;

	public MemberAccountContactDetailService() {
		// TODO Auto-generated constructor stub
	}
	
	private void setAppContext()
	{
		
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}
	
	public int CreateMemberAccountContactDetails(MemberAccountContactDetail memberAccount)
	{
		setAppContext();
		System.out.println(memberAccount.toString());
		MemberAccountContactDetailDAO memberAccountContactDetailDAO = new MemberAccountContactDetailDAO();
		memberAccountContactDetailDAO= (MemberAccountContactDetailDAO) this.appContext.getBean("MemberAccountContactDetailDAO");
		int id = memberAccountContactDetailDAO.CreateMemberAccountContactDetail(memberAccount);
		return id;
	}
	
	public MemberAccountContactDetail getMemberAccountContactDetails(String memberAccountId)
	{
		setAppContext();
		System.out.println(memberAccountId.toString());
		MemberAccountContactDetailDAO memberAccountContactDetailDAO = new MemberAccountContactDetailDAO();
		memberAccountContactDetailDAO= (MemberAccountContactDetailDAO) this.appContext.getBean("MemberAccountContactDetailDAO");
		MemberAccountContactDetail memberAccountContactDetail = memberAccountContactDetailDAO.getMemberAccountContactDetail(memberAccountId);
		return memberAccountContactDetail;
	}
	

}
