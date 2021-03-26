package day14_methodcreation;

public class C3_methodcreation3 {

	public static void main(String[] args) {
		// verilen üç double sayýnýn ortalamasýný yazdýran bir method yazýn
		// main method içinden çaðýrarrak çalýþtýrýn

		ortalama(85.2, 90.3, 90); // hangi methodun çalýþacaðýna method içindeki parametre sayýsýna bakarak karar verir
		ortalama(85.2,90.3);
		
	} // main method sonu

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println("girdiðiniz üç sayýnýn ortalamasý : " + (sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiðiniz iki sayýnýn ortalamasý : " + (sayi1 + sayi2) / 2);
		
	}
}// class sonu
