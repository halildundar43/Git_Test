package day16_forloop;

public class C4_ForLoop4 {

	public static void main(String[] args) {
		// 50 den b�y�k 150 den k���k olan tam say�lardan
		// 7 ile tam b�l�nebilenleri toplay�p
		// sonucu yazd�ran bir kod yaz�n�z
		
		int toplam=0;
		
		for (int i = 51; i < 150; i++) {
			if (i%7==0) {
				toplam+=i;
			}
		}
		System.out.println(toplam);
	}

}
