package day42_abstractclasses;

public abstract class YanHizmetler extends Personel {
    
    // abstract bir class'ýn abstract child'ýný oluþturursak 
    // abstract methodlarý implement etmek zorunda olmayýz
    // Java bilir ki bu child son class deðil, mutlaka bun child'ýn 
    // concrete child class'ý olacak
    
    public static void main(String[] args) {
        
        // YanHizmetler obj1 = new YanHizmetler(); // abstract bir class'dan obje üretilemez
        // Cannot instantiate the type YanHizmetler
    }
}