package kodlama.io;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Bünyamin");
		student1.setLastName("Yakut");
		student1.setIdentityNumber("123456789");
		student1.setEmail("aaaaaaa@gmail.com");
		student1.setParola("123");
		student1.setStudentNumber("123456");
		student1.setCourseCount(2);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Melik");
		student2.setLastName("Yakut");
		student2.setIdentityNumber("1234567");
		student2.setEmail("bbbbbb@gmail.com");
		student2.setParola("123321");
		student2.setStudentNumber("123456789");
		student2.setCourseCount(3);
		
		Student[] students= {student1,student2};
		
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setIdentityNumber("12345678");
		instructor1.setEmail("engin@gmail.com");
		instructor1.setParola("123");
		instructor1.setSalary(5000);
		instructor1.setStudentCount(2);
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setFirstName("Ahmet");
		instructor2.setLastName("Ersin");
		instructor2.setIdentityNumber("asdsadsad");
		instructor2.setEmail("ahmet@gmail.com");
		instructor2.setParola("123456789");
		instructor2.setSalary(10000);
		instructor2.setStudentCount(3);
		
		Instructor[] instrucotors= {instructor1,instructor2};
		
		
		System.out.println("\n\n---------- ÖĞRENCİLER ----------\n");
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
		studentManager.login(student1);
		studentManager.exit(student1);
		
		studentManager.register(student2);
		studentManager.login(student2);
		studentManager.exit(student2);
		
		studentManager.getAll(students);
		
		
		System.out.println("\n\n---------- EĞİTMENLER ----------\n");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.register(instructor1);
		instructorManager.login(instructor1);
		instructorManager.exit(instructor1);
		
		instructorManager.register(instructor2);
		instructorManager.login(instructor2);
		instructorManager.exit(instructor2);
		
		instructorManager.getAll(instrucotors);
		
		

}
}
