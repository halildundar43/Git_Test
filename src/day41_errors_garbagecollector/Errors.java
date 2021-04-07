package day41_errors_garbagecollector;

public class Errors {
    public static void main(String[] args) {
        
        // System.out.println(20/0); // RTE deðil RunTimeException
        
        // String str="asd; // CTE dur... çünkü çift týrnaðý tamamlamadýkça kod çalýþmaz
        // bu tür yazýmdan kaynaklanan hatalar kolayca düzeltilebilir.
        
        // Java'da Error dendiðinde önüne geçilemeyen, kod ile çözülemeyen
        // sistemden kaynaklý büyük hatalar kastedilir.
        
        // Error'lar unchecked'dýr ve Java bunlarý öngöremez
        // ancak gerçekleþtiðinde kodun calýþmasý durdurulur.
        
        @SuppressWarnings("unused")
		String str="";
        for (int i = 0; i < 1000000 ; i++) { // hafýzayý doldurur ve hata verip java durur
            str+=i;
        } 
    }
}