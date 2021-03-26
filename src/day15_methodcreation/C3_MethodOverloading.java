package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// Java da ayn� isimle birden fazla method olu�turulursa buna overloading denir
		// Overloading yapabilmek i�in Method signature lar�n�n farkl� olmas� gerekir
		// Method Signature= isim + parametre + parametre data t�r�
		// biribirini kapsayan data t�rleri oldu�unda Java en optimum ��z�m� �retir
		// birebir uyan varsa o methodu �al��t�r�r, birebir uyan yoksa en fazla uyan methodu kullan�r
		// e�er kasayan bir method bulamazsa CTE verir
		toplama(10, 23);
		toplama('a', 'b');
		toplama("Ali ", "Veli");

	}

	public static void toplama(int sayi1, int sayi2) {

		System.out.println("integer method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {

		System.out.println("double method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {

		System.out.println("integer/double method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, int sayi2) {

		System.out.println("double/integer method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(char char1, char char2) {

		System.out.println("char method sonucu : " + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {

		System.out.println("String method sonucu : " + (str1 + str2));
	}

}
