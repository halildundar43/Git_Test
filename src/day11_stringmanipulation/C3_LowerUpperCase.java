package day11_stringmanipulation;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		
		String str= "Tecproeducation"; // b�y�k harfle yazd�rmak i�in
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		// yazd�rma de�il atama yapmak isyiyorsak
		
		str=str.toUpperCase(); // str kal�c� olarak b�y�k olaarak de�i�ir
		
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr"))); // t�rk�e yok forLaguageTag se�ip i�ine "tr" yaz

		str=str.toLowerCase(); //str kal�c� olarak k���k olarak de�i�ir
	}

}
