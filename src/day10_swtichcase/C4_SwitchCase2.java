package day10_swtichcase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		// kullan�c�dan ka��nc� ay oldu�unu isteyin ve
		// ismini yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ka��nc� ayda oldu�unuzu giriniz.");
		int ay = scan.nextInt();
		
		switch (ay) {
		case 1:
			System.out.println("Ocak");
			break;
		case 2:
			System.out.println("�ubat");
			break;
		case 3:
			System.out.println("Mart");
			break;
		case 4:
			System.out.println("Nisan");
			break;
		case 5:
			System.out.println("May�s");
			break;
		case 6:
			System.out.println("Haziran");
			break;
		case 7:
			System.out.println("Temmuz");
			break;
		case 8:
			System.out.println("A�ustos");
			break;
		case 9:
			System.out.println("Eyl�l");
			break;
		case 10:
			System.out.println("Ekim");
			break;
		case 11:
			System.out.println("Kas�m");
			break;
		case 12:
			System.out.println("Aral�k");
			break;
		default:
			System.out.println("Ge�erli bir ay giriniz.");
		}
		scan.close();
	}

}
