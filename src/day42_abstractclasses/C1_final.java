package day42_abstractclasses;

public class C1_final {
	
	final static int SAYI = 10;

	// instance bir variable'i final ve static yaparsan�z java onu bold yapar
	// biz de ismi B�Y�K HARFLE yazar�z

	String isim; // null
	// Instance variable'lara ilk de�er atamas� yapmak zorunda de�iliz
	// De�er atamad���m�zda Java data t�r�ne g�re default bir de�er atar

	// final String soyisim;
	// final variable'larin de�eri sonradan de�i�tirilemeyece�i i�in
	// ilk atama yap�lmadan olu�turulmas�na java izin vermez
	
	public static void main(String[] args) {

		System.out.println(SAYI);

		System.out.println(Integer.MAX_VALUE);
	}
	public void deneme() {
		System.out.println("deneme yapiyoruz");
	}
	public final void deneme2() {
		System.out.println("deneme yapiyoruz 2");

	}
}