package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullan�c�dan g�n isminin ilk harfini isteyin
		//harfe uygun g�n isimlerini yazd�r�n
		// c == cuma ve cumartesi s == sal� gibi
		
	Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen g�n isminin ilk harfini giriniz.");
	
		char ilkHarf = scan.next().charAt(0);
	
	if (ilkHarf == 'p' || ilkHarf == 'P') {
		System.out.println("pazar, pazartesi veya per�embe");
	}
	if (ilkHarf == 's' || ilkHarf == 'S') {
		System.out.println("sal�");
	}
	if (ilkHarf == 'c' || ilkHarf == 'C') {
		System.out.println("car�amba,cuma veya cumartesi");
	}
	if (ilkHarf!= 'p' && ilkHarf!= 'P' && ilkHarf!= 's' && ilkHarf!= 'S' && ilkHarf!= 'c' && ilkHarf!= 'C') {
		System.out.println("L�tfen ge�erli bir harf yaz�n�z.");
	}
	
	scan.close();
	}

}
