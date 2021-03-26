package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
	
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
		System.out.println("L�tfen s�n�r de�er i�in pozitif bir tamsay� giriniz");
		int s�n�r=scan.nextInt();
		
		if (say�<=0) {
			System.out.println("L�tfen pozitif say� giriniz");
		} else {
			if (rakamlarToplam�Hesapla(say�)>s�n�r) {
				System.out.println("Girdi�iniz say�n�n rakamlar toplam�, girdi�iniz s�n�r de�erden b�y�k");
				
			} else {
				System.out.println("Girdi�iniz say�n�n rakamlar toplam�, girdi�iniz s�n�r de�erden b�y�k de�il");
			}rakamlarToplam�Hesapla(say�); // girilen say�n�n rakamlar toplam� int
		}
		scan.close();
	}

	public static int rakamlarToplam�Hesapla(int say�) {
		int rakamlarToplam�=0;
		String say�2=say�+""; // say� y� String e �evirdik
		for (int i = 1; i <=say�2.length() ; i++) {
			rakamlarToplam�+=say�%10;
			say�/=10;
		}
		return rakamlarToplam�;
	}

}
