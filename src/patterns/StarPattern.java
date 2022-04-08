package patterns;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		*	 *
//		**  **
//		******
//		**  **
//		*	 *
		
		//int space = 5;
		
		int star= 1;
		for (int i=1; i<=9;i++)
		{
			for(int k=1; k<=star;k++)
			{
				System.out.print("* ");
			}
//			for(int j=1;j<=space;j++)
//			{
//				System.out.print(" ");
//			}
//		
			if(i<5)
			{
				star++;
			//	space--;
			}
			else
			{
				star--;
			//	space++;
			}
			System.out.println();
		
		}
	}

}
