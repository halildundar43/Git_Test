package day13_stringmanipulations;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		
		// kullanýcýdab bir cümle isteyin
		// cümledki tüm boþluklarý silin
		// ve tüm a larýn yerine e yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz.");
		
		String cumle=scan.nextLine();
		
		System.out.println(cumle.replace(" ", ""));
		System.out.println(cumle.replace("a", "e"));
		
		//.yol
		
		cumle=cumle.replace(" ", ""); // eðer atama yaparsak cumle kalýcý olarak deðiþir
		cumle=cumle.replace("a", "e"); // bu nedenle ilk cümleye bir daha ulaþamayýz
		
		System.out.println(cumle);
		
		System.out.println("Lütfen bir cümle daha giriniz.");
		String str=scan.nextLine();
		System.out.println(str.replace(" ", "").replace("a", "e"));
		
		System.out.println(str.replace("e", "i").replace("a", "i"));
		
		scan.close();

	}

}
