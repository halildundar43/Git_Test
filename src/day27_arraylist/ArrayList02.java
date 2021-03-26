package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ay�e");
		list.add("Fatma");
		System.out.println(list);
		
		// istenen indexteki eleman� kald�r�p, yerine bizim istedi�imiz eleman� koyar (replace)
		list.set(2, "Kemal");
		System.out.println(list);
		
		list.set(0, "Semih");
		System.out.println(list);
		
		//list.set(4,"Mustafa"); olmayan bir index kullan�rsa RTE verir
		
		list.add(2, "Yasin");
		System.out.println(list);
		list.add(5, "H�rriyet");
		System.out.println(list);
		// list.add(10, "Sefer"); size dan b�y�k index kabul etmez
		
		System.out.println(list.contains("H�rriyet"));
		System.out.println(list.contains("Mehmet"));
		
		// list in elemanlar�n� alfabetik s�ralay�n
		Collections.sort(list);
		System.out.println(list);
	}

}
