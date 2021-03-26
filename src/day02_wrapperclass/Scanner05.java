package day02_wrapperclass;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen dairenin yarý çapýný giriniz.");
	
	double yacap = scan.nextDouble();
	
	System.out.println(3.14159 * yacap * yacap);
	System.out.println(3.14159 * yacap * 2);

	scan.close();
	}

}
