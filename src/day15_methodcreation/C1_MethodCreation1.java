package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		// kullan�c�dan bir tamsay� al�n bu say�n�n
		// negatif veya pozitif oldu�unu
		// tek mi �ift mi oldu�unu
		// �� basamakl� ve daha b�y�k ise birler onlar y�zler basama��n�n rakamlar�
		// toplam�n�
		// 100 den k���kse sadece birler basama��n� yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tamsay� giriniz");
		int sayi = scan.nextInt();

		pozitifNegatif(sayi); // girilen say�n�n negatf yada pozitif oldu�unu yazd�rs�n
		takMi�iftMi(sayi);

		if (sayi >= 100) {
			y�zdenB�y�k(sayi);
		} else {
			y�zdenK���k(sayi);
		}
		scan.close();
	}

	public static void y�zdenK���k(int sayi) {
		System.out.println(sayi % 10);

	}

	public static void y�zdenB�y�k(int sayi) {
		int rakamlarToplam� = 0;
		rakamlarToplam� = sayi % 10;
		sayi /= 10;
		rakamlarToplam� += sayi % 10;
		sayi /= 10;
		rakamlarToplam� += sayi % 10;
		sayi /= 10;
		rakamlarToplam� += sayi % 10;
		System.out.println(rakamlarToplam�);

	}

	public static void takMi�iftMi(int sayi) {
		// System.out.println(sayi%2==0 ? "�ift" : "Tek");
		if (sayi % 2 == 0) {
			System.out.println("Say� �ift");
		} else {
			System.out.println("Say� tek");
		}
	}

	public static void pozitifNegatif(int sayi) { // parametre yazarken data tipinide girmeliyiz
		System.out.println(sayi > 0 ? "Pozitif" : (sayi < 0 ? "Negatif" : "Pozitif yada Negatif de�il"));
		
	}
}
