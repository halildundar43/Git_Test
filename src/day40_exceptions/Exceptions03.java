package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		
		int arr[]= {1,4,7,8};
        
        try {
        System.out.println(arr[2]);
        
        } catch (ArrayIndexOutOfBoundsException e) { // buray� kapat�rsak exception f�rlat�r ve finally g�revini yapar
            e.printStackTrace();					 // sonra program� kapat�r. son yaz�lan� yazd�rmaz.
        } 
        finally {
            System.out.println("Ne olursa olsun bu sat�r yaz�ls�n");
        }
        
        System.out.println("Kod bloke olmam��");
        
        // Finally blogu try-catch blogu ile veya sadece try blogu ile cal��abilir.
        // Finnally blogu catch ile �ng�rd���m bir sorun oldu�unda cal��t��� gibi
        // �ng�remedi�im bir exception olu�tu�unda da �al���r....

	}
}