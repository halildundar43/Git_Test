package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// OOP concept
        // Object Oriented Programing
        // Bir proje kapsamindaki class'larda olusturulan variable ve method'larin
        // baska class'larda tekrar tekrar yazýlmamasý, var oldugu class'dan obje üretilerek
        // bu variable ve method'larin istendiði kadar kullanilmasidir. (reusability)
        // Write Once Reuse Anywhere
        
        // scope6 class'indaki variable ve methodlara ulasmak istiyorum
        // bunun icin Scope6 class'indan obje uretmeliyiz
        
        Scope6 obj1 = new Scope6();
        // eþitliðin sol tarafý declaration
        // declaration 2 parçadýr ilk parça Data türü, ikinci kýsým isim 
        // non-primitive'ler için data türü ayný zaman da class ismi olabilir
        // eþitliðin saðýnda ise deðer, 2 parcadan olusur
        // new keyword'u, ikicisi de constructor 
        // hangi class'dan obje üretmek istersek o class'in constructor'ýný kullanýrýz
        obj1.num1=10;
        System.out.println(obj1.num1); // 10
        obj1.add();
        
        // deneme() method'unu main method içinden cagirabilir miyim ?
        // deneme(); method'u static olmadigi icin main method'dan direk cagrilamaz
        // Bunun yerine icinde olduðumuz class'dan bir obje üretip onun üzerinden 
        // static olmayan method'larý da caðýrabiliriz
        Encapsulation01 obj3=new Encapsulation01();
        obj3.deneme();
    }
    
    public void deneme() {
        // Projemiz kapsaminda bulunan tüm Class'lardan
        // public variable ve method'lara istediðim yerden obje üreterek ulasabilirim.
        // eðer ulaþmak istediðim class üyeleri (class member) public deðilse baþka 
        // package'lerden ulaþmak icin extra iþlem yapmamýz gerekir.
        Scope1 obj2 = new Scope1();
        obj2.isim="Ahmet";
        obj2.soyisim="Ozcelik";
        obj2.sayi=15;
        obj2.method();
        
        // Ben istediðim class'dan obje üretip oradaki public class üyelerine ulaþabilirim...
	}

}
