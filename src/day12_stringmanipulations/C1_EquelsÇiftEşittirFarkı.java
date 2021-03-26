package day12_stringmanipulations;

public class C1_EquelsÇiftEþittirFarký {

	public static void main(String[] args) {
		// 
		
		String str="Ali can";
		String str2=str+"";
		
		System.out.println(str); // Ali can
		System.out.println(str2); // Ali can
		
		System.out.println(str==str2); // false  == de hem objelere hem adreslere bakar adresler ayný olmadýðý için false olur
		System.out.println(str.equals(str2)); // true sadece içindeki deðere bakar o nedenle true verir
		
		String str3="Ali can";
		System.out.println(str==str3); //true
		System.out.println(str.equals(str3)); //true
		
	}

}
