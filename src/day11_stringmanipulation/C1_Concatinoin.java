package day11_stringmanipulation;

public class C1_Concatinoin {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="World";
		
		System.out.println(str1+ " " +str2);
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(" ").concat(str2));
		System.out.println(str1.concat(" " +str2));
		
		
	}

}
