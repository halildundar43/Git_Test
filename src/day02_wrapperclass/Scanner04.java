package day02_wrapperclass;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen diktörgenin en ve boyunu giriniz");
	
	int en = scan.nextInt();
	int boy = scan.nextInt();
	
	System.out.println(en * 2 + boy * 2);
	System.out.println(en * boy);

	scan.close();
	}

}
