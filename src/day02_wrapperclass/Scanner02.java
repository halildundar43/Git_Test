package day02_wrapperclass;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin bir kenar uzunlugunu giriniz.");
		
		int uzun = scan.nextInt();
		
		System.out.println(uzun * 4);
		System.out.println(uzun * uzun);
		
		scan.close();

	}

}
