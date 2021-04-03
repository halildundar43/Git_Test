package day36_inheritance;

//import java.util.ArrayList;
//import java.util.List;

public class UstaBasi extends Isci{
    
    public String bolum="takimhane";
    public int sorOldIscisay=20;
    
    public static void main(String[] args) {
        
        UstaBasi ub1=new UstaBasi();
        // Objeyi torun class ýnda oluþturunca 3 class'a da ulaþabiliyoruz
        
        System.out.println(ub1.bolum); // takimhane
        System.out.println(ub1.sorOldIscisay); // 20
        System.out.println(ub1.saatUcreti); // 10
        System.out.println(ub1.isim); // Mehmet
        
        //List<String> list = new ArrayList<>();
        //Object str=new String("Hasan");
        Isci ub2=new UstaBasi();
        // Extends ile birbirine baðlý olan class'larda IS-A relation olan 
        // Data türleri isteðe baðlý olarak kullanýlabilir.
        // Daha geniþ Data türü Yazmanýn avantajý :
        // Kapsamýn daha genis olmasý
        // Daha geniþ Data türü Yazmanýn dezavantajý :
        // Data türü olarak seçtiðimiz class ve parent(larina) ait datalara ulaþabiliriz
        System.out.println(ub2.departman); // Isci class ýndan alýr
        System.out.println(ub2.izindeMi); // Personel class ýndan alýr
            
        Personel ub3=new UstaBasi();
        System.out.println(ub3.id); // Personel class ýndan alýr
              
    }

}
