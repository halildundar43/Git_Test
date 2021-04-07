package day44_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list); // [A, B, C, D]
		// her elemana B harfini ekleyelim
		
		for (String each : list) {
			each+="B";
			System.out.print(each+" ");
		}
		System.out.println("");
		System.out.println(list);
		
		// Colections her yap� index i desteklemez. �rne�in Set de index olmaz
		// �ndex olmay�nca mecburen t�m elemanlara ula�mak i�in for-each loop kullan�l�r
		// For-each loop ile de update veya delete yapamay�z
		// Bunu n i�in Java Iterator interface ini olu�turmu�tur...
		
		@SuppressWarnings("rawtypes")
		Iterator it1= list.iterator();
		// next(), hasNext(), rem�ve() methodlar�na sahiptir
		// Listedeki t�m elemanlar� iterator kullanarak silelim
		
		while(it1.hasNext()) {
		it1.next();
		it1.remove();
		}
		System.out.println(list); // []
		System.out.println(list.size()); // 0
	}
}