
public class Array2DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int row,col;
//		short k=32767;
//		System.out.println(k);
		row=ArrayOperations2D.getArrayrow();
		col=ArrayOperations2D.getArraycol();
		int[][] array = new int[row][col];
		int[] row_max = new int[array.length];
		int[] col_max = new int[array[0].length];
		int[] sum_rows = new int[array.length];
		int[] sum_cols = new int[array[0].length];
		array = ArrayOperations2D.getArray(array);
//		int array[][] = {{1,4,7},{2,9,1},{0,3,6},{2,2,8}}; 
		int[][] array_transpose=new int[array[0].length][array.length];
		System.out.println("The Given Array is");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			System.out.print("\t"+array[i][j]);
			System.out.println();	
		}
		row_max=ArrayOperations2D.findRowMax(array);
		System.out.println("RowMax Array is:");
		for(int i=0;i<array.length;i++)
			System.out.println("\t"+row_max[i]);
		col_max=ArrayOperations2D.findColMax(array);
		System.out.println("ColMax Array is:");
		for(int j=0;j<array[0].length;j++)
			System.out.println("\t"+col_max[j]);
		
		sum_rows=ArrayOperations2D.findRowSums(array);
		System.out.println("RowSums Array is:");
		for(int i=0;i<sum_rows.length;i++)
			//System.out.println("Sum of elements in Row "+i+" is"+"\t"+sum_rows[i]);
			System.out.println("\t"+sum_rows[i]);
		sum_cols=ArrayOperations2D.findColSums(array);
		System.out.println("ColSums Array is:");
		for(int j=0;j<sum_cols.length;j++)
			//System.out.println("Sum of elements in Col "+j+" is"+"\t"+sum_cols[j]);
			System.out.println("\t"+sum_cols[j]);
		
		array_transpose=ArrayOperations2D.findTransposeArray(array);
		System.out.println("The Transpose Array is:");
		for(int i=0;i<array_transpose.length;i++)
		{
			for(int j=0;j<array_transpose[0].length;j++)
			System.out.print("\t"+array_transpose[i][j]);
			System.out.println();	
		}

	}
}
