package day08_ifelsenested�f;

import java.util.Scanner;

public class C3_Art�kY�l {

	public static void main(String[] args) {
		// Kullan�c�dan bir y�l girmesini isteyin
		// art�k y�l olup olmad���n� kontrol edin
		
		//1.kural 4 ile b�lenemeyen art�k y�l de�il
		//2.kural 4 �n kat� olmas�na ra�men 100 ile b�l�n�p 400 e b
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen y�l� yaz�n�z");
		
		int y�l= scan.nextInt();
		
		if (y�l%4==0 && y�l%100!= 0) {
			System.out.println("Art�k y�l");
		} else if (y�l%100==0 && y�l%400==0) {
			System.out.println("Art�k y�l");
		} else {
			System.out.println("Art�k y�l de�il");
		}
		scan.close();
	}

}
