package serviceDAO.Entity.Member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="MemberAccountAddress" )
public class MemberAccountAddressEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MemberAccountAddressId")
	private int memberAccountAddressId;
	
	@Column(name="MemberAccountId")
	private int memberAccountId;
	
	@Column(name="AddressTypeId")
	private int addressTypeId;
	
	@Column(name="AddressLine1")
	private String addressLine1;
	
	@Column(name="AddressLine2")
	private String addressLine2;
	
	@Column(name="AddressLine3")
	private String addressLine3;
	
	@Column(name="CityId")
	private int cityId;
	
	@Column(name="StateId")
	private int stateId;
	
	@Column(name="CountryId")
	private int countryId;
	
	@Column(name="PostalCode")
	private String postalCode;
	public MemberAccountAddressEntity() {
		// TODO Auto-generated constructor stub
	}
	public int getMemberAccountAddressId() {
		return memberAccountAddressId;
	}
	public void setMemberAccountAddressId(int memberAccountAddressId) {
		this.memberAccountAddressId = memberAccountAddressId;
	}
	public int getmemberAccountId() {
		return memberAccountId;
	}
	public void setMemberAccountId(int memberAccountId) {
		this.memberAccountId = memberAccountId;
	}
	public int getAddressTypeId() {
		return addressTypeId;
	}
	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "MemberAccountAddress [memberAccountAddressId=" + memberAccountAddressId + ", memberAccountId="
				+ memberAccountId + ", addressTypeId=" + addressTypeId + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", addressLine3=" + addressLine3 + ", cityId=" + cityId
				+ ", stateId=" + stateId + ", countryId=" + countryId + ", postalCode=" + postalCode + "]";
	}
	
	

}
