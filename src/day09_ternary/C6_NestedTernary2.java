package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// kullanýcýdan bir harf isteyin küçük harf ise küçük harf yazdýrýn
		// büyük harf ise büyük harf yazdýrýn
		// uygun karakter deðilse girdiðiniz karakter harf deðil yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir harf giriniz.");
		
		char harf= scan.next().charAt(0);

		System.out.println(harf>'a' || harf<'z' ? "Küçük harf" : ((harf>'A' || harf<'Z') ?  "Büyük harf" : "Girdiðiniz karakter harf deðil")) ;
	
		scan.close();
	}
	
}
