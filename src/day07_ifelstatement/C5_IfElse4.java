package day07_ifelstatement;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// Kullanýcýdan üçgenin kenar uzunluklarýný alýn
		// üç kenar eþitse eþkenar
		// yoksa eþkenar deðil yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen üçgenin kenar uzunuklarýný girin");
		
		double k1= scan.nextDouble();
		double k2= scan.nextDouble();
		double k3= scan.nextDouble();
		
		if ((k1==k2) && (k2==k3)) {
			System.out.println("Eþkenar");
		} else {
			System.out.println("Eþkenar deðil");
		}
		scan.close();
	}

}
