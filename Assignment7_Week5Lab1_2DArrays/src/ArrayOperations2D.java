import java.util.Scanner;

public class ArrayOperations2D {
	
private static int row,col;
	
	public static int getArrayrow()
	{
		System.out.println("Enter the number of rows in Array");
		Scanner array1 = new Scanner(System.in);
		row = array1.nextInt();
		return row;
	}
	
	public static int getArraycol()
	{
		System.out.println("Enter the number of columns in Array");
		Scanner array1 = new Scanner(System.in);
		col = array1.nextInt();
		return col;
	}
	
private static int[][] array = new int[row][col];
private static int[][] array1 = new int[col][row];
	
	public static int[][] getArray(int[][] array)
	{
		Scanner elements = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[0].length;j++)
			{
				array[i][j]=elements.nextInt();
			}

		
//		for(int i=0;i<array.length;i++)
//		{
//			for(int j=0;j<array[0].length;j++)
//				System.out.print("\t"+array[i][j]);
//			System.out.println();
//		}
		return array;
	}
	
	
	public static int[] findRowMax(int[][] array) 
	{
		int max_number;
		int[] row_max = new int[array.length]; 
		for(int i=0;i<array.length;i++)
		{
			max_number= array[i][0];
			for(int j=1;j<array[0].length;j++)
			{
				if(array[i][j]>max_number)
					max_number=array[i][j];
			}
			row_max[i]=max_number;
		}
		return row_max;
	}
	
	public static int[] findColMax(int[][] array) 
	{
		int max_number;
		int[] col_max = new int[array[0].length]; 
		for(int i=0;i<array[0].length;i++)
		{
			max_number= array[0][i];
			for(int j=1;j<array.length;j++)
			{
				if(array[j][i]>max_number)
					max_number=array[j][i];
			}
			col_max[i]=max_number;
		}
		return col_max;
	}
	
	public static int[] findRowSums(int[][] array) 
	{
		int[] sum_rows= new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			int sum = 0;
			for(int j=0;j<array[0].length;j++)
			{
				sum=sum+array[i][j];
			}
			sum_rows[i]=sum;
		}
		return sum_rows;
	}
	
	public static int[] findColSums(int[][] array) 
	{
		int[] sum_cols = new int[array[0].length];
		for(int i=0;i<array[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<array.length;j++)
			{
				sum=sum+array[j][i];
			}
			sum_cols[i]=sum;
		}
		return sum_cols;
	}
	
	public static int[][] findTransposeArray(int[][] array)
	{
//		System.out.println("Transpose of an Array");
		
		int[][] array_transpose=new int[array[0].length][array.length];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
				array_transpose[j][i]=array[i][j];
			
		}
		
//		for(int i=0;i<array_transpose.length;i++)
//		{
//			for(int j=0;j<array_transpose[0].length;j++)
//				System.out.print("\t"+array_transpose[i][j]);
//			System.out.println();
//		}
		return array_transpose;
		
	}

}
