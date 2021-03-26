package day20_scope;

import java.util.Scanner;

public class Scope1 {
	
	public int sayi; // INSTANCE (Object) variable denir. Static de�ildir. Class i�inde ama main d���nda
			  		 // calss level de olu�turuldu�u i�in belli �artlarla class �n her yerinden kullan�labilir
			  		 // instance variable lar object e ba�l� olarak �al���r (��retmen ad� veya ��renci notu gibi)
	public String isim="Mehmet";
	public String soyisim;
	boolean ��renciMi;
	char ilkHarf;
	public static void main(String[] args) {
		
	//System.out.println(sayi); // static bir method da static olmayan bir variable yada method kullan�lamaz
	//method()					// main method static ama sayi class ta ve static de�il
		
		// �nstance bir variable a main method i�erisinden ula�mak istedi�imizde
		// OBJECT olu�turmal�y�z
		
		Scanner       scan       =               new            Scanner  (System.in); // bu Java daki standart obje olu�turma formu
	// class ismi    Obje ismi 	   obje olu�turmada keyword   Class ismi    ()
		
		Scope1 obj1= new Scope1();
		
		System.out.println(obj1.sayi); // 0
		System.out.println(obj1.isim); // Mehmet
		System.out.println(obj1.soyisim); // null
		
		// string e de�er atamazsak Java default de�er olarak null atar
		// instance variable lar olu�turuldu�unda biz istersek de�er atayabiliriz.
		// instance variable lara biz de�er atamazsak Java default de�er atar
		// boolean i�in default de�er false dur
		// char i�in default de�er hi�lik olur
		
		Scope1 obj2 = new Scope1();
		obj2.isim="M�sl�m";
		obj2.soyisim="Baba";
		
		System.out.println(obj2.isim+" "+obj2.soyisim); // M�sl�m Baba
		System.out.println(obj1.isim+" "+obj1.soyisim); // Mehmet null
		System.out.println(obj2.��renciMi); // false
		System.out.println(obj2.ilkHarf); // space(bo�luk)
		
		Scope1 obj3 = new Scope1();
		obj3.isim="Ferdi";
		obj3.soyisim="Tayfur";
		obj3.��renciMi=true;
		
		System.out.println(obj3.isim+" "+obj3.soyisim+" "+obj3.��renciMi); // Ferdi Tayfur true
		
		scan.close();
	}

	public static void staticMethod() {
		
	}

	public void method() {
	System.out.println(sayi); // bu method static olmad��� i�in instance variablelere direk ula�abilir
	sayi=sayi+20; // bu method i�inde ge�erli olamk �zere de�erini de�i�tirebiliriz
	
	}
}