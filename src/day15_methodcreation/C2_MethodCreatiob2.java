package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreatiob2 {

	public static void main(String[] args) {
		// kullanýcýya kaç sayý toplamak istediðini sorun
		// kullanýcý 2,3 veya 4 deðerini girerse
		// kullanýcýdan bu sayýlarý girmesini isteyin ve
		// sayýlarýn toplamýný yazdýrýn
		// kullanýcý toplamak istediði sayý adetini 4 ten fazla girerse
		// çok sayý girdiniz ben toplayamam yazdýrýn
		// ikiden az sayý girerse en az iki sayý girmelisiniz desin

		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç sayý toplamak istiyorsunuz");
		int adet = scan.nextInt();

		if (adet < 2) {
			System.out.println("En az iki sayý girmelisiniz");
		} else if (adet == 2) {
			ikiSayýTopla();
		} else if (adet == 3) {
			üçSayýTopla();
		} else if (adet == 4) {
			dörtSayýTopla();
		} else {
			System.out.println("Çok sayý girdiniz, ben toplayamam");
		}
		scan.close();
	}

	public static void dörtSayýTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen dört sayý giriniz");
		double sayý1 = scan.nextDouble();
		double sayý2 = scan.nextDouble();
		double sayý3 = scan.nextDouble();
		double sayý4 = scan.nextDouble();
		System.out.println("Dört sayýnýn toplamý" + (sayý1 + sayý2 + sayý3 + sayý4));
		
		scan.close();
	}

	public static void üçSayýTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen üç sayý giriniz");
		double sayý1 = scan.nextDouble();
		double sayý2 = scan.nextDouble();
		double sayý3 = scan.nextDouble();
		System.out.println("Üç sayýnýn toplamý" + (sayý1 + sayý2 + sayý3));
		
		scan.close();
	}

	public static void ikiSayýTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki sayý giriniz");
		double sayý1 = scan.nextDouble();
		double sayý2 = scan.nextDouble();
		System.out.println("Ýki sayýnýn toplamý" + (sayý1 + sayý2));
		
		scan.close();
	}
	
}
