package day43_interfaces;

public interface Interface02 {
    
    // Soru su : Buradaki default ve static bizim bildiðimiz default ve static mi ?
    // cevap : HAYIR
    
    public default void deneme() {
        System.out.println("Default keyword'lü method çalýþtý");
    }
    
    // bizim bildiðimiz default access modifier'dý 
    // bir method'da birden fazla access modfier olur mu ? 
    // bizim interface'de oluþturduðumuz tüm method'lar public'tir
    // interface'de default keyword kullanarak concrete method oluþturabiliriz
    // buradaki default keyword'u access modfier deðil
    // Java'nin özel bir çözümüdür.
    // Buradaki default keyword baþýna yazýldýðý method'un concrete olduðunu belirtir
    
    static void deneme2() {
        System.out.println("Static keyword'lü method çalýþtý");
    }
    // yukarýda default keyword'u için yazdýklarýmýz static için de geçerlidir.
    
    // static ve default keyword'u kullanarak oluþturduðumuz method'lar
    // override edilmek ZORUNDA DEÐÝLDÝR
}