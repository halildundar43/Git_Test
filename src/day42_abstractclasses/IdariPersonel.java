package day42_abstractclasses;

public class IdariPersonel extends Personel {
    
    // extends Personel yazarak Abstract Personele concrete bir child olu�turdum
    // ve Java CTE verdi 
    // ��z�m olarak �retti�i 2 ihtimal var
    // 1- Unimplemented(uyarlanmam��) method'lar� uyarla
    // 2- Ya da Personel class'�ndan abstract kelimesini kald�r
    // Bu class'�n �al��abilmesi i�in 2 i�lemden birini yapmak zorunday�z
	
    public static void main(String[] args) {
        
    }
    // concrete bir class'da abstract bir method olabilir mi ? Hay�r olamaz
    // abstract bir method sadece abstract bir class'da olusturulabilir...
    // public abstract void surekliCalisma();
    // The abstract method surekliCalisma in type IdariPersonel 
    // can only be defined by an abstract class
    @Override
    public void maasHesapla() {
        System.out.println("�dari personel maa�� 4000 TL");    
    }
    @Override
    public void mesaiBilgisi() {
     
}  
}