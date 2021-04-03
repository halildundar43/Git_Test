package day37_overriding;

public class Formen extends Isci {
	
		public String sorumluOldBolum="Bakým";
		public String isim="Emrullah";
	
	public static void main(String[] args) {
		
		// inheritance da data türü olarak class ismi kullanýmý
		
		// Bir class'da obje üretirken data türü olarak class'ýn kendisini 
        // veya parent(lar)ýný kullanabiliriz.
        // Oluþturdugumuz obje ile variable kullanmamýz gerekirse, hangi deðeri 
        // alacaðýný anlamak icin önce Data türü olan class'a gideriz
        // orada aradigimiz variable varsa kullaniriz, yoksa 
        // parent(lar)ina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz
		
		Formen fr1=new Formen();
		// fr1 objesini kullanarak hangi class larýn variable larý görebilirim
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas); //Emrullah Marangozhane 1000
		
		Isci fr2=new Formen(); // data türü olarak iþçi seçildiði için formen class ýný göremeyiz
		fr2.bolum="Kaynak Atölyesi";
		
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas); //Mesut Kaynak Atölyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); // Emre
	}
}
