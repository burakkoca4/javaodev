package odev2;

public class StudentManager extends UserManager {
	public void registerCourse(Student student) {
		System.out.println("��renci kursa kaydoldu : " + student.getUserName());
	}
}
