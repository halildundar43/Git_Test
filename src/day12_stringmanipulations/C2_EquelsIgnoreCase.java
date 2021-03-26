package day12_stringmanipulations;

public class C2_EquelsIgnoreCase {

	public static void main(String[] args) {
		// equelsIgnoreCase() büyük küçük harf duyarlý olmadan eþitleðe bakar
		//
		
		String str1= "Ali Can";
		String str2= "ali CAN";
		String str3= "Ali Can ";
		
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		
		System.out.println(str1.equals(str3)); // false
		System.out.println(str1.equalsIgnoreCase(str3)); //false  boþluk bir karakterdir o yüzden false verir

	}

}
