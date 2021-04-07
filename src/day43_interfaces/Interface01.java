package day43_interfaces;

public interface Interface01 {
	
    public void motor(); // interface içinde abstract method'lar ve 
                         // ÖZEL concrete method'lar olabilir
    /*
     Bir abstract method'un body'si olmadýðýndan o method'un istenen dinamik özelliði 
     nasýl gercekleþtireceðini bilmemiz mümkün deðildir. Sadece ne yapacaðýný biliriz
     
     Bu method bize sunu anlatýr:
     Beni inherit eden her concrete class'in dinamik motor özelliði olmalýdýr
    */
    void vites(); // Beni inherit eden her concrete class'in dinamik vites özelliði olmalýdýr
    abstract void kasa(); // Beni inherit eden her concrete class'ýn dinamik kasa özelliði olmalýdýr
    
    // Interface'de sadece ABSTRACT, PUBLIC method'lar olur
    // bu iki keyword'u yazsak da yazmasak da Java tüm method'larý bu þekilde kabul eder,
    
    // Java'da interface oluþturmak istiyorsak baþtan o þekilde oluþturmalýyýz
    // Bir class sonradan bazý keyword'ler yazýlarak interface yapýlamaz
    
    String ISIM ="Mustafa"; // Java isim kelimesini italik ve bold yaptý
                            // Demmek ki tüm variable'lar final ve static'tir
}