package model.Member;

public class DocumentType {
	

	private int documentTypeId;
	private String documentTypeCode;
	private String documentTypeDesc;

	public DocumentType() {
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
