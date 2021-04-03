package day39_exceptions;

import java.io.FileInputStream;
import java.io.IOException;
public class Exceptions04 {
    /*
        Eger handle edilecek exception'lar aras�nda parent-child ili�kisi varsa
        bu durmda child exception i�in catch blogu yazmasak da kodumuz �al���r
        Child exception'i silmenin 
        pozitif yan� : tek catch blogu ile t�m exceptionlar handle edilebilir
        negatif yan� : bir sorunla kar��la�t���m�zda bunun dosya bulunamad��� i�in mi
                        yoksa dosya okunamad��� i�in mi oldu�u anla��lamaz
     */
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("C:\\Users\\userss\\eclipse-workspace\\techproedsummer2021turksh\\src\\day39_exceptions\\File");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        }  catch (IOException e) { 
            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Kod bloke olmam������");
    }
}
