package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 class'indaki class member'a ulaşmaya calışalım
        
        Encapsulation02 obj1 = new Encapsulation02();
        Encapsulation02 obj2 = new Encapsulation02();
        
        // Biz erişim yetkisini ikiye ayırıyoruz 
        // 1- okuyabilme get()
        // 2- değiştirip kullanabilme set()
        
        System.out.println(obj1.sayi); // 100 public olduğundan hem okudum
        obj1.sayi=25;                  // 25 hem de değer atayabildim
        System.out.println(obj1.sayi); 
        
        System.out.println(obj2.sayi); // 100
        
        System.out.println(obj1.getOkulIsmi()); // get method'u olduğu için sadece bilgi verir
        // obj1.getOkulIsmi()="Mehmet Koleji"; // get method'u sadece okur, değiştiremez
        
        obj1.setTcNo("326547895447");
        // System.out.println(obj1.setTcNo("12356478912")); set() methodu okumaya izin vermez
        
    
        // Bir Class içinde class member oluşturuken bunu diğer class'lar ile
        // ne oranda paylaşacağımıza karar veririz 3 ihtimal var
        // 1-  Herkes okuyabilsin ve obje üzerinden değer atayıp kullanbilsin ==> public
        // 2-  Herkes okuyabilsin ama kimse obje üzerinden de olsa değiştiremesin Private ==> Public get();
        // 3-  İlk atadığım değeri kimse göremesin Private ==> Public set ()

	}

}
