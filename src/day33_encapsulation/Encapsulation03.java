package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 class'indaki class member'a ula�maya cal��al�m
        
        Encapsulation02 obj1 = new Encapsulation02();
        Encapsulation02 obj2 = new Encapsulation02();
        
        // Biz eri�im yetkisini ikiye ay�r�yoruz 
        // 1- okuyabilme get()
        // 2- de�i�tirip kullanabilme set()
        
        System.out.println(obj1.sayi); // 100 public oldu�undan hem okudum
        obj1.sayi=25;                  // 25 hem de de�er atayabildim
        System.out.println(obj1.sayi); 
        
        System.out.println(obj2.sayi); // 100
        
        System.out.println(obj1.getOkulIsmi()); // get method'u oldu�u i�in sadece bilgi verir
        // obj1.getOkulIsmi()="Mehmet Koleji"; // get method'u sadece okur, de�i�tiremez
        
        obj1.setTcNo("326547895447");
        // System.out.println(obj1.setTcNo("12356478912")); set() methodu okumaya izin vermez
        
    
        // Bir Class i�inde class member olu�turuken bunu di�er class'lar ile
        // ne oranda payla�aca��m�za karar veririz 3 ihtimal var
        // 1-  Herkes okuyabilsin ve obje �zerinden de�er atay�p kullanbilsin ==> public
        // 2-  Herkes okuyabilsin ama kimse obje �zerinden de olsa de�i�tiremesin Private ==> Public get();
        // 3-  �lk atad���m de�eri kimse g�remesin Private ==> Public set ()

	}

}
