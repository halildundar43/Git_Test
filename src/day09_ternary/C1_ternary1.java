package day09_ternary;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		int sayi=10;
		// ternary bir saocu� d�nd�r�d���nden bir veriable olu�turup ona assign yapmal�y�z.
		String sonuc = sayi%2==0 ? "�ift sayi" : "Tek sayi";
		System.out.println(sonuc);
		
		// ben bir vari�able ye assign etmek istemiyorum. o zaman syso i�ine yazabilirim
		
		System.out.println(sayi%2==0 ? "�ift sayi" : "Tek sayi");
		
		// ba��na a��klama yazmak istersem
		// ternoty operatorunu parantez i�ine almam laz�m
		
		System.out.println("��lem sonucu: " + (sayi%2==0 ? "�ift sayi" : "Tek sayi"));
		
	}

}
