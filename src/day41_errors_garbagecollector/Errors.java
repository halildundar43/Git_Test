package day41_errors_garbagecollector;

public class Errors {
    public static void main(String[] args) {
        
        // System.out.println(20/0); // RTE de�il RunTimeException
        
        // String str="asd; // CTE dur... ��nk� �ift t�rna�� tamamlamad�k�a kod �al��maz
        // bu t�r yaz�mdan kaynaklanan hatalar kolayca d�zeltilebilir.
        
        // Java'da Error dendi�inde �n�ne ge�ilemeyen, kod ile ��z�lemeyen
        // sistemden kaynakl� b�y�k hatalar kastedilir.
        
        // Error'lar unchecked'd�r ve Java bunlar� �ng�remez
        // ancak ger�ekle�ti�inde kodun cal��mas� durdurulur.
        
        @SuppressWarnings("unused")
		String str="";
        for (int i = 0; i < 1000000 ; i++) { // haf�zay� doldurur ve hata verip java durur
            str+=i;
        } 
    }
}