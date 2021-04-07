package day40_exceptions;

public class Exceptions04 {

	public static void main(String[] args) {
		System.out.print(exceptions()); // method call
	}

	@SuppressWarnings({ "finally", "null" })
	public static String exceptions() {
		String result = "";
		String v = null; // de�er de�il pointer excaption dur
		try {
			try {
				result = result + "a";
				v.length(); // nullPointerException verir ve �al��may� durdurur
				result = result + "b";
			} catch (NullPointerException e) { // try durdu�u i�in catch �al���r
				result = result + "c";
			} finally { // her durumda �al���r
				result = result + "d";
				throw new Exception(); // exception f�rlatt��� i�in altta ki catch e ge�er
			}
		} catch (Exception e) { // exception� yakala ve e ekle diyor
			result = result + "e";
		}
		return result;
	}
}