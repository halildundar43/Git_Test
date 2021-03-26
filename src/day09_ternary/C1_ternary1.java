package day09_ternary;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		int sayi=10;
		// ternary bir saocuç döndürüdüðünden bir veriable oluþturup ona assign yapmalýyýz.
		String sonuc = sayi%2==0 ? "Çift sayi" : "Tek sayi";
		System.out.println(sonuc);
		
		// ben bir variðable ye assign etmek istemiyorum. o zaman syso içine yazabilirim
		
		System.out.println(sayi%2==0 ? "Çift sayi" : "Tek sayi");
		
		// baþýna açýklama yazmak istersem
		// ternoty operatorunu parantez içine almam lazým
		
		System.out.println("Ýþlem sonucu: " + (sayi%2==0 ? "Çift sayi" : "Tek sayi"));
		
	}

}
