package day24_arrays;

import java.util.Arrays;

public class Arrays02 {
	public static void main(String[] args) {
		 /*
		 Soru 1: Verilen bir array’in tum elemanlarini bir soldaki konuma tasiyacak
		 bir program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
		 */

		int arr[] = { 1, 2, 3 };

		int temp = arr[0]; // geçiçi bir deðer oluþtururuz ve 1 i saklarýz

		for (int i = 0; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];
		}
		System.out.println(Arrays.toString(arr)); // [2, 3, 3]
		
		arr[arr.length - 1] = temp; // 1 i sondaki 3 ün yerine koyar
		System.out.println(Arrays.toString(arr));
	}
}
