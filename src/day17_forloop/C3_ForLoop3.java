package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kullan�c�dan 35 dan k���k pozitif bir say� al�n
		// girilen say�n�n fakt�riyelini hesaplay�p yazd�ran bir method olu�turun
		//6!=1*2*3*4*5*6=720 == fakt�riyel
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen fakt�riyel hesaplamak i�in 35 ten k���k pozitif bir tam say� giriniz");
		int say�=scan.nextInt();
		
		
		if (say�>=35 || say�<=0) {
			System.out.println("L�tfen ge�erli pozitif bir tam say� giriniz");
		} else {
			fakt�riyelBul(say�);
		}
		scan.close();
	}

	public static void fakt�riyelBul(int say�) {
		
		long fakt�riyel=1;
		for (int i = 1; i <= say�; i++) {
			fakt�riyel*=i;
		}
		
		System.out.println("Girdi�iniz say�n�n fakt�riyeli: "+fakt�riyel);
		
	}

}
