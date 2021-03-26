package day13_stringmanipulations;

public class C8_Examples2 {

	public static void main(String[] args) {
		// strig olarak verilen
		// str1="$13,99" ve str2 "$10,55" sayýlarýn toplamýný bulunuz
		// double.parseDouble() kullanabilirsiniz
		
		String str1="$13,99";
		String str2="$10,55";
		
		str1=str1.replaceAll("\\D", "");
		str2=str2.replaceAll("\\D", "");
		
		System.out.println(str1); // str1 ve str2 string olduðu için içerikleri sayý deðildir 
		System.out.println(str2);
		
		// eðer içeriði sayý görünümlü string varsa
		// parseDouble() veya parseIbteger() methodu kullanabiliriz
		// ancak primitiv data type leri methoda sahip olmadýklarýndan wrapper calss larý kullanýrýz
		
		double sayi1=Double.parseDouble(str1);
		double sayi2=Double.parseDouble(str2);
		double toplam= (sayi1+sayi2)/100;
		
		System.out.println("$"+toplam);

	}

}
