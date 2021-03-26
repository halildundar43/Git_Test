package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayþe");
		list.add("Fatma");
		System.out.println(list);
		
		// istenen indexteki elemaný kaldýrýp, yerine bizim istediðimiz elemaný koyar (replace)
		list.set(2, "Kemal");
		System.out.println(list);
		
		list.set(0, "Semih");
		System.out.println(list);
		
		//list.set(4,"Mustafa"); olmayan bir index kullanýrsa RTE verir
		
		list.add(2, "Yasin");
		System.out.println(list);
		list.add(5, "Hürriyet");
		System.out.println(list);
		// list.add(10, "Sefer"); size dan büyük index kabul etmez
		
		System.out.println(list.contains("Hürriyet"));
		System.out.println(list.contains("Mehmet"));
		
		// list in elemanlarýný alfabetik sýralayýn
		Collections.sort(list);
		System.out.println(list);
	}

}
