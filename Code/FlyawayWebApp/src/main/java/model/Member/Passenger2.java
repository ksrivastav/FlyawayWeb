package model.Member;

public class Passenger2 {

	
	public Passenger2() {
		
		// TODO Auto-generated constructor stub
	}
	private int age;
	
	private String firstName;
	private String lastName;	
	private String gender;
	private String prefix;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	@Override
	public String toString() {
		return "Passenger2 [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", prefix=" + prefix + "]";
	}
	

	

}
