package day23_statickeyword;

public class StaticBlock {
	
	static String isim;
	// static block class �al��t�r�ld���nda ilk olarak �al���r (main method dan bile �nce �al���r)
	// static blocklar static variable lere de�er atamak i�in kullan�l�r
	static { // static block
		isim="Mehmet";
				System.out.println(isim);
	}
	
	static { // static block
		System.out.println("2.static block �al��t�");
	}

	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);

	}

}
