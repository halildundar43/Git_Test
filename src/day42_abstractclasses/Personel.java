package day42_abstractclasses;

public abstract class Personel {
	
	// bir class'� abstract yapmak i�in class keyword'�nden �nce 
    // abstract yazmak yeterlidir.
    
    // abstract bir class'�n i�inde variable olabilir mi ? Evet olabilir
     
     public String isim = "Yasin";
     
     // variable'lar abstract olur mu ? Hay�r olmaz...
     // public abstract int sayi=10;
     
     // abstract class'in t�m concrete child'lar� abstract class'daki 
     // t�m dinamik �zellikleri yani methodlar�
     // override etmek zorundad�r.
     // bir method abstract olur mu ve nas�l yap�l�r ? Evet olabilir
     public abstract void maasHesapla();
     public abstract void mesaiBilgisi();
     
     // Bir abstract class'da concrete method yaz�labilir mi ? Evet yaz�labilir
     // Bir abstract class'da abstract ve concrete method'lar olabilir
     //  concrete child class'lar abstract method'lar� override ETMEK ZORUNDADIR ama
     //  concrete methodlar� override etmek iste�e ba�l�d�r.
     public void ozelSigorta() {
         System.out.println("Bu personel �zel sigorta kapsam�ndad�r");

}
}