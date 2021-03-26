package day17_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/* kullanýcýdan bir tam sayý girmesini isteyin
		sayý negatif veya sýfýrsa "Lütfen pozitif sayý giriniz" yazdýrýn
		girilen sayýnýn rakamlarýný ayrý bir method la hesaplayýn
		
		Main method içinde kullanýcýdan bir sýnýr deðer isteyin
		rakamlar toplamý sýnýr deðerden büyükse
		"Girdiðiniz sayýnýn rakamlar toplamý, girdiðiniz sýnýr deðerden büyük"
		deðilse "Girdiðiniz sayýnýn rakamlar toplamý, girdiðiniz sýnýr deðerden büyük deðil"
		yazdýrýn*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen rakamlarýnýtoplamak için pozitif bir tam sayý giriniz");
		int sayý=scan.nextInt();
		
		if (sayý<=0) {
			System.out.println("Lütfen pozitif sayý giriniz");
		} else {
			rakamlarToplamýYazdýr(sayý);
		}
		scan.close();
	}

	public static void rakamlarToplamýYazdýr(int sayý) {
		int rakamlarToplamý=0;
		String sayý2=sayý+"";
		for (int i = 1; i <=sayý2.length() ; i++) {
			rakamlarToplamý+=sayý%10;
			sayý/=10;
		}
		System.out.println("Rakamlar toplamý : " + rakamlarToplamý );
	}

}
