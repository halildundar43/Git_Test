package day13_stringmanipulations;

import java.util.Scanner;

public class C7_Examples1 {

	public static void main(String[] args) {
		// kullan�c�dan 4 harfli bir kelime isteyin
		// ve tersten yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("D�rt harli bir kelime giriniz");
		String str=scan.nextLine();
		
		if (str.length()!=4) {
			System.out.println("L�tfen d�rt karakterli bir kelime giriniz");
		} else {
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));
		}
		scan.close();
	}

}
