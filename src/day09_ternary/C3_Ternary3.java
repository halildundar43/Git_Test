package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// kullan�c�dan 2 say� al�n b�y�k olan� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki say� giriniz.");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		String sonuc = (sayi1>sayi2) ? "B�y�k say� " + sayi1 : "B�y�k Say� " + sayi2;
		System.out.println(sonuc);

		scan.close();
	}

}
