package day35_inheritance;

public class Memur extends Personel {
	
	public int maas;
	
	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor �al��t�");
	}
	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli constructor �al��t�");
	}

	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);

	}

}
