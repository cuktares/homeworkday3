package homeworkday3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		Instructor instructor = new Instructor();
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println(instructorManager.password  + instructorManager.firstName + instructorManager.lastName);
		System.out.println(studentManager.firstName + studentManager.lastName + studentManager.note + studentManager.studentNumber);
		
		
		
		
		
	
		
		
		

	}

}
