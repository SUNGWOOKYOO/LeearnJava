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
interface Printable {
	void print(String doc); // abstract method have to declare only.
	//default void printCMYK(String doc){}
}

class PrnA implements Printable{
	//@Override
	public void print(String doc){
		System.out.println("From A printer");
		System.out.println(doc);
	}
}

class PrnB implements Printable{
	//@Override
	public void print(String doc){
		System.out.println("From B printer");
		System.out.print(doc);
	}
	
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







