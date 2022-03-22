package interfaceAbstractDemo;

public class MernisVerification implements Verification{
	private Customer customer;
	
	public MernisVerification(Customer customer) {
		this.customer = customer;
	}
	@Override
	public boolean Verify() {
		
		if(customer.getId() == 0) {
			return true;
		}
		
		return false;
		
		
	}

}
