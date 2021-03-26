package day14_methodcreation;

public class C2_methodcreation2 {

	public static void main(String[] args) {
	 
		//bir methodu çalýþtýrmak içinden çaðýrmamýz gerekir
		//bir methodu çaðýrmak için ise methodun adýný ve parametrelere uygun 
		//argümentleri yazmalýyýz
		ortalama(85.2,90.3); // method call
							 // 1.parametreye 1.argümenti 2.parametreye 2.argümenti yazar
		
	
	
	}//main method somu
	
		//bir method oluþturmak istediðimizde calss içinde ama main method un dýþýnda oluþturmalýyýz
		//genel kullaným main method dan sonra oluþturmadýr
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdiðiniz iki sayýnýn ortalamasý : " + (sayi1+sayi2)/2);
		//bir methodu oluþturmak o methodu çalýþtýrmak için yeterli deðildir
		//oluþturulan method main method içinden çaðrýlýnca çalýþýr
	}
	
}//class sonu
