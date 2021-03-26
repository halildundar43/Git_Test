package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan toplamak üzere pozitif tamsayýlar isteyin
		 iþlemi bitirmek için 0'a basmasýný söyleyin
		 kullanýcý yanlýþlýkla negatif sayý girerse o sayýyý toplamaya eklemeyin ve
		 "Negatif sayý giremezsin" yazdýrýp baþa dönün
		 kullanýcý 0'a bastýðýnda toplam kaç pozitif sayý girdiðini,
		 yanlýþlýkla kaç negatif sayý girdiðini ve
		 irdiði pozitif sayýlarýn toplamýnýn kaç olduðunu yazdýrýn
		*/
		
		Scanner scan=new Scanner(System.in);
		int countPoz=0;
		int countNeg=0;
		int toplam=0;
		int sayý=0;
		System.out.println("Oyuna hoþ geldiniz, bitirmek istediðinizde 0'a basýn");
		
		do {
			System.out.println("Lütfen pozitif bir tamsayý giriniz");
			sayý=scan.nextInt();
			
			if (sayý>0) {
				
				countPoz++;
				toplam+=sayý;
			} 
			
			if (sayý<0){
				
				countNeg++;
				System.out.println("Negatif sayý giremezsin");
			}
			
		} while (sayý!=0);
		
		System.out.println("toplam "+countPoz+" pozitif sayý girdiniz");
		System.out.println("toplam "+countNeg+" negatif sayý girdiniz");
		System.out.println("Girdiðiniz pozitif sayýlarýn toplamý: "+toplam);
		
		scan.close();
	}

}
