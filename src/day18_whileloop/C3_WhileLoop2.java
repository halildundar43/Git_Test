package day18_whileloop;

public class C3_WhileLoop2 {

	public static void main(String[] args) {
		// For loop ve while loop kullanarak 3 basamakl� pozitif say�lardan
		// 15, 20 ve 90 na tam b�l�negilen say�lar� yazd�r�n
		
		for (int i = 100; i < 1000; i++) {
			if (i%15==0 && i%20==0 && i%90==0) { // i%180==0 da olabilir
				System.out.print(i+" ");
			} 
		}
		System.out.println("");
		
		int say�=100;
			while (say�<1000) {
				if (say�%15==0 && say�%20==0 && say�%90==0) {
					System.out.print(say�+" ");
			} 
			
				say�++;
			}
		
	}

}
