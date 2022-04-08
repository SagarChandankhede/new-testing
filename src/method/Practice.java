package method;

public class Practice {

	
	public void addition() {
		 
		int a=12;
		int b=4;
		int sum=a+b;
		System.out.println("non static sum is "+sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subtraction();
		Practice ob3=new Practice();
		ob3.addition();
		NS ob2=new NS();
		ob2.addition();
		Example3.test1();
	}

	public static void subtraction() {
		int a=12;
		int b=4;
		int sub=a-b;
		System.out.println("static subtraction is "+sub);
	}
}
