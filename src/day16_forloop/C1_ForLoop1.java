package day16_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		// kullanýcýdan pozitif iki tam sayý alýn
		// aldýðýmýz deðerlerden küçük olandan baþlayýp büyük olana kadar
		// tüm sayýlarý yanyana (virgülle ayýrarak) yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki pozitif tam sayý giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int küçükSayý=0;
		int büyükSayý=0;
		
		if(sayi1<0 || sayi2<0) {
			System.out.println("Lütfen pozitif sayý giriniz");
		}
		
		else if (sayi1>sayi2) {
			büyükSayý=sayi1;
			küçükSayý=sayi2;
		} else {
			büyükSayý=sayi2;
			küçükSayý=sayi1;
		}
		for (int i = küçükSayý ; i <= büyükSayý; i++) {
			
			System.out.print(i + ",");
			
		}
		scan.close();
	}

}
