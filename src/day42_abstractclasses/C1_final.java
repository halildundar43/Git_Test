package day42_abstractclasses;

public class C1_final {
	
	final static int SAYI = 10;

	// instance bir variable'i final ve static yaparsanýz java onu bold yapar
	// biz de ismi BÜYÜK HARFLE yazarýz

	String isim; // null
	// Instance variable'lara ilk deðer atamasý yapmak zorunda deðiliz
	// Deðer atamadýðýmýzda Java data türüne göre default bir deðer atar

	// final String soyisim;
	// final variable'larin deðeri sonradan deðiþtirilemeyeceði için
	// ilk atama yapýlmadan oluþturulmasýna java izin vermez
	
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