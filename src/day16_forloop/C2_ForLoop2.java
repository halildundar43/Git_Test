package day16_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		// kullan�c�dan 2 tam say� al�n
		// ilk say�dan ikinci say�ya kadar t�m tam say�lar�
		// yanyana aralar�nda bo�luk olarak yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki tam say� giriniz");
		
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		
		if (say�1>say�2) {
			for (int i = say�1; i >=say�2; i--) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = say�1; i <=say�2; i++) {
				System.out.print(i + " ");
		}
		}
		scan.close();
	}
}			//2.yol		
		/*	int k���kSay�=0;
			int b�y�kSay�=0;
			
		    b�y�kSay�=say�1;
			k���kSay�=say�2;
		} else {
			b�y�kSay�=say�2;
			k���kSay�=say�1;
		}
		for (int i = k���kSay�; i <= b�y�kSay�; i++) {
			System.out.print(i + " ");
		}
		
	}

}*/
