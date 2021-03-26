package day13_stringmanipulations;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// kullanýcýdan bir cümle ve aramak istediði bir string isteyin
		// cümle stringi içeriyorsa baþarýlý içermiyorsa baþarsýz yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz.");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("Lütfen aramak istediðiniz String'i giriniz.");
		String aranan = scan.nextLine().toLowerCase();
		
		System.out.println(cumle.contains(aranan)? "Baþarýlý" : "Baþarýsýz");
		
		int str1 = cumle.indexOf(aranan);
		if (str1>=-1) {
			System.out.println("Baþarýlý");
		} else {
			System.out.println("Baþarýsýz");
		}
		// kullanýcýdan mail adresini isteyin
		// mail adresi @gmail.com içeriyorsa mailiniz kaydedildi yazsýn
		// yoksa lütfen gmail adrsinisinizi girin yazsýn
		
		
		System.out.println("Lütfen mail adresinizi giriniz.");
		String email = scan.next();
		
		int sondamý=email.indexOf("@gmail.com", email.length()-10);
		
		if (email.contains("@gmail.com") && sondamý!=-1) { // @gmail.com un sonda olduðunu kontrol eder
			System.out.println("mailiniz kaydedildi");
		} else {
			System.out.println("geçerli bir gmail adresi girin");
		}
		
		scan.close();
		
		//System.out.println(email.contains(str2)? "Mail adresiniz baþarýyla kaydedildi" : "Lütfen gmail adresinizi girin");
		
		// gmail.com un en sonda olduðunu kontrol etmek istersek
		
		//email.indexOf("@gmail.com", email.length()-10);
				
		
	}

}
