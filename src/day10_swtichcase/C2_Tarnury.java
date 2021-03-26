package day10_swtichcase;

import java.util.Scanner;

public class C2_Tarnury {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý alýn
		// sayý çiftse çift yazdýrýn
		// deðise karesini alýn
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz.");
		int sayi= scan.nextInt();
		
		//1.yol
		//eðer biri sayý diðeri string ise dirak yazdýr
		
		System.out.println(sayi%2==0 ? "çift" : sayi*sayi);
		
		//2.yol
		//eðer biri sayý diðeri string ise sayýnýn sonuna "" hiçlik ekleriz
		
		String sonuc= sayi%2==0 ? "çift" : sayi*sayi+"";
		System.out.println(sonuc);
		
		scan.close();

	}

}
