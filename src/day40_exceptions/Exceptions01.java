package day40_exceptions;

import java.util.Scanner;
public class Exceptions01 {
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        // Kullanýcýdan yaþýný girmesini isteyin. 
        // Kodunuzu kullanýcý sýfýrdan küçük bir sayý girerse Exception verecek 
        // þekilde yazýn.
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen yaþýnýzý giriniz");
        int yas=scan.nextInt();
        
        if (yas>=0) {
            System.out.println("Girdiðiniz yaþ : " + yas);
        }else {
            throw new IllegalArgumentException();
        }
        System.out.println("Kod bloke olmamýþ");
        
        // Java'ya bir exception throw ettirmek icin "throw" ve "new " keyword'leri kullanýlýr
    
        // bu þekilde yazdýðýmýzda Java exception throw eder ama
        // kodumuz da bloke olmuþ olur.
        // bloke olmasýný engellemek isterseniz kodu try catch ile surround yapabiliriz
        
        /*
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen yaþýnýzý giriniz");
        int yas=scan.nextInt();
        
        try {
            
        if (yas>=0) {
            System.out.println("Girdiðiniz yaþ : " + yas);
        }else {
            throw new IllegalArgumentException();
        }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("Kod bloke olmamýþ");
        */
        scan.close();
    } 
}