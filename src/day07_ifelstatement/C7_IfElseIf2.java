package day07_ifelstatement;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// Kullanýcýdan iki sayý isteyin sayýlarýn ikiside pozitif ise toplamýný yazdýrýn
		// Sayýlarýn ikiside negitif ise çarpýmýný yazdýrýn
		// farklý iþaretlere sahip sayýalarda iþlem yapamazsýn yazdýrýn
		// Sayýlarda 0 varsa sýfýr çarpmada yutan elemandýr yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki sayý giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1==0 || sayi2==0) {
			System.out.println("Sýfýr çarpmaya göre yutan elamndýr.");
			
		} else if(sayi1>0 && sayi2>0) {
			System.out.println(sayi1+sayi2);
			
		} else if (sayi1<0 && sayi2<0) {
			System.out.println(sayi1*sayi2);
			
		} else {
			System.out.println("Farklý iþaretlerde ki sayýlarla iþlem yapamazsýn.");
		}{
			
		}{

		}
		scan.close();
	}

}
