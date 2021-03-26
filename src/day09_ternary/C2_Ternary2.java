package day09_ternary;

public class C2_Ternary2 {

	public static void main(String[] args) {
		
		int y= 1;
		int z= 1;
		
		int a= y<10 ? y++ : z++;
		
		//int a= y++ çalışır post increment olduğundan önce işlem sonra arttırma
		//int a=y yani 1 olur sonrada y=2 olur
		// ++y olursa pre increment olurdu
		
		System.out.println(y + "," + z + "," + a);
		
		
		
		System.out.println(y++); // post increment önce yazdır sonra arttır
		
		System.out.println(++y); // pre increment önce arttır sonra yazdır
				
		System.out.println(y); // direk yazdırma

	}

}
