package day04_operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Yas�n�z� giriniz.");
		String yas = scan.nextLine(); // int yerine String yaz�nca ad soyad yaz�l�labilir ama java �ekil olarak g�r�r
		int yeniYas = Integer.parseInt(yas);
		System.out.println(yeniYas + 1); //34
		
	System.out.println("Adinizi ve soyadinizi giriniz.");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		
		scan.close();
		
		
		
		
		

	}

}
