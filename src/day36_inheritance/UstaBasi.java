package day36_inheritance;

//import java.util.ArrayList;
//import java.util.List;

public class UstaBasi extends Isci{
    
    public String bolum="takimhane";
    public int sorOldIscisay=20;
    
    public static void main(String[] args) {
        
        UstaBasi ub1=new UstaBasi();
        // Objeyi torun class �nda olu�turunca 3 class'a da ula�abiliyoruz
        
        System.out.println(ub1.bolum); // takimhane
        System.out.println(ub1.sorOldIscisay); // 20
        System.out.println(ub1.saatUcreti); // 10
        System.out.println(ub1.isim); // Mehmet
        
        //List<String> list = new ArrayList<>();
        //Object str=new String("Hasan");
        Isci ub2=new UstaBasi();
        // Extends ile birbirine ba�l� olan class'larda IS-A relation olan 
        // Data t�rleri iste�e ba�l� olarak kullan�labilir.
        // Daha geni� Data t�r� Yazman�n avantaj� :
        // Kapsam�n daha genis olmas�
        // Daha geni� Data t�r� Yazman�n dezavantaj� :
        // Data t�r� olarak se�ti�imiz class ve parent(larina) ait datalara ula�abiliriz
        System.out.println(ub2.departman); // Isci class �ndan al�r
        System.out.println(ub2.izindeMi); // Personel class �ndan al�r
            
        Personel ub3=new UstaBasi();
        System.out.println(ub3.id); // Personel class �ndan al�r
              
    }

}
