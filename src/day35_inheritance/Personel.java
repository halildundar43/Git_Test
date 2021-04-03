package day35_inheritance;

public class Personel {
	public String isim;
	public int sayi;
	
	public Personel() { // parametresiz bir constructor oluþturdum
		// super();
				/*
				  Jaca dan yardým alarak bir constructor oluþturduðumuzda
				  Java constructor ýn ilk satýrýna super(); keyword unu ekler
				  Eðer içinde olduðumuz class bie child class deðilse super(); keywordu silinebilir
				  Bugüne kadar biz oluþturduðumuz constructorlarda hiç super(); keywordu kullanmadýk
				  		ancak bizim claslarýmýz child class olmadýðýndan sorun olmadý
				*/
				System.out.println("Personel parametresiz constructor çalýþtý");
	}

	public Personel(String isim, int sayi) { // parametreli bir constructor oluþturdum
			super();
		System.out.println("Personel parametreli constructor çalýþtý");
	}
	
	/* Eski derslerden hatýrlatma
	   Her class default constructor a sahiptir
	   Default constructor ýn parametresi yoktur
	   Biz parametreli veya parametresiz bir constructor oluþturduðumuzda default constructor silinir
	   Eðer biz sadece 1 tane parametreli constructor oluþturursak, Java default olaný
	        sildiði için parametresiz constructor kalmaz
	   Dolayýsyla parametreli constructor oluþturduðumuzda mutlaka default constructor
	   		yerine de parametresiz bir constructor oluþturmamýz gerekir
	 */
}
