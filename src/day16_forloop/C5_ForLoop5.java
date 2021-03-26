package day16_forloop;

import java.util.Scanner;

public class C5_ForLoop5 {

	public static void main(String[] args) {
		/* Interview Question kullanýcýdan 100 den küçük bir tam sayý isteyin 1 den
		 * baþlayarak tüm sayýlarý yazdýrýn Ancak; 
		 * -sayý 3 un katý ise yerine Java yazdýrýn 
		 * -sayý 5 in katý ise yerine Güzeldir 
		 * -sayý hem 3 un hem 5 in katý ise yerine Java Güzeldir yazdýrýn
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 100 den küçük bir tam sayý giriniz");
		int sayý = scan.nextInt();

		for (int i = 1; i <= sayý; i++) {

			if (i % 15 == 0) {
				System.out.println("Java Güzeldir");
			} else if (i % 5 == 0) {
				System.out.print("Güzeldir"+" ");
			} else if (i % 3 == 0) {
				System.out.print("Java"+" ");
			} else {
				System.out.print(i+" ");
			}
			
		}
		scan.close();
	}

}
