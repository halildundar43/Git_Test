package day09_ternary;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		int y= 1;
		int z= 1;
		
		int a= y<10 ? y++ : z++;
		
		//int a= y++ �al���r post increment oldu�undan �nce i�lem sonra artt�rma
		//int a=y yani 1 olur sonrada y=2 olur
		// ++y olursa pre increment olurdu
		
		System.out.println(y + "," + z + "," + a);
		
		
		
		System.out.println(y++); // post increment �nce yazd�r sonra artt�r
		
		System.out.println(++y); // pre increment �nce artt�r sonra yazd�r
				
		System.out.println(y); // direk yazd�rma

	}

}
