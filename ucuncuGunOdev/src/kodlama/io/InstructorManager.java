package kodlama.io;

public class InstructorManager {

	
	public void getAll(Instructor[] instructor) {
		
		for(Instructor instructors:instructor) {
    		System.out.println(instructors.getFirstName()+instructors.getLastName());
    	}
		
		}
	
	public void register(Instructor instructor) {
		System.out.println( "Kay�t Ba�ar�l� ��retmen " + 	 instructor.getFirstName()  );
	}
	
	public void login(Instructor instructor) {
		System.out.println( "Ho�geldiniz " + 	 instructor.getFirstName()  );
	}
	
	public void exit(Instructor instructor) {
		System.out.println(  "��k�� yap�ld� " + instructor.getFirstName() );
	}
}
