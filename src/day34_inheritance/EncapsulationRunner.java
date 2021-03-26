package day34_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation obj1= new Encapsulation();
        System.out.println(obj1.getOkulIsmi()); // Yildiz koleji
        System.out.println(obj1.getOkulHesapNo()); // 12345
        System.out.println(obj1.isOkulAcikMi()); // true
        
        obj1.setOkulIsmi("Mehmet Koleji"); // obj1 için okul ismini deðiþtirdik
        System.out.println(obj1.getOkulIsmi()); // Mehmet Koleji
        
        Encapsulation obj2= new Encapsulation();
        System.out.println(obj2.getOkulIsmi()); // Yildiz koleji

	}

}
