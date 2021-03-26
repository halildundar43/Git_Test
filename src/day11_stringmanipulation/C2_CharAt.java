package day11_stringmanipulation;

public class C2_CharAt {

	public static void main(String[] args) {

		String str = "Java çok güzel.";
		System.out.println(str.charAt(0)); // J

		System.out.println(str.charAt(5)); // index 0 dan baþlar

		System.out.println(str.charAt(13)); // kelimenin uzunluðu son imdex+1 dir
											// son index=kelimenin uzunluðu-1
		// System.out.println(str.charAt(15)); // hata verir
		// kelimenin uzunluðunu biliyorsak ==> son index= kelimenin uzunluðu(length)-1

		// kullanýcý 10 harfli bir kelime girerse son harfi yazdýrýn
		
		String str1 = "Helikopter";
		System.out.println(str1.charAt(9));
		
		

	}

}
