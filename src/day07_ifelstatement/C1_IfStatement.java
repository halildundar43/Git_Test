package day07_ifelstatement;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		// kullanýcýdan bir tam sayý isteyin
		// sayý pozitifse 'sayý pozitif' yazdýrýn
		// sayý 100 den büyükse 'büyük sayý' yazdýrýn
		// sayý 100 den küçükse 'küçük sayý' yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tam sayý giriniz");
		
		int sayi = scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Sayý pozitif");
		}
		if (sayi>100) {
			System.out.println("Büyük sayý");
		}
		if (sayi<100) {
			System.out.println("Küçük sayý");
		}
		scan.close();
	}

}
