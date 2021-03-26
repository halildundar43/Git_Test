package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ay�e");
		list.add("Fatma");
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.remove(1)); // indexi 1 olan Can � silip sildi�i eleman� bana d�nd�recek
		System.out.println(list); // [Ali, Ay�e, Fatma]
		
		System.out.println(list.remove("Ay�e")); // ay�e yi silecek ve bize true d�nd�recek
		System.out.println(list); // [Ali, Fatma]
		
		System.out.println(list.remove("Mehmet")); // mehmet i bulamad��� i�in silemeyecek ve bize false d�nd�recek
		System.out.println(list); // [Ali, Fatma]
		
		list.remove(1);
		list.remove("Ali");
		System.out.println(list); //[]
	}

}
