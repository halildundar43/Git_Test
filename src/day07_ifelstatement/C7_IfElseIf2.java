package day07_ifelstatement;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// Kullan�c�dan iki say� isteyin say�lar�n ikiside pozitif ise toplam�n� yazd�r�n
		// Say�lar�n ikiside negitif ise �arp�m�n� yazd�r�n
		// farkl� i�aretlere sahip say�alarda i�lem yapamazs�n yazd�r�n
		// Say�larda 0 varsa s�f�r �arpmada yutan elemand�r yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki say� giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1==0 || sayi2==0) {
			System.out.println("S�f�r �arpmaya g�re yutan elamnd�r.");
			
		} else if(sayi1>0 && sayi2>0) {
			System.out.println(sayi1+sayi2);
			
		} else if (sayi1<0 && sayi2<0) {
			System.out.println(sayi1*sayi2);
			
		} else {
			System.out.println("Farkl� i�aretlerde ki say�larla i�lem yapamazs�n.");
		}{
			
		}{

		}
		scan.close();
	}

}
