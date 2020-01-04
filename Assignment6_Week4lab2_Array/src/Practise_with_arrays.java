import java.util.Scanner;
public class Practise_with_arrays {

	private static int row,col;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of rows in Array");
		Scanner array1 = new Scanner(System.in);
		row = array1.nextInt();
		System.out.println("Enter the number of columns in Array");
		col = array1.nextInt();
		int[][] array = new int[row][col];
		
		System.out.println("Enter Array Elements");
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[0].length;j++)
				array[i][j]=array1.nextInt();
				//System.out.println(array[i][j]);
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
				System.out.print("\t"+array[i][j]);
			System.out.println();
		}
		
		System.out.println("Transpose of an Array");
		
		int[][] array_transpose=new int[col][row];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
				array_transpose[j][i]=array[i][j];
			
		}
		
		for(int i=0;i<array_transpose.length;i++)
		{
			for(int j=0;j<array_transpose[0].length;j++)
				System.out.print("\t"+array_transpose[i][j]);
			System.out.println();
		}
		

	}

}
