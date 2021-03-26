package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// kar���k s�ral� verilen bir array � s�ral� olarak yazd�r�n
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// ayn� array� b�y�kten k����e nas�l yazd�r�r�z
		
		for (int i = arr.length-1; i>=0 ; i--) {
			System.out.print(arr[i]+ " ");	
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		// ayn� array� b�y�kten k����e do�ru nas�l s�ralar�z
		int arrTers[]=new int[arr.length]; // ilk array �n uzunlu�una e�it yeni bir array olu�turdum
		
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arrTers));
	}

}
