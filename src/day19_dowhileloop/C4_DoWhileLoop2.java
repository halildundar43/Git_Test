package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan toplamak �zere pozitif tamsay�lar isteyin
		 i�lemi bitirmek i�in 0'a basmas�n� s�yleyin
		 kullan�c� yanl��l�kla negatif say� girerse o say�y� toplamaya eklemeyin ve
		 "Negatif say� giremezsin" yazd�r�p ba�a d�n�n
		 kullan�c� 0'a bast���nda toplam ka� pozitif say� girdi�ini,
		 yanl��l�kla ka� negatif say� girdi�ini ve
		 irdi�i pozitif say�lar�n toplam�n�n ka� oldu�unu yazd�r�n
		*/
		
		Scanner scan=new Scanner(System.in);
		int countPoz=0;
		int countNeg=0;
		int toplam=0;
		int say�=0;
		System.out.println("Oyuna ho� geldiniz, bitirmek istedi�inizde 0'a bas�n");
		
		do {
			System.out.println("L�tfen pozitif bir tamsay� giriniz");
			say�=scan.nextInt();
			
			if (say�>0) {
				
				countPoz++;
				toplam+=say�;
			} 
			
			if (say�<0){
				
				countNeg++;
				System.out.println("Negatif say� giremezsin");
			}
			
		} while (say�!=0);
		
		System.out.println("toplam "+countPoz+" pozitif say� girdiniz");
		System.out.println("toplam "+countNeg+" negatif say� girdiniz");
		System.out.println("Girdi�iniz pozitif say�lar�n toplam�: "+toplam);
		
		scan.close();
	}

}
