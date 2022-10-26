package serviceDAO.Entity.Member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="AddressType")
public class AddressType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AddressTypeId")
	private int addressTypeId;
	
	@Column(name="AddressTypeCode")
	private String addressTypeCode;
	@Column(name="AddressTypeDesc")
	private String addressTypeDesc;


	public AddressType() {
		// TODO Auto-generated constructor stub
	}


	public int getAddressTypeId() {
		return addressTypeId;
	}


	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}


	public String getAddressTypeCode() {
		return addressTypeCode;
	}


	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}


	public String getAddressTypeDesc() {
		return addressTypeDesc;
	}


	public void setAddressTypeDesc(String addressTypeDesc) {
		this.addressTypeDesc = addressTypeDesc;
	}


	@Override
	public String toString() {
		return "AddressType [addressTypeId=" + addressTypeId + ", addressTypeCode=" + addressTypeCode
				+ ", addressTypeDesc=" + addressTypeDesc + "]";
	}
	
	

	
}
