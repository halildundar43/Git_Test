package day12_stringmanipulations;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kullan�c�dan bir string girmesini isteyin
		// girilen stringin son harfini b�y�k harf olarak yazd�r�n.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz.");
		
		String str= scan.nextLine().toUpperCase();
		
		System.out.println("Girdi�iniz c�mlenin son harfi : "+ str.charAt(str.length()-1));
		
		
		String str2="";
		System.out.println(str2.length()); // s�f�r
		
		String str3="null"; // null
						    // null hi� demek
						    // null case sensitive dir Null tada NULL yaz�lmaz
						   // null bir de�er de�idir
						   // bir i�aretleyicidir pointer d�r
		//String str3=null; str3 e de�er atanmad���n� ifade eder
		System.out.println(str3.length()); // �ift t�rnak i�ine yaz�lmazsa hata verir 
		
		
		scan.close();
		
	}

}
