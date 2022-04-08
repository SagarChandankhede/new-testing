package constructor;

public class Cs1 {

	public static void main(String[] args) 
	{
		Cs2 v= new Cs2();// created object of another class
		
		System.out.println("Value of a is "+v.a);// calling non static variable from another class
		
		System.out.println("Value of b is "+Cs2.b);// calling static variable form another class
		
		System.out.println("the name is "+v.name);
	}

}