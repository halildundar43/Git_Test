package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullanýcýdan 2 tamsayý alýn ve bölümlerini yazdýrýn
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bölünecek tamsayýyý yazýn");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen kaça bölmek istediðinizi yazýn");
        int sayi2=scan.nextInt();
        // java exceptions'ý handle etmek için try-catch blogu oluþturmuþ.
        
        try {
        System.out.println("Bölme iþleminin sonucu : " + sayi1/sayi2);
        } catch (ArithmeticException e) { // sýfýrla bölme problemini çözmek için catch
        								  // hangi exception hatasý veriyorsa o catch bloðunu kullanmalýyýz
            System.out.println("Sayýyý sýfýra bölemezsin");
        }
        scan.close();
	}
}
