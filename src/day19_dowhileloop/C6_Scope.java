package day19_dowhileloop;

public class C6_Scope {
	// Bir Class içerisinde oluþturulan variable larýn nerede geçerli olduðu
	// ve nereden kullanýla bildiðini o variable in Scope u beliler
	// google Jva da scope nedir? araþtýr
	// Scope ==> geçerlilik alaný=kapsam

	public static void main(String[] args) {
		int sayý=10;
		
		denemeMethod();
		sayý++;
		System.out.println(sayý);
		//System.out.println(isim);
	}

	public static void denemeMethod() {
		// sayý=20;
		String isim="Mehmet";
		System.out.println(isim);
	}

}
