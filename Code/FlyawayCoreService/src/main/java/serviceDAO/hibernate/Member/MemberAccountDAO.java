package serviceDAO.hibernate.Member;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.MemberAccountConverter;

import org.hibernate.query.Query;
import serviceDAO.Entity.Member.MemberAccountEntity;
import model.Member.MemberAccount;

public class MemberAccountDAO {
	
	private HibernateTemplate hibTemplate;

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}
	
	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	
	


	public MemberAccountDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int createMember(MemberAccount memberAccount)
	{
		int id = 0;
		
		try {
			
			
			MemberAccountEntity memberAccountEntity = MemberAccountConverter.convertModelToEntity(memberAccount);			
			Session session = hibTemplate.getSessionFactory().openSession();			
			session.beginTransaction();			
			System.out.println(memberAccount.toString());
			id = (int) session.save(memberAccountEntity);			
			session.getTransaction().commit();			
			return id;
		}
		
		catch(Exception e)
		{
			System.out.println("Member Creation Failed : " + e.getMessage());
			return id;
		}
		
		
	}
	
	
	public MemberAccount getMemberAccountDetails(String email)
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();			
		String querryString = "FROM  MemberAccountEntity where Email=:email ";		
		Query query = session.createQuery(querryString );		
		System.out.println(query.toString());
		query.setParameter("email", email);
		

		MemberAccountEntity memberAccountEntity = (MemberAccountEntity)query.getSingleResult();		
		MemberAccount member = MemberAccountConverter.convertEntityToModel(memberAccountEntity);					
		session.getTransaction().commit();			
		return member;
		
	}
	
	public MemberAccount getMemberAccountDetailsByEmail(String email)
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();			
		String querryString = "FROM  MemberAccountEntity where Email=:email ";		
		Query query = session.createQuery(querryString );		
		System.out.println(query.toString());
		query.setParameter("email", email);
		

		MemberAccountEntity memberAccountEntity = (MemberAccountEntity)query.getSingleResult();		
		MemberAccount member = MemberAccountConverter.convertEntityToModel(memberAccountEntity);					
		session.getTransaction().commit();			
		return  member ;
		
	}
	
	
	
	
	
	

}
