package day13_stringmanipulations;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		String str = "Javayla hayat ne g�zel";
		System.out.println(str.endsWith("zel"));
		System.out.println(str.endsWith("ne g�zel"));
		System.out.println(str.endsWith("ne g�zel "));

		// kullan�c�dan email isteyin
		// e�er @ i�areti i�ermiyorsa l�tfen girdi�iniz bilgi email de�il desin
		// @i�areti i�eriyor ama @gmail.com i�ermiyorsa l�tfen gmail adresi yaz�n desi
		// ilk iki �art� sa�l�yor fakat @gmail.com ile bitmiyorsa ge�ersiz email desin

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen email adresini giriniz");
		String email = scan.next();

		if (!email.contains("@")) { // @ yoksa demektir ! olumsuzluk kazand�r�r
			System.out.println("Girdi�iniz bilgi email de�il");
			
		} else if (!email.contains("@gmail.com")) {
			System.out.println("L�tfen gmail adresi yaz�n");
			
		} else if (email.endsWith("@gmail.com")) {
			System.out.println("emailiniz kaydedildi");
			
		} else {
			System.out.println("Ge�ersiz email");
		}

		scan.close();
	}

}
