package day07_ifelstatement;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		// Kullan�c�dan maa� i�in bir teklif isteyin ve
		// Teklif 80.000 �zerindeyse kabul ediyorum
		// Teklif 60.000 ile 80.000 aras�nda ise konu�abiliriz
		// Teklif 60.000 alt�nda ise malesef kabul etmiyorum yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Maa� i�in teklifiniz nedir?");
		
		double maas=scan.nextDouble();
		
		if (maas<60000) {
			System.out.println("Malesef kabul edemem.");
		} else if (maas>60000 && maas<80000) {
			System.out.println("Konu�abiriz");
		} else {
			System.out.println("Kabul ediyorum");
		}{

		}
		scan.close();
	}

}
