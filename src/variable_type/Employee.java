package variable_type;

public class Employee {

	//name--->string
	//emp code--->Tm124,1234-->string
	//grade-->A, B, C, D-->char
	//salary--->12.13, 123.23---> float
	
	String empName;
	String empCode;
	char empGrade;
	float empSal;
	
	public void empInfo()
	{
		System.out.println("=============================");
		System.out.println("Emploeey name is "+empName);
		System.out.println("Empolyee Code is "+empCode);
		System.out.println("Empolyee Grade is "+empGrade);
		System.out.println("Employee salary is "+empSal);
	}
	 public void empDetails() {
		 
	 }
}
