package day42_abstractclasses;

public abstract class Personel {
	
	// bir class'ý abstract yapmak için class keyword'ünden önce 
    // abstract yazmak yeterlidir.
    
    // abstract bir class'ýn içinde variable olabilir mi ? Evet olabilir
     
     public String isim = "Yasin";
     
     // variable'lar abstract olur mu ? Hayýr olmaz...
     // public abstract int sayi=10;
     
     // abstract class'in tüm concrete child'larý abstract class'daki 
     // tüm dinamik özellikleri yani methodlarý
     // override etmek zorundadýr.
     // bir method abstract olur mu ve nasýl yapýlýr ? Evet olabilir
     public abstract void maasHesapla();
     public abstract void mesaiBilgisi();
     
     // Bir abstract class'da concrete method yazýlabilir mi ? Evet yazýlabilir
     // Bir abstract class'da abstract ve concrete method'lar olabilir
     //  concrete child class'lar abstract method'larý override ETMEK ZORUNDADIR ama
     //  concrete methodlarý override etmek isteðe baðlýdýr.
     public void ozelSigorta() {
         System.out.println("Bu personel özel sigorta kapsamýndadýr");

}
}