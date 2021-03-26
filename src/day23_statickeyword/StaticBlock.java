package day23_statickeyword;

public class StaticBlock {
	
	static String isim;
	// static block class çalýþtýrýldýðýnda ilk olarak çalýþýr (main method dan bile önce çalýþýr)
	// static blocklar static variable lere deðer atamak için kullanýlýr
	static { // static block
		isim="Mehmet";
				System.out.println(isim);
	}
	
	static { // static block
		System.out.println("2.static block çalýþtý");
	}

	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);

	}

}
