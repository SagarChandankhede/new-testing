package constructor;

public class Cs3 {

		int a;//variable declaration
		int b;//variable declaration
		String name="velocity";
	

	public Cs3()//zero parametric constructor
	{
		a=50;
		b=70;
		
		System.out.println("constructor is running ");
		System.out.println("value of a is "+a);
		System.out.println("value of a is "+b);
	}
	public static void main(String[] args)
			
 {
		Cs3 c1=new Cs3();
		c1.addition();
		System.out.println("Institute name is "+c1.name);
	}
	
	public void addition()//non static method
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
		System.out.println("Institute name is "+name);
		Cs4 c2=new Cs4(1, 2, 3);
		c2.multi();
		
	}
}
