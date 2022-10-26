package serviceDAO.hibernate.Member;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.MemberAccountAddressConverter;
import entityModelConverion.MemberAccountContactDetailConverter;
import model.Member.MemberAccountAddress;
import model.Member.MemberAccountContactDetail;
import serviceDAO.Entity.Member.MemberAccountAddressEntity;
import serviceDAO.Entity.Member.MemberAccountContactDetailEntity;

public class MemberAccountContactDetailDAO {
	
	HibernateTemplate hibTemplate;

	public MemberAccountContactDetailDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	
	
	
	public int CreateMemberAccountContactDetail(MemberAccountContactDetail memberAccountContactDetailModel)
	{
		int id=0;
		
		try {
			MemberAccountContactDetailEntity memberAccountContactDetailEntity = new MemberAccountContactDetailEntity();
			memberAccountContactDetailEntity=  MemberAccountContactDetailConverter.convertModelToEntity(memberAccountContactDetailModel);
			Session session = hibTemplate.getSessionFactory().openSession();
			session.beginTransaction();
			System.out.println(memberAccountContactDetailModel.toString());
			id = (int)session.save(memberAccountContactDetailEntity);
			session.getTransaction().commit();
			return id;
			
		}
		catch(Exception e)
		{
			
			System.out.println("Member Account Contact Details Creation Failed : " + e.getMessage());
			return id;
			
		}
		
	}
	
	public MemberAccountContactDetail getMemberAccountContactDetail(String memberAccountId)
	{
		MemberAccountContactDetailEntity maEntity = new MemberAccountContactDetailEntity();
		Session session = hibTemplate.getSessionFactory().openSession();
		Query querry = session.createQuery(" FROM MemberAccountContactDetailEntity where MemberAccountId: memberAccountId");
		querry.setParameter("memberAccountId", memberAccountId);
	    maEntity = (MemberAccountContactDetailEntity) querry.getSingleResult();
		MemberAccountContactDetail memberAccountContactDetailModel = MemberAccountContactDetailConverter.convertEntityToModel(maEntity);			
				
		session.beginTransaction();
		
		return memberAccountContactDetailModel;
		
	}
	

}
