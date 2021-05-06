
public class Main {

	public static void main(String[] args) {
		User bunyamin = new User(1, "Bünyamin", "Yakut");
		User emre = new User(2, "Emre", "Özer");
		User nidal = new User(3, "Nidal", "Midilli");
		
		User[] users = {bunyamin, emre, nidal};
		List list = new List();
		list.list(users);

	}

}
