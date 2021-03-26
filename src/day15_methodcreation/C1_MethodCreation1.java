package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		// kullanýcýdan bir tamsayý alýn bu sayýnýn
		// negatif veya pozitif olduðunu
		// tek mi çift mi olduðunu
		// üç basamaklý ve daha büyük ise birler onlar yüzler basamaðýnýn rakamlarý
		// toplamýný
		// 100 den küçükse sadece birler basamaðýný yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayý giriniz");
		int sayi = scan.nextInt();

		pozitifNegatif(sayi); // girilen sayýnýn negatf yada pozitif olduðunu yazdýrsýn
		takMiÇiftMi(sayi);

		if (sayi >= 100) {
			yüzdenBüyük(sayi);
		} else {
			yüzdenKüçük(sayi);
		}
		scan.close();
	}

	public static void yüzdenKüçük(int sayi) {
		System.out.println(sayi % 10);

	}

	public static void yüzdenBüyük(int sayi) {
		int rakamlarToplamý = 0;
		rakamlarToplamý = sayi % 10;
		sayi /= 10;
		rakamlarToplamý += sayi % 10;
		sayi /= 10;
		rakamlarToplamý += sayi % 10;
		sayi /= 10;
		rakamlarToplamý += sayi % 10;
		System.out.println(rakamlarToplamý);

	}

	public static void takMiÇiftMi(int sayi) {
		// System.out.println(sayi%2==0 ? "Çift" : "Tek");
		if (sayi % 2 == 0) {
			System.out.println("Sayý çift");
		} else {
			System.out.println("Sayý tek");
		}
	}

	public static void pozitifNegatif(int sayi) { // parametre yazarken data tipinide girmeliyiz
		System.out.println(sayi > 0 ? "Pozitif" : (sayi < 0 ? "Negatif" : "Pozitif yada Negatif deðil"));
		
	}
}
