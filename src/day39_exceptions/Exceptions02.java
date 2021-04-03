package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		  E�er kodumuzu yazd���m�zda birden fazla exception la ilgili durum olu�uyorsa
		  i� i�e try-ctch bloklar� olu�tururabiliriz
		  Bu �rnekte ilk �nce dosyay� okutmak istedik
		  Java "Ya dosyay� bulamazsam?" diye bizden yard�m istedi
		  Biz de try-catch blo�u ile F�leNOtFoundException ile handle etmesinde yard�mc� olduk
		  Sonra dosyadaki yaz�lar� okumaya cal��t�k ve Java yeniden "Ya dosyay� okuyamazsam " 
          diye yard�m istedi
          Biz de try-catch blogu ile IOException ile handle etmesini saglad�k.
		*/
		
		try {
			FileInputStream fis=new FileInputStream ("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
			int k=0;
			try { // inner try-catch
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) { // dosyalarla ilgili genel yazma ve okuma sorunlar� ile handle eder
				
				e.printStackTrace(); // dosyay� bulur ama yazd�ramay�nca yada okuyamay�nca ki hatalar� yazd�r�r
			}
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(); // dosyay� bulamay�nca ki hatalar� yazd�r�r
		}
		System.out.println("");
		System.out.println("Kod bloke olmam��");
	}
}