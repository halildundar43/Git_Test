package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� isteyin ve 
		//say�n�n tek veya �ift oldu�unu yazd�r�n
		
	Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tamsay� giriniz.");
		
	int num1 = scan.nextInt();
	 
	// eger 153 % 2 == 0 ise say� �ifttir. eger (153%2==1 || 153%==-1) ise say� tektir.
	
	if(num1%2==0) {
		System.out.println("girdi�iniz say� �ift say�d�r");
	}
		
	if(num1%2==1 || num1%2==-1) {
		System.out.println("girdi�iniz say� tek say�d�r");
	}
		System.out.println("kat�ld���n�z i�in te�ekk�rler");
		
		scan.close();
	}
	}
