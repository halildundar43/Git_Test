package day37_overriding;

public class Isci extends Personel {
	
	public String bolum="Kaynak at�lyesi";
	public int maas=5000;
	public String isim="Mesut";
	
	public int maasHesapla() {
        return 30*8*15; // 30 gun sayisi, 8 gunluk mesai,15 saat ucreti
    }
    
    public void mesai() {
        System.out.println("isciler gunluk 8 saat calisir");
    }
    
    // overloading : ayn� isimde ama farkl� method signature'larina sahip methodlar
    public int maasHesapla(int gunSayisi) {
        
        return gunSayisi*8*15;
    }
    public int maasHesapla(int gunlukCalismaSaati,int gunSayisi) {
        
        return gunSayisi*gunlukCalismaSaati*15;
    }
    public int maasHesapla(int gunlukCalismaSaati,int gunSayisi,int saatUcreti) {
        return gunSayisi*gunlukCalismaSaati*saatUcreti;
    }
	
}
