package day25_arrays;

import java.util.Arrays;
public class Arrays03 {
    public static void main(String[] args) {
        // Verilen bir String'i array'e nasil ceviririz ?
        // Verilen bir cümlede kac kelime olduðunu bulunuz
        // Verilen cümlede her kelimenin ilk harfini buyuk yapiniz
        
        String str="Herkes Javayi tanýsa severdi";
        // bu stringi kelimelere ayýralým
        // split methodu
        
        String arr[]=str.split(" ");
        
        System.out.println(Arrays.toString(arr));
        
        String arr2[]=str.split("Java");
        System.out.println(Arrays.toString(arr2)); 
        
        String arr3[]=str.split("a");
        System.out.println(Arrays.toString(arr3)); 
        String arr4[]=str.split("");
        System.out.println(Arrays.toString(arr4)); 
    }
}
