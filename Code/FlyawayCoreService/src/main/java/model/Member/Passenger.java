package model.Member;

public class Passenger {

	private int passengerId;
	private int memberAccountId;
	private String firstName;
	private String lastName;
	private int flightid;
	private String prefix;
	private String gender;
	private int age;
	private int ReservationId;
	
	public Passenger() {
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

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", memberAccountId=" + memberAccountId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", flightid=" + flightid + ", prefix=" + prefix + ", gender="
				+ gender + ", age=" + age + "]";
	}
	

	
	

}
