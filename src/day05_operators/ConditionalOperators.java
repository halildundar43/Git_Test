package day05_operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		// AND && // OR ||
		
	boolean isTrue = 5>4 && 7-3>0;
	
	System.out.println(isTrue);
	
	int x = 10;
	int y = 5;
	
	System.out.println(x/y==2 && x*y>20 && x-y>0);
	
	System.out.println(x+y<0 && x-y>0); // false * true = false
	
	System.out.println(x<y || x+y<0 || x*y>0); // false * false * true = true
	
	}

}
