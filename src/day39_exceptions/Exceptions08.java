package day39_exceptions;

import java.util.Scanner;
public class Exceptions08 {
    public static void main(String[] args) {
        /*         
        Kullanýcýdan çarpma yapmak için bir String isteyin. 
        Kullanýcýnýn girdiði String sadece sayýlardan oluþuyorsa 
        sayýyý 2 ile çarpýp sonucu yazdýrýn.
        Kullanýcý sayýlardan oluþmayan bir String girerse 
        “Girdiðiniz String sayýya çevrilemez” yazdýrýn.
        */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 ile çarpmak için bir String girin");
        String str=scan.nextLine();
        
        try {
        System.out.println(2*Integer.parseInt(str));
        } catch(NumberFormatException e) {
            System.out.println("Girdiðiniz String sayýya çevrilemez");
        }
        scan.close();
    }
}