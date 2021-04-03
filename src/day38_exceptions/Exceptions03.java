package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundaki e nin g�revi 
        
        int sayi1=10;
        int sayi2=0;
        
        @SuppressWarnings("unused")
		Exceptions01 exp=new Exceptions01(); 
        // e�itli�in solundaki Exceptions01 hem class ad� hem de exp objesi i�in data t�r�
        
        try {
        System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
        // ArithmeticException java'da bir class ve e objesi icin data turu
        // e ise ArithmeticException class'�ndan olu�turdu�umuz objenin ad�
        // o zaman ismi e olmak zorunda de�il ama genelde e kullan�l�r    
            
        	System.out.println("Say�y� s�f�ra b�lemezsin"); // bizim kullan�c�ya vermek istedi�imiz mesaj
            System.out.println(e); // java.lang.ArithmeticException: / by zero
        // bu durumda hem java'ya sorunu yazmas� i�in f�rsat vermi� hem de aplicayion'i bloke etmemis oluruz
      
            System.out.println(e.getMessage()); // / by zero
            e.printStackTrace(); /*
                java.lang.ArithmeticException: / by zero
                at day38_exceptions.Exceptions03.main(Exceptions03.java:15)
            */
        }
        System.out.println("Kod bloke olmam������");
	}
}