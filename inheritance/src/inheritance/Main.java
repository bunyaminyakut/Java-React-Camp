package inheritance;

public class Main {

	public static void main(String[] args) {

		InduvidualCustomer bunyamin = new InduvidualCustomer();
		bunyamin.customerNumber="12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="6789";
		
		SendikaCustomer abc= new SendikaCustomer();
		abc.customerNumber="99999";

		Customer[] customers= {bunyamin,hepsiBurada,abc};
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.mutliAdd(customers);

}
}