package model.Member;

import java.time.LocalDateTime;


public class AdminAccount {
	
	private int adminAccountId;
	private int memberAccountId;
	private String email;
	private String firstName;
	private String lastName;
	private int  accountStatusId;
	private LocalDateTime accountCreationDateTime;
	private LocalDateTime accountUpdateDateTime;
	private String password;
	
	public AdminAccount()
	{
		
	}
	
	// getters and setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		 this.lastName = lastName;
	}
	public int getAccountStatusId() {
		return this.accountStatusId;
	}
	public void setAccountStatusId(int accountStatusId) {
		this.accountStatusId = accountStatusId;
	}
	public LocalDateTime getAccountCreationDateTime() {
		return this.accountCreationDateTime;
	}
	public void setAccountCreationDateTime(LocalDateTime accountCreationDateTime) {
		this.accountCreationDateTime = accountCreationDateTime;
	}
	public LocalDateTime getAccountUpdateDateTime() {
		return this.accountUpdateDateTime;
	}
	public void setAccountUpdateDateTime(LocalDateTime accountUpdateDateTime) {
		this.accountUpdateDateTime = accountUpdateDateTime;
	}
	
	

	public int getMemberAccountId() {
		return memberAccountId;
	}

	public void setMemberAccountId(int memberAccountId) {
		this.memberAccountId = memberAccountId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}
	
	

	public int getAdminAccountId() {
		return adminAccountId;
	}

	public void setAdminAccountId(int adminAccountId) {
		this.adminAccountId = adminAccountId;
	}

	@Override
	public String toString() {
		return "AdminAccount [adminAccountId= "+ adminAccountId+ "memberAccountId=" + memberAccountId + ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", accountStatusId=" + accountStatusId + ", accountCreationDateTime="
				+ accountCreationDateTime + ", accountUpdateDateTime=" + accountUpdateDateTime + "]";
	}
	
	

	
}
