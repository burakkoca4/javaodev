package odev2;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student(1,"Burak","1234",263);
		
		Student student2=new Student();
		student2.setId(2);
		student2.setUserName("Buket");
		student2.setPassword("4567");
		student2.setStudentNumber(258);
		
		Instructor instructor = new Instructor(13,"Engin","7890",21);
		
		User[] users= {
				student1,student2,instructor
		};
		
		UserManager userManager=new UserManager();
		userManager.add(users);
		
		StudentManager studentManager=new StudentManager();
		studentManager.registerCourse(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
	}

}
