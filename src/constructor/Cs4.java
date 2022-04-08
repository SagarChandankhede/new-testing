package constructor;

public class Cs4 {

	int a;
	int b;
	int c;
	
	public Cs4() {
		
		a=300;
		b=200;
		c=100;
		System.out.println("zero parametric");
	}
	
	public Cs4(int num1) {
		
		a=num1;
		b=1;
		c=1;
		System.out.println("this is one parametric");
	}
	
	public Cs4(int num1,int num2,int num3) {
		a=num1;
		b=num2;
		c=num3;
		System.out.println("this is 3 parametric");
	}
	
	public void multi()
	{
		int ans=a*b*c;
		System.out.println("answer is "+ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cs4 v= new Cs4();
		v.multi();
		Cs4 v1=new Cs4(3);
		v1.multi();
		Cs4 v2=new Cs4(2,3,4);
		v2.multi();
		Cs3 c1=new Cs3();
		c1.addition();
		System.out.println("ohh yeah "+c1.a);
	}

}
