package entityModelConverion;

import model.Member.MemberAccountContactDetail;
import serviceDAO.Entity.Member.MemberAccountContactDetailEntity;

public class MemberAccountContactDetailConverter {

	public static MemberAccountContactDetailEntity convertModelToEntity(MemberAccountContactDetail memberAccountContactDetailModel)
	{
		MemberAccountContactDetailEntity  memberAccountContactDetailEntity = new MemberAccountContactDetailEntity();
		memberAccountContactDetailEntity.setContactNumber(memberAccountContactDetailModel.getContactNumber());
		memberAccountContactDetailEntity.setContactTypeId(memberAccountContactDetailModel.getContactTypeId());
		memberAccountContactDetailEntity.setMemberAccountContactDetailId(memberAccountContactDetailModel.getMemberAccountContactDetailId());
		memberAccountContactDetailEntity.setMemberAccountId(memberAccountContactDetailModel.getMemberAccountId());
		memberAccountContactDetailEntity.setCountryCodeId(memberAccountContactDetailModel.getCountryCodeId());
		
		return memberAccountContactDetailEntity;
	}
	
	public static MemberAccountContactDetail convertEntityToModel(MemberAccountContactDetailEntity memberAccountContactDetailEntity)
	{
		MemberAccountContactDetail  memberAccountContactDetail = new MemberAccountContactDetail();
		memberAccountContactDetail.setContactNumber(memberAccountContactDetailEntity.getContactNumber());
		memberAccountContactDetail.setContactTypeId(memberAccountContactDetailEntity.getContactTypeId());
		memberAccountContactDetail.setCountryCodeId(memberAccountContactDetailEntity.getCountryCodeId());
		memberAccountContactDetail.setMemberAccountContactDetailId(memberAccountContactDetailEntity.getMemberAccountContactDetailId());
		memberAccountContactDetail.setMemberAccountId(memberAccountContactDetailEntity.getMemberAccountId());
		return memberAccountContactDetail;
	}

}
