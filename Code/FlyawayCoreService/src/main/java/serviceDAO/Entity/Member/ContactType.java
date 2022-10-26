package serviceDAO.Entity.Member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GenerationType;

@Entity
@Table(name="ContactType")
public class ContactType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ContactTypeId")
	private int contactTypeId;
	
	@Column(name="ContactTypeCode")
	private String contactTypeCode;
	@Column(name="ContactTypeDesc")
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
