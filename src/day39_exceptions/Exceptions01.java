package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java ya bir dosyay� okumas�n� yada dosyaya yazmas�n� s�yledi�imizde
		// Java "ya dosyay� bulamazsam" der ve bizden ��z�m �retmemizi bekler
		// dosya bulma ile ilgili exception turu : FileNotFoundException
		// Java kodu yazar yazmaz burada ki olas� problemi g�r�r ve CTE verir
		// Kodumuzu yazd���m�z anda ortaya ��kan bu t�r exception lara Checked Exception diyoruz
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(); // t�m hata a��klamalar�n� yazd�r�r ama kodumuz bloke olmaz
			System.out.println(e.getMessage()); // daha az hata a��klamas� yapar
		}
		System.out.println("Kod bloke olmam��");
	}
}