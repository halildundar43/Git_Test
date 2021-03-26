package day23_statickeyword;

public class Static2 {

	int x;
	static int y;

	Static2(int i) {
		x += i; // x ==> 2 // x=0+3
		y += i; // y ==> 2 // y=2+3
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		new Static2(2);
		Static2 dnm = new Static2(3);
		System.out.println(dnm.x + "," + dnm.y);
	}
}
