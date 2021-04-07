package day43_interfaces;

public interface Interface01 {
	
    public void motor(); // interface i�inde abstract method'lar ve 
                         // �ZEL concrete method'lar olabilir
    /*
     Bir abstract method'un body'si olmad���ndan o method'un istenen dinamik �zelli�i 
     nas�l gercekle�tirece�ini bilmemiz m�mk�n de�ildir. Sadece ne yapaca��n� biliriz
     
     Bu method bize sunu anlat�r:
     Beni inherit eden her concrete class'in dinamik motor �zelli�i olmal�d�r
    */
    void vites(); // Beni inherit eden her concrete class'in dinamik vites �zelli�i olmal�d�r
    abstract void kasa(); // Beni inherit eden her concrete class'�n dinamik kasa �zelli�i olmal�d�r
    
    // Interface'de sadece ABSTRACT, PUBLIC method'lar olur
    // bu iki keyword'u yazsak da yazmasak da Java t�m method'lar� bu �ekilde kabul eder,
    
    // Java'da interface olu�turmak istiyorsak ba�tan o �ekilde olu�turmal�y�z
    // Bir class sonradan baz� keyword'ler yaz�larak interface yap�lamaz
    
    String ISIM ="Mustafa"; // Java isim kelimesini italik ve bold yapt�
                            // Demmek ki t�m variable'lar final ve static'tir
}