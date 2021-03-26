package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kullanıcıdan 35 dan küçük pozitif bir sayı alın
		// girilen sayının faktöriyelini hesaplayıp yazdıran bir method oluşturun
		//6!=1*2*3*4*5*6=720 == faktöriyel
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen faktöriyel hesaplamak için 35 ten küçük pozitif bir tam sayı giriniz");
		int sayı=scan.nextInt();
		
		
		if (sayı>=35 || sayı<=0) {
			System.out.println("Lütfen geçerli pozitif bir tam sayı giriniz");
		} else {
			faktöriyelBul(sayı);
		}
		scan.close();
	}

	public static void faktöriyelBul(int sayı) {
		
		long faktöriyel=1;
		for (int i = 1; i <= sayı; i++) {
			faktöriyel*=i;
		}
		
		System.out.println("Girdiğiniz sayının faktöriyeli: "+faktöriyel);
		
	}

}
