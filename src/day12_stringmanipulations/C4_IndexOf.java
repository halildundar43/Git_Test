package day12_stringmanipulations;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() istediğimiz karakterlerin index ini döndürür
		
		String str ="Java öğren, iş sahibi ol";
		
		System.out.println(str.charAt(6)); // 6. indexteki harfi verir ğ
		System.out.println ("char arama " +str.indexOf('ğ')); // cahr seçtik. ğ yi bulduğu ilk yerin index ini yazdırı 6
		System.out.println ("String arama " +str.indexOf("ğ")); // cahr seçtik. ğ yi bulduğu ilk yerin index ini yazdırı 6
		System.out.println ("String kelime arama " +str.indexOf("iş")); // i=12 ş=13 index te ilk i geldği için 12 verir
		// birden fazla ise
		System.out.println ("Birden fazla varsa " +str.indexOf('i')); // ilk bulduğunun indexsini getirir.
		System.out.println ("Başlangıç index ile " +str.indexOf('a', 4)); // Java yazısından sonra ki a sahibi indeki a dır indexi 16
																// 4 dahidir burdan saymaya başlar (yani boşluktan)
		System.out.println ("char olmayan " +str.indexOf("dert"));
		
		// kullanıcıdab bir cümle isteyin
		// case sensitive olmayan bir java kelimesi olup olmadığını yazdırın
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		int sonuç=cumle.indexOf("java"); // java varsa index i döndürür yoksa -1 döndürür
		
		System.out.println("Girdiğiniz cümlede java kelimesi " + (sonuç==-1 ? "Yok" : "Var") );
		
		if (cumle.indexOf("java")>=0) { // tam kelime aramaya gerek yok istenirse heve veya karakter yada iki kelime beraber aranabilir.
			System.out.println("cumlede java vardır");
		} else {
			System.out.println("cümlede java yoktur");
		}
		
		scan.close();
	}

}
