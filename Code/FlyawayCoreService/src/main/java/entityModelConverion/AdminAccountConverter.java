package entityModelConverion;

import model.Member.AdminAccount;
import serviceDAO.Entity.Member.AdminAccountEntity;

public class AdminAccountConverter {

	public static AdminAccountEntity convertModelToEntity(AdminAccount AdminAccount)
	{
		AdminAccountEntity AdminAccountEntity = new AdminAccountEntity();
		AdminAccountEntity.setFirstName(AdminAccount.getFirstName());
		AdminAccountEntity.setLastName(AdminAccount.getLastName());
		AdminAccountEntity.setEmail(AdminAccount.getEmail());
		AdminAccountEntity.setAccountCreationDateTime(AdminAccount.getAccountCreationDateTime());
		AdminAccountEntity.setAccountStatusId(AdminAccount.getAccountStatusId());
		AdminAccountEntity.setAccountUpdateDateTime(null);
		AdminAccountEntity.setPassword(AdminAccount.getPassword());
		return AdminAccountEntity;
		
	}
	
	public static AdminAccount convertEntityToModel(AdminAccountEntity AdminAccountEntity )
	{
		AdminAccount AdminAccount = new AdminAccount();
		AdminAccount.setFirstName(AdminAccountEntity.getFirstName());
		AdminAccount.setLastName(AdminAccountEntity.getLastName());
		AdminAccount.setEmail(AdminAccountEntity.getEmail());
		AdminAccount.setAccountCreationDateTime(AdminAccountEntity.getAccountCreationDateTime());
		AdminAccount.setAccountStatusId(AdminAccountEntity.getAccountStatusId());
		AdminAccount.setAccountUpdateDateTime(null);
		AdminAccount.setPassword(AdminAccountEntity.getPassword());
		AdminAccount.setAdminAccountId(AdminAccountEntity.getAdminAccountId());
		return AdminAccount;
		
	}

}
