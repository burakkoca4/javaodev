package odev2;

public class Instructor extends User{
	private int instructorNumber;
	
	public Instructor() {
		
	}

	public Instructor(int id,String userName,String password,int instructorNumber) {
		super(id,userName,password);
		this.instructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
