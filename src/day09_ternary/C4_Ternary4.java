package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Kullan�c�dan bir say� al�n tek mi �ift mi oldu�unu yazd�r�n.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir tamsay� giriniz.");
		
		int sayi1= scan.nextInt();
		
		String sonuc = (sayi1%2==0) ? "�ift say� " + sayi1 : "Tek Say� ";
		System.out.println(sonuc);

		//girilen say�n�n mutlak de�erini blunuz
		
		System.out.println("Say�n�n mutlak de�eri: " + (sayi1>0 ? sayi1 : -sayi1));
		
		scan.close();
	}

}
