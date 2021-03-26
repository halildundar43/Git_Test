package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan bir þifre girmesini isteyin.
		 Girilen þifreyi aþaðýdaki þartlara göre kontrol edin ve þifredeki hatalarý yazdýrýn
		 --Þifre küöük harf içermelidir
		 --Þifre büyük harf içermelidir
		 --Þifre özel karakter içermelidir
		 --Þifre en az 8 karakter olmalýdýr
		 */
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		String þifre="";
		int sonuç=0;
		
		do {
			System.out.println("Lütfen þifrenizi giriniz");
			þifre=scan.nextLine();
			
			sonuç=küçükHarfVarMý(þifre)+büyükHarfVarMý(þifre)+özelKarVarMý(þifre)+uzunlukUygunMu(þifre);
			
		} while(sonuç!=4);
		
		System.out.println("Þifreniz baþarý ile kaydedildi");
		scan.close();
	}

	public static int uzunlukUygunMu(String þifre) {
		
		int sonuçUzunluk=0;
		if (þifre.length()<8) {
		System.out.println("Þifre en az sekiz karakter olmalýdýr");
	} else {
		sonuçUzunluk=1;
		
	}
	return sonuçUzunluk;
	}
	
	public static int özelKarVarMý(String þifre) {
		int flagÖzel=0;
		int index=0;
		
		while(index<þifre.length()) {
			if (þifre.charAt(index)>=' ' && þifre.charAt(index)<='/') {
			flagÖzel=1;
		}
		index++;
		}
		if (flagÖzel==0) {
			System.out.println("Þifre özel karakter içermelidir");
			
		}
	
		return flagÖzel;
	}

	public static int büyükHarfVarMý(String þifre) {
		int flagBüyük=0;
		int index=0;
		
		while(index<þifre.length()) {
			if (þifre.charAt(index)>='A' && þifre.charAt(index)<='Z') {
			flagBüyük=1;
		}
		index++;
		}
		if (flagBüyük==0) {
			System.out.println("Þifre büyük harf içermelidir");
			
		}
	
		return flagBüyük;
		
	}

	public static int küçükHarfVarMý(String þifre) {
		int flagKüçük=0;
		int index=0;
		
		while(index<þifre.length()) {
			if (þifre.charAt(index)>='a' && þifre.charAt(index)<='z') {
			flagKüçük=1;
		}
		index++;
	}
		if (flagKüçük==0) {
			System.out.println("Þifre küçük harf içermelidir");
		}
	
		return flagKüçük;
	}

}
