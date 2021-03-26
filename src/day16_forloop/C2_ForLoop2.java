package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// kullanýcýdan 2 tam sayý alýn
		// ilk sayýdan ikinci sayýya kadar tüm tam sayýlarý
		// yanyana aralarýnda boþluk olarak yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki tam sayý giriniz");
		
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		
		if (sayý1>sayý2) {
			for (int i = sayý1; i >=sayý2; i--) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = sayý1; i <=sayý2; i++) {
				System.out.print(i + " ");
		}
		}
		scan.close();
	}
}			//2.yol		
		/*	int küçükSayý=0;
			int büyükSayý=0;
			
		    büyükSayý=sayý1;
			küçükSayý=sayý2;
		} else {
			büyükSayý=sayý2;
			küçükSayý=sayý1;
		}
		for (int i = küçükSayý; i <= büyükSayý; i++) {
			System.out.print(i + " ");
		}
		
	}

}*/
