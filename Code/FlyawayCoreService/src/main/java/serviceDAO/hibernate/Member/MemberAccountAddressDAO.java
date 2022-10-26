package serviceDAO.hibernate.Member;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.MemberAccountAddressConverter;
import javax.persistence.Query;
import model.Member.MemberAccountAddress;
import model.Member.MemberAccountContactDetail;
import serviceDAO.Entity.Member.MemberAccountAddressEntity;
import serviceDAO.Entity.Member.MemberAccountContactDetailEntity;

public class MemberAccountAddressDAO {
	
	HibernateTemplate hibTemplate;
	
	public MemberAccountAddressDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	public int createMemberAccountAddress(MemberAccountAddress memberAccountAddressModel)
	{
		int id=0;
		
		try {
			MemberAccountAddressEntity maEntity = new MemberAccountAddressEntity();
			maEntity= MemberAccountAddressConverter.convertModelToEntity(memberAccountAddressModel);			
			Session session = hibTemplate.getSessionFactory().openSession();
			session.beginTransaction();
			id = (int)session.save(maEntity);
			session.getTransaction().commit();
			return id;
			
		}
		catch(Exception e)
		{
			
			System.out.println("Member Account Addresss Creation Failed : " + e.getMessage());
			return id;
			
		}
		
	}
	
	public MemberAccountAddress getMemberAccountAddress(String memberAccountId)
	{
		MemberAccountAddressEntity maEntity = new MemberAccountAddressEntity();
		Session session = hibTemplate.getSessionFactory().openSession();
		Query querry = session.createQuery(" FROM MemberAccountAddressEntity where MemberAccountId: memberAccountId");
		querry.setParameter("memberAccountId", memberAccountId);
	    maEntity = (MemberAccountAddressEntity) querry.getSingleResult();
		MemberAccountAddress memberAccountAddressModel = MemberAccountAddressConverter.convertEntityToModel(maEntity);			
		
		
		session.beginTransaction();
		
		return memberAccountAddressModel;
		
	}
}
