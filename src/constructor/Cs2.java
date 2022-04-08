
package constructor;

public class Cs2 {

	int a=10;// 1.2.--> non static variable
	static int b=20;// static variable
	String name="Velocity";
	
	
	public static void main(String[] args)
	{
		Cs2 v= new Cs2();// creating object
		
		System.out.println("Value of variable a is "+v.a);// calling non static variable
		System.out.println("Value of variable b is "+b);// calling static variable
		System.out.println("Value of name is "+v.name);

	}

}
