package Abstract;

import Entity.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public  class CheckRealPersonManager implements CheckRealPersonService{

	@Override
	public boolean checkRealPerson(User user) throws Exception {
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		System.out.println("Doðrulama yapılıyor...");
		
		return soapClient.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(),user.getLastName(), user.getDateOfBirth());
		
	}

}
