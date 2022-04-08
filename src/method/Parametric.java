package method;

public class Parametric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parametric ob= new Parametric();
		ob.students("pooja", 21, 28.44f, 'a');
		ob.students("manisha", 22, 100f, 'b');
		students("madhuri", 01, 90.33f);
		ob.students("kuhu", 28, 93.54f, 'A');
		students("bubby", 14, 67.88f);
	}
public void students(String name,int num, float percentage, char grade) {
	System.out.println("==================================");
	System.out.println("name         :- "+name );
	System.out.println("roll no      :- "+num);
	System.out.println("percentage   :- "+percentage+" %" );
	System.out.println("grade        :- "+grade );
}

public static void students(String name,int num, float percentage) {
	
	System.out.println("==================================");
	System.out.println("name         :- "+name );
	System.out.println("roll no      :- "+num);
	System.out.println("percentage   :- "+percentage +" %" );
	
}
}
