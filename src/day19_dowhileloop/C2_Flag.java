package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanýcýdan bir cümle alýn, while loop kullanarak
		// cümlede büyük harf varmý yokmu yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cümle=scan.nextLine();
		
		String flag="yok";
		int index=0;
		
		while(index<cümle.length()) {
			if (cümle.charAt(index)>='A' && cümle.charAt(index)<='Z') {
				flag="var";
	}
			index++;
	}
		System.out.println("verdiðiniz cümlede büyük harf " + flag);
		
		scan.close();
	}

}
