package arrayStudy;

public class MultiD1 {

	public static void main(String[] args) {
		
		int array[][]=new int[2][2];
		
		array [0][0]=1;
		array [0][1]=2;
		array [1][0]=1;
		array [1][1]=3;
		
		for (int i=0; i<=array.length-1;i++)
		{
			for(int j=0;j<=array.length-1;j++)
			{
			System.out.print(array [i][j]+" ");
			}
			System.out.println();
		}
			
	}

}
