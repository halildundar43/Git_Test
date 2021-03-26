package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayþe");
		list.add("Fatma");
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.remove(1)); // indexi 1 olan Can ý silip sildiði elemaný bana döndürecek
		System.out.println(list); // [Ali, Ayþe, Fatma]
		
		System.out.println(list.remove("Ayþe")); // ayþe yi silecek ve bize true döndürecek
		System.out.println(list); // [Ali, Fatma]
		
		System.out.println(list.remove("Mehmet")); // mehmet i bulamadýðý için silemeyecek ve bize false döndürecek
		System.out.println(list); // [Ali, Fatma]
		
		list.remove(1);
		list.remove("Ali");
		System.out.println(list); //[]
	}

}
