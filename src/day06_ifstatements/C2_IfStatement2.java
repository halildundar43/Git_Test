package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý isteyin ve 
		//sayýnýn tek veya çift olduðunu yazdýrýn
		
	Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayý giriniz.");
		
	int num1 = scan.nextInt();
	 
	// eger 153 % 2 == 0 ise sayý çifttir. eger (153%2==1 || 153%==-1) ise sayý tektir.
	
	if(num1%2==0) {
		System.out.println("girdiðiniz sayý çift sayýdýr");
	}
		
	if(num1%2==1 || num1%2==-1) {
		System.out.println("girdiðiniz sayý tek sayýdýr");
	}
		System.out.println("katýldýðýnýz için teþekkürler");
		
		scan.close();
	}
	}
