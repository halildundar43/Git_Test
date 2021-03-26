package day13_stringmanipulations;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		// replaceall hepsini de�i�tir demek
		//

		String str="Java ogren, mutlu ol, Java cand�r 2021";
		System.out.println(str.replace("Java", "hava"));
		
		System.out.println(str.replaceAll("\\w" , "*"));
		System.out.println(str.replaceAll("\\W", "*"));
		System.out.println(str.replaceAll("\\d", "."));
		System.out.println(str.replaceAll("\\D", ""));
		System.out.println(str.replaceAll("\\s", "/"));
		System.out.println(str.replaceAll("\\S", "?"));
	}

}
