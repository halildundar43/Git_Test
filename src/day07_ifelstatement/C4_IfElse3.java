package day07_ifelstatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullan�c�dan ta��n� sorun
		// 65 ve 65 ten b�y�kse emekli olabirsin
		// yoksa emekli olamazs�n yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ya��n�z� girin");
		
		double sayi1= scan.nextDouble();
		
		if (sayi1>=65) {
			System.out.println("Emekli olabilirsiniz.");
		} else {
			System.out.println("Emekli olamazs�n�z.");
		}
		scan.close();
	}

}
