package day42_abstractclasses;

public abstract class YanHizmetler extends Personel {
    
    // abstract bir class'�n abstract child'�n� olu�turursak 
    // abstract methodlar� implement etmek zorunda olmay�z
    // Java bilir ki bu child son class de�il, mutlaka bun child'�n 
    // concrete child class'� olacak
    
    public static void main(String[] args) {
        
        // YanHizmetler obj1 = new YanHizmetler(); // abstract bir class'dan obje �retilemez
        // Cannot instantiate the type YanHizmetler
    }
}