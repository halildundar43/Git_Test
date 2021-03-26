package day13_stringmanipulations;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		
		// kullan�c�dab bir c�mle isteyin
		// c�mledki t�m bo�luklar� silin
		// ve t�m a lar�n yerine e yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz.");
		
		String cumle=scan.nextLine();
		
		System.out.println(cumle.replace(" ", ""));
		System.out.println(cumle.replace("a", "e"));
		
		//.yol
		
		cumle=cumle.replace(" ", ""); // e�er atama yaparsak cumle kal�c� olarak de�i�ir
		cumle=cumle.replace("a", "e"); // bu nedenle ilk c�mleye bir daha ula�amay�z
		
		System.out.println(cumle);
		
		System.out.println("L�tfen bir c�mle daha giriniz.");
		String str=scan.nextLine();
		System.out.println(str.replace(" ", "").replace("a", "e"));
		
		System.out.println(str.replace("e", "i").replace("a", "i"));
		
		scan.close();

	}

}
