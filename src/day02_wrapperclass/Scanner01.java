package day02_wrapperclass;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tam sayý giriniz.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 * sayi2);
		
		scan.close();

	}

}
