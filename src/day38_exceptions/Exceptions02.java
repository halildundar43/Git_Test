package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		// Kullanýcýdan 2 tamsayý alýn ve bölümlerini yazdýrýn
        int count=1;
        Scanner scan=new Scanner(System.in);
        
        while(count<=100) {
        
        System.out.println("Lütfen bölünecek tamsayýyý yazýn");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen kaça bölmek istediginizi yazýn");
        int sayi2=scan.nextInt();
        /*  java'ya exceptions'i handle etmek için bir çözüm üretmezsek
            java exception ile karþýlaþtýðýnda çalýþmayý durdurur (stops execution)
            throws exception (exception fýrlatýr)(problemin kaynaðýný bize gösterir)
            
            tüm aplication durmuþ olur... 
            Muþterinin kullandýðý bir uygulama için bu KABUL EDÝLEMEZ
            Bunun için kod yazan kiþi muhtemel sorunlarý öngörmeli ve
            Java'ya bu sorunla handle edebilmesi için yol göstermelidir.
        */
        System.out.println("islem no : " + count);
        try {
        System.out.println("Bölme iþleminin sonucu : " + sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Sayýyý sýfýra bölemezsin");
        }
        count++;
        }
        scan.close();
	}
}