package day05_operators;

public class IncretmentDecrement {

	public static void main(String[] args) {
		// int data type nde bir veriable olusturun
		// bunun de�erini �arpma ve b�lme kullanarak
		// artt�r�n ve azalt�n
		
	int num1 = 12;
	// uzun yolla �arpma ile increment
	num1 = num1 * 3;
	System.out.println(num1);
	
	//k�sa yolla �arpma increment
	num1*=3;
	System.out.println(num1);
	
	//uzun yolla b�lme ile decrement
	num1 = num1 / 3;
	System.out.println(num1);
	
	//k�sa yol ile dectement
	num1/=3;
	System.out.println(num1);
	}

}
