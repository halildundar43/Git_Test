package day22_constructor;

public class OtomobilRunner {

	public static void main(String[] args) {
		
		Otomobil oto1 = new Otomobil(); // default constructor � kulland�k
        oto1.vites("otomatik");
        
        Otomobil oto2 = new Otomobil ("K�rm�z�");
        System.out.println("Araba " + oto2 + "renklidir"); // buras� olmad� tekrar bak
	}

}
