package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		
		int arr[]= {1,4,7,8};
        
        try {
        System.out.println(arr[2]);
        
        } catch (ArrayIndexOutOfBoundsException e) { // burayý kapatýrsak exception fýrlatýr ve finally görevini yapar
            e.printStackTrace();					 // sonra programý kapatýr. son yazýlaný yazdýrmaz.
        } 
        finally {
            System.out.println("Ne olursa olsun bu satýr yazýlsýn");
        }
        
        System.out.println("Kod bloke olmamýþ");
        
        // Finally blogu try-catch blogu ile veya sadece try blogu ile calýþabilir.
        // Finnally blogu catch ile öngördüðüm bir sorun olduðunda calýþtýðý gibi
        // öngöremediðim bir exception oluþtuðunda da çalýþýr....

	}
}