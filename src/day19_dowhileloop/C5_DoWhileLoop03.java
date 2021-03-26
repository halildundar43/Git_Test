package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan bir �ifre girmesini isteyin.
		 Girilen �ifreyi a�a��daki �artlara g�re kontrol edin ve �ifredeki hatalar� yazd�r�n
		 --�ifre k���k harf i�ermelidir
		 --�ifre b�y�k harf i�ermelidir
		 --�ifre �zel karakter i�ermelidir
		 --�ifre en az 8 karakter olmal�d�r
		 */
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		String �ifre="";
		int sonu�=0;
		
		do {
			System.out.println("L�tfen �ifrenizi giriniz");
			�ifre=scan.nextLine();
			
			sonu�=k���kHarfVarM�(�ifre)+b�y�kHarfVarM�(�ifre)+�zelKarVarM�(�ifre)+uzunlukUygunMu(�ifre);
			
		} while(sonu�!=4);
		
		System.out.println("�ifreniz ba�ar� ile kaydedildi");
		scan.close();
	}

	public static int uzunlukUygunMu(String �ifre) {
		
		int sonu�Uzunluk=0;
		if (�ifre.length()<8) {
		System.out.println("�ifre en az sekiz karakter olmal�d�r");
	} else {
		sonu�Uzunluk=1;
		
	}
	return sonu�Uzunluk;
	}
	
	public static int �zelKarVarM�(String �ifre) {
		int flag�zel=0;
		int index=0;
		
		while(index<�ifre.length()) {
			if (�ifre.charAt(index)>=' ' && �ifre.charAt(index)<='/') {
			flag�zel=1;
		}
		index++;
		}
		if (flag�zel==0) {
			System.out.println("�ifre �zel karakter i�ermelidir");
			
		}
	
		return flag�zel;
	}

	public static int b�y�kHarfVarM�(String �ifre) {
		int flagB�y�k=0;
		int index=0;
		
		while(index<�ifre.length()) {
			if (�ifre.charAt(index)>='A' && �ifre.charAt(index)<='Z') {
			flagB�y�k=1;
		}
		index++;
		}
		if (flagB�y�k==0) {
			System.out.println("�ifre b�y�k harf i�ermelidir");
			
		}
	
		return flagB�y�k;
		
	}

	public static int k���kHarfVarM�(String �ifre) {
		int flagK���k=0;
		int index=0;
		
		while(index<�ifre.length()) {
			if (�ifre.charAt(index)>='a' && �ifre.charAt(index)<='z') {
			flagK���k=1;
		}
		index++;
	}
		if (flagK���k==0) {
			System.out.println("�ifre k���k harf i�ermelidir");
		}
	
		return flagK���k;
	}

}
