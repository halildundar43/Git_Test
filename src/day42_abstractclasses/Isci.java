package day42_abstractclasses;

public class Isci extends Personel {
	
    public static void main(String[] args) {
    	
        Isci isci1=new Isci();
        isci1.maasHesapla(); // iþçiler için maaþ 5000 tl
        isci1.mesaiBilgisi(); // iþçiler günlük 8 saat çalýþýr
        isci1.isim="Rumeysa"; // abstract parent class'daki variable'larý istersem kullanabilirim
        System.out.println(isci1.isim); // Rumeysa
        // System.out.println(isim); 
        isci1.ozelSigorta(); // abstract parent class'daki concrete method'u istersem kullanýrým
                             // Bu personel özel sigorta kapsamýndadýr
                             // Bu method'u override etmedik ama parent-child iliþkisi ile kullanabildik
    }
    @Override
    public void maasHesapla() {
        // Parent class'daki abstract method'u implement (uyarlama) etti
        // 1- Sen abstract bir class'ý parent edindiysen mutlaka oradaki abstract method'u
        //    implement etmelisin
        // 2- Parent class'daki method'da body olmadýðý için onu kullanmanýn anlamý yok
        //    biz child class'da body olan method (concrete) kullanýp iþlem yapmalýyýz
        System.out.println("Ýþçiler için maaþ 5000 TL");  
    }
    @Override
    public void mesaiBilgisi() {
        System.out.println("Ýþçiler günlük 8 saat çalýþýr");    
    }
}