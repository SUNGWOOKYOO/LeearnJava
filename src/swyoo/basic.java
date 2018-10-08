package swyoo; 

/*  
// understanding of package system
public class basic {
	public static void main(String[] args){
		// at current path, we can make use of any package 
		com.wxfx.smart.circle c1 = new com.wxfx.smart.circle(3.5);
		System.out.println(c1.getPerimeter());
		com.fxmx.simple.circle c2 = new com.fxmx.simple.circle(5.5);
		System.out.println(c2.getArea());
	}
}
*/

/*
// Constructor ! 
class AAA{
	public AAA(){System.out.println("I'm Super class");}
}

class BBB extends AAA{
	public BBB(){System.out.println("I'm Sub class");}
}

// public class rule: p204 
class basic{
	public static void main(String[] args){
		new BBB();
	}
}
*/


// interface rule : p368
// In interface, (it has abstract method, default method, static method)
// 1. all methods are regarded to declare 'public'
// 2. all variables have to be initialized when they are declared. 
// 3. all variables are regarded to declare "public, static, final"
// 4. all classes that implements interface should implements all abstract method (overriding is essential )
// [AAA instance of BBB]
// If AAA is an instance of BBB or a class that BBB extends or
// If AAA is an instance that implements BBB directly or indirectly, it returns True! 
// we can know about abstract class if we look into p381
/*
interface Printable {
	void print(String doc); // abstract method have to declare only.
	//default void printCMYK(String doc){}
}

class PrnA implements Printable{
	@Override
	public void print(String doc){
		System.out.println("From A printer");
		System.out.println(doc);
	}
}

class PrnB implements Printable{
	@Override
	public void print(String doc){
		System.out.println("From B printer");
		System.out.print(doc);
	}
	
	//@Override
	//public void printCMYK(String doc){
	//	System.out.println("From color printer");
	//	System.out.println(doc);
	//}
	
}

class basic{
	public static void main(String[] args){
		String myDoc = "Thiis is a report about ... ";
		Printable prn1 = new PrnA();
		prn1.print(myDoc);
		System.out.println();
		
		Printable prn2 = new PrnB();
		prn2.print(myDoc);
	}
}
*/

// Exception from Programmer 
// a class that extends Exception must execute exception through throws or try, catch ! 
// throws meaning : p404, Rule for Exception class : p402
/*
import java.util.Scanner;

class UserError extends Exception {
	public UserError(){ super(" it is not available to use the input ");}
}
class basic {
	public static void main(String[] args){
		System.out.print("input your age: ");
		
		try{
			int age = readAge();
			System.out.printf("entered age : %d \n", age);
		}
		catch(UserError e){
			System.out.println(e.getMessage());
		}
	}
	public static int readAge() throws UserError {
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		
		if(age<0)
			throw new UserError();
		return age;
	}
}


// Deep copy 
// in order to copy an instance deeply, we need to override Object.clone() function
// , and we need to implement Cloneable for marker interface  
class Point implements Cloneable {
    private int xPos;
    private int yPos;
    
    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }
    
    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println();
    }

    public void changePos(int x, int y) {
        xPos = x;
        yPos = y;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Rectangle implements Cloneable {
    private Point upperLeft;     // ÁÂÃø »óŽÜ ÁÂÇ¥
    private Point lowerRight;     // ¿ìÃø ÇÏŽÜ ÁÂÇ¥
    
    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    // ÁÂÇ¥ Á€ºžžŠ ŒöÁ€ÇÔ
    public void changePos(int x1, int y1, int x2, int y2) {
        upperLeft.changePos(x1, y1);
        lowerRight.changePos(x2, y2);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        // Object Å¬·¡œºÀÇ clone žÞŒÒµå È£Ãâ °á°úžŠ ŸòÀœ
        Rectangle copy = (Rectangle)super.clone();

        // ±íÀº º¹»çÀÇ ÇüÅÂ·Î º¹»çº»À» ŒöÁ€
        copy.upperLeft = (Point)upperLeft.clone();
        copy.lowerRight = (Point)lowerRight.clone();
        
        // ¿ÏŒºµÈ º¹»çº»ÀÇ ÂüÁ¶žŠ ¹ÝÈ¯
        return copy;        
    }

    // Á÷»ç°¢Çü ÁÂÇ¥ Á€ºž Ãâ·Â    
    public void showPosition() {
        System.out.print("ÁÂÃø »óŽÜ: ");
        upperLeft.showPosition();
        
        System.out.print("¿ìÃø ÇÏŽÜ: ");
        lowerRight.showPosition();
        System.out.println(); 
    }
}

class basic {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy;
        
        try {
            // ÀÎœºÅÏœº º¹»ç
            cpy = (Rectangle)org.clone();

            // ÀÎœºÅÏœºÀÇ ÁÂÇ¥ Á€ºžžŠ ŒöÁ€
            org.changePos(2, 2, 7, 7);

            org.showPosition();
            cpy.showPosition();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

*/
