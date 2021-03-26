package day13_stringmanipulations;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// kullan�c�dan bir c�mle ve aramak istedi�i bir string isteyin
		// c�mle stringi i�eriyorsa ba�ar�l� i�ermiyorsa ba�ars�z yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz.");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("L�tfen aramak istedi�iniz String'i giriniz.");
		String aranan = scan.nextLine().toLowerCase();
		
		System.out.println(cumle.contains(aranan)? "Ba�ar�l�" : "Ba�ar�s�z");
		
		int str1 = cumle.indexOf(aranan);
		if (str1>=-1) {
			System.out.println("Ba�ar�l�");
		} else {
			System.out.println("Ba�ar�s�z");
		}
		// kullan�c�dan mail adresini isteyin
		// mail adresi @gmail.com i�eriyorsa mailiniz kaydedildi yazs�n
		// yoksa l�tfen gmail adrsinisinizi girin yazs�n
		
		
		System.out.println("L�tfen mail adresinizi giriniz.");
		String email = scan.next();
		
		int sondam�=email.indexOf("@gmail.com", email.length()-10);
		
		if (email.contains("@gmail.com") && sondam�!=-1) { // @gmail.com un sonda oldu�unu kontrol eder
			System.out.println("mailiniz kaydedildi");
		} else {
			System.out.println("ge�erli bir gmail adresi girin");
		}
		
		scan.close();
		
		//System.out.println(email.contains(str2)? "Mail adresiniz ba�ar�yla kaydedildi" : "L�tfen gmail adresinizi girin");
		
		// gmail.com un en sonda oldu�unu kontrol etmek istersek
		
		//email.indexOf("@gmail.com", email.length()-10);
				
		
	}

}
