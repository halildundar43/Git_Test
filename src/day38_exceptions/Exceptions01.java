package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// Kullan�c�dan 2 tamsay� al�n ve b�l�mlerini yazd�r�n
        
        Scanner scan=new Scanner(System.in);
        System.out.println("L�tfen b�l�necek tamsay�y� yaz�n");
        int sayi1=scan.nextInt();
        System.out.println("L�tfen ka�a b�lmek istedi�inizi yaz�n");
        int sayi2=scan.nextInt();
        // java exceptions'� handle etmek i�in try-catch blogu olu�turmu�.
        
        try {
        System.out.println("B�lme i�leminin sonucu : " + sayi1/sayi2);
        } catch (ArithmeticException e) { // s�f�rla b�lme problemini ��zmek i�in catch
        								  // hangi exception hatas� veriyorsa o catch blo�unu kullanmal�y�z
            System.out.println("Say�y� s�f�ra b�lemezsin");
        }
        scan.close();
	}
}
