package day05_operators;

public class IncretmentDecrement {

	public static void main(String[] args) {
		// int data type nde bir veriable olusturun
		// bunun deðerini çarpma ve bölme kullanarak
		// arttýrýn ve azaltýn
		
	int num1 = 12;
	// uzun yolla çarpma ile increment
	num1 = num1 * 3;
	System.out.println(num1);
	
	//kýsa yolla çarpma increment
	num1*=3;
	System.out.println(num1);
	
	//uzun yolla bölme ile decrement
	num1 = num1 / 3;
	System.out.println(num1);
	
	//kýsa yol ile dectement
	num1/=3;
	System.out.println(num1);
	}

}
