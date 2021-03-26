package day10_swtichcase;

import java.util.Scanner;

public class C1_TernarTekrar {

	public static void main(String[] args) {
		// kullanıcıdan bir sayı alın
		// sayı 3 basamalı ise üç basmaklı sayı
		// değilse üç basamaklı sayı değil yazdırın
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen pozitif bir tam sayı giriniz.");
		int sayi= scan.nextInt();
		
		String sonuc = sayi>99 ? (sayi<1000 ? "Sayı üç basamaklı" : "Sayı üç basamaklı değil") : "Sayı üç basamaklı değil";
		System.out.println(sonuc);
		
		//2.yol
		String sonuc2=  sayi>99 && sayi<1000 ? "Sayı üç basamaklı" : "Sayı üç basamaklı değil";
		System.out.println(sonuc2);
	
	scan.close();
	}

}
