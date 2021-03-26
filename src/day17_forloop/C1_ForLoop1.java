package day17_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/* kullan�c�dan bir tam say� girmesini isteyin
		say� negatif veya s�f�rsa "L�tfen pozitif say� giriniz" yazd�r�n
		girilen say�n�n rakamlar�n� ayr� bir method la hesaplay�n
		
		Main method i�inde kullan�c�dan bir s�n�r de�er isteyin
		rakamlar toplam� s�n�r de�erden b�y�kse
		"Girdi�iniz say�n�n rakamlar toplam�, girdi�iniz s�n�r de�erden b�y�k"
		de�ilse "Girdi�iniz say�n�n rakamlar toplam�, girdi�iniz s�n�r de�erden b�y�k de�il"
		yazd�r�n*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen rakamlar�n�toplamak i�in pozitif bir tam say� giriniz");
		int say�=scan.nextInt();
		
		if (say�<=0) {
			System.out.println("L�tfen pozitif say� giriniz");
		} else {
			rakamlarToplam�Yazd�r(say�);
		}
		scan.close();
	}

	public static void rakamlarToplam�Yazd�r(int say�) {
		int rakamlarToplam�=0;
		String say�2=say�+"";
		for (int i = 1; i <=say�2.length() ; i++) {
			rakamlarToplam�+=say�%10;
			say�/=10;
		}
		System.out.println("Rakamlar toplam� : " + rakamlarToplam� );
	}

}
