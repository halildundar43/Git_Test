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
        // bu kod çalýþtýðýnda kaç tane obje oluþur ?
        // 1001 
        // ilk baþta 1 tane oluþturduk
        // sonra her döngüde str'a concatination yapýlacak
        // ama String class'ý immutable olduðu için her yeni deðeri koymak için
        // yeni bir String objesi oluþturulur ve eski obje'den pointer silinir
        
        // dolayýsýyla loop bittiðinde str için 1 tane pointer'in iþaret ettiði obje,
        // 1000 tane de hiç bir pointer'in iþaret etmediði obje heap memory de bulunur.
        
        @SuppressWarnings("unused")
		List<Integer> list = new ArrayList<>();
        
        // bu satýr java'ya yeni bir obje oluþturmasýný söylüyor
        // Java yeni obje için yer var mý diye memory'i kontrol eder ve memory kritik seviyede ise
        // Garbage collector'u devreye sokuyor...
        
        // Garbage collector finalize() methodunu calýþtýrýr
        // finalize method'u silinecek objeleri iþaretler ve 
        // sonra Garbage collector finalize olan objeleri siler.
    }
}