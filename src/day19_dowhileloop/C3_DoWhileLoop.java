package day19_dowhileloop;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int sayý=0;
		
		do {
					
			System.out.println("Lütfen pozitif bir tamsayý giriniz");
			sayý=scan.nextInt();
			
		} while (sayý<=0);
		
		System.out.println("aferin");
		
		scan.close();
	}

}
