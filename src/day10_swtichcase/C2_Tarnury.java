package day10_swtichcase;

import java.util.Scanner;

public class C2_Tarnury {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n
		// say� �iftse �ift yazd�r�n
		// de�ise karesini al�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz.");
		int sayi= scan.nextInt();
		
		//1.yol
		//e�er biri say� di�eri string ise dirak yazd�r
		
		System.out.println(sayi%2==0 ? "�ift" : sayi*sayi);
		
		//2.yol
		//e�er biri say� di�eri string ise say�n�n sonuna "" hi�lik ekleriz
		
		String sonuc= sayi%2==0 ? "�ift" : sayi*sayi+"";
		System.out.println(sonuc);
		
		scan.close();

	}

}
