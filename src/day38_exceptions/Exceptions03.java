package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundaki e nin görevi 
        
        int sayi1=10;
        int sayi2=0;
        
        @SuppressWarnings("unused")
		Exceptions01 exp=new Exceptions01(); 
        // eþitliðin solundaki Exceptions01 hem class adý hem de exp objesi için data türü
        
        try {
        System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
        // ArithmeticException java'da bir class ve e objesi icin data turu
        // e ise ArithmeticException class'ýndan oluþturduðumuz objenin adý
        // o zaman ismi e olmak zorunda deðil ama genelde e kullanýlýr    
            
        	System.out.println("Sayýyý sýfýra bölemezsin"); // bizim kullanýcýya vermek istediðimiz mesaj
            System.out.println(e); // java.lang.ArithmeticException: / by zero
        // bu durumda hem java'ya sorunu yazmasý için fýrsat vermiþ hem de aplicayion'i bloke etmemis oluruz
      
            System.out.println(e.getMessage()); // / by zero
            e.printStackTrace(); /*
                java.lang.ArithmeticException: / by zero
                at day38_exceptions.Exceptions03.main(Exceptions03.java:15)
            */
        }
        System.out.println("Kod bloke olmamýþþþþþ");
	}
}