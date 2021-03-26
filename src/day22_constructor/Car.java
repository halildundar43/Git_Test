package day22_constructor;

public class Car {

	String marka;
	String model;
	int y�l;
	boolean kazas�VarM�;

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println(car1.marka + " " + car1.model + " " + car1.y�l + " " + car1.kazas�VarM�); // default de�erler yazar

		// Bir object olusturuldugunda esitligin saginda mutlaka Constructor kullanilir
		// Constructor ismi clas ismi ile ayni olmalidir
		// Constructor'da mutlaka () olmalidir
		// Constructor'da parametre olmasi istege baglidir

		car1.marka = "Toyota";
		car1.model = "Corolla";
		car1.y�l = 2010;
		car1.kazas�VarM� = false;
		System.out.println(car1.marka + " " + car1.model + " " + car1.y�l + " " + car1.kazas�VarM�);

		Car car2 = new Car();
		car2.marka = "Opel";
		car2.model = "Astra";
		car2.y�l = 2015;
		car2.kazas�VarM� = true;
		System.out.println(car2.marka + " " + car2.model + " " + car2.y�l + " " + car2.kazas�VarM�);

		car1.kazas�VarM� = true; // car1 e ait herhangi bir �zelli�i de�i�tirebiliriz
		System.out.println(car1.marka + " " + car1.model + " " + car1.y�l + " " + car1.kazas�VarM�);

	}

}
