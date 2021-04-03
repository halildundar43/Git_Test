package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		// iç içe try-catch yerine 1 tane try ve multiple catch blogu kullanabiliriz
		// Ancak bu durumda yazdýðýmýz exception lar arasýnda Parent-Child iliþkisi varsa
		// önce child class ý yazmalýyýz
		// Aksi takdirde (yani önce parent yazýlýrsa) child a iþ kalmaz. Java eriþilemez catch blogu diyerek CTE verir
		try {
			@SuppressWarnings("resource")
			FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
			int k=0;
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
				
			} catch (FileNotFoundException e) { // önce child exception yazdýk
			
			System.out.println(e.getMessage());
			
			} catch (IOException e) { // sonra parent exception yazdýk
				
				e.printStackTrace();
				
		}
		System.out.println("");
		System.out.println("Kod bloke olmamýþ");
	}
}