package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanýcýdan bir cümle ve bir harf isteyin
		// while loop kullanarak cümlede istenen harf kaç kez kullanýlmýþ bulunuz
		// program case sensitive olsun (büyük harf küçük harf önemli)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cümle=scan.nextLine();
		
		System.out.println("Lütfen cümlede saymak istediðiniz harfi giriniz");
		String harf=scan.next().substring(0, 1); // String olarak ilk harfi alýr
		
		int count=0;
		
		int index=0;
		
		while(index<cümle.length()) {
			if (cümle.substring(index,index+1).equals(harf)) {
				count++;
				
			}
			index++;
		}
		System.out.println("Cümlede "+harf+" harfi "+count+" defa kullanýlmýþ");
		scan.close();
	}

}
