package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanýcýdan bir dikdörtgenin iki kenar uzunluðunu alýn
		// kenar uzunluklarý eþitse 'kare'
		// eþit deðilse 'dikdörtgen' yazdýrýn
		
	Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen iki kenar uzunluðu giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		if (sayi1>0 && sayi2>0 && sayi1 == sayi2) {
			System.out.println("kare");
		}
		if (sayi1>0 && sayi2>0 && sayi1 != sayi2) {
			System.out.println("dikdörtgen");
		}
		if (sayi1<=0 || sayi2<=0) {
			System.out.println("Lütfen geçerli bir uzunluk giriniz.");
		}
		scan.close();
	}

}
