package day07_ifelstatement;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		// Kullanýcýdan maaþ için bir teklif isteyin ve
		// Teklif 80.000 üzerindeyse kabul ediyorum
		// Teklif 60.000 ile 80.000 arasýnda ise konuþabiliriz
		// Teklif 60.000 altýnda ise malesef kabul etmiyorum yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Maaþ için teklifiniz nedir?");
		
		double maas=scan.nextDouble();
		
		if (maas<60000) {
			System.out.println("Malesef kabul edemem.");
		} else if (maas>60000 && maas<80000) {
			System.out.println("Konuþabiriz");
		} else {
			System.out.println("Kabul ediyorum");
		}{

		}
		scan.close();
	}

}
