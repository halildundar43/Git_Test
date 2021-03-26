package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// OOP concept
        // Object Oriented Programing
        // Bir proje kapsamindaki class'larda olusturulan variable ve method'larin
        // baska class'larda tekrar tekrar yaz�lmamas�, var oldugu class'dan obje �retilerek
        // bu variable ve method'larin istendi�i kadar kullanilmasidir. (reusability)
        // Write Once Reuse Anywhere
        
        // scope6 class'indaki variable ve methodlara ulasmak istiyorum
        // bunun icin Scope6 class'indan obje uretmeliyiz
        
        Scope6 obj1 = new Scope6();
        // e�itli�in sol taraf� declaration
        // declaration 2 par�ad�r ilk par�a Data t�r�, ikinci k�s�m isim 
        // non-primitive'ler i�in data t�r� ayn� zaman da class ismi olabilir
        // e�itli�in sa��nda ise de�er, 2 parcadan olusur
        // new keyword'u, ikicisi de constructor 
        // hangi class'dan obje �retmek istersek o class'in constructor'�n� kullan�r�z
        obj1.num1=10;
        System.out.println(obj1.num1); // 10
        obj1.add();
        
        // deneme() method'unu main method i�inden cagirabilir miyim ?
        // deneme(); method'u static olmadigi icin main method'dan direk cagrilamaz
        // Bunun yerine icinde oldu�umuz class'dan bir obje �retip onun �zerinden 
        // static olmayan method'lar� da ca��rabiliriz
        Encapsulation01 obj3=new Encapsulation01();
        obj3.deneme();
    }
    
    public void deneme() {
        // Projemiz kapsaminda bulunan t�m Class'lardan
        // public variable ve method'lara istedi�im yerden obje �reterek ulasabilirim.
        // e�er ula�mak istedi�im class �yeleri (class member) public de�ilse ba�ka 
        // package'lerden ula�mak icin extra i�lem yapmam�z gerekir.
        Scope1 obj2 = new Scope1();
        obj2.isim="Ahmet";
        obj2.soyisim="Ozcelik";
        obj2.sayi=15;
        obj2.method();
        
        // Ben istedi�im class'dan obje �retip oradaki public class �yelerine ula�abilirim...
	}

}
