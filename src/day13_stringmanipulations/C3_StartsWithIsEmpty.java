package day13_stringmanipulations;

public class C3_StartsWithIsEmpty {

	public static void main(String[] args) {
		
		String str="Her gün java olsa";
		System.out.println(str.startsWith(str));
		System.out.println(str.startsWith("Her "));
		
		System.out.println(str.startsWith("g", 4));
		System.out.println(str.startsWith("java", 4));
		
		System.out.println(str.isEmpty());
		
		String str1="";
		System.out.println(str1.isEmpty()); // true verir hiç karakter yok
		
		String str2=" ";
		System.out.println(str2.isEmpty()); // false verir boþluk bir karakterdir
		
		// String str3=nuull; hata verir null deðer deðildir RTE
		//System.out.println(str1.isEmpty());
		
		
		
		
	}

}
