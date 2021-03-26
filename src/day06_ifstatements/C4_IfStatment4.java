package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatment4 {

	public static void main(String[] args) {
		// kullanýcýdan gün ismini isteyin
		//girilen gün hafta içi veya hafta sonu olduðunu yazdýrýn
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen bir gün giriniz.");
		
		String gun = scan.next().toLowerCase();
		
		if (gun.equals("pazartesi") || gun.equals("salý") || gun.equals("carþamba") || gun.equals("perþembe") || gun.equals("cuma")) {
			System.out.println("hafta içi bir gündür");
		}
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("hafta sonu bir gündür");
		}
				// bu kodda gün ismi dýlýnda yazýlana birþey oluþmaz
		
		scan.close();
	}

}
