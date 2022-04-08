package method;

public class NS {
	
	public static void main(String[] args) {
		NS ob=new NS();
		ob.test0();
		NS ob2=new NS();
		ob2.addition();
		Non_static ob1=new Non_static();
		ob1.test1();
		
	}

	public void test0() {

		System.out.println("this is non static ex in same class");
		
	}
	public void addition() {
		
		byte a=4;
		byte b=6;
		int sum=a+b;
		System.out.println("diff class non static addition of A and B is "+sum);
		
	}
}
