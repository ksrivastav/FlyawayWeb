package serviceDAO.hibernate.Member;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entityModelConverion.DocumentTypeConverter;
import model.Member.DocumentType;
import serviceDAO.Entity.Member.DocumentTypeEntity;

public class DocumentTypeDAO {
	
	private HibernateTemplate hibTemplate;

	public DocumentTypeDAO() {
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibTemplate() {
		return hibTemplate;
	}

	public void setHibTemplate(HibernateTemplate hibTemplate) {
		this.hibTemplate = hibTemplate;
	}
	
	public int createDocumentType(DocumentType doc)
	{
		int id=0;
		
		try
		{
			Session session = hibTemplate.getSessionFactory().openSession();
			DocumentTypeEntity docEntity = DocumentTypeConverter.convertModelToEntity(doc);
			session.beginTransaction();
			id= (int)session.save(docEntity);
			session.getTransaction().commit();
			return id;
			
		}
		
		catch(Exception e)
		{
			System.out.println("Passenger creation failed:" + e.getMessage());
			return id;
		}
		
	}
	
	public DocumentType getDocumentType(String documentTypeCode)
	{
		System.out.println(documentTypeCode);
		Session session = hibTemplate.getSessionFactory().openSession();
		Query qr = session.createQuery("From DocumentTypeEntity where DocumentTypeCode=:docCode");
		qr.setParameter("docCode",documentTypeCode);
		DocumentTypeEntity docEntity = (DocumentTypeEntity) qr.getSingleResult();
		DocumentType docType = DocumentTypeConverter.converEntityToModel(docEntity);
		return docType;
	}
	

}
