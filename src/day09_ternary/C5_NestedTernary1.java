package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// kullanýcýdan dikdörtgenin uzunluðunu ve geniþliðini alýn kare olup olmadýðýný yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen dikdörtgenin uzunluðunu ve geniþliðini giriniz.");
		
		int kenar1= scan.nextInt();
		int kenar2= scan.nextInt();
		// uygun girerse sýkýntý olmaz		
		System.out.println(kenar1==kenar2 ? "Kare" : "Kare deðil"); 
		
		System.out.println("==============");
		
		// nested ternary ile çözümü
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "Kare" : "Kare deðil") : "Geçersiz uzunluk");

		scan.close();
	}

}
