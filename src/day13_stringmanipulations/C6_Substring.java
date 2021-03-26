package day13_stringmanipulations;

public class C6_Substring {

	public static void main(String[] args) {

		String str = "Her ders Java gibi olsa";
		// str �n ilk 10 karakteri y�ld�z ile gizleyin

		System.out.println(str.substring(10)); // 10. index dahil sonuna kadar yazd�r�

		System.out.println(str.substring(str.length() - 10)); // son harfi yazd�r�r

		System.out.println(str.substring(0, 10)); // ilk 10 harfi yazd�r�r

		// substring te ilk de�er dahil ikinci de�er dahil de�ildir

		System.out.println("**********" + str.substring(10));
		
		//2.yol
		String str3=str.substring(0, 10);
		str3=str3.replaceAll("\\W", "a");
		System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));

		System.out.println(str.substring(10, 10)); // ilk say� 10.index tekini al der ikinci say� 10.indexi alma der.
													// Java son s�yleneni yapar (hi�lik)

		// System.out.println(str.substring(8, 7)); RTE hatas�

		System.out.println(str.substring(22)); // length-1 son karakter
		System.out.println(str.substring(23)); // length hi�lik
		// System.out.println(str.substring(24)); // RTE hatas� verir

	}

}
