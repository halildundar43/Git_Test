package day08_ifelsenested�f;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		// Kullan�c�dan bir �ifre girmesini isteyin
		// E�er ilk harf b�y�k harf ise A olup olmad���n� kontrol edin. A ise ge�erli �ifre de�ise ge�ersiz �ifre yazd�r�n
		// E�er ilk harf k���k harf ise z olup olmad���n� kontrol edin. z ise ge�erli �ifre de�ise ge�ersiz �ifre yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen �ifre giriniz");
		
		char ilkHarf=scan.next().charAt(0); // girilen �ifrenin ilk karakterini al�r
		
		if (ilkHarf>= 'A' && ilkHarf<='Z') { // b�y�k harf ise
			if (ilkHarf=='A') {
				System.out.println("�ifre ge�erli");
			} else {
				System.out.println("�ifre ge�ersiz");
			}
						
		} else if (ilkHarf>='a' && ilkHarf<='z') { // k���k harf ise
			if (ilkHarf=='z') {
				System.out.println("�ifre ge�erli");
			} else {
				System.out.println("�ifre ge�ersiz");
			}
			
			
		} else { // harf de�ilse
			System.out.println("�ifre ge�ersiz");
		}{

		}
		scan.close();
	}

}
