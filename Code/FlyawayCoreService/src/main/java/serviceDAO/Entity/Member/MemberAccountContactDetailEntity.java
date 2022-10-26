package serviceDAO.Entity.Member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MemberAccountContactDetail")
public class MemberAccountContactDetailEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MemberAccountContactDetailId")
	private int memberAccountContactDetailId;
	
	@Column(name = "MemberAccountId")
	private int memberAccountId;
	
	@Column(name="ContactTypeId")
	private int contactTypeId;
	
	@Column(name="CountryCodeId")
	private int countryCodeId;
	
	@Column(name="ContactNumber")
	private int contactNumber;
	
	public MemberAccountContactDetailEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getMemberAccountContactDetailId() {
		return memberAccountContactDetailId;
	}

	public void setMemberAccountContactDetailId(int memberAccountContactDetailId) {
		this.memberAccountContactDetailId = memberAccountContactDetailId;
	}

	public int getContactTypeId() {
		return contactTypeId;
	}

	public void setContactTypeId(int contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	public int getCountryCodeId() {
		return countryCodeId;
	}

	public void setCountryCodeId(int countryCodeId) {
		this.countryCodeId = countryCodeId;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getMemberAccountId() {
		return memberAccountId;
	}

	public void setMemberAccountId(int memberAccountId) {
		this.memberAccountId = memberAccountId;
	}

	@Override
	public String toString() {
		return "MemberAccountContactDetail [memberAccountContactDetailId=" + memberAccountContactDetailId
				+ ", memberAccountId=" + memberAccountId + ", contactTypeId=" + contactTypeId + ", countryCodeId="
				+ countryCodeId + ", contactNumber=" + contactNumber + "]";
	}
	
	
	

}
