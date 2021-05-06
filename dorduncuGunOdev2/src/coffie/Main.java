package coffie;


public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Bünyamin", "Yakut", "14.12.1999", "12777001982");
		Customer customer2 = new Customer(2, "Nidal", "Midilli", "13.1.2000", "2222222222");
		
		CustomerRegistration[] customerRegistrations = {
				new StarbucksRegistration(),
				new NeroRegistration(new MernisVerification(customer2)),
		};
		
		CustomerManager customerManager = new CustomerManager(customerRegistrations);
		customerManager.addCustomer(customer1);
		customerManager.addCustomer(customer2);
		
		NeroRegistration neroRegistration = new NeroRegistration(new MernisVerification(customer1));
		neroRegistration.BuyCoffee();
		NeroRegistration neroRegistration1 = new NeroRegistration(new MernisVerification(customer2));
		neroRegistration1.BuyCoffee();
		
		
		
		StarbucksRegistration StarbucksRegistration = new StarbucksRegistration();
		StarbucksRegistration.BuyCoffee();
	}

}
