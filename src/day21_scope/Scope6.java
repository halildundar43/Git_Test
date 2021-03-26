package day21_scope;

public class Scope6 {
	
	public int num1; // intance // access modifier public yapýlýnca her yerden ulaþýlabilir
    String name = "Ali"; // intance // access modifier yazýlmadýðý için default access modifier geçerlidir
    								// sadece paket içinde kullanýlabilir
    
    public static void main(String args){ 
      add(); // method call ==> static olduðu için çaðýrabilir
    // product (5); ==> static deðil, static olmayan bir method static olan main method icerisinden caðrýlamaz
    }
    
    public static void add(){
    // num1++; // ==> static olmayan (instance) num1, static bir method icinden kullanýlamaz
    
    int num2 = 6; // local variable
    char letter; // local variable
    System.out.println("Do addition ");
    
    letter='a';
    System.out.println(num2+" "+letter);
    }
    
    
    public void product(int num3){
    name = "Veli";
     // num2++; // num2 üstteki methodda olusturulmus Local bir variable'dir. 
    System.out.println(num3 * num3);
    } 

}
