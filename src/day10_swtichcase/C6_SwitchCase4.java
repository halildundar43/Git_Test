package day10_swtichcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanýcýdan VIP (Very Impotant Person)kýsaltmasýndan hangi harfýn anlamýný
		// istediðini soralým
		// girilen harfin açýklamasýný yazdýralým
		// char kullanalým

		Scanner scan = new Scanner(System.in);
		System.out.println("VIP kýsaltmasýnda hangi harfin anlamýný öðrenmek istiyorsanýz o harfi yazýnýz.");
		char harf = scan.next().charAt(0);

		switch (harf) {
		case 'V':
		case 'v':
			System.out.println("Very");
			break;
		case 'I':
		case 'ý':
			System.out.println("Impotant");
			break;
		case 'P':
		case 'p':
			System.out.println("Person");
			break;
		default:
			System.out.println("Geçerli bir harf giriniz.");
		}
		
		// kullanýcýnýn birden fazla harf girmesini hata olarak tanýmlayacaksak String olarak tanýmlamalýyýz
		
		System.out.println("VIP kýsaltmasýnda hangi harfin anlamýný öðrenmek istiyorsanýz o harfi yazýnýz.");
		String str = scan.next();

		switch (str) {
		case "V":
		case "v":
			System.out.println("Very");
			break;
		case "I":
		case "ý":
			System.out.println("Impotant");
			break;
		case "P":
		case "p":
			System.out.println("Person");
			break;
		default:
			System.out.println("Geçerli bir harf giriniz.");
		}
		scan.close();
	}

}
