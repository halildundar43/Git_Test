package day07_ifelstatement;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// kullanýcýdan dikdörtgenin kemar uzunluklarýný alýn
		// uzunluklar eþirse kare deðilse kare deðil yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen dikdörtgenin kenar uzunuklarýný girin");
		
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		if (sayi1==sayi2) {
			System.out.println("kare");
		} else {
			System.out.println("kare deðil");
		}
		scan.close();
	}

}
