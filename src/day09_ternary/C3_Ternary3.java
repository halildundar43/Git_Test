package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// kullanýcýdan 2 sayý alýn büyük olaný yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki sayý giriniz.");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		String sonuc = (sayi1>sayi2) ? "Büyük sayý " + sayi1 : "Büyük Sayý " + sayi2;
		System.out.println(sonuc);

		scan.close();
	}

}
