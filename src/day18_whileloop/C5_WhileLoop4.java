package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/* kullan�c�dan pozitif bir tamsay� al�n ve bu say�y� tam b�len say�lar�
		 * ve toplam ka� tane olduklar�n� ekranda yazd�r�n 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen b�lenleri bulmak i�in pozitif bir tamsay� giriniz");
		int say�=scan.nextInt();
		
		int b�len=1;
		int count=0;
		
		while (b�len<=say�) {
			if (say�%b�len==0) {
				count++;
				System.out.println(b�len);
			}
			b�len++;
		}
		System.out.println(say� + " say�s�n�n b�lenleri : "+count+ " adettir");
		
		//1-1
		//2-2
		//3-4 b�lenleri bu �ekilde yazd�ral�m
				
		b�len=1;
		count=0;
		
		while (b�len<=say�) {
			if (say�%b�len==0) {
				count++;
				System.out.println(count +"-" +b�len);
			}
			b�len++;
		}
		scan.close();
	}

}
