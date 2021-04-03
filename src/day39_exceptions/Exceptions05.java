package day39_exceptions;

public class Exceptions05 {
    @SuppressWarnings("null")
	public static void main(String[] args) {
        
        // null olarak tan�mlanm�� bir obje ile uygun olmayan bir i�lem yapmaya cal��t���n�zda
        // Java NullPointerException verir
        // Unchecked exception'dir
        
        String str1=" ";
        String str2="";
        String str3=null;   // null bir deger degildir sadece str3'un hi�bir�eye e�it olamd���n� 
                            // s�yleyen bir i�aret�idir(pointer)
        
        System.out.println(str1.length()); // 1
        System.out.println(str2.length()); // 0
        //System.out.println(str3.length()); // NullPointerException
        
        System.out.println(str3 + "bos"); // nullbos
        System.out.println(str3.concat("bos")); // NullPointerException       
    }
}