package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen say�n�n asal olup olmad���n� bulan bir program yaz�n
		// asal say�: 1 ve kendisi d���nda hi� bir pozitif tamsay�ya kalans�z b�l�nmeyen
		
		int say�=50;
		
		String flag="Asal"; // flag=bayrak. bizim istedi�imiz �art�n ger�ekle�ip ger�ekle�medi�ini kontrol eder
		
		int b�len=2;
		
		while (b�len<say�) {
			if(say�%b�len==0) {
				flag="Asal say� de�il";
			}
			b�len++;
		}
		System.out.println(flag);
	}

}
