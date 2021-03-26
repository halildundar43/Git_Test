package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
	
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
		System.out.println("Lütfen sýnýr deðer için pozitif bir tamsayý giriniz");
		int sýnýr=scan.nextInt();
		
		if (sayý<=0) {
			System.out.println("Lütfen pozitif sayý giriniz");
		} else {
			if (rakamlarToplamýHesapla(sayý)>sýnýr) {
				System.out.println("Girdiðiniz sayýnýn rakamlar toplamý, girdiðiniz sýnýr deðerden büyük");
				
			} else {
				System.out.println("Girdiðiniz sayýnýn rakamlar toplamý, girdiðiniz sýnýr deðerden büyük deðil");
			}rakamlarToplamýHesapla(sayý); // girilen sayýnýn rakamlar toplamý int
		}
		scan.close();
	}

	public static int rakamlarToplamýHesapla(int sayý) {
		int rakamlarToplamý=0;
		String sayý2=sayý+""; // sayý yý String e çevirdik
		for (int i = 1; i <=sayý2.length() ; i++) {
			rakamlarToplamý+=sayý%10;
			sayý/=10;
		}
		return rakamlarToplamý;
	}

}
