package day07_ifelstatement;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// Kullan�c�dan ��genin kenar uzunluklar�n� al�n
		// �� kenar e�itse e�kenar
		// yoksa e�kenar de�il yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen ��genin kenar uzunuklar�n� girin");
		
		double k1= scan.nextDouble();
		double k2= scan.nextDouble();
		double k3= scan.nextDouble();
		
		if ((k1==k2) && (k2==k3)) {
			System.out.println("E�kenar");
		} else {
			System.out.println("E�kenar de�il");
		}
		scan.close();
	}

}
