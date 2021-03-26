package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Interview Question kullanýcýdan bir String isteyin ve
		// Stringi tersine çeviren bir program yazýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen tersine çevirmek için bir yazý giriniz");
		String yazý=scan.nextLine();
		//1. yol variable oluþturup en son yazdýrabilirim
		String tersYazý="";
		
		for (int i = yazý.length()-1; i >= 0; i--) {
			tersYazý+=yazý.charAt(i);
		}
		System.out.println("Girdiðiniz yazýnýn tersten yazýlýþý : " + tersYazý);
		
		//2.yol tersYazý yý sadece yazdýracak variable oluþturmadan da yazdýrabiliriz
		for (int i = yazý.length()-1; i >= 0; i--) {
			System.out.print(yazý.charAt(i));
		}
		System.out.println("");
		scan.close();
		//3. yol method oluþturup bunu yazdýrrabiliriz
		tersineCevir(yazý);	
	}
	
	public static void tersineCevir(String yazý) {
		for (int i = yazý.length()-1; i >= 0; i--) {
			System.out.print(yazý.charAt(i));
		
	}

}
}