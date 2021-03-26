package day04_operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		 //Kullanýcýnýn girdiði 4 basamaklý sayýsýnýn ilk ve son rakamýnýn toplamýný veren program yazýn.
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen 4 basamaklý bir sayý giriniz");
	
	int s = scan.nextInt(); // bir tam syýnýn birler basamaðýný bulmak için 10 böleriz.
	int sonRakam = s % 10;
	int ilkRakam = s / 1000;
	
	System.out.println(sonRakam + ilkRakam); //4+1=5
	
	scan.close();
	}

}
