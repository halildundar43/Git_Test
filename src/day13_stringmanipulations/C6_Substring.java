package day13_stringmanipulations;

public class C6_Substring {

	public static void main(String[] args) {

		String str = "Her ders Java gibi olsa";
		// str ýn ilk 10 karakteri yýldýz ile gizleyin

		System.out.println(str.substring(10)); // 10. index dahil sonuna kadar yazdýrý

		System.out.println(str.substring(str.length() - 10)); // son harfi yazdýrýr

		System.out.println(str.substring(0, 10)); // ilk 10 harfi yazdýrýr

		// substring te ilk deðer dahil ikinci deðer dahil deðildir

		System.out.println("**********" + str.substring(10));
		
		//2.yol
		String str3=str.substring(0, 10);
		str3=str3.replaceAll("\\W", "a");
		System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));

		System.out.println(str.substring(10, 10)); // ilk sayý 10.index tekini al der ikinci sayý 10.indexi alma der.
													// Java son söyleneni yapar (hiçlik)

		// System.out.println(str.substring(8, 7)); RTE hatasý

		System.out.println(str.substring(22)); // length-1 son karakter
		System.out.println(str.substring(23)); // length hiçlik
		// System.out.println(str.substring(24)); // RTE hatasý verir

	}

}
