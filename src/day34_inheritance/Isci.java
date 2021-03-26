package day34_inheritance;

public class Isci extends Muhasebe {
	
    public static void main(String[] args) {
        
        Isci isci1 = new Isci();
        isci1.isim="Omer";
        isci1.soyisim="Aydin";
        isci1.id=1001;
        isci1.izindeMi=false;
        isci1.saatUcreti=10;
        isci1.statu="Isci";
        isci1.maas=isci1.maasHesapla();
        
        System.out.println(isci1.id+" "+isci1.isim +" "+isci1.soyisim+" "+
                           isci1.statu+" "+isci1.maas+" TL");  
        
        // Bu derse kadar hangi class'dan bilgi elde etmek istiyorsak o class'dan obje olu�turduk
        // Inheritance ile bu mecburiyet ortadan kalkt�
        // Child class'da olu�turdu�um obje ile t�m parent class'larda
        // bulunan variable ve method'lari inherit edebilirim.
        
        Isci isci2 = new Isci();
        isci2.isim="Esad";
        isci2.soyisim="Okumus";
        isci2.id=1002;
        isci2.izindeMi=true;
        isci2.saatUcreti=15;
        isci2.statu="Isci";
        isci2.maas=isci2.maasHesapla();
        
        System.out.println(isci2.id+" "+isci2.isim + " " + isci2.soyisim+ " " +
                           isci2.statu+ " " + isci2.maas + " tl");
        
       // System.out.println(id1.id); objenin bilgilerini yazd�rabiliriz
    }
}
