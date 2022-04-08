package arrayStudy;

public class Multid2 {

	public static void main(String[] args) {
		// declaration and initialization
		int ar[][]= {{10,20},{30,40}};

		for(int i=0;i<=ar.length-1;i++)
		{
			for (int j=0;j<=ar.length-1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		String s[][]= {{"sagar","abhi","vj"},{"saurabh","agrya","shubham"},{"shweta","dim","madz"}};
		
		for (int i=0;i<=s.length-1;i++)//0
		{
			for(int j=0;j<=s.length-1;j++) //0

				{
				System.out.print(s[i][j]+" ");

				}
			System.out.println();
		}
		
		
	}

}
