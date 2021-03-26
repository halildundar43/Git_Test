package day21_scope;

public class Scope2 {

	public static void main(String[] args) {

		// Static variable'lar icin object olusturma ihtiyaci yoktur
		// Baska bir Class'dan static variable'lara ulasmak istedigimizde
		// Ulasmak istedigimiz Class'in adi . static variable adi yazmamiz yeterlidir.

		System.out.println(Scope1.okulAd�); // Y�ld�z Koleji
		System.out.println(Scope1.okulId); // 1201

		Scope1.okulAd� = "Mehmet Koleji";
		System.out.println(Scope1.okulAd�); // Mehmet Koleji

		// Java Run Time program'dir
		// Scope2 Class'i calistirildiginda Scope1 calismazzzzzz
		// dolayisiyla en basta olusturulan veya atanan degerler gecerli olur

		Scope1.staticMethod(); // 1201 Mehmet Koleji false ==> scope1 deki static method ve scope 2 birle�iminden
		System.out.println(Scope1.okulId); // 1203 okulId scope 1 deki static method da atand�
		System.out.println(Scope1.okulAd�); // mehmet koleji okulAd� scope 2 de atand�
	}

	public static void staticMethod() {

	}

	public void method() {

	}
}
