package day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullan�c�dan pozitif bir tamsay� al�n
		// 1 den kullan�c�n�n girdi�i say�ya kadar olan
		// t�m say�lar�n toplam�n� yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen pozitif bir tam say� giriniz");
		int say� = scan.nextInt();

		int toplam = 0;

		for (int i = 1; i <= say�; i++) {
			toplam += i;
		}
		System.out.println(toplam);

		scan.close();
	}

}
