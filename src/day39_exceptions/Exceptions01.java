package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java ya bir dosyayý okumasýný yada dosyaya yazmasýný söylediðimizde
		// Java "ya dosyayý bulamazsam" der ve bizden çözüm üretmemizi bekler
		// dosya bulma ile ilgili exception turu : FileNotFoundException
		// Java kodu yazar yazmaz burada ki olasý problemi görür ve CTE verir
		// Kodumuzu yazdýðýmýz anda ortaya çýkan bu tür exception lara Checked Exception diyoruz
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(); // tüm hata açýklamalarýný yazdýrýr ama kodumuz bloke olmaz
			System.out.println(e.getMessage()); // daha az hata açýklamasý yapar
		}
		System.out.println("Kod bloke olmamýþ");
	}
}