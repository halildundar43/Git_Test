package day40_exceptions;

import java.util.Scanner;
public class Exceptions01 {
    
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        // Kullan�c�dan ya��n� girmesini isteyin. 
        // Kodunuzu kullan�c� s�f�rdan k���k bir say� girerse Exception verecek 
        // �ekilde yaz�n.
        
        Scanner scan =new Scanner(System.in);
        System.out.println("L�tfen ya��n�z� giriniz");
        int yas=scan.nextInt();
        
        if (yas>=0) {
            System.out.println("Girdi�iniz ya� : " + yas);
        }else {
            throw new IllegalArgumentException();
        }
        System.out.println("Kod bloke olmam��");
        
        // Java'ya bir exception throw ettirmek icin "throw" ve "new " keyword'leri kullan�l�r
    
        // bu �ekilde yazd���m�zda Java exception throw eder ama
        // kodumuz da bloke olmu� olur.
        // bloke olmas�n� engellemek isterseniz kodu try catch ile surround yapabiliriz
        
        /*
        Scanner scan =new Scanner(System.in);
        System.out.println("L�tfen ya��n�z� giriniz");
        int yas=scan.nextInt();
        
        try {
            
        if (yas>=0) {
            System.out.println("Girdi�iniz ya� : " + yas);
        }else {
            throw new IllegalArgumentException();
        }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("Kod bloke olmam��");
        */
        scan.close();
    } 
}