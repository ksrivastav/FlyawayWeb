package entityModelConverion;

import model.Member.DocumentType;
import serviceDAO.Entity.Member.DocumentTypeEntity;

public  class DocumentTypeConverter {



	 public static DocumentTypeEntity convertModelToEntity(DocumentType documentType) {
		 
		 DocumentTypeEntity docTypeEntity = new DocumentTypeEntity();
		 docTypeEntity.setDocumentTypeId(documentType.getDocumentTypeId());
		 docTypeEntity.setDocumentTypeDesc(documentType.getDocumentTypeDesc());
		 docTypeEntity.setDocumentTypeCode(documentType.getDocumentTypeCode());
		 return docTypeEntity ;
		 
	 }
	 
	 public static DocumentType converEntityToModel(DocumentTypeEntity docTypeEntity) {
		 
		 DocumentType documentType = new DocumentType();
		 documentType.setDocumentTypeId(docTypeEntity.getDocumentTypeId());
		 documentType.setDocumentTypeDesc(docTypeEntity.getDocumentTypeDesc());
		 documentType.setDocumentTypeCode(docTypeEntity.getDocumentTypeCode());
		 
		 return  documentType;
		 
	 }

}
