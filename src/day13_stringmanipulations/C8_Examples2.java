package day13_stringmanipulations;

public class C8_Examples2 {

	public static void main(String[] args) {
		// strig olarak verilen
		// str1="$13,99" ve str2 "$10,55" say�lar�n toplam�n� bulunuz
		// double.parseDouble() kullanabilirsiniz
		
		String str1="$13,99";
		String str2="$10,55";
		
		str1=str1.replaceAll("\\D", "");
		str2=str2.replaceAll("\\D", "");
		
		System.out.println(str1); // str1 ve str2 string oldu�u i�in i�erikleri say� de�ildir 
		System.out.println(str2);
		
		// e�er i�eri�i say� g�r�n�ml� string varsa
		// parseDouble() veya parseIbteger() methodu kullanabiliriz
		// ancak primitiv data type leri methoda sahip olmad�klar�ndan wrapper calss lar� kullan�r�z
		
		double sayi1=Double.parseDouble(str1);
		double sayi2=Double.parseDouble(str2);
		double toplam= (sayi1+sayi2)/100;
		
		System.out.println("$"+toplam);

	}

}
