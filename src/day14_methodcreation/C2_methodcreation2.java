package day14_methodcreation;

public class C2_methodcreation2 {

	public static void main(String[] args) {
	 
		//bir methodu �al��t�rmak i�inden �a��rmam�z gerekir
		//bir methodu �a��rmak i�in ise methodun ad�n� ve parametrelere uygun 
		//arg�mentleri yazmal�y�z
		ortalama(85.2,90.3); // method call
							 // 1.parametreye 1.arg�menti 2.parametreye 2.arg�menti yazar
		
	
	
	}//main method somu
	
		//bir method olu�turmak istedi�imizde calss i�inde ama main method un d���nda olu�turmal�y�z
		//genel kullan�m main method dan sonra olu�turmad�r
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdi�iniz iki say�n�n ortalamas� : " + (sayi1+sayi2)/2);
		//bir methodu olu�turmak o methodu �al��t�rmak i�in yeterli de�ildir
		//olu�turulan method main method i�inden �a�r�l�nca �al���r
	}
	
}//class sonu
