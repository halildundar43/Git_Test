package day16_forloop;

import java.util.Scanner;

public class C5_ForLoop5 {

	public static void main(String[] args) {
		/* Interview Question kullan�c�dan 100 den k���k bir tam say� isteyin 1 den
		 * ba�layarak t�m say�lar� yazd�r�n Ancak; 
		 * -say� 3 un kat� ise yerine Java yazd�r�n 
		 * -say� 5 in kat� ise yerine G�zeldir 
		 * -say� hem 3 un hem 5 in kat� ise yerine Java G�zeldir yazd�r�n
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen 100 den k���k bir tam say� giriniz");
		int say� = scan.nextInt();

		for (int i = 1; i <= say�; i++) {

			if (i % 15 == 0) {
				System.out.println("Java G�zeldir");
			} else if (i % 5 == 0) {
				System.out.print("G�zeldir"+" ");
			} else if (i % 3 == 0) {
				System.out.print("Java"+" ");
			} else {
				System.out.print(i+" ");
			}
			
		}
		scan.close();
	}

}
