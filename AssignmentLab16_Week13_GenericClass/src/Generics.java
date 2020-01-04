import java.util.Random;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random myRandom = new Random();
		Double[] doubleArray = new Double[20];
		Integer[] integerArray = new Integer[20];
		ArrayOperations<Integer> array1 = new ArrayOperations<Integer>(integerArray);
		ArrayOperations<Double> array2 = new ArrayOperations<Double>(doubleArray);
		// Generate Random Numbers
		for(int i=0;i<20;i++)
		{
			integerArray[i] = (myRandom.nextInt(100));
			doubleArray[i] = 100.0*myRandom.nextDouble();
		}
		
		System.out.println("Before Sorting Double Array : ");
		for(int i=0;i<20;i++)
			System.out.print(doubleArray[i]+" ");
		System.out.println("\n");
		
		System.out.println("Before Sorting Integer Array : ");
		for(int i=0;i<20;i++)
			System.out.print(integerArray[i]+" ");
		
		//Call the Generic Sort and sort the Array of Double
		
		//Call the Generic Sort and sort the array of Integer
		System.out.println("\n");
		int array1min = array1.findMin(integerArray);
		double array2min = array2.findMin(doubleArray);
		System.out.println(" Integer array (array1) Minimum Element is "+array1min);
		System.out.println(" Double  array (array2) Minimum Element is "+array2min);
		System.out.println("\n");
		
		int array1max = array1.findMax(integerArray);
		double array2max = array2.findMax(doubleArray);
		System.out.println(" Integer array (array1) Maximum Element is "+array1max);
		System.out.println(" Double  array (array2) Maximum Element is "+array2max);
		System.out.println();
		array1.selectionsort1(integerArray);
		array2.selectionsort1(doubleArray);
		
		System.out.println("After Sorting Double Array : ");
		for(int i=0;i<20;i++)
			System.out.print(doubleArray[i]+" ");
		System.out.println("\n");
		System.out.println("After Sorting Integer Array : ");
		for(int i=0;i<20;i++)
			System.out.print(integerArray[i]+" ");
	}

}
