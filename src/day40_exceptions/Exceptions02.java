package day40_exceptions;

import java.io.FileInputStream;

import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) throws IOException {
				
		@SuppressWarnings("resource")
		FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
		
		// try-catch blogu exception ile handle etmekte kullan�l�r
        // throws keyword'u ise sadece declaration'd�r, dolay�sla
        // throws kullan�lan bir method'da exception olu�ursa KOD BLOKE OLUR
        
		int k=0;
        while((k=fis.read())!=-1) { 
            System.out.print((char)k);
        }
        
        // E�er birden fazla exception i�in throws keyword'u kullanacaksak
        // yazaca��m�z exceptionlar�n aras�ndaki ili�ki ve s�ralama �nemli olur
        // e�er yazd���m�z exception'lar aras�nda parent-child ili�kisi varsa 
        // �nce child exception yaz�lmal�d�r, aksi takdirde child exception eri�ilemez olur
                
        // E�er yazacaklar�m�z aras�nda parent-child ili�kisi varsa
        // istersek sadece parent'� yazmam�z da yeterli olur.
	}
}