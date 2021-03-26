package day13_stringmanipulations;

public class C3_StartsWithIsEmpty {

	public static void main(String[] args) {
		
		String str="Her g�n java olsa";
		System.out.println(str.startsWith(str));
		System.out.println(str.startsWith("Her "));
		
		System.out.println(str.startsWith("g", 4));
		System.out.println(str.startsWith("java", 4));
		
		System.out.println(str.isEmpty());
		
		String str1="";
		System.out.println(str1.isEmpty()); // true verir hi� karakter yok
		
		String str2=" ";
		System.out.println(str2.isEmpty()); // false verir bo�luk bir karakterdir
		
		// String str3=nuull; hata verir null de�er de�ildir RTE
		//System.out.println(str1.isEmpty());
		
		
		
		
	}

}
