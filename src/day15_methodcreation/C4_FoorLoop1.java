package day15_methodcreation;

public class C4_FoorLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazd�r�n

		// 1.yol
		/*
		 * System.out.println("Hello World"); System.out.println("Hello World");
		 * System.out.println("Hello World"); System.out.println("Hello World");
		 * System.out.println("Hello World");
		 */

		// 2.yol loop kullan�yoruz
		// ne yapaca��m�z� javaya s�yl�yoruz, ka� kere yapmas� gerekti�ini de s�yl�yoruz

		// t�m loop larda 3 �eyi yapmak zorunday�z
		// 1) ba�lang�� de�eri
		// 2) biti� de�eri
		// 3) art�� de�eri

		for (int i = 1; i <= 5; i++) {

			System.out.println("Hello World");

		}
		// Not: e�er �art k�sm� bizim art���m�za g�re hep true verirse loop sonsuz
		// d�ng�ye girer
		// Not: loop da art�� de�eri pozitif oldu�u gibi negatifde olabilir (i--)
		// Not: art�� de�eri 1 olmak zorunda de�il farkl�da olabilir
		// Nor: e�er loop un �art� true olmazsa loop bady hi� devreye girmez
	}

}
