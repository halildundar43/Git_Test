package day08_ifelsenestedýf;

import java.util.Scanner;

public class C1_IfElseIf1 {

	public static void main(String[] args) {
		// Kullanýcýdan gün isimleri isteyin
		// girilen isim gün ismi ise
		// 1.2. ve 3.harflerini ilk har büyük olacak þelilde yazdýrýn
		// gün ismi deðilse geçerli bir gün ismi girin yazdýr
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen gün ismini giriniz");
		
		String gunIsmý=scan.nextLine();
		
		if (gunIsmý.equalsIgnoreCase("pazar") || gunIsmý.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if (gunIsmý.equalsIgnoreCase("salý")) {
			System.out.println("Sal");
		} else if (gunIsmý.equalsIgnoreCase("carþamba")) {
			System.out.println("Car");
		} else if (gunIsmý.equalsIgnoreCase("perþembe")) {
			System.err.println("Per");
		} else if (gunIsmý.equalsIgnoreCase("cuma") || gunIsmý.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		} else {
			System.out.println("Lütfen geçerli gün bir gün ismi giriniz.");
		} {

		} {

		} {

		} {

		}
		scan.close();
	}

}
