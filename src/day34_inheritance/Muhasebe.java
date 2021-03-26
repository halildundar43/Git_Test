package day34_inheritance;

public class Muhasebe extends Personel{
    // Muhasebe class'ýnýn personel class'ýnýn child class'ý olduðunu 
    // declare etmek için class ismine extends keyword ile
    // parent class'ý yazarýz
    
    public int saatUcreti;
    public String statu;
    public int maas;
    
    public int maasHesapla() {
        
        maas=30*8*saatUcreti;
        
        return maas;
    }
}
