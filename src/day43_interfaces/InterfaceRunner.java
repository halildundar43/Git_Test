package day43_interfaces;

public class InterfaceRunner implements Interface02 {
	
    public static void main(String[] args) {
        
        // static olarak tan�mlanm�� bir variable veya method
        // ba�ka class'dan classIsmi.methodIsmi �eklinde �a�r�labilir
        
        Interface02.deneme2();
        
        // Default keyword'u ile olu�turdu�umuz method ise 
        // obje �zerinden �a�r�labilir
        
        InterfaceRunner obj1= new InterfaceRunner();
        obj1.deneme();
    }
}