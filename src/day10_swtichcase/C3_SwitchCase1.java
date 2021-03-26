package day10_swtichcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		// kullan�c�dan bir rakam isteyin
		// girilen rakam� yaz� ile yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir rakam giriniz.");
		int sayi = scan.nextInt();

		if (sayi == 0) {
			System.out.println("S�f�r");
		} else if (sayi == 1) {
			System.out.println("Bir");
		} else if (sayi == 2) {
			System.out.println("�ki");
		} else if (sayi == 3) {
			System.out.println("��");
		} else if (sayi == 4) {
			System.out.println("D�rt");
		} else if (sayi == 5) {
			System.out.println("Be�");
		} else if (sayi == 6) {
			System.out.println("Alt�");
		} else if (sayi == 7) {
			System.out.println("Yedi");
		} else if (sayi == 8) {
			System.out.println("Sekiz");
		} else if (sayi == 9) {
			System.out.println("Dokuz");
		} else {
			System.out.println("Say� rakam de�il.");
		}
		System.out.println("================");
		// soruyu switch ile yapal�m

		switch (sayi) {
		case 0:
			System.out.println("S�f�r");
			break;
		case 1:
			System.out.println("Bir");
			break;
		case 2:
			System.out.println("�ki");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("D�rt");
			break;
		case 5:
			System.out.println("Be�");
			break;
		case 6:
			System.out.println("Alt�");
			break;
		case 7:
			System.out.println("Yedi");
			break;
		case 8:
			System.out.println("Sekiz");
			break;
		case 9:
			System.out.println("Dokuz");
			break;
		default:
			System.out.println("Say� rakam de�il");
		}

		scan.close();
	}

}
