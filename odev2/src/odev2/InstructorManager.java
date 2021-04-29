package odev2;

public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor) {
		System.out.println("Kurs eklendi : " + instructor.getUserName());
	}
}
