package day03_operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen adinizi ve soyadinizi giriniz.");
	
	String isim = scan.nextLine();
	
	System.out.println(isim);
  
	scan.close();
	}

}
