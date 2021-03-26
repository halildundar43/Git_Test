package day22_constructor;

public class OtomobilRunner {

	public static void main(String[] args) {
		
		Otomobil oto1 = new Otomobil(); // default constructor ý kullandýk
        oto1.vites("otomatik");
        
        Otomobil oto2 = new Otomobil ("Kýrmýzý");
        System.out.println("Araba " + oto2 + "renklidir"); // burasý olmadý tekrar bak
	}

}
