package Entities;

public class Gamer implements Entity {
	private int gamerID;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String nationalityId;
	
	public Gamer() {
		
	}
	
	
	public Gamer(int gamerID, String userName, String firstName, String lastName, String email, String nationalityId,
			int yearOfBirth) {
		super();
		this.gamerID = gamerID;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
	}
	private int yearOfBirth;
	
	
	public int getGamerID() {
		return gamerID;
	}
	public void setGamerID(int gamerID) {
		this.gamerID = gamerID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
