package day34_inheritance;

public class Muhasebe extends Personel{
    // Muhasebe class'�n�n personel class'�n�n child class'� oldu�unu 
    // declare etmek i�in class ismine extends keyword ile
    // parent class'� yazar�z
    
    public int saatUcreti;
    public String statu;
    public int maas;
    
    public int maasHesapla() {
        
        maas=30*8*saatUcreti;
        
        return maas;
    }
}
