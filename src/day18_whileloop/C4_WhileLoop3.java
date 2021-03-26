package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		// kullan�c�dan ba�lang�� ve biti� harflaerini al�n ve
		// ba�lang�� harfinden ba�lay�p biti� harfinde biten t�m harflaeri
		// b�y�k harf olarak yazd�r�n
		// kullan�c�n�n hata yapmad���n� farz edin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ba�lang�� harfini giriniz");
		char ba�Harf=scan.next().toUpperCase().charAt(0);
		
		System.out.println("L�tfen biti� harfini giriniz");
		char bitHarf=scan.next().toUpperCase().charAt(0);
		
		for (char i = ba�Harf; i <= bitHarf; i++) {
			System.out.print(i+ " ");
		}
		System.out.println("");
		// while loop ile yapal�m
		while (ba�Harf<=bitHarf) {
			System.out.print(ba�Harf+ " ");
			ba�Harf++;
		}
		scan.close();
	}

}
