package day07_ifelstatement;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// kullan�c�dan dikd�rtgenin kemar uzunluklar�n� al�n
		// uzunluklar e�irse kare de�ilse kare de�il yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen dikd�rtgenin kenar uzunuklar�n� girin");
		
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		if (sayi1==sayi2) {
			System.out.println("kare");
		} else {
			System.out.println("kare de�il");
		}
		scan.close();
	}

}
