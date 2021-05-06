package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String internetSubeButonu="internet þubeye gir";
		double dolarDun=8.15;
		double dolarBugun=8.25;
		int vade=36;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("dolar düþtü");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("dolar yükseldi");
		}
		else {
			System.out.println("dolar sabit");
		}
		
		String[] krediler=
			{
					"mutlu kredi",
					"emekli kredisi",
					"hýzlý kredi",
					"çiftçi kredisi"
					
			};
		
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=30;
		System.out.println(sayi1);//stack: direkt deðer tutuluyo örn:int,string(referans tip ama istisna),double,float,boolean
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);// heap: adresleme olarak tutuluyor örn:arrays,class,interface
	}

}
