package day08_ifelsenested�f;

import java.util.Scanner;

public class C1_IfElseIf1 {

	public static void main(String[] args) {
		// Kullan�c�dan g�n isimleri isteyin
		// girilen isim g�n ismi ise
		// 1.2. ve 3.harflerini ilk har b�y�k olacak �elilde yazd�r�n
		// g�n ismi de�ilse ge�erli bir g�n ismi girin yazd�r
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen g�n ismini giriniz");
		
		String gunIsm�=scan.nextLine();
		
		if (gunIsm�.equalsIgnoreCase("pazar") || gunIsm�.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		} else if (gunIsm�.equalsIgnoreCase("sal�")) {
			System.out.println("Sal");
		} else if (gunIsm�.equalsIgnoreCase("car�amba")) {
			System.out.println("Car");
		} else if (gunIsm�.equalsIgnoreCase("per�embe")) {
			System.err.println("Per");
		} else if (gunIsm�.equalsIgnoreCase("cuma") || gunIsm�.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		} else {
			System.out.println("L�tfen ge�erli g�n bir g�n ismi giriniz.");
		} {

		} {

		} {

		} {

		}
		scan.close();
	}

}
