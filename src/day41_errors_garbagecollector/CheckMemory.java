package day41_errors_garbagecollector;

import java.sql.Date;

public class CheckMemory {

	public static void main(String[] args) {
		// garbagecollector() metodu ile JVM e istekte bulunuruz ve isteðimizin dikkate
		// alýnmasýnýn veya sonuçlarýnýn garantisi yoktur!
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory:" + rt.totalMemory());
		System.out.println("Loop tan önce Free Memory:" + rt.freeMemory());
		@SuppressWarnings("unused")
		Date d = null;
		
		// Bu adýmda çýlgýnca Date objesi oluþturalým :)
		for (int i = 0; i < 100000; i++) {
			d = new Date(i);
			d = null;
		}
		// Deli gibi Date objesi oluþturduk þimdi freeMemory metodunu tekrar çaðýralým
		System.out.println("After loop Free Memory:" + rt.freeMemory());
		
		// rt referans deðiþkeni ile JVM e garbage collector u çalýþtýrma isteðinde bulunalým
		rt.gc(); // ya da System.gc();
		System.out.println("After GC Free Memory:" + rt.freeMemory());
	}
	// Bendeki örnek çýktý þu þekilde, çalýþtýrdýðýnýzda sizde farklý olacaktýr
	// GC tüm oluþturalan objeleri silmeyi garanti etmedigi için After GC Free
	// Memory farklýlýklar gösterebilir.
	
	/* Total Memory:62390272
	   Free Memory:61717816
	   After Free Memory:59750560
	   After GC Free Memory:61803160 */
}