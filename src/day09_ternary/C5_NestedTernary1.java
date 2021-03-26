package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// kullan�c�dan dikd�rtgenin uzunlu�unu ve geni�li�ini al�n kare olup olmad���n� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen dikd�rtgenin uzunlu�unu ve geni�li�ini giriniz.");
		
		int kenar1= scan.nextInt();
		int kenar2= scan.nextInt();
		// uygun girerse s�k�nt� olmaz		
		System.out.println(kenar1==kenar2 ? "Kare" : "Kare de�il"); 
		
		System.out.println("==============");
		
		// nested ternary ile ��z�m�
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "Kare" : "Kare de�il") : "Ge�ersiz uzunluk");

		scan.close();
	}

}
