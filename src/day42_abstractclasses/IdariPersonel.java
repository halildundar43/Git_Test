package day42_abstractclasses;

public class IdariPersonel extends Personel {
    
    // extends Personel yazarak Abstract Personele concrete bir child oluþturdum
    // ve Java CTE verdi 
    // çözüm olarak ürettiði 2 ihtimal var
    // 1- Unimplemented(uyarlanmamýþ) method'larý uyarla
    // 2- Ya da Personel class'ýndan abstract kelimesini kaldýr
    // Bu class'ýn çalýþabilmesi için 2 iþlemden birini yapmak zorundayýz
	
    public static void main(String[] args) {
        
    }
    // concrete bir class'da abstract bir method olabilir mi ? Hayýr olamaz
    // abstract bir method sadece abstract bir class'da olusturulabilir...
    // public abstract void surekliCalisma();
    // The abstract method surekliCalisma in type IdariPersonel 
    // can only be defined by an abstract class
    @Override
    public void maasHesapla() {
        System.out.println("Ýdari personel maaþý 4000 TL");    
    }
    @Override
    public void mesaiBilgisi() {
     
}  
}