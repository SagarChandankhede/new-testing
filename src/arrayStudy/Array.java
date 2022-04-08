package arrayStudy;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
	//1 declaration 
		String s1[]=new String[5];
	//2 Initialization
		s1[0]="velocity";
		s1[1]="corporate";
		s1[2]="Training";
		s1[3]="center";
	//3 usage
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		
		System.out.println("===============================");
		for  (int i=0; i<=3; i++) 
		{
			System.out.println(s1[i]);
		}
		System.out.println("===============================");
	
	//1 declaration
		char grade[]=new char[5];
	//2 initialization	
		grade[0]='C';
		grade[1]='E';
		grade[2]='A';
		grade[3]='F';
		grade[4]='B';
	//	grade[5]='D';
		
	//3 usage
		System.out.println(grade[0]);
		System.out.println("grades are \n");
		
		for (int i=0;i<=4;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("===============================");
		
		for (int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("==============ascending order=================");
		
		Arrays.sort(grade);
		for (int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("==============descending order=================");
		for (int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}
		
		
	}

}
