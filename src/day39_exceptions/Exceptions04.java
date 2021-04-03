package day39_exceptions;

import java.io.FileInputStream;
import java.io.IOException;
public class Exceptions04 {
    /*
        Eger handle edilecek exception'lar arasýnda parent-child iliþkisi varsa
        bu durmda child exception için catch blogu yazmasak da kodumuz çalýþýr
        Child exception'i silmenin 
        pozitif yaný : tek catch blogu ile tüm exceptionlar handle edilebilir
        negatif yaný : bir sorunla karþýlaþtýðýmýzda bunun dosya bulunamadýðý için mi
                        yoksa dosya okunamadýðý için mi olduðu anlaþýlamaz
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
        System.out.println("Kod bloke olmamýþþþþþ");
    }
}
