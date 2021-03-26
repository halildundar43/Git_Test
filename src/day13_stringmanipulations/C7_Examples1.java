package day13_stringmanipulations;

import java.util.Scanner;

public class C7_Examples1 {

	public static void main(String[] args) {
		// kullanýcýdan 4 harfli bir kelime isteyin
		// ve tersten yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dört harli bir kelime giriniz");
		String str=scan.nextLine();
		
		if (str.length()!=4) {
			System.out.println("Lütfen dört karakterli bir kelime giriniz");
		} else {
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));
		}
		scan.close();
	}

}
