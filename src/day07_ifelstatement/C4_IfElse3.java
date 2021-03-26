package day07_ifelstatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullanýcýdan taþýný sorun
		// 65 ve 65 ten büyükse emekli olabirsin
		// yoksa emekli olamazsýn yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yaþýnýzý girin");
		
		double sayi1= scan.nextDouble();
		
		if (sayi1>=65) {
			System.out.println("Emekli olabilirsiniz.");
		} else {
			System.out.println("Emekli olamazsýnýz.");
		}
		scan.close();
	}

}
