package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// While= iken, oldu�u s�rece anlamlar�nda
		// 10 dan 30 kadar olan say�lardan 4 ile b�l�nebilenleri
		// aralar�nda bir bo�luk olacak �ekilde yanyana yazd�r�n
		
			// �nce for loop ile yapal�m
		
		for (int i = 10; i < 30; i++) {
			if (i%4==0) {
				System.out.print(i+" ");
			} 
		}
		System.out.println("");
		//ayn�s�n� whilw loop ile yapal�m
		int say�=10;
		while (say�<30) {
			if (say�%4==0) {
				System.out.print(say�+" ");
			} 
		say�++;
		}
	}

}
