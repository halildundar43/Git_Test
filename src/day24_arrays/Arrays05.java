package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// karýþýk sýralý verilen bir array ý sýralý olarak yazdýrýn
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// ayný arrayý büyükten küçüðe nasýl yazdýrýrýz
		
		for (int i = arr.length-1; i>=0 ; i--) {
			System.out.print(arr[i]+ " ");	
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		// ayný arrayý büyükten küçüðe doðru nasýl sýralarýz
		int arrTers[]=new int[arr.length]; // ilk array ýn uzunluðuna eþit yeni bir array oluþturdum
		
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arrTers));
	}

}
