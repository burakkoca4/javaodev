package odev2;

public class Student extends User{
	private int studentNumber;
	
	public Student() {
		
	}
	

	public Student(int id,String userName,String password,int studentNumber) {
		super(id,userName,password);
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
