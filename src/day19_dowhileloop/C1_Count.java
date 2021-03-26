package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullan�c�dan bir c�mle ve bir harf isteyin
		// while loop kullanarak c�mlede istenen harf ka� kez kullan�lm�� bulunuz
		// program case sensitive olsun (b�y�k harf k���k harf �nemli)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String c�mle=scan.nextLine();
		
		System.out.println("L�tfen c�mlede saymak istedi�iniz harfi giriniz");
		String harf=scan.next().substring(0, 1); // String olarak ilk harfi al�r
		
		int count=0;
		
		int index=0;
		
		while(index<c�mle.length()) {
			if (c�mle.substring(index,index+1).equals(harf)) {
				count++;
				
			}
			index++;
		}
		System.out.println("C�mlede "+harf+" harfi "+count+" defa kullan�lm��");
		scan.close();
	}

}
