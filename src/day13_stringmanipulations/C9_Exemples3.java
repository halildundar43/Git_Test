package day13_stringmanipulations;

import java.util.Scanner;

public class C9_Exemples3 {

	public static void main(String[] args) {
		// kullan�c�dan ismini soy ismini ve kart nosunu isteyim
		// isim soy isin: M***** A*****
		// kart : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen isminizi giriniz");
		String isim=scan.next();
		
		System.out.println("L�tfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("L�tfen kart nonuzu giriniz");
		String kartNo=scan.next();
		
		char isim�lkHarf=isim.toUpperCase().charAt(0);
		String geriKalan�sim=isim.substring(1).replaceAll("\\w", "*");
				
		String soyisim�lkHarf=soyisim.toUpperCase().substring(0, 1);
		String geriKalanSoyisim=soyisim.substring(1).replaceAll("\\w", "*");
		
		String kartNoBa��="**** **** ****";
		String kartNoSonu=kartNo.substring(kartNo.length()-4);
		
		System.out.println("�sminiz ve Soyisminiz " + isim�lkHarf+" "+geriKalan�sim+soyisim�lkHarf+" "+geriKalanSoyisim);
		System.out.println("Kart No :"+ kartNoBa��+" "+kartNoSonu);

		scan.close();
	}

}
