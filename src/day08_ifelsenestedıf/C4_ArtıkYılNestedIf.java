package day08_ifelsenestedýf;

import java.util.Scanner;

public class C4_ArtýkYýlNestedIf {

	public static void main(String[] args) {
		// // Kullanýcýdan bir yýl girmesini isteyin
		// artýk yýl olup olmadýðýný kontrol edin
		
		//1.kural 4 ile bölenemeyen artýk yýl deðil
		//2.kural 4 ün katý olmasýna raðmen 100 ile bölünüp 400 e b
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yýlý yazýnýz");
		
		int yýl= scan.nextInt();
		
		if (yýl%100==0) { // 100 e bölünüyor
			
			if (yýl%400==0) {
				System.out.println("Artýk yýl");
			} else {
				System.out.println("Artýk yýl deðil");
			}
						
		} else { // 100 e bölünemiyor

			if (yýl%4==0) {
				System.out.println("Artýk yýl");
			} else {
				System.out.println("Artýk yýl deðil");
			}
						
		}
		scan.close();
	}

}
