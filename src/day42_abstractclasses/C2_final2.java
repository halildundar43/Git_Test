package day42_abstractclasses;

public class C2_final2 extends C1_final {
	public static void main(String[] args) {

		System.out.println(C1_final.SAYI);

		// static bir variable okul ismi gibi herkes için aynýdýr

		// C1_final.SAYI+=20;
		// SAYI variable'ý final olarak tanýmlandýðý için DEÐÝÞTÝRÝLEMEZ

		C2_final2 obj1 = new C2_final2(); // bu class ta deneme method var mý

		obj1.deneme();
	}
	public void deneme() {
		System.out.println("child class'daki overriding method");
	}

	 /*
	  public void deneme2() { //Cannot override the final method from C1_final } 
	 */

	// final class yaptýðýmýzda inherit edilemez
}