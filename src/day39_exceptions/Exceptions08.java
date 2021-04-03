package day39_exceptions;

import java.util.Scanner;
public class Exceptions08 {
    public static void main(String[] args) {
        /*         
        Kullan�c�dan �arpma yapmak i�in bir String isteyin. 
        Kullan�c�n�n girdi�i String sadece say�lardan olu�uyorsa 
        say�y� 2 ile �arp�p sonucu yazd�r�n.
        Kullan�c� say�lardan olu�mayan bir String girerse 
        �Girdi�iniz String say�ya �evrilemez� yazd�r�n.
        */
        
        Scanner scan=new Scanner(System.in);
        System.out.println("L�tfen 2 ile �arpmak i�in bir String girin");
        String str=scan.nextLine();
        
        try {
        System.out.println(2*Integer.parseInt(str));
        } catch(NumberFormatException e) {
            System.out.println("Girdi�iniz String say�ya �evrilemez");
        }
        scan.close();
    }
}