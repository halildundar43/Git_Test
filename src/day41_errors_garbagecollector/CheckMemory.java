package day41_errors_garbagecollector;

import java.sql.Date;

public class CheckMemory {

	public static void main(String[] args) {
		// garbagecollector() metodu ile JVM e istekte bulunuruz ve iste�imizin dikkate
		// al�nmas�n�n veya sonu�lar�n�n garantisi yoktur!
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory:" + rt.totalMemory());
		System.out.println("Loop tan �nce Free Memory:" + rt.freeMemory());
		@SuppressWarnings("unused")
		Date d = null;
		
		// Bu ad�mda ��lg�nca Date objesi olu�tural�m :)
		for (int i = 0; i < 100000; i++) {
			d = new Date(i);
			d = null;
		}
		// Deli gibi Date objesi olu�turduk �imdi freeMemory metodunu tekrar �a��ral�m
		System.out.println("After loop Free Memory:" + rt.freeMemory());
		
		// rt referans de�i�keni ile JVM e garbage collector u �al��t�rma iste�inde bulunal�m
		rt.gc(); // ya da System.gc();
		System.out.println("After GC Free Memory:" + rt.freeMemory());
	}
	// Bendeki �rnek ��kt� �u �ekilde, �al��t�rd���n�zda sizde farkl� olacakt�r
	// GC t�m olu�turalan objeleri silmeyi garanti etmedigi i�in After GC Free
	// Memory farkl�l�klar g�sterebilir.
	
	/* Total Memory:62390272
	   Free Memory:61717816
	   After Free Memory:59750560
	   After GC Free Memory:61803160 */
}