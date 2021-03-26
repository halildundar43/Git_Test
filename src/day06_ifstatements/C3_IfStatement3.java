package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullanýcýdan gün isminin ilk harfini isteyin
		//harfe uygun gün isimlerini yazdýrýn
		// c == cuma ve cumartesi s == salý gibi
		
	Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen gün isminin ilk harfini giriniz.");
	
		char ilkHarf = scan.next().charAt(0);
	
	if (ilkHarf == 'p' || ilkHarf == 'P') {
		System.out.println("pazar, pazartesi veya perþembe");
	}
	if (ilkHarf == 's' || ilkHarf == 'S') {
		System.out.println("salý");
	}
	if (ilkHarf == 'c' || ilkHarf == 'C') {
		System.out.println("carþamba,cuma veya cumartesi");
	}
	if (ilkHarf!= 'p' && ilkHarf!= 'P' && ilkHarf!= 's' && ilkHarf!= 'S' && ilkHarf!= 'c' && ilkHarf!= 'C') {
		System.out.println("Lütfen geçerli bir harf yazýnýz.");
	}
	
	scan.close();
	}

}
