package day07_ifelstatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullan�c�dan bir karakter girmesini isteyin
		// harf olup olmad���n� yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir karakter giriniz.");
		
		char karakter = scan.next().charAt(0);
				
		if ((karakter>= 'a' && karakter <= 'z') || (karakter>= 'A' && karakter <= 'Z')) {
			System.out.println("harf");
		} else {
			System.out.println("harf de�il");
		}
		scan.close();
	}

}
