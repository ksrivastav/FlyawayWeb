package services.Member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Member.DocumentType;
import serviceDAO.hibernate.Member.DocumentTypeDAO;


public class DocumentTypeService {
	
	private ApplicationContext appContext ;
	
	
	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext() {
		this.appContext = new ClassPathXmlApplicationContext("MemberBeans.xml");
	}


	public DocumentTypeService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int createDocumentType(DocumentType docType)
	{
		int id=0;
		setAppContext();
		try{
			
			DocumentTypeDAO docTypeDAO = (DocumentTypeDAO)this.appContext.getBean("DocumentTypeDAO");
			id = docTypeDAO.createDocumentType(docType);
			return id;
			
		}
		catch(Exception e)
		{
			System.out.println("Document Type  creation failed : " + e.getMessage());
			return id ;
		}
	
	}
	
	
	public DocumentType getDocumentType(String documentTypeCode)
	{
		setAppContext();
		
		System.out.println(documentTypeCode);
		DocumentTypeDAO docTypeDAO = new DocumentTypeDAO();
		docTypeDAO=(DocumentTypeDAO)this.appContext.getBean("DocumentTypeDAO");
		DocumentType docType = docTypeDAO.getDocumentType(documentTypeCode);
		return docType;
		
	}
	

}
