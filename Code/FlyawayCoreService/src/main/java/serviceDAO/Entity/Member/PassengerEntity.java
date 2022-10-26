package serviceDAO.Entity.Member;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger")
public class PassengerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PassengerId")
	private int passengerId;
	
	
	@Column(name="MemberAccountId")
	private int memberAccountId;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="FlightId")
	private int flightid;
	
	@Column(name="Prefix")
	private String prefix;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="ReservationId")
	private int ReservationId;
	
	public PassengerEntity() {
		// TODO Auto-generated constructor stub
	}



	public int getPassengerId() {
		return passengerId;
	}



	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}



	public int getMemberAccountId() {
		return memberAccountId;
	}



	public void setMemberAccountId(int memberAccountId) {
		this.memberAccountId = memberAccountId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getFlightid() {
		return flightid;
	}



	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}



	public String getPrefix() {
		return prefix;
	}



	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getReservationId() {
		return ReservationId;
	}



	public void setReservationId(int reservationId) {
		ReservationId = reservationId;
	}
	
	

		

}
