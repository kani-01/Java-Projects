import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length1,length2;
		
		ArrayOperations array1 = new ArrayOperations();
		length1 = array1.getArrayLength();
		int [] reverse_array = new int[length1];
		int [] array = new int[length1];
		array=array1.getArray(length1);
		
		System.out.println("The Smallest Element in the given Array is "+array1.findSmallest(array));
		System.out.println("The Largest Element in the given Array is "+array1.findLargest(array));
		System.out.println("The Given Array is ");
		for(int i1=0;i1<array.length;i1++)
			System.out.print("\t"+array[i1]);
		System.out.println("\nThe Reverse Array is ");
		reverse_array=ArrayOperations.reverseArray(array);
		for(int k=0;k<reverse_array.length;k++)
			System.out.print("\t"+reverse_array[k]);
		System.out.println("\nThe Norm of the Array is "+array1.normArray(array));
		
		System.out.println("Enter the length of array a and b");
		Scanner len = new Scanner(System.in);
		length2 = len.nextInt();
 	    int[] a = new int[length2];
  	    int[] b = new int[length2];
		
		Scanner dotprod = new Scanner(System.in);
		System.out.println("Enter the Elements of array a");
		for(int i=0;i<length2;i++)
			a[i]=dotprod.nextInt();
		System.out.println("Enter the Elements of array b");
		for(int j=0;j<length2;j++)
			b[j]=dotprod.nextInt();
		System.out.println("The Dot Product of a and b is "+ArrayOperations.dotProduct(a,b));
  			
	}

}
