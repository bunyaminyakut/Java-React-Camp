
public class List {
	public void list (User[] user) {
		for (User user2 : user) {
			System.out.println("Kullanici id: " + user2.getId());
			System.out.println("Kullanici adi: " + user2.getName());
			System.out.println("Kullainci soyadi: " + user2.getSurname());
			
		}
	}
}
