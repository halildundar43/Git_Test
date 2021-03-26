package day23_statickeyword;

public class MyConstructor {

	    int x =3;
        int y =5;
        
        MyConstructor () {
            x+=1; // x==> 3+1=4
            System.out.println("-x"+x);       
        }
        
        MyConstructor (int i) { // i=3
            this();
            
            this.y =i; // i=3=y
            x+=y; // x==> 4+3=7
            System.out.println("-x"+x);
            }
        
        MyConstructor (int i, int i2) { // i=4 , i2=3
            this(3);
            
            this.x -=4; // x==> 7-4=3
            System.out.println("-x"+x);
        }
        public static void main(String[] args) {
            MyConstructor mc1 = new MyConstructor (4,3);
        System.out.println("x in son deðeri: "+mc1.x);
        System.out.println("y in son deðeri: "+mc1.y);
        }
	
}
