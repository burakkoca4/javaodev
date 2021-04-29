package odev2;

public class StudentManager extends UserManager {
	public void registerCourse(Student student) {
		System.out.println("Öğrenci kursa kaydoldu : " + student.getUserName());
	}
}
