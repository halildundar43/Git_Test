package day07_ifelstatement;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// kullanýcýdan 100 üzerinden not isteyin. notu harf sistemine çevirip yazdýrýn
		// 50 den büyükse D, 50-60 arasý ise C, 60-80 arasý ise B, 80 üzeri ise A
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen notunuzu sayý olarak giriniz.");
		
		double not= scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("Lütfen geçerli bir not giriniz.");
			
		} else if(not<50) {
			System.out.println("not: D");
			
		} else if (not<60) {
			System.out.println("not: C");
			
		} else if (not<80) {
			System.out.println("not: B");
			
		} else {
			System.out.println("not: A");
		} {

		} {
			
		}
		scan.close();
	}

}
