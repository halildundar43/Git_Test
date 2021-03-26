package day10_swtichcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullan�c�dan hangi g�nde oldu�umuzu yaz�yla isteyin
		// g�n�n hafta i�i yada hafta sonu oldu�unu yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir g�n giriniz.");
		String g�n = scan.next().toLowerCase();

		switch (g�n) {
		case "pazartesi":
			System.out.println("Hafta ��i");
			break;
		case "sal�":
			System.out.println("Hafta ��i");
			break;
		case "�ar�amba":
			System.out.println("Hafta ��i");
			break;
		case "per�embe":
			System.out.println("Hafta ��i");
			break;
		case "cuma":
			System.out.println("Hafta ��i");
			break;
		case "cumartesi":
			System.out.println("Hafta Sonu");
			break;
		case "pazar":
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("Ge�erli bir g�n ismi giriniz.");
		}
		System.out.println("==================");
		// 2.YOL

		switch (g�n) {
		case "pazartesi":
		case "sal�":
		case "�ar�amba":
		case "per�embe":
		case "cuma":
			System.out.println("Hafta ��i");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("Ge�erli bir g�n ismi giriniz.");
		}
		scan.close();
	}

}
