package day04_operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Yasýnýzý giriniz.");
		String yas = scan.nextLine(); // int yerine String yazýnca ad soyad yazýlýlabilir ama java þekil olarak görür
		int yeniYas = Integer.parseInt(yas);
		System.out.println(yeniYas + 1); //34
		
	System.out.println("Adinizi ve soyadinizi giriniz.");
		String isim = scan.nextLine();
		System.out.println(isim);
		
		
		scan.close();
		
		
		
		
		

	}

}
