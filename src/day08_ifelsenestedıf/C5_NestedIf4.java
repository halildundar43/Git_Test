package day08_ifelsenestedýf;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		// Kullanýcýdan bir þifre girmesini isteyin
		// Eðer ilk harf büyük harf ise A olup olmadýðýný kontrol edin. A ise geçerli þifre deðise geçersiz þifre yazdýrýn
		// Eðer ilk harf küçük harf ise z olup olmadýðýný kontrol edin. z ise geçerli þifre deðise geçersiz þifre yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen þifre giriniz");
		
		char ilkHarf=scan.next().charAt(0); // girilen þifrenin ilk karakterini alýr
		
		if (ilkHarf>= 'A' && ilkHarf<='Z') { // büyük harf ise
			if (ilkHarf=='A') {
				System.out.println("Þifre geçerli");
			} else {
				System.out.println("Þifre geçersiz");
			}
						
		} else if (ilkHarf>='a' && ilkHarf<='z') { // küçük harf ise
			if (ilkHarf=='z') {
				System.out.println("Þifre geçerli");
			} else {
				System.out.println("Þifre geçersiz");
			}
			
			
		} else { // harf deðilse
			System.out.println("þifre geçersiz");
		}{

		}
		scan.close();
	}

}
