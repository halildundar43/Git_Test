package day03_operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
	byte by1 = 101;
	int sayi = by1;
		System.out.println(sayi);
	
	int sayi2 = 53;
	byte by2 = (byte)sayi2;
		System.out.println(by2);
	
	double sayi3 = 23.5;
	int by3 = (int) sayi3;
		System.out.println(by3);
		
	float sayi4 = -23.5f;
	short by4 = (short) sayi4;
		System.out.println(by4);
		
	double sayi5 = 4.8;
	double sayi6 = 1.4;
	double sonuc1 = sayi5 / sayi6;
		System.out.println(sonuc1);
		
	int sonuc2 = (int) (sayi5 / sayi6);
		System.out.println(sonuc2);
		
	int sayi7 = 5;
	int sayi8 = 3;
	
	int sonuc3 = sayi7 / sayi8; // 1.6666..
		System.out.println(sonuc3);
		
	int sayi9 = 556;
	byte by5 = (byte) sayi9;
		System.out.println(by5);
		
		
		
		
		
		
		
		
	}

}
