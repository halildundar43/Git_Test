package day19_dowhileloop;

public class C6_Scope {
	// Bir Class i�erisinde olu�turulan variable lar�n nerede ge�erli oldu�u
	// ve nereden kullan�la bildi�ini o variable in Scope u beliler
	// google Jva da scope nedir? ara�t�r
	// Scope ==> ge�erlilik alan�=kapsam

	public static void main(String[] args) {
		int say�=10;
		
		denemeMethod();
		say�++;
		System.out.println(say�);
		//System.out.println(isim);
	}

	public static void denemeMethod() {
		// say�=20;
		String isim="Mehmet";
		System.out.println(isim);
	}

}
