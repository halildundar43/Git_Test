package day15_methodcreation;

public class C4_FoorLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdýrýn

		// 1.yol
		/*
		 * System.out.println("Hello World"); System.out.println("Hello World");
		 * System.out.println("Hello World"); System.out.println("Hello World");
		 * System.out.println("Hello World");
		 */

		// 2.yol loop kullanýyoruz
		// ne yapacaðýmýzý javaya söylüyoruz, kaç kere yapmasý gerektiðini de söylüyoruz

		// tüm loop larda 3 þeyi yapmak zorundayýz
		// 1) baþlangýç deðeri
		// 2) bitiþ deðeri
		// 3) artýþ deðeri

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello World");

		}
		// Not: eðer þart kýsmý bizim artýþýmýza göre hep true verirse loop sonsuz
		// döngüye girer
		// Not: loop da artýþ deðeri pozitif olduðu gibi negatifde olabilir (i--)
		// Not: artýþ deðeri 1 olmak zorunda deðil farklýda olabilir
		// Nor: eðer loop un þartý true olmazsa loop bady hiç devreye girmez
	}

}
