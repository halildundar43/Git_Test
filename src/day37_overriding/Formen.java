package day37_overriding;

public class Formen extends Isci {
	
		public String sorumluOldBolum="Bak�m";
		public String isim="Emrullah";
	
	public static void main(String[] args) {
		
		// inheritance da data t�r� olarak class ismi kullan�m�
		
		// Bir class'da obje �retirken data t�r� olarak class'�n kendisini 
        // veya parent(lar)�n� kullanabiliriz.
        // Olu�turdugumuz obje ile variable kullanmam�z gerekirse, hangi de�eri 
        // alaca��n� anlamak icin �nce Data t�r� olan class'a gideriz
        // orada aradigimiz variable varsa kullaniriz, yoksa 
        // parent(lar)ina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz
		
		Formen fr1=new Formen();
		// fr1 objesini kullanarak hangi class lar�n variable lar� g�rebilirim
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas); //Emrullah Marangozhane 1000
		
		Isci fr2=new Formen(); // data t�r� olarak i��i se�ildi�i i�in formen class �n� g�remeyiz
		fr2.bolum="Kaynak At�lyesi";
		
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas); //Mesut Kaynak At�lyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); // Emre
	}
}
