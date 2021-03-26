package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// lastIndexOf ta istenen karakterin son index ni bulur
		
		//kullanýcýdan bir cümle alýný
		// aþaðýdaki 3 durumdan uygun olaný yazdýrýn 
		// 1 cümle java içermiyor
		// 2 cümle 1 tane java içeriyor
		// 3 cümlede 1 den fazla java içeriyor
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		int ilkJava=cumle.indexOf("java"); //-1 yada ilk javanýn indexini
		int sonJava=cumle.lastIndexOf("java"); //-1 yada son javanýn indexini verir
		
		if (ilkJava==-1) {
			System.out.println("Cümlede java kelimesi yok");
		} else if (ilkJava==sonJava) {
			System.out.println("Cümlede bir java kelimesi var");
		} else {
			System.out.println("Cümlede birden fazla java kelimesi car");
		}{

		}
		scan.close();
	}

}
