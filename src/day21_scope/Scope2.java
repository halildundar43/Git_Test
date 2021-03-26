package day21_scope;

public class Scope2 {

	public static void main(String[] args) {

		// Static variable'lar icin object olusturma ihtiyaci yoktur
		// Baska bir Class'dan static variable'lara ulasmak istedigimizde
		// Ulasmak istedigimiz Class'in adi . static variable adi yazmamiz yeterlidir.

		System.out.println(Scope1.okulAdý); // Yýldýz Koleji
		System.out.println(Scope1.okulId); // 1201

		Scope1.okulAdý = "Mehmet Koleji";
		System.out.println(Scope1.okulAdý); // Mehmet Koleji

		// Java Run Time program'dir
		// Scope2 Class'i calistirildiginda Scope1 calismazzzzzz
		// dolayisiyla en basta olusturulan veya atanan degerler gecerli olur

		Scope1.staticMethod(); // 1201 Mehmet Koleji false ==> scope1 deki static method ve scope 2 birleþiminden
		System.out.println(Scope1.okulId); // 1203 okulId scope 1 deki static method da atandý
		System.out.println(Scope1.okulAdý); // mehmet koleji okulAdý scope 2 de atandý
	}

	public static void staticMethod() {

	}

	public void method() {

	}
}
