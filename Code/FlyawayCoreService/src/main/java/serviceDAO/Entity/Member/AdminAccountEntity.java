package serviceDAO.Entity.Member;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AdminAccount")
public class AdminAccountEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AdminAccountId")
	private int adminAccountId;
	

	@Column(name="MemberAccountId")
	private int memberAccountId;
	
	@Column(name="Email", unique=true)
	private String email;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "AccountStatusId")
	private int  accountStatusId;
	
	@Column(name = "AccountCreationDateTime")
	private LocalDateTime accountCreationDateTime;
	
	@Column(name = "AccountUpdateDateTime")
	private LocalDateTime accountUpdateDateTime;
	
	@Column(name = "Password")
	private String password;
	
	public AdminAccountEntity()
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

	public String getLastName() {
		return lastName;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
