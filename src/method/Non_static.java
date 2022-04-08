package method;

public class Non_static {

	public static void main(String[] args) {
		
		// calling non static method-->>need to create object
		//creating object
		Non_static object=new Non_static();
		//syntax to create object--->>classname objectname=new classname();
		
		//to call non static method in same class --->>syntax--->>>Objectname.methodName();
		object.test1();
		
		
	}

	public void test1()//non static method--->>because it don't have static 
	{
		System.out.println("this is test 1 non static");
		
	}
	
}
