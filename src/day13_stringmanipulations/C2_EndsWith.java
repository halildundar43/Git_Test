package day13_stringmanipulations;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		String str = "Javayla hayat ne güzel";
		System.out.println(str.endsWith("zel"));
		System.out.println(str.endsWith("ne güzel"));
		System.out.println(str.endsWith("ne güzel "));

		// kullanýcýdan email isteyin
		// eðer @ iþareti içermiyorsa lütfen girdiðiniz bilgi email deðil desin
		// @iþareti içeriyor ama @gmail.com içermiyorsa lütfen gmail adresi yazýn desi
		// ilk iki þartý saðlýyor fakat @gmail.com ile bitmiyorsa geçersiz email desin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen email adresini giriniz");
		String email = scan.next();

		if (!email.contains("@")) { // @ yoksa demektir ! olumsuzluk kazandýrýr
			System.out.println("Girdiðiniz bilgi email deðil");
			
		} else if (!email.contains("@gmail.com")) {
			System.out.println("Lütfen gmail adresi yazýn");
			
		} else if (email.endsWith("@gmail.com")) {
			System.out.println("emailiniz kaydedildi");
			
		} else {
			System.out.println("Geçersiz email");
		}

		scan.close();
	}

}
