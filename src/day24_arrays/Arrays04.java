package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
	public static void main(String[] args) {
		// kullan�c�dan de�erler alarak int bir array olu�turun
		// �nce kullan�c�dan girece�i say� adedini almam�z laz�m ki array � olu�tural�m

		Scanner scan = new Scanner(System.in);
		System.out.println("Ka� say�dan olu�an array istedi�inizi yaz�n�z");
		int uzunluk = scan.nextInt();

		int arr[] = new int[uzunluk]; // pozitif bir tam say� girildi�ini d���nelim b�ylece array � olu�turuyoruz

		System.out.println("L�tfen say�lar� giriniz");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
	
}
