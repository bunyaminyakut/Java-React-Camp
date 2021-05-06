package Main;

import Abstract.CheckRealPersonManager;
import Abstract.GameManager;
import Abstract.SaleManager;
import Abstract.UserManager;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		
		User bunyamin = new User("12345678910","Bünyamin","Yakut",1999,"öğrenci");
		User emre = new User("11111111111","Emre","Özer",2000,"emekli");
		User nidal = new User("22222222222","Nidal","Midilli",2000,"öğrenci");
		
		Game witcher3 = new Game(1,"Witcher3",50);
		Game rDR2 = new Game(2,"Red Dead Redemption 2",400);
		Game cODMW = new Game(3,"Call Of Duty Modern Warfare",100);
		Game godOfWar = new Game(2,"God Of War",600);
	
		Campaign  campaign =new Campaign(1,"öğrenci",30);
		Campaign  campaign1 =new Campaign(2,"emekli",20);
		
		SaleManager salesManager=new SaleManager();
		
		UserManager userManager = new UserManager(new CheckRealPersonManager());
		
		userManager.add(bunyamin);
		userManager.add(nidal);

				
		salesManager.sales(witcher3, bunyamin, campaign);
		salesManager.sales(rDR2, emre, campaign1);
		salesManager.sales(godOfWar, nidal, campaign);

	}

}
