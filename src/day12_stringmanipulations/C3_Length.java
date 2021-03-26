package day12_stringmanipulations;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kullanýcýdan bir string girmesini isteyin
		// girilen stringin son harfini büyük harf olarak yazdýrýn.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz.");
		
		String str= scan.nextLine().toUpperCase();
		
		System.out.println("Girdiðiniz cümlenin son harfi : "+ str.charAt(str.length()-1));
		
		
		String str2="";
		System.out.println(str2.length()); // sýfýr
		
		String str3="null"; // null
						    // null hiç demek
						    // null case sensitive dir Null tada NULL yazýlmaz
						   // null bir deðer deðidir
						   // bir iþaretleyicidir pointer dýr
		//String str3=null; str3 e deðer atanmadýðýný ifade eder
		System.out.println(str3.length()); // çift týrnak içine yazýlmazsa hata verir 
		
		
		scan.close();
		
	}

}
