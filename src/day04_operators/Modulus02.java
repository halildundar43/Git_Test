package day04_operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		 //Kullan�c�n�n girdi�i 4 basamakl� say�s�n�n ilk ve son rakam�n�n toplam�n� veren program yaz�n.
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("L�tfen 4 basamakl� bir say� giriniz");
	
	int s = scan.nextInt(); // bir tam sy�n�n birler basama��n� bulmak i�in 10 b�leriz.
	int sonRakam = s % 10;
	int ilkRakam = s / 1000;
	
	System.out.println(sonRakam + ilkRakam); //4+1=5
	
	scan.close();
	}

}
