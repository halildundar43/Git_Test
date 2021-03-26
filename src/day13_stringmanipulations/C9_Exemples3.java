package day13_stringmanipulations;

import java.util.Scanner;

public class C9_Exemples3 {

	public static void main(String[] args) {
		// kullanýcýdan ismini soy ismini ve kart nosunu isteyim
		// isim soy isin: M***** A*****
		// kart : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isminizi giriniz");
		String isim=scan.next();
		
		System.out.println("Lütfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lütfen kart nonuzu giriniz");
		String kartNo=scan.next();
		
		char isimÝlkHarf=isim.toUpperCase().charAt(0);
		String geriKalanÝsim=isim.substring(1).replaceAll("\\w", "*");
				
		String soyisimÝlkHarf=soyisim.toUpperCase().substring(0, 1);
		String geriKalanSoyisim=soyisim.substring(1).replaceAll("\\w", "*");
		
		String kartNoBaþý="**** **** ****";
		String kartNoSonu=kartNo.substring(kartNo.length()-4);
		
		System.out.println("Ýsminiz ve Soyisminiz " + isimÝlkHarf+" "+geriKalanÝsim+soyisimÝlkHarf+" "+geriKalanSoyisim);
		System.out.println("Kart No :"+ kartNoBaþý+" "+kartNoSonu);

		scan.close();
	}

}
