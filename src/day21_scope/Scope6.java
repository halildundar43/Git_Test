package day21_scope;

public class Scope6 {
	
	public int num1; // intance // access modifier public yap�l�nca her yerden ula��labilir
    String name = "Ali"; // intance // access modifier yaz�lmad��� i�in default access modifier ge�erlidir
    								// sadece paket i�inde kullan�labilir
    
    public static void main(String args){ 
      add(); // method call ==> static oldu�u i�in �a��rabilir
    // product (5); ==> static de�il, static olmayan bir method static olan main method icerisinden ca�r�lamaz
    }
    
    public static void add(){
    // num1++; // ==> static olmayan (instance) num1, static bir method icinden kullan�lamaz
    
    int num2 = 6; // local variable
    char letter; // local variable
    System.out.println("Do addition ");
    
    letter='a';
    System.out.println(num2+" "+letter);
    }
    
    
    public void product(int num3){
    name = "Veli";
     // num2++; // num2 �stteki methodda olusturulmus Local bir variable'dir. 
    System.out.println(num3 * num3);
    } 

}
