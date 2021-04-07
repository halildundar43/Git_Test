package day43_interfaces;

public interface Interface02 {
    
    // Soru su : Buradaki default ve static bizim bildi�imiz default ve static mi ?
    // cevap : HAYIR
    
    public default void deneme() {
        System.out.println("Default keyword'l� method �al��t�");
    }
    
    // bizim bildi�imiz default access modifier'd� 
    // bir method'da birden fazla access modfier olur mu ? 
    // bizim interface'de olu�turdu�umuz t�m method'lar public'tir
    // interface'de default keyword kullanarak concrete method olu�turabiliriz
    // buradaki default keyword'u access modfier de�il
    // Java'nin �zel bir ��z�m�d�r.
    // Buradaki default keyword ba��na yaz�ld��� method'un concrete oldu�unu belirtir
    
    static void deneme2() {
        System.out.println("Static keyword'l� method �al��t�");
    }
    // yukar�da default keyword'u i�in yazd�klar�m�z static i�in de ge�erlidir.
    
    // static ve default keyword'u kullanarak olu�turdu�umuz method'lar
    // override edilmek ZORUNDA DE��LD�R
}