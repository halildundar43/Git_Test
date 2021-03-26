package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// While= iken, olduðu sürece anlamlarýnda
		// 10 dan 30 kadar olan sayýlardan 4 ile bçlünebilenleri
		// aralarýnda bir boþluk olacak þekilde yanyana yazdýrýn
		
			// önce for loop ile yapalým
		
		for (int i = 10; i < 30; i++) {
			if (i%4==0) {
				System.out.print(i+" ");
			} 
		}
		System.out.println("");
		//aynýsýný whilw loop ile yapalým
		int sayý=10;
		while (sayý<30) {
			if (sayý%4==0) {
				System.out.print(sayý+" ");
			} 
		sayý++;
		}
	}

}
