package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// kullan�c�dan bir harf isteyin k���k harf ise k���k harf yazd�r�n
		// b�y�k harf ise b�y�k harf yazd�r�n
		// uygun karakter de�ilse girdi�iniz karakter harf de�il yazd�r�n.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir harf giriniz.");
		
		char harf= scan.next().charAt(0);

		System.out.println(harf>'a' || harf<'z' ? "K���k harf" : ((harf>'A' || harf<'Z') ?  "B�y�k harf" : "Girdi�iniz karakter harf de�il")) ;
	
		scan.close();
	}
	
}
