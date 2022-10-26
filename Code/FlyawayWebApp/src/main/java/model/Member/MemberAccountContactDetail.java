package model.Member;

public class MemberAccountContactDetail {

	private int memberAccountContactDetailId;
	private int memberAccountId;
	private int contactTypeId;
	private int countryCodeId;
	private int contactNumber;
	
	public MemberAccountContactDetail() {
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
