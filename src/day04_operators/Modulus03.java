package day04_operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
	
	//Kullan�c�dan 3 basamakl� bir tam say� al�n bu say�n�n rakamlar� toplam�n� bulan program yaz�n.
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("3 basamakl� bir tam say� giriniz.");
	
	int s = scan.nextInt(); // s=123
	int sonRakam = s % 10; 
	int sv = s / 10;
	int ortaRakam = sv % 10; // int ortaRakam = (s / 10) % 10
	int ilkRakam = s / 100;
	
	System.out.println(sonRakam+ortaRakam+ilkRakam);
	
	// �DEV Kullan�c�dan 4 basamakl� bir tam say� al�n bu say�n�n rakamlar� toplam�n� bulan program yaz�n.
	
	System.out.println("4 basamakl� bir tam say� giriniz.");
	
	int sa = scan.nextInt();
	int r4 = sa % 10;
	int g1 = sa / 10; //int r3 = (sa / 10) % 10;
	int r3 = g1 % 10;
	int g2 = sa / 10;//int r2 = (sa / 100) % 10;
	int r2 = g2 % 10;
	int r1 = sa / 1000;
	
	System.out.println(r1+r2+r3+r4);
	
	
	scan.close();
	
	
	
	}

}
