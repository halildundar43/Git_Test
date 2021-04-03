package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		  Eðer kodumuzu yazdýðýmýzda birden fazla exception la ilgili durum oluþuyorsa
		  iç içe try-ctch bloklarý oluþtururabiliriz
		  Bu örnekte ilk önce dosyayý okutmak istedik
		  Java "Ya dosyayý bulamazsam?" diye bizden yardým istedi
		  Biz de try-catch bloðu ile FýleNOtFoundException ile handle etmesinde yardýmcý olduk
		  Sonra dosyadaki yazýlarý okumaya calýþtýk ve Java yeniden "Ya dosyayý okuyamazsam " 
          diye yardým istedi
          Biz de try-catch blogu ile IOException ile handle etmesini sagladýk.
		*/
		
		try {
			FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
			int k=0;
			try { // inner try-catch
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) { // dosyalarla ilgili genel yazma ve okuma sorunlarý ile handle eder
				
				e.printStackTrace(); // dosyayý bulur ama yazdýramayýnca yada okuyamayýnca ki hatalarý yazdýrýr
			}
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(); // dosyayý bulamayýnca ki hatalarý yazdýrýr
		}
		System.out.println("");
		System.out.println("Kod bloke olmamýþ");
	}
}