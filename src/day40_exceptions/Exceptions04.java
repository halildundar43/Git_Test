package day40_exceptions;

public class Exceptions04 {

	public static void main(String[] args) {
		System.out.print(exceptions()); // method call
	}

	@SuppressWarnings({ "finally", "null" })
	public static String exceptions() {
		String result = "";
		String v = null; // deðer deðil pointer excaption dur
		try {
			try {
				result = result + "a";
				v.length(); // nullPointerException verir ve çalýþmayý durdurur
				result = result + "b";
			} catch (NullPointerException e) { // try durduðu için catch çalýþýr
				result = result + "c";
			} finally { // her durumda çalýþýr
				result = result + "d";
				throw new Exception(); // exception fýrlattýðý için altta ki catch e geçer
			}
		} catch (Exception e) { // exceptioný yakala ve e ekle diyor
			result = result + "e";
		}
		return result;
	}
}