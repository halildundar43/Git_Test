package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý alýn tek mi çift mi olduðunu yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tamsayý giriniz.");
		
		int sayi1= scan.nextInt();
		
		String sonuc = (sayi1%2==0) ? "Çift sayý " + sayi1 : "Tek Sayý ";
		System.out.println(sonuc);

		//girilen sayýnýn mutlak deðerini blunuz
		
		System.out.println("Sayýnýn mutlak deðeri: " + (sayi1>0 ? sayi1 : -sayi1));
		
		scan.close();
	}

}
