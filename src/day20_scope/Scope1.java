package day20_scope;

import java.util.Scanner;

public class Scope1 {
	
	public int sayi; // INSTANCE (Object) variable denir. Static deðildir. Class içinde ama main dýþýnda
			  		 // calss level de oluþturulduðu için belli þartlarla class ýn her yerinden kullanýlabilir
			  		 // instance variable lar object e baðlý olarak çalýþýr (öðretmen adý veya öðrenci notu gibi)
	public String isim="Mehmet";
	public String soyisim;
	boolean öðrenciMi;
	char ilkHarf;
	public static void main(String[] args) {
		
	//System.out.println(sayi); // static bir method da static olmayan bir variable yada method kullanýlamaz
	//method()					// main method static ama sayi class ta ve static deðil
		
		// Ýnstance bir variable a main method içerisinden ulaþmak istediðimizde
		// OBJECT oluþturmalýyýz
		
		Scanner       scan       =               new            Scanner  (System.in); // bu Java daki standart obje oluþturma formu
	// class ismi    Obje ismi 	   obje oluþturmada keyword   Class ismi    ()
		
		Scope1 obj1= new Scope1();
		
		System.out.println(obj1.sayi); // 0
		System.out.println(obj1.isim); // Mehmet
		System.out.println(obj1.soyisim); // null
		
		// string e deðer atamazsak Java default deðer olarak null atar
		// instance variable lar oluþturulduðunda biz istersek deðer atayabiliriz.
		// instance variable lara biz deðer atamazsak Java default deðer atar
		// boolean için default deðer false dur
		// char için default deðer hiçlik olur
		
		Scope1 obj2 = new Scope1();
		obj2.isim="Müslüm";
		obj2.soyisim="Baba";
		
		System.out.println(obj2.isim+" "+obj2.soyisim); // Müslüm Baba
		System.out.println(obj1.isim+" "+obj1.soyisim); // Mehmet null
		System.out.println(obj2.öðrenciMi); // false
		System.out.println(obj2.ilkHarf); // space(boþluk)
		
		Scope1 obj3 = new Scope1();
		obj3.isim="Ferdi";
		obj3.soyisim="Tayfur";
		obj3.öðrenciMi=true;
		
		System.out.println(obj3.isim+" "+obj3.soyisim+" "+obj3.öðrenciMi); // Ferdi Tayfur true
		
		scan.close();
	}

	public static void staticMethod() {
		
	}

	public void method() {
	System.out.println(sayi); // bu method static olmadýðý için instance variablelere direk ulaþabilir
	sayi=sayi+20; // bu method içinde geçerli olamk üzere deðerini deðiþtirebiliriz
	
	}
}