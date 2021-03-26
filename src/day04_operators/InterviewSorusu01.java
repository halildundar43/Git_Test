package day04_operators;

import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Yerlerini degistirmek icin iki sayi giriniz.");
	
	double sayi1 = scan.nextDouble();
	double sayi2 = scan.nextDouble();
	
	//1.yol
	
	System.out.println("Yer de�istirmeden �nce");
	System.out.println(sayi1); //12.0
	System.out.println(sayi2); //30.0
	
	double gecici = 0.0; //variable olustururken sadece bir kere yaz�l�r
	gecici = sayi1;
	sayi1 = sayi2;
	sayi2 = gecici;
	
	System.out.println("Yer de�istirdikten sonra");
	System.out.println(sayi1); //30.0
	System.out.println(sayi2); //12.0
	
	System.out.println("Ge�i�ideki say�"); //12.0
	System.out.println(gecici); //12.0
	
	//2.yol
	
	System.out.println("Yer de�i�tirmek i�in iki say� daha giriniz.");
	
	double sayi3 = scan.nextDouble();
	double sayi4 = scan.nextDouble();
	
	sayi3 = sayi3 + sayi4;
	sayi4 = sayi3 - sayi4;
	sayi3 = sayi3 - sayi4;
	
	System.out.println(sayi3);
	System.out.println(sayi4);
	
	scan.close();
	}

}
