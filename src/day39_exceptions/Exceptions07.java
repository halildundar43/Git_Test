package day39_exceptions;

public class Exceptions07 {
    public static void main(String[] args) {
        // Data t�rlerini casting yaparken uygun olmayan i�lem yaparsan�z
        // Java ClassCastException verir
        
        // E�er tamamen say�lardan olu�mayan bir String'i int'a �evirmeye 
        // �al���rsan�z Java NumberFormatException verir
        
        int sayi=10;
        // String str=sayi; // CTE
        
        String str="123456";
        
        System.out.println(str+10); // 12345610
        
        int strSayi=Integer.parseInt(str); // "123456" stringi intigera (say�ya) �evirir 123456
        
        System.out.println(strSayi+10); // 123466
        System.out.println(str+20); // 12345620
        
        String str2="123a45";
        //System.out.println(Integer.parseInt(str2)); // NumberFormatException
        
        Object sayi2=40;
        String sayiStr=(String)sayi2;   // Explicit narrowing casting
                                        // ClassCastException
        System.out.println(sayi+str2+sayiStr); // ikazlar� silmek i�in yazd�r�d�m
    } 
}