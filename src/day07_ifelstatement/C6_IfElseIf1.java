package day07_ifelstatement;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// kullan�c�dan 100 �zerinden not isteyin. notu harf sistemine �evirip yazd�r�n
		// 50 den b�y�kse D, 50-60 aras� ise C, 60-80 aras� ise B, 80 �zeri ise A
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen notunuzu say� olarak giriniz.");
		
		double not= scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("L�tfen ge�erli bir not giriniz.");
			
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
