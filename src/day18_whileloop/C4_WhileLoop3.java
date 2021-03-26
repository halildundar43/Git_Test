package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		// kullanýcýdan baþlangýç ve bitiþ harflaerini alýn ve
		// baþlangýç harfinden baþlayýp bitiþ harfinde biten tüm harflaeri
		// büyük harf olarak yazdýrýn
		// kullanýcýnýn hata yapmadýðýný farz edin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen baþlangýç harfini giriniz");
		char baþHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen bitiþ harfini giriniz");
		char bitHarf=scan.next().toUpperCase().charAt(0);
		
		for (char i = baþHarf; i <= bitHarf; i++) {
			System.out.print(i+ " ");
		}
		System.out.println("");
		// while loop ile yapalým
		while (baþHarf<=bitHarf) {
			System.out.print(baþHarf+ " ");
			baþHarf++;
		}
		scan.close();
	}

}
