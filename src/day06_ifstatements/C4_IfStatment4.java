package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatment4 {

	public static void main(String[] args) {
		// kullan�c�dan g�n ismini isteyin
		//girilen g�n hafta i�i veya hafta sonu oldu�unu yazd�r�n
		
		Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen bir g�n giriniz.");
		
		String gun = scan.next().toLowerCase();
		
		if (gun.equals("pazartesi") || gun.equals("sal�") || gun.equals("car�amba") || gun.equals("per�embe") || gun.equals("cuma")) {
			System.out.println("hafta i�i bir g�nd�r");
		}
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("hafta sonu bir g�nd�r");
		}
				// bu kodda g�n ismi d�l�nda yaz�lana bir�ey olu�maz
		
		scan.close();
	}

}
