package day35_inheritance;

public class Personel {
	public String isim;
	public int sayi;
	
	public Personel() { // parametresiz bir constructor olu�turdum
		// super();
				/*
				  Jaca dan yard�m alarak bir constructor olu�turdu�umuzda
				  Java constructor �n ilk sat�r�na super(); keyword unu ekler
				  E�er i�inde oldu�umuz class bie child class de�ilse super(); keywordu silinebilir
				  Bug�ne kadar biz olu�turdu�umuz constructorlarda hi� super(); keywordu kullanmad�k
				  		ancak bizim claslar�m�z child class olmad���ndan sorun olmad�
				*/
				System.out.println("Personel parametresiz constructor �al��t�");
	}

	public Personel(String isim, int sayi) { // parametreli bir constructor olu�turdum
			super();
		System.out.println("Personel parametreli constructor �al��t�");
	}
	
	/* Eski derslerden hat�rlatma
	   Her class default constructor a sahiptir
	   Default constructor �n parametresi yoktur
	   Biz parametreli veya parametresiz bir constructor olu�turdu�umuzda default constructor silinir
	   E�er biz sadece 1 tane parametreli constructor olu�turursak, Java default olan�
	        sildi�i i�in parametresiz constructor kalmaz
	   Dolay�syla parametreli constructor olu�turdu�umuzda mutlaka default constructor
	   		yerine de parametresiz bir constructor olu�turmam�z gerekir
	 */
}
