package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullan�c�dan bir dikd�rtgenin iki kenar uzunlu�unu al�n
		// kenar uzunluklar� e�itse 'kare'
		// e�it de�ilse 'dikd�rtgen' yazd�r�n
		
	Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen iki kenar uzunlu�u giriniz");
		
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		
		if (sayi1>0 && sayi2>0 && sayi1 == sayi2) {
			System.out.println("kare");
		}
		if (sayi1>0 && sayi2>0 && sayi1 != sayi2) {
			System.out.println("dikd�rtgen");
		}
		if (sayi1<=0 || sayi2<=0) {
			System.out.println("L�tfen ge�erli bir uzunluk giriniz.");
		}
		scan.close();
	}

}
