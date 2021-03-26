package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// kullan�c�dan pozitif bir tamsay� al�n
		// ald���n�z say�dan k���k olan fibonacci dizisielemanlar�n� yazd�r�n
		// 1 1 2 3 5 8 13 21 34.......
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen pozitif bir tam say� giriniz");
		int say�=scan.nextInt();
		
		List<Integer> fibo=new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
				
		System.out.println(fibo);
		/*
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < say�; i++) {
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
			
		}
		System.out.println(fibo);
		*/
		
		int i=2;
        int yeniSayi=0;
        
        while(yeniSayi<say�) {
            
            yeniSayi=fibo.get(i-2)+fibo.get(i-1);
            
            fibo.add(yeniSayi);
            
            i++;
        }
        
        System.out.println(fibo);
        
        scan.close();
	}

}
