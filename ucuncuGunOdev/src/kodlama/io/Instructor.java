package kodlama.io;

public class Instructor extends User {

	private int salary;
	private int studentCount;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String parola, int salary,int studentCount) {
		super();
		this.salary = salary;
		this.studentCount = studentCount;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getStudentCount() {
		return studentCount;
	}


	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	
}
