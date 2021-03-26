package day21_scope;

public class Scope1 {

	static int okulId = 1201;
	static String okulAdý = "Yýldýz Koleji";
	static boolean açýkMý;
	
	// static variable'lar class level'da olusturuldugu icin class'in her yerinden kullanilabilirler
    // instance variable'lar static olmayan method'larda direk kullanilabiliyorken, static method'larda 
    // object olusturularak kullanilabiliyordu 
    // static variable'lar ise ister static isterse static olamayan tum method'lardan direk kullanilabilir

	public static void main(String[] args) {
		System.out.println(okulId + " " + okulAdý + " " + açýkMý); // 1201 Yýldýz Koleji false
		okulId = 1202;
		açýkMý = true;

		staticMethod();

		System.out.println(okulId + " " + okulAdý + " " + açýkMý); // 1203 Yýldýz Koleji true
	}

	public static void staticMethod() {
		System.out.println(okulId + " " + okulAdý + " " + açýkMý); // 1202 Yýldýz Koleji true
		okulId = 1203;
	}

	public void method() {
		okulId=1205; // bu class çalýþtýðýnda bu method çalýþmaz bu nedenle yaptýðýmýz atamanýn deðeri yok
	}
}
