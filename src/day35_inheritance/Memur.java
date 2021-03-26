package day35_inheritance;

public class Memur extends Personel {
	
	public int maas;
	
	public Memur() {
		super();
		System.out.println("Child class parametresiz constructor çalýþtý");
	}
	
	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli constructor çalýþtý");
	}

	public static void main(String[] args) {
		
		Memur obj1=new Memur(2400);

	}

}
