package day19_dowhileloop;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int say�=0;
		
		do {
					
			System.out.println("L�tfen pozitif bir tamsay� giriniz");
			say�=scan.nextInt();
			
		} while (say�<=0);
		
		System.out.println("aferin");
		
		scan.close();
	}

}
