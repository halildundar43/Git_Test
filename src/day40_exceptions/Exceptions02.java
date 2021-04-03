package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
		
		// try-catch blogu exception ile handle etmekde kullanilir
        // throws keyword'u ise sadece declaration'dir, dolayisla
        // throws kullanilan bir method'da exception olusursa KOD BLOKE OLUR
        int k=0;
        
        while((k=fis.read())!=-1) { 
            System.out.print((char)k);
        }
        
        // Eger birden fazla exception icin throws keyword'u kullanacaksak
        // yazacagimiz exceptionlarin arasindaki iliski ve siralama onemli olur
        // eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa 
        // once child exception yazilmalidir, aksi takdirde child exc. erisilemez olur
        
        
        // Eger yazacaklarimiz arasinda parent-child iliskisi varsa
        // istersek sadece parent'i yazmamiz da yeterli olur.
	}
}