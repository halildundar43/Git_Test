package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		// i� i�e try-catch yerine 1 tane try ve multiple catch blogu kullanabiliriz
		// Ancak bu durumda yazd���m�z exception lar aras�nda Parent-Child ili�kisi varsa
		// �nce child class � yazmal�y�z
		// Aksi takdirde (yani �nce parent yaz�l�rsa) child a i� kalmaz. Java eri�ilemez catch blogu diyerek CTE verir
		try {
			@SuppressWarnings("resource")
			FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
			int k=0;
			
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
				
			} catch (FileNotFoundException e) { // �nce child exception yazd�k
			
			System.out.println(e.getMessage());
			
			} catch (IOException e) { // sonra parent exception yazd�k
				
				e.printStackTrace();
				
		}
		System.out.println("");
		System.out.println("Kod bloke olmam��");
	}
}