package day18_whileloop;

public class C3_WhileLoop2 {

	public static void main(String[] args) {
		// For loop ve while loop kullanarak 3 basamaklý pozitif sayýlardan
		// 15, 20 ve 90 na tam bölünegilen sayýlarý yazdýrýn
		
		for (int i = 100; i < 1000; i++) {
			if (i%15==0 && i%20==0 && i%90==0) { // i%180==0 da olabilir
				System.out.print(i+" ");
			} 
		}
		System.out.println("");
		
		int sayý=100;
			while (sayý<1000) {
				if (sayý%15==0 && sayý%20==0 && sayý%90==0) {
					System.out.print(sayý+" ");
			} 
			
				sayý++;
			}
		
	}

}
