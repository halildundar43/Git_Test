package day23_statickeyword;

public class Static1 {
	static String isim = "Mehmet"; // static olduðu için class a baðlý
	int yas = 49; // instace olduðu için objeye baðlý

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// static variable ler olusturulan tum objeler icin gecerlidir.
		// okul adi gibi
		// mesela bir classs da 1 instance, 1 de static variable olsun

		Static1 st1 = new Static1();
		Static1 st2 = new Static1();
		Static1 st3 = new Static1();

		st1.isim = "Hasan"; // class daki isim dedðiþir
		st1.yas = 25;
		System.out.println(st1.isim + " " + st1.yas);

		st2.isim = "Ayse"; // class daki isim dedðiþir
		st2.yas = 30;
		System.out.println(st2.isim + " " + st2.yas);
		System.out.println(st1.isim + " " + st1.yas);

		st3.isim = "Alican"; // class daki isim dedðiþir
		st3.yas = 40;
		System.out.println(st3.isim + " " + st3.yas);
		System.out.println(st2.isim + " " + st2.yas);
		System.out.println(st1.isim + " " + st1.yas);

	}

}
