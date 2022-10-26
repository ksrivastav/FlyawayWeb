package serviceDAO.Entity.Member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name="DocumentType")
public class DocumentTypeEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DocumentTypeId")
	private int documentTypeId;
	
	@Column(name="DocumentTypeCode")
	private String documentTypeCode;
	
	@Column(name="DocumentTypeDesc")
	private String documentTypeDesc;

	public DocumentTypeEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getDocumentTypeId() {
		return documentTypeId;
	}

	public void setDocumentTypeId(int documentTypeId) {
		this.documentTypeId = documentTypeId;
	}

	public String getDocumentTypeCode() {
		return documentTypeCode;
	}

	public void setDocumentTypeCode(String documentTypeCode) {
		this.documentTypeCode = documentTypeCode;
	}

	public String getDocumentTypeDesc() {
		return documentTypeDesc;
	}

	public void setDocumentTypeDesc(String documentTypeDesc) {
		this.documentTypeDesc = documentTypeDesc;
	}

	@Override
	public String toString() {
		return "DocumentType [documentTypeId=" + documentTypeId + ", documentTypeCode=" + documentTypeCode
				+ ", documentTypeDesc=" + documentTypeDesc + "]";
	}
	
	

}
