package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/* kullanýcýdan pozitif bir tamsayý alýn ve bu sayýyý tam bölen sayýlarý
		 * ve toplam kaç tane olduklarýný ekranda yazdýrýn 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bölenleri bulmak için pozitif bir tamsayý giriniz");
		int sayý=scan.nextInt();
		
		int bölen=1;
		int count=0;
		
		while (bölen<=sayý) {
			if (sayý%bölen==0) {
				count++;
				System.out.println(bölen);
			}
			bölen++;
		}
		System.out.println(sayý + " sayýsýnýn bölenleri : "+count+ " adettir");
		
		//1-1
		//2-2
		//3-4 bölenleri bu þekilde yazdýralým
				
		bölen=1;
		count=0;
		
		while (bölen<=sayý) {
			if (sayý%bölen==0) {
				count++;
				System.out.println(count +"-" +bölen);
			}
			bölen++;
		}
		scan.close();
	}

}
