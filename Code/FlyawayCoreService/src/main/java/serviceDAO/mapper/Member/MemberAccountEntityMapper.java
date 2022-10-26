package serviceDAO.mapper.Member;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


import serviceDAO.Entity.Member.MemberAccountEntity;

public class MemberAccountEntityMapper implements RowMapper {

	public Object mapRow(ResultSet rs , int args1) throws SQLException {
		
		MemberAccountEntity memberEnt = new MemberAccountEntity();
		memberEnt.setMemberAccountId(rs.getInt("memberAccountId"));
		memberEnt.setEmail(rs.getString("Email"));
		memberEnt.setFirstName("FirstName");
		memberEnt.setLastName("LastName");
		memberEnt.setAccountStatusId(rs.getInt("AccountStatusId"));
		memberEnt.setAccountCreationDateTime(null);
		memberEnt.setAccountUpdateDateTime(null);
		
		return memberEnt;
	}
	
	

}
