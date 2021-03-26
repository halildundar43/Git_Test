package day33_encapsulation;

public class Encapsulation02 {

		private String okulIsmi="Yildiz Koleji";
	    // Okul isminin baþka class'lardan okunmasýný ama deðer atanamamasýný istiyorsak
	    // getter() method'u oluþturuyoruz
	    
	    private String tcNo="12345678901";
	    private int hesapNo=5554321;
	    
	    // Obje oluþturularak deðer atanýp kullanýlmasýný istedigimiz ama 
	    // ilk atadýðýmýz deðerin görünmemesini istiyorsak setter() method'u kullanýrýz
	    
	    public int sayi=100;
	      
	    public static void main(String[] args) {
	        // eðer ulaþmak istediðim class üyeleri (class member) public deðilse baþka 
	        // package'lerden ulaþmak için extra iþlem yapmamýz gerekir.
	        
	        // Yapabileceðimiz iþlemlerden 1.si Encapsulation (Data saklama)
	        // bu class'da kimseyle paylaþmak istemedigimiz variable ve method'lar oluþturalým
	        
	        // private yapýnca güvenlik konusunu halletmiþ olduk
	        // Ancak class üyeleri'nin private olmasý OOP concept'e aykýrý
	        
	        // Encapsulation class'imizda oluþturduðumuz class üylerine 
	        // kimlerin ne oranda ulaþabileceðini belirlemek için yapýlýr
	        
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
