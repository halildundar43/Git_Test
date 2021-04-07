package day42_abstractclasses;

public class Isci extends Personel {
	
    public static void main(String[] args) {
    	
        Isci isci1=new Isci();
        isci1.maasHesapla(); // i��iler i�in maa� 5000 tl
        isci1.mesaiBilgisi(); // i��iler g�nl�k 8 saat �al���r
        isci1.isim="Rumeysa"; // abstract parent class'daki variable'lar� istersem kullanabilirim
        System.out.println(isci1.isim); // Rumeysa
        // System.out.println(isim); 
        isci1.ozelSigorta(); // abstract parent class'daki concrete method'u istersem kullan�r�m
                             // Bu personel �zel sigorta kapsam�ndad�r
                             // Bu method'u override etmedik ama parent-child ili�kisi ile kullanabildik
    }
    @Override
    public void maasHesapla() {
        // Parent class'daki abstract method'u implement (uyarlama) etti
        // 1- Sen abstract bir class'� parent edindiysen mutlaka oradaki abstract method'u
        //    implement etmelisin
        // 2- Parent class'daki method'da body olmad��� i�in onu kullanman�n anlam� yok
        //    biz child class'da body olan method (concrete) kullan�p i�lem yapmal�y�z
        System.out.println("���iler i�in maa� 5000 TL");  
    }
    @Override
    public void mesaiBilgisi() {
        System.out.println("���iler g�nl�k 8 saat �al���r");    
    }
}