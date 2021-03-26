package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

			public static void main(String[] args) {
	        // Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
	        // Array olusturulurken 2 seyi declare etmeliyiz: 1- data type (Bir array'in icerisinde 
	        // sadece ayni data tipinden elemanlar olabilir.) 2- uzunluk (uzunluk array'in icerisne konulacak
	        // max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
	        
			int arr []= {10,23,54}; // length =3
	        String isimler[]=new String[4]; // length=4 olan bos bir array olusturur
	        
	        // Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
	        // Mesela isimler array'inin icinde isim degerleri degil, isimlerin referanslari olur
	        
	        // array'in elemanlarine ulasma ve update etme
	        System.out.println(isimler[1]); // null
	        isimler[2]="Boss";
	        isimler[0]="Elveda";
	        
	        // Array'in tum elemanlarini yazdirma
	        System.out.println(isimler); // referansi yazdýrýr
	        System.out.println(Arrays.toString(isimler)); // [Elveda, null, Boss, null]
	        
	        // method kullanmadan tum elemanlari yazdiralim
	        // loop kullanmamýz lazým
	        
	        for (int i = 0; i < isimler.length; i++) {
	            
	            System.out.print(isimler[i] + " "); // Elveda null Boss null
	        }
	        System.out.println();
	        
	        System.out.println(arr); // referans yazdýrýr
	        System.out.println(Arrays.toString(arr)); // [10, 23, 54]
	        
	        // Array'in elemanlarini nasil sýralayabiliriz
	        isimler[1]="Oguzhan";
	        isimler[3]="Bilal";
	        Arrays.sort(isimler);
	        System.out.println(Arrays.toString(isimler)); // [Bilal, Boss, Elveda, Oguzhan]
	                  
	    }

}
