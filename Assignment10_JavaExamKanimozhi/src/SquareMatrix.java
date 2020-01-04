import java.util.Scanner;

public class SquareMatrix {
	
	public static double[][] getArray(int length)
	{
			double[][] myArray = new double[length][length];
			Scanner array = new Scanner(System.in);
			System.out.println("\n Enter the Array Elements");
			for(int i=0;i<myArray.length;i++)
				for(int j=0;j<myArray[0].length;j++)
				{
					myArray[i][j]= array.nextDouble();
				}
	return myArray;
	}
	
	public static double diagonalSum(double[][] myArray)
	{
		double diagonalSum = 0;
		for(int i=0;i<myArray.length;i++)
			for(int j=0;j<myArray[0].length;j++)
			{
				if(i==j)
				{
					diagonalSum+=myArray[i][j];
				}
			}
		return diagonalSum;
	}
	
	public static boolean areEqual(double[][] firstArray, double[][] secondArray)
	{
		double[][] first_Array = firstArray;
		double[][] second_Array = secondArray;
		if((first_Array.length==second_Array.length)&&(first_Array[0].length==second_Array[0].length))
		{
		for(int i=0;i<first_Array.length;i++)
			for(int j=0;j<first_Array[0].length;j++)
			{
				if(first_Array[i][j]!=second_Array[i][j])
				{
					return false;
				}
			}
		}
		return true;		
	}
	

}
