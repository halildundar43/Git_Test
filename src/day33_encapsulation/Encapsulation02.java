package day33_encapsulation;

public class Encapsulation02 {

		private String okulIsmi="Yildiz Koleji";
	    // Okul isminin ba�ka class'lardan okunmas�n� ama de�er atanamamas�n� istiyorsak
	    // getter() method'u olu�turuyoruz
	    
	    private String tcNo="12345678901";
	    private int hesapNo=5554321;
	    
	    // Obje olu�turularak de�er atan�p kullan�lmas�n� istedigimiz ama 
	    // ilk atad���m�z de�erin g�r�nmemesini istiyorsak setter() method'u kullan�r�z
	    
	    public int sayi=100;
	      
	    public static void main(String[] args) {
	        // e�er ula�mak istedi�im class �yeleri (class member) public de�ilse ba�ka 
	        // package'lerden ula�mak i�in extra i�lem yapmam�z gerekir.
	        
	        // Yapabilece�imiz i�lemlerden 1.si Encapsulation (Data saklama)
	        // bu class'da kimseyle payla�mak istemedigimiz variable ve method'lar olu�tural�m
	        
	        // private yap�nca g�venlik konusunu halletmi� olduk
	        // Ancak class �yeleri'nin private olmas� OOP concept'e ayk�r�
	        
	        // Encapsulation class'imizda olu�turdu�umuz class �ylerine 
	        // kimlerin ne oranda ula�abilece�ini belirlemek i�in yap�l�r
	        
	    }
	    
	    private void denemeMethod() {
	        System.out.println("Deneme method'u calisti");
	    }
	    public String getOkulIsmi() {
	        return okulIsmi;
	    }
	    public void setTcNo(String tcNo) {
	        this.tcNo = tcNo;
	    }
	    public void setHesapNo(int hesapNo) {
	        this.hesapNo = hesapNo;
	}

}
