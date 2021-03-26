package day10_swtichcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanýcýdan hangi günde olduðumuzu yazýyla isteyin
		// günün hafta içi yada hafta sonu olduðunu yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir gün giriniz.");
		String gün = scan.next().toLowerCase();

		switch (gün) {
		case "pazartesi":
			System.out.println("Hafta Ýçi");
			break;
		case "salý":
			System.out.println("Hafta Ýçi");
			break;
		case "çarþamba":
			System.out.println("Hafta Ýçi");
			break;
		case "perþembe":
			System.out.println("Hafta Ýçi");
			break;
		case "cuma":
			System.out.println("Hafta Ýçi");
			break;
		case "cumartesi":
			System.out.println("Hafta Sonu");
			break;
		case "pazar":
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("Geçerli bir gün ismi giriniz.");
		}
		System.out.println("==================");
		// 2.YOL

		switch (gün) {
		case "pazartesi":
		case "salý":
		case "çarþamba":
		case "perþembe":
		case "cuma":
			System.out.println("Hafta Ýçi");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("Geçerli bir gün ismi giriniz.");
		}
		scan.close();
	}

}
