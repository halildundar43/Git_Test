package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanýcýdan pozitif bir tamsayý alýn
		// 1 den kullanýcýnýn girdiði sayýya kadar olan
		// tüm sayýlarýn toplamýný yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen pozitif bir tam sayý giriniz");
		int sayý = scan.nextInt();

		int toplam = 0;

		for (int i = 1; i <= sayý; i++) {
			toplam += i;
		}
		System.out.println(toplam);

		scan.close();
	}

}
