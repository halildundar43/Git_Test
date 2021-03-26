package day12_stringmanipulations;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() istedi�imiz karakterlerin index ini d�nd�r�r
		
		String str ="Java ��ren, i� sahibi ol";
		
		System.out.println(str.charAt(6)); // 6. indexteki harfi verir �
		System.out.println ("char arama " +str.indexOf('�')); // cahr se�tik. � yi buldu�u ilk yerin index ini yazd�r� 6
		System.out.println ("String arama " +str.indexOf("�")); // cahr se�tik. � yi buldu�u ilk yerin index ini yazd�r� 6
		System.out.println ("String kelime arama " +str.indexOf("i�")); // i=12 �=13 index te ilk i geld�i i�in 12 verir
		// birden fazla ise
		System.out.println ("Birden fazla varsa " +str.indexOf('i')); // ilk buldu�unun indexsini getirir.
		System.out.println ("Ba�lang�� index ile " +str.indexOf('a', 4)); // Java yaz�s�ndan sonra ki a sahibi indeki a d�r indexi 16
																// 4 dahidir burdan saymaya ba�lar (yani bo�luktan)
		System.out.println ("char olmayan " +str.indexOf("dert"));
		
		// kullan�c�dab bir c�mle isteyin
		// case sensitive olmayan bir java kelimesi olup olmad���n� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		int sonu�=cumle.indexOf("java"); // java varsa index i d�nd�r�r yoksa -1 d�nd�r�r
		
		System.out.println("Girdi�iniz c�mlede java kelimesi " + (sonu�==-1 ? "Yok" : "Var") );
		
		if (cumle.indexOf("java")>=0) { // tam kelime aramaya gerek yok istenirse heve veya karakter yada iki kelime beraber aranabilir.
			System.out.println("cumlede java vard�r");
		} else {
			System.out.println("c�mlede java yoktur");
		}
		
		scan.close();
	}

}
