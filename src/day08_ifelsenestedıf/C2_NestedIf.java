package day08_ifelsenested�f;

public class C2_NestedIf {

	public static void main(String[] args) {
		// verilen cinsiyet ve ya� i�in emeklilik durumunu g�steren java prog. yaz�n
		// �al��an kad�nsa 69 ya��nda erkek �al��ansa 65 ya��nda emekli olur.

		String cinsiyet="erkek"; 
		int yas = 65;
		
		if (yas<=0) {
			System.out.println("Ya� negatif olamaz.");
		} else if (cinsiyet.equalsIgnoreCase("Erkek") && yas>=65) {
			System.out.println("Emekli olabilirsiniz.");
		} else if (cinsiyet.equalsIgnoreCase("Erkek") && yas<65) {
			System.out.println("Emekli olamazs�n�z.");
		} else if (cinsiyet.equalsIgnoreCase("Kad�n") && yas>=60) {
			System.out.println("Emekli olabilirsiniz.");
		} else if (cinsiyet.equalsIgnoreCase("kad�n") && yas<60) {
			System.out.println("Emekli olamazs�n�z.");
		} else {
			System.out.println("Ge�erli veri giriniz.");
		}{

		}{

		}{
			
		}
	
		System.out.println("Nested If ile sonu�");
		
		if (cinsiyet.equalsIgnoreCase("Erkek")) {
			if (yas<0) {
				System.out.println("Ya� negatif olamaz");
			} else if (yas>=65) {
				System.out.println("Emekli olabilirsin.");
			} else {
				System.out.println("Emekli olamazs�n.");
			} 
			
		} else if (cinsiyet.equalsIgnoreCase("Kad�n")) {
			if (yas<0) {
				System.out.println("Ya� negatif olamaz");
			} else if (yas>=60) {
				System.out.println("Emekli olabilirsin.");
			} else {
				System.out.println("Emekli olamazs�n.");
			}
			
		} else {
			System.out.println("Yazd���n�z cinsiyet sistemde kay�tl� de�ildir.");
		}
	}	
}
