package day16_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		// kullan�c�dan pozitif iki tam say� al�n
		// ald���m�z de�erlerden k���k olandan ba�lay�p b�y�k olana kadar
		// t�m say�lar� yanyana (virg�lle ay�rarak) yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki pozitif tam say� giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int k���kSay�=0;
		int b�y�kSay�=0;
		
		if(sayi1<0 || sayi2<0) {
			System.out.println("L�tfen pozitif say� giriniz");
		}
		
		else if (sayi1>sayi2) {
			b�y�kSay�=sayi1;
			k���kSay�=sayi2;
		} else {
			b�y�kSay�=sayi2;
			k���kSay�=sayi1;
		}
		for (int i = k���kSay� ; i <= b�y�kSay�; i++) {
			
			System.out.print(i + ",");
			
		}
		scan.close();
	}

}
