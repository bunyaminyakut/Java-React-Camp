package kodlama.io;

public class InstructorManager {

	
	public void getAll(Instructor[] instructor) {
		
		for(Instructor instructors:instructor) {
    		System.out.println(instructors.getFirstName()+instructors.getLastName());
    	}
		
		}
	
	public void register(Instructor instructor) {
		System.out.println( "Kayýt Baþarýlý Öðretmen " + 	 instructor.getFirstName()  );
	}
	
	public void login(Instructor instructor) {
		System.out.println( "Hoþgeldiniz " + 	 instructor.getFirstName()  );
	}
	
	public void exit(Instructor instructor) {
		System.out.println(  "Çýkýþ yapýldý " + instructor.getFirstName() );
	}
}
