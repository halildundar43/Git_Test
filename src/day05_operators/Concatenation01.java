package day05_operators;

public class Concatenation01 {

	public static void main(String[] args) {
	
		System.out.println("Ali" + "Can");
			System.out.println("Ali " + "Can");
			System.out.println("Ali" + " Can");
			System.out.println("Ali" + " " + "Can");
		
		System.out.println(3 + "4"); // biri string ise toplama de�il concatenation yap�l�r sonu� say� de�ildir
				System.out.println("3" + 4 + 5); // java �nce "35" yapar sonra 345 yapar say� de�ildir
				System.out.println("3" + (4 + 5));
		System.out.println(3 + 4 + "5");
		System.out.println(3 + 4 + "5" + 6);
		System.out.println(2*3 + "4" + 6/2);
		System.out.println("2*3" + 4 + 5); // java �ift t�rnak i�ini resim gibi g�r�r
	
	}

}
