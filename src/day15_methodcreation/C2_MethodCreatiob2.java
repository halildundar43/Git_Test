package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreatiob2 {

	public static void main(String[] args) {
		// kullan�c�ya ka� say� toplamak istedi�ini sorun
		// kullan�c� 2,3 veya 4 de�erini girerse
		// kullan�c�dan bu say�lar� girmesini isteyin ve
		// say�lar�n toplam�n� yazd�r�n
		// kullan�c� toplamak istedi�i say� adetini 4 ten fazla girerse
		// �ok say� girdiniz ben toplayamam yazd�r�n
		// ikiden az say� girerse en az iki say� girmelisiniz desin

		Scanner scan = new Scanner(System.in);
		System.out.println("Ka� say� toplamak istiyorsunuz");
		int adet = scan.nextInt();

		if (adet < 2) {
			System.out.println("En az iki say� girmelisiniz");
		} else if (adet == 2) {
			ikiSay�Topla();
		} else if (adet == 3) {
			��Say�Topla();
		} else if (adet == 4) {
			d�rtSay�Topla();
		} else {
			System.out.println("�ok say� girdiniz, ben toplayamam");
		}
		scan.close();
	}

	public static void d�rtSay�Topla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen d�rt say� giriniz");
		double say�1 = scan.nextDouble();
		double say�2 = scan.nextDouble();
		double say�3 = scan.nextDouble();
		double say�4 = scan.nextDouble();
		System.out.println("D�rt say�n�n toplam�" + (say�1 + say�2 + say�3 + say�4));
		
		scan.close();
	}

	public static void ��Say�Topla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen �� say� giriniz");
		double say�1 = scan.nextDouble();
		double say�2 = scan.nextDouble();
		double say�3 = scan.nextDouble();
		System.out.println("�� say�n�n toplam�" + (say�1 + say�2 + say�3));
		
		scan.close();
	}

	public static void ikiSay�Topla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen iki say� giriniz");
		double say�1 = scan.nextDouble();
		double say�2 = scan.nextDouble();
		System.out.println("�ki say�n�n toplam�" + (say�1 + say�2));
		
		scan.close();
	}
	
}
