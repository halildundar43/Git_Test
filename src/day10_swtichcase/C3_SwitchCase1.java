package day10_swtichcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		// kullanýcýdan bir rakam isteyin
		// girilen rakamý yazý ile yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir rakam giriniz.");
		int sayi = scan.nextInt();

		if (sayi == 0) {
			System.out.println("Sýfýr");
		} else if (sayi == 1) {
			System.out.println("Bir");
		} else if (sayi == 2) {
			System.out.println("Ýki");
		} else if (sayi == 3) {
			System.out.println("Üç");
		} else if (sayi == 4) {
			System.out.println("Dört");
		} else if (sayi == 5) {
			System.out.println("Beþ");
		} else if (sayi == 6) {
			System.out.println("Altý");
		} else if (sayi == 7) {
			System.out.println("Yedi");
		} else if (sayi == 8) {
			System.out.println("Sekiz");
		} else if (sayi == 9) {
			System.out.println("Dokuz");
		} else {
			System.out.println("Sayý rakam deðil.");
		}
		System.out.println("================");
		// soruyu switch ile yapalým

		switch (sayi) {
		case 0:
			System.out.println("Sýfýr");
			break;
		case 1:
			System.out.println("Bir");
			break;
		case 2:
			System.out.println("Ýki");
			break;
		case 3:
			System.out.println("Üç");
			break;
		case 4:
			System.out.println("Dört");
			break;
		case 5:
			System.out.println("Beþ");
			break;
		case 6:
			System.out.println("Altý");
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
			System.out.println("Sayý rakam deðil");
		}

		scan.close();
	}

}
