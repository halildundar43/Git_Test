package day10_swtichcase;

import java.util.Scanner;

public class C1_TernarTekrar {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n
		// say� 3 basamal� ise �� basmakl� say�
		// de�ilse �� basamakl� say� de�il yazd�r�n
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfen pozitif bir tam say� giriniz.");
		int sayi= scan.nextInt();
		
		String sonuc = sayi>99 ? (sayi<1000 ? "Say� �� basamakl�" : "Say� �� basamakl� de�il") : "Say� �� basamakl� de�il";
		System.out.println(sonuc);
		
		//2.yol
		String sonuc2=  sayi>99 && sayi<1000 ? "Say� �� basamakl�" : "Say� �� basamakl� de�il";
		System.out.println(sonuc2);
	
	scan.close();
	}

}
