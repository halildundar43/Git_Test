package day03_operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Ýlk isminzi giriniz.");
	String ilkIsim = scan.nextLine();
		
	System.out.println("Soy isminizi giriniz.");
	String soyisim = scan.nextLine();
			
	System.out.println(ilkIsim);
	System.out.println(soyisim);
	
	scan.close();
	}

}
