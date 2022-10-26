package serviceDAO.hibernate.Member;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.AdminAccountConverter;

import org.hibernate.query.Query;

import serviceDAO.Entity.Member.AdminAccountEntity;
import serviceDAO.Entity.Member.AdminAccountEntity;
import model.Member.AdminAccount;
import model.Member.AdminAccount;

public class AdminAccountDAO {
	
	private HibernateTemplate hibTemplate;

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}
	
	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	
	


	public AdminAccountDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public int createAdmin(AdminAccount adminAccount)
	{
		int id = 0;
		
		try {
			
			
			AdminAccountEntity adminAccountEntity = AdminAccountConverter.convertModelToEntity(adminAccount);			
			Session session = hibTemplate.getSessionFactory().openSession();			
			session.beginTransaction();			
			System.out.println(adminAccount.toString());
			id = (int) session.save(adminAccountEntity);			
			session.getTransaction().commit();			
			return id;
		}
		
		catch(Exception e)
		{
			System.out.println("Admin Creation Failed : " + e.getMessage());
			return id;
		}
		
		
	}
	
	public int updateAdmin(AdminAccount adminAccount)
	{
		int id = 0;
		
		try {
				
			AdminAccountEntity adminAccountEntity =  this.getAdminAccountEntityDetailsByEmail(adminAccount.getEmail());
			
			adminAccountEntity.setFirstName(adminAccount.getFirstName());
			adminAccountEntity.setLastName(adminAccount.getLastName());
			adminAccountEntity.setAccountStatusId(adminAccount.getAccountStatusId());
			adminAccountEntity.setAccountUpdateDateTime(adminAccount.getAccountUpdateDateTime());
			adminAccountEntity.setAccountCreationDateTime(adminAccount.getAccountCreationDateTime());
			adminAccountEntity.setPassword(adminAccount.getPassword());
			adminAccountEntity.setEmail(adminAccount.getEmail());
			adminAccountEntity.setMemberAccountId(adminAccountEntity.getMemberAccountId());			
			Session session = hibTemplate.getSessionFactory().openSession();	
			
			//int temp_id =adminAccountEntity.getAdminAccountId();
			session.beginTransaction();	
			System.out.println(adminAccount.toString());
			
			session.update(adminAccountEntity);
			id = adminAccountEntity.getAdminAccountId();
			
			
		//	id = (int) session.save(adminAccountEntity);			
			session.getTransaction().commit();			
			return id;
		}
		
		catch(Exception e)
		{
			System.out.println("Admin Creation Failed : " + e.getMessage());
			return id;
		}
		
		
	}
	
	
	public AdminAccount getAdminAccountDetails(String email)
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();			
		String querryString = "FROM  AdminAccountEntity where Email=:email";		
		Query query = session.createQuery(querryString );		
		System.out.println(query.toString());
		query.setParameter("email", email);
		

		AdminAccountEntity AdminAccountEntity = (AdminAccountEntity)query.getSingleResult();		
		AdminAccount Admin = AdminAccountConverter.convertEntityToModel(AdminAccountEntity);					
		session.getTransaction().commit();			
		return Admin;
		
	}
	
	public AdminAccount getAdminAccountDetailsByEmail(String email)
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();			
		String querryString = "FROM  AdminAccountEntity where Email=:email ";		
		Query query = session.createQuery(querryString );		
		System.out.println(query.toString());
		query.setParameter("email", email);
		

		AdminAccountEntity adminAccountEntity = (AdminAccountEntity)query.getSingleResult();		
		AdminAccount admin = AdminAccountConverter.convertEntityToModel(adminAccountEntity);					
		session.getTransaction().commit();			
		return  admin ;
		
	}
	
	public AdminAccountEntity getAdminAccountEntityDetailsByEmail(String email)
	{
				
		Session session = hibTemplate.getSessionFactory().openSession();			
		session.beginTransaction();			
		String querryString = "FROM  AdminAccountEntity where Email=:email ";		
		Query query = session.createQuery(querryString );		
		System.out.println(query.toString());
		query.setParameter("email", email);
		

		AdminAccountEntity adminAccountEntity = (AdminAccountEntity)query.getSingleResult();		
							
		session.getTransaction().commit();			
		return adminAccountEntity ;
		
	}
	
	
	
	
	
	

}
