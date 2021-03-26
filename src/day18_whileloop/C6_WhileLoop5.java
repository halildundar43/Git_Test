package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// verilen sayýnýn asal olup olmadýðýný bulan bir program yazýn
		// asal sayý: 1 ve kendisi dýþýnda hiç bir pozitif tamsayýya kalansýz bölünmeyen
		
		int sayý=50;
		
		String flag="Asal"; // flag=bayrak. bizim istediðimiz þartýn gerçekleþip gerçekleþmediðini kontrol eder
		
		int bölen=2;
		
		while (bölen<sayý) {
			if(sayý%bölen==0) {
				flag="Asal sayý deðil";
			}
			bölen++;
		}
		System.out.println(flag);
	}

}
