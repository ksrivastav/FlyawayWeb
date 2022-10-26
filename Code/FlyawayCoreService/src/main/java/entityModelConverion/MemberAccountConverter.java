package entityModelConverion;

import model.Member.MemberAccount;
import serviceDAO.Entity.Member.MemberAccountEntity;

public class MemberAccountConverter {

	public static MemberAccountEntity convertModelToEntity(MemberAccount memberAccount)
	{
		MemberAccountEntity memberAccountEntity = new MemberAccountEntity();
		memberAccountEntity.setFirstName(memberAccount.getFirstName());
		memberAccountEntity.setLastName(memberAccount.getLastName());
		memberAccountEntity.setEmail(memberAccount.getEmail());
		memberAccountEntity.setAccountCreationDateTime(memberAccount.getAccountCreationDateTime());
		memberAccountEntity.setAccountStatusId(memberAccount.getAccountStatusId());
		memberAccountEntity.setAccountUpdateDateTime(null);
		memberAccountEntity.setPassword(memberAccount.getPassword());
		return memberAccountEntity;
		
	}
	
	public static MemberAccount convertEntityToModel(MemberAccountEntity memberAccountEntity )
	{
		MemberAccount memberAccount = new MemberAccount();
		memberAccount.setFirstName(memberAccountEntity.getFirstName());
		memberAccount.setLastName(memberAccountEntity.getLastName());
		memberAccount.setEmail(memberAccountEntity.getEmail());
		memberAccount.setAccountCreationDateTime(memberAccountEntity.getAccountCreationDateTime());
		memberAccount.setAccountStatusId(memberAccountEntity.getAccountStatusId());
		memberAccount.setAccountUpdateDateTime(null);
		memberAccount.setPassword(memberAccountEntity.getPassword());
		memberAccount.setMemberAccountId(memberAccountEntity.getMemberAccountId());
		return memberAccount;
		
	}

}
