package day21_scope;

public class Scope1 {

	static int okulId = 1201;
	static String okulAd� = "Y�ld�z Koleji";
	static boolean a��kM�;
	
	// static variable'lar class level'da olusturuldugu icin class'in her yerinden kullanilabilirler
    // instance variable'lar static olmayan method'larda direk kullanilabiliyorken, static method'larda 
    // object olusturularak kullanilabiliyordu 
    // static variable'lar ise ister static isterse static olamayan tum method'lardan direk kullanilabilir

	public static void main(String[] args) {
		System.out.println(okulId + " " + okulAd� + " " + a��kM�); // 1201 Y�ld�z Koleji false
		okulId = 1202;
		a��kM� = true;

		staticMethod();

		System.out.println(okulId + " " + okulAd� + " " + a��kM�); // 1203 Y�ld�z Koleji true
	}

	public static void staticMethod() {
		System.out.println(okulId + " " + okulAd� + " " + a��kM�); // 1202 Y�ld�z Koleji true
		okulId = 1203;
	}

	public void method() {
		okulId=1205; // bu class �al��t���nda bu method �al��maz bu nedenle yapt���m�z ataman�n de�eri yok
	}
}
