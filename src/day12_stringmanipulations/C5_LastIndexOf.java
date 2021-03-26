package day12_stringmanipulations;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// lastIndexOf ta istenen karakterin son index ni bulur
		
		//kullan�c�dan bir c�mle al�n�
		// a�a��daki 3 durumdan uygun olan� yazd�r�n 
		// 1 c�mle java i�ermiyor
		// 2 c�mle 1 tane java i�eriyor
		// 3 c�mlede 1 den fazla java i�eriyor
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		int ilkJava=cumle.indexOf("java"); //-1 yada ilk javan�n indexini
		int sonJava=cumle.lastIndexOf("java"); //-1 yada son javan�n indexini verir
		
		if (ilkJava==-1) {
			System.out.println("C�mlede java kelimesi yok");
		} else if (ilkJava==sonJava) {
			System.out.println("C�mlede bir java kelimesi var");
		} else {
			System.out.println("C�mlede birden fazla java kelimesi car");
		}{

		}
		scan.close();
	}

}
