package day07_ifelstatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanıcıdan bir karakter girmesini isteyin
		// harf olup olmadığını yazdırın
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir karakter giriniz.");
		
		char karakter = scan.next().charAt(0);
				
		if ((karakter>= 'a' && karakter <= 'z') || (karakter>= 'A' && karakter <= 'Z')) {
			System.out.println("harf");
		} else {
			System.out.println("harf değil");
		}
		scan.close();
	}

}
