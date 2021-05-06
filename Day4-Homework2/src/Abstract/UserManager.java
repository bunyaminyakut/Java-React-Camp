package Abstract;

import Entity.User;

public  class UserManager implements UserService{
	
	CheckRealPersonService checkRealPerson;
	
	
	public UserManager(CheckRealPersonService checkRealPerson) {
		this.checkRealPerson=checkRealPerson;
	}
	
	@Override
	public void add(User user) throws Exception {
		
		if(checkRealPerson.checkRealPerson(user)) {
			System.out.println(" kullanýcý ekleme baþarýlý " + user.getFirstName());
			} else {
				System.out.println("Kullanýcý sahte! "+ user.getFirstName());
			
		
	}}
	@Override
	public void update(User user) {
		System.out.println("kullanýcý güncelleme baþarýlý " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silme baþarýlý " + user.getFirstName());
		
	}


}
