package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
	public static void main(String[] args) {
		// kullanýcýdan deðerler alarak int bir array oluþturun
		// önce kullanýcýdan gireceði sayý adedini almamýz lazým ki array ý oluþturalým

		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç sayýdan oluþan array istediðinizi yazýnýz");
		int uzunluk = scan.nextInt();

		int arr[] = new int[uzunluk]; // pozitif bir tam sayý girildiðini düþünelim böylece array ý oluþturuyoruz

		System.out.println("Lütfen sayýlarý giriniz");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
	
}
