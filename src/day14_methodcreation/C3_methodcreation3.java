package day14_methodcreation;

public class C3_methodcreation3 {

	public static void main(String[] args) {
		// verilen �� double say�n�n ortalamas�n� yazd�ran bir method yaz�n
		// main method i�inden �a��rarrak �al��t�r�n

		ortalama(85.2, 90.3, 90); // hangi methodun �al��aca��na method i�indeki parametre say�s�na bakarak karar verir
		ortalama(85.2,90.3);
		
	} // main method sonu

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println("girdi�iniz �� say�n�n ortalamas� : " + (sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdi�iniz iki say�n�n ortalamas� : " + (sayi1 + sayi2) / 2);
		
	}
}// class sonu
