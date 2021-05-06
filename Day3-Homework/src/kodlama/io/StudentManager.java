package kodlama.io;

public class StudentManager {
	

    public void getAll(Student[] student) {
    	
    	for(Student students:student) {
    		System.out.println(students.getFirstName()+students.getLastName());
    	}
		
		}
	
	public void register(Student student) {
		System.out.println( "Başarılı kayıt " + 	 student.getFirstName()  );
	}
	
	public void login(Student student) {
		System.out.println( "Hoşgeldin " + 	 student.getFirstName()  );
	}
	
	public void exit(Student student) {
		System.out.println( "Çıkış yapıldı " + student.getFirstName());
	}
}
