package day10_swtichcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullan�c�dan VIP (Very Impotant Person)k�saltmas�ndan hangi harf�n anlam�n�
		// istedi�ini soral�m
		// girilen harfin a��klamas�n� yazd�ral�m
		// char kullanal�m

		Scanner scan = new Scanner(System.in);
		System.out.println("VIP k�saltmas�nda hangi harfin anlam�n� ��renmek istiyorsan�z o harfi yaz�n�z.");
		char harf = scan.next().charAt(0);

		switch (harf) {
		case 'V':
		case 'v':
			System.out.println("Very");
			break;
		case 'I':
		case '�':
			System.out.println("Impotant");
			break;
		case 'P':
		case 'p':
			System.out.println("Person");
			break;
		default:
			System.out.println("Ge�erli bir harf giriniz.");
		}
		
		// kullan�c�n�n birden fazla harf girmesini hata olarak tan�mlayacaksak String olarak tan�mlamal�y�z
		
		System.out.println("VIP k�saltmas�nda hangi harfin anlam�n� ��renmek istiyorsan�z o harfi yaz�n�z.");
		String str = scan.next();

		switch (str) {
		case "V":
		case "v":
			System.out.println("Very");
			break;
		case "I":
		case "�":
			System.out.println("Impotant");
			break;
		case "P":
		case "p":
			System.out.println("Person");
			break;
		default:
			System.out.println("Ge�erli bir harf giriniz.");
		}
		scan.close();
	}

}
