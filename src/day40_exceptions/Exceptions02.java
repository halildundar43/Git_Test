package day40_exceptions;

import java.io.FileInputStream;

import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) throws IOException {
				
		@SuppressWarnings("resource")
		FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
		
		// try-catch blogu exception ile handle etmekte kullanýlýr
        // throws keyword'u ise sadece declaration'dýr, dolayýsla
        // throws kullanýlan bir method'da exception oluþursa KOD BLOKE OLUR
        
		int k=0;
        while((k=fis.read())!=-1) { 
            System.out.print((char)k);
        }
        
        // Eðer birden fazla exception için throws keyword'u kullanacaksak
        // yazacaðýmýz exceptionlarýn arasýndaki iliþki ve sýralama önemli olur
        // eðer yazdýðýmýz exception'lar arasýnda parent-child iliþkisi varsa 
        // önce child exception yazýlmalýdýr, aksi takdirde child exception eriþilemez olur
                
        // Eðer yazacaklarýmýz arasýnda parent-child iliþkisi varsa
        // istersek sadece parent'ý yazmamýz da yeterli olur.
	}
}