package interfaceAbstractDemo;

public class StarbucksRegistration implements CustomerRegistration{

	@Override
	public void Register(String massage) {
		System.out.println("Starbucks kaydedildi : " + massage);
		
	}
	
	public void BuyCoffee() {
		BuyCoffeeS buyCoffeeS= new BuyCoffeeS();
		buyCoffeeS.buyCoffee();
	}

}
