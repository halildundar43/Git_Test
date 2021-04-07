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
		
		// Colections her yapý index i desteklemez. Örneðin Set de index olmaz
		// Ýndex olmayýnca mecburen tüm elemanlara ulaþmak için for-each loop kullanýlýr
		// For-each loop ile de update veya delete yapamayýz
		// Bunu n için Java Iterator interface ini oluþturmuþtur...
		
		@SuppressWarnings("rawtypes")
		Iterator it1= list.iterator();
		// next(), hasNext(), remýve() methodlarýna sahiptir
		// Listedeki tüm elemanlarý iterator kullanarak silelim
		
		while(it1.hasNext()) {
		it1.next();
		it1.remove();
		}
		System.out.println(list); // []
		System.out.println(list.size()); // 0
	}
}