package day07_ifelstatement;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// kullan�c�dan bir tam say� isteyin
		// say� pozitifse 'say� pozitif' yazd�r�n
		// say� 100 den b�y�kse 'b�y�k say�' yazd�r�n
		// say� 100 den k���kse 'k���k say�' yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tam say� giriniz");
		
		int sayi = scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Say� pozitif");
		}
		if (sayi>100) {
			System.out.println("B�y�k say�");
		}
		if (sayi<100) {
			System.out.println("K���k say�");
		}
		scan.close();
	}

}
