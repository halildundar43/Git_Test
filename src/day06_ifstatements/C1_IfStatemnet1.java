package day06_ifstatements;

public class C1_IfStatemnet1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		
		if (a>b) {
			System.out.println("ilk sayý büyük");
		}
		
		if (a*b<0) {
			System.out.println("sayýlarým çarpýmý negatitir");
		}
		
		if (a<b || b>0) {
			System.out.println("or'lu cümle çalýþtý");
		}
		
		if(a-b>0 && a*b>0) {
			System.out.println("and cümlesi çalýþtý");
		}
	}

}
