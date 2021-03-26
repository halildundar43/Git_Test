package day03_operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen adinizi ve soyadinizi giriniz.");
	String adSoyad = scan.nextLine();
	System.out.println(adSoyad);
	
	System.out.println("Lutfen adresinizi giriniz.");
	String adres = scan.nextLine();
	System.out.println(adres);
	
	System.out.println("Lutfen yasinizi giriniz.");
	int yas = scan.nextInt();
	System.out.println(yas);
	
	System.out.println("Turkiye' de yasýyorum. true/false");
	boolean ulke = scan.nextBoolean();
	System.out.println(ulke);
	
	scan.close();
	}

}
