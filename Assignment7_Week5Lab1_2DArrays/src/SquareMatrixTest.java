//import java.util.Scanner;

public class SquareMatrixTest {
	
//	 private static double[][] arrayOne= {{2,3,4,1},{0,3,5,1},{1,2,2,5},{-1,0,2,-6}};
//	 private static	double[][] arrayTwo= {{4,2,7,1},{3,1,5,8},{3,1,0,2},{1,2,3,2}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int length;
		double[][] arrayOne= {{2,3,4,1},{0,3,5,1},{1,2,2,5},{-1,0,2,-6}};
		double[][] arrayTwo= {{4,2,7,1},{3,1,5,8},{3,1,0,2},{1,2,3,2}};
//		System.out.println("Enter the Square Matrix Dimension");
//		Scanner console = new Scanner(System.in);
//		length = console.nextInt();
			
		System.out.println("The Sum of the Diagonals in arrayOne Matrix is = "+SquareMatrix.diagonalSum(arrayOne));
		System.out.println("Comparing Array Matrix arrayTwo and arrayOne:");
		if((SquareMatrix.areEqual(arrayTwo, arrayOne)==true))
			{
				System.out.println("The Arrays are Equal");
			}
		else
			{
				System.out.println("The Arrays are not Equal");
			}
		
		System.out.println("Comparing Array Matrix arrayOne and arrayOne:");
		if((SquareMatrix.areEqual(arrayOne, arrayOne)==true))
			{
				System.out.println("The Arrays are Equal");
			}
		else
			{
				System.out.println("The Arrays are not Equal");
			}
			
		}
		
	}


