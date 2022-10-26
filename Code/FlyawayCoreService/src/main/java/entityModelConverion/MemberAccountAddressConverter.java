package entityModelConverion;

import model.Member.MemberAccountAddress;
import serviceDAO.Entity.Member.MemberAccountAddressEntity;

public class MemberAccountAddressConverter {


	public static  MemberAccountAddressEntity convertModelToEntity(MemberAccountAddress memberAccountAddressModel)
	{
		MemberAccountAddressEntity  memberAccountAddressEntity = new MemberAccountAddressEntity();
		memberAccountAddressEntity.setAddressLine1(memberAccountAddressModel.getAddressLine1());
		memberAccountAddressEntity.setAddressLine2(memberAccountAddressModel.getAddressLine2());
		memberAccountAddressEntity.setAddressLine3(memberAccountAddressModel.getAddressLine3());
		memberAccountAddressEntity.setCityId(memberAccountAddressModel.getCityId());
		memberAccountAddressEntity.setCountryId(memberAccountAddressModel.getCountryId());
		memberAccountAddressEntity.setPostalCode(memberAccountAddressModel.getPostalCode());
		memberAccountAddressEntity.setMemberAccountId(memberAccountAddressModel.getmemberAccountId());
		return memberAccountAddressEntity;
	}
	
	public static MemberAccountAddress convertEntityToModel(MemberAccountAddressEntity memberAccountAddresEntity)
	{
		MemberAccountAddress  memberAccountAddressModel = new MemberAccountAddress();
		memberAccountAddressModel.setAddressLine1(memberAccountAddresEntity.getAddressLine1());
		memberAccountAddressModel.setAddressLine2(memberAccountAddresEntity.getAddressLine2());
		memberAccountAddressModel.setAddressLine3(memberAccountAddresEntity.getAddressLine3());
		memberAccountAddressModel.setCityId(memberAccountAddresEntity.getCityId());
		memberAccountAddressModel.setCountryId(memberAccountAddresEntity.getCountryId());
		memberAccountAddressModel.setPostalCode(memberAccountAddresEntity.getPostalCode());
		memberAccountAddressModel.setMemberAccountId(memberAccountAddresEntity.getmemberAccountId());
		return memberAccountAddressModel;
	}


}
