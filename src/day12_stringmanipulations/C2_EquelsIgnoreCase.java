package day12_stringmanipulations;

public class C2_EquelsIgnoreCase {

	public static void main(String[] args) {
		// equelsIgnoreCase() b�y�k k���k harf duyarl� olmadan e�itle�e bakar
		//
		
		String str1= "Ali Can";
		String str2= "ali CAN";
		String str3= "Ali Can ";
		
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		
		System.out.println(str1.equals(str3)); // false
		System.out.println(str1.equalsIgnoreCase(str3)); //false  bo�luk bir karakterdir o y�zden false verir

	}

}
