package model.Member;

public class AddressType {
	
	private int addressTypeId;
	private String addressTypeCode;
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
