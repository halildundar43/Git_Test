package day06_ifstatements;

public class C1_IfStatemnet1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		
		if (a>b) {
			System.out.println("ilk say� b�y�k");
		}
		
		if (a*b<0) {
			System.out.println("say�lar�m �arp�m� negatitir");
		}
		
		if (a<b || b>0) {
			System.out.println("or'lu c�mle �al��t�");
		}
		
		if(a-b>0 && a*b>0) {
			System.out.println("and c�mlesi �al��t�");
		}
	}

}
