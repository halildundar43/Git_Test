package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;
public class GarbageCollector01 {
	
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
		String str="";
        for (int i = 0; i < 1000 ; i++) {
            str+=i;
        }
        // bu kod �al��t���nda ka� tane obje olu�ur ?
        // 1001 
        // ilk ba�ta 1 tane olu�turduk
        // sonra her d�ng�de str'a concatination yap�lacak
        // ama String class'� immutable oldu�u i�in her yeni de�eri koymak i�in
        // yeni bir String objesi olu�turulur ve eski obje'den pointer silinir
        
        // dolay�s�yla loop bitti�inde str i�in 1 tane pointer'in i�aret etti�i obje,
        // 1000 tane de hi� bir pointer'in i�aret etmedi�i obje heap memory de bulunur.
        
        @SuppressWarnings("unused")
		List<Integer> list = new ArrayList<>();
        
        // bu sat�r java'ya yeni bir obje olu�turmas�n� s�yl�yor
        // Java yeni obje i�in yer var m� diye memory'i kontrol eder ve memory kritik seviyede ise
        // Garbage collector'u devreye sokuyor...
        
        // Garbage collector finalize() methodunu cal��t�r�r
        // finalize method'u silinecek objeleri i�aretler ve 
        // sonra Garbage collector finalize olan objeleri siler.
    }
}