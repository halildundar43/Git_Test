package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullan�c�dan bir c�mle al�n, while loop kullanarak
		// c�mlede b�y�k harf varm� yokmu yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String c�mle=scan.nextLine();
		
		String flag="yok";
		int index=0;
		
		while(index<c�mle.length()) {
			if (c�mle.charAt(index)>='A' && c�mle.charAt(index)<='Z') {
				flag="var";
	}
			index++;
	}
		System.out.println("verdi�iniz c�mlede b�y�k harf " + flag);
		
		scan.close();
	}

}
