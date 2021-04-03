package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		// Kullan�c�dan 2 tamsay� al�n ve b�l�mlerini yazd�r�n
        int count=1;
        Scanner scan=new Scanner(System.in);
        
        while(count<=100) {
        
        System.out.println("L�tfen b�l�necek tamsay�y� yaz�n");
        int sayi1=scan.nextInt();
        System.out.println("L�tfen ka�a b�lmek istediginizi yaz�n");
        int sayi2=scan.nextInt();
        /*  java'ya exceptions'i handle etmek i�in bir ��z�m �retmezsek
            java exception ile kar��la�t���nda �al��may� durdurur (stops execution)
            throws exception (exception f�rlat�r)(problemin kayna��n� bize g�sterir)
            
            t�m aplication durmu� olur... 
            Mu�terinin kulland��� bir uygulama i�in bu KABUL ED�LEMEZ
            Bunun i�in kod yazan ki�i muhtemel sorunlar� �ng�rmeli ve
            Java'ya bu sorunla handle edebilmesi i�in yol g�stermelidir.
        */
        System.out.println("islem no : " + count);
        try {
        System.out.println("B�lme i�leminin sonucu : " + sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Say�y� s�f�ra b�lemezsin");
        }
        count++;
        }
        scan.close();
	}
}