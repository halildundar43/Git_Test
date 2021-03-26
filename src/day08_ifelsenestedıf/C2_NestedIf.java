package day08_ifelsenestedýf;

public class C2_NestedIf {

	public static void main(String[] args) {
		// verilen cinsiyet ve yaþ için emeklilik durumunu gösteren java prog. yazýn
		// çalýþan kadýnsa 69 yaþýnda erkek çalýþansa 65 yaþýnda emekli olur.

		String cinsiyet="erkek"; 
		int yas = 65;
		
		if (yas<=0) {
			System.out.println("Yaþ negatif olamaz.");
		} else if (cinsiyet.equalsIgnoreCase("Erkek") && yas>=65) {
			System.out.println("Emekli olabilirsiniz.");
		} else if (cinsiyet.equalsIgnoreCase("Erkek") && yas<65) {
			System.out.println("Emekli olamazsýnýz.");
		} else if (cinsiyet.equalsIgnoreCase("Kadýn") && yas>=60) {
			System.out.println("Emekli olabilirsiniz.");
		} else if (cinsiyet.equalsIgnoreCase("kadýn") && yas<60) {
			System.out.println("Emekli olamazsýnýz.");
		} else {
			System.out.println("Geçerli veri giriniz.");
		}{

		}{

		}{
			
		}
	
		System.out.println("Nested If ile sonuç");
		
		if (cinsiyet.equalsIgnoreCase("Erkek")) {
			if (yas<0) {
				System.out.println("Yaþ negatif olamaz");
			} else if (yas>=65) {
				System.out.println("Emekli olabilirsin.");
			} else {
				System.out.println("Emekli olamazsýn.");
			} 
			
		} else if (cinsiyet.equalsIgnoreCase("Kadýn")) {
			if (yas<0) {
				System.out.println("Yaþ negatif olamaz");
			} else if (yas>=60) {
				System.out.println("Emekli olabilirsin.");
			} else {
				System.out.println("Emekli olamazsýn.");
			}
			
		} else {
			System.out.println("Yazdýðýnýz cinsiyet sistemde kayýtlý deðildir.");
		}
	}	
}
