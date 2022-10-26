package model.Member;

public class ContactType {
	
	private int contactTypeId;
	private String contactTypeCode;
	private String contactTypeDesc;

	public ContactType() {
		// TODO Auto-generated constructor stub
	}

	public int getContactTypeId() {
		return contactTypeId;
	}

	public void setContactTypeId(int contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	public String getContactTypeCode() {
		return contactTypeCode;
	}

	public void setContactTypeCode(String contactTypeCode) {
		this.contactTypeCode = contactTypeCode;
	}

	public String getContactTypeDesc() {
		return contactTypeDesc;
	}

	public void setContactTypeDesc(String contactTypeDesc) {
		this.contactTypeDesc = contactTypeDesc;
	}

	@Override
	public String toString() {
		return "ContactType [contactTypeId=" + contactTypeId + ", contactTypeCode=" + contactTypeCode
				+ ", contactTypeDesc=" + contactTypeDesc + "]";
	}
	
	

}
