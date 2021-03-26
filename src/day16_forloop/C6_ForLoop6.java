package day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Interview Question kullan�c�dan bir String isteyin ve
		// Stringi tersine �eviren bir program yaz�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen tersine �evirmek i�in bir yaz� giriniz");
		String yaz�=scan.nextLine();
		//1. yol variable olu�turup en son yazd�rabilirim
		String tersYaz�="";
		
		for (int i = yaz�.length()-1; i >= 0; i--) {
			tersYaz�+=yaz�.charAt(i);
		}
		System.out.println("Girdi�iniz yaz�n�n tersten yaz�l��� : " + tersYaz�);
		
		//2.yol tersYaz� y� sadece yazd�racak variable olu�turmadan da yazd�rabiliriz
		for (int i = yaz�.length()-1; i >= 0; i--) {
			System.out.print(yaz�.charAt(i));
		}
		System.out.println("");
		scan.close();
		//3. yol method olu�turup bunu yazd�rrabiliriz
		tersineCevir(yaz�);	
	}
	
	public static void tersineCevir(String yaz�) {
		for (int i = yaz�.length()-1; i >= 0; i--) {
			System.out.print(yaz�.charAt(i));
		
	}

}
}