package day11_stringmanipulation;

public class C2_CharAt {

	public static void main(String[] args) {

		String str = "Java �ok g�zel.";
		System.out.println(str.charAt(0)); // J

		System.out.println(str.charAt(5)); // index 0 dan ba�lar

		System.out.println(str.charAt(13)); // kelimenin uzunlu�u son imdex+1 dir
											// son index=kelimenin uzunlu�u-1
		// System.out.println(str.charAt(15)); // hata verir
		// kelimenin uzunlu�unu biliyorsak ==> son index= kelimenin uzunlu�u(length)-1

		// kullan�c� 10 harfli bir kelime girerse son harfi yazd�r�n
		
		String str1 = "Helikopter";
		System.out.println(str1.charAt(9));
		
		

	}

}
