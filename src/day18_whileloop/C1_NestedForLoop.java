package day18_whileloop;

import java.util.Scanner;

public class C1_NestedForLoop {

	public static void main(String[] args) {
		/* kullanýcýdan pozitif bir rakam girmesini isteyim ve
		 girilen rakama göre çarpým tablosu oluþturun örnek kullanýcý 3 girerse
			
			1 2 3
			4 5 6 
			7 8 9
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen çarpým tablosu için bir rakam giriniz");
		int rakam=scan.nextInt();
		
		for (int i = 1; i <=rakam; i++) {
			System.out.println("");
			
			for (int j = 1; j <= rakam; j++) {
				System.out.print(i*j+" ");
	}
		}	
		scan.close();
	}
}