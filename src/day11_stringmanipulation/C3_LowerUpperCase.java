package day11_stringmanipulation;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		
		String str= "Tecproeducation"; // büyük harfle yazdýrmak için
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		// yazdýrma deðil atama yapmak isyiyorsak
		
		str=str.toUpperCase(); // str kalýcý olarak büyük olaarak deðiþir
		
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr"))); // türkçe yok forLaguageTag seçip içine "tr" yaz

		str=str.toLowerCase(); //str kalýcý olarak küçük olarak deðiþir
	}

}
