import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length1,length2;
		
		ArrayOP array1 = new ArrayOP();
		length1 = array1.getArrayLength();
		int [] reverse_array = new int[length1];
		int [] array = new int[length1];
		array=array1.getArray(length1);
		
		System.out.println("The Smallest Element in the given Array is "+array1.findSmallest(array));
		System.out.println("The Largest Element in the given Array is "+array1.findLargest(array));
		System.out.println("Reverse Array:");
		reverse_array=ArrayOP.reverseArray(array);
		System.out.println("The Norm of the Array is "+array1.normArray(array));
		
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
		System.out.println("The Dot Product of a and b is "+array1.dotProduct(a,b));
  	
	}

}
