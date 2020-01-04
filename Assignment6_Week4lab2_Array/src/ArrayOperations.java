import java.util.Scanner;
 
public class ArrayOperations {
	
	int length;
	
	public int getArrayLength()
	{
	System.out.println("Enter the Array Length");
	Scanner arraylength = new Scanner(System.in);
    length = arraylength.nextInt();
    return length;
	}

	public int[] getArray(int length1)
	{
	length = length1;
	int[] array = new int[length];
	Scanner enterarray = new Scanner(System.in);
	System.out.println("Enter the Elements of array");
	for(int i=0;i<length;i++)
	array[i]=enterarray.nextInt();
	return array;   
	}
	
	public int findSmallest(int[] array)
	{
		int smallestNum;
		smallestNum=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(smallestNum>array[i])
			{
				smallestNum=array[i];
			}
		}
		return smallestNum;
	}

	public int findLargest(int[] array)
	{
		int largestNum;
		largestNum=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(largestNum<array[i])
			{
				largestNum=array[i];
			}
		}
		return largestNum;
	}
	
	public static int[] reverseArray(int[] array)
	{
		int[] array1=new int[array.length];
		int j=0,i=(array.length)-1;
		while(j<array.length)
			{
				array1[j]=array[i];  
				j++;
				i--;
			}
//		System.out.println("The Given Array is ");
//		for(int i1=0;i1<array.length;i1++)
//			System.out.print("\t"+array[i1]);
//		System.out.println();
//		System.out.println("The Reverse Array is ");
//		for(int j1=0;j1<array1.length;j1++)
//			System.out.print("\t"+array1[j1]);
//		System.out.println();
		return array1;
	}
	
	public double normArray(int[] array)
	{
		double sum=0,norm;
		for(int i=0;i<array.length;i++)
		{
			sum=sum + Math.pow(array[i], 2);
		}
		norm=Math.sqrt(sum);
		return norm;
	}
	
	public static double dotProduct(int[] a, int[] b)
	{
		int n1,n2,k=0;
		double dotproduct=0;
		int[] a1=a;
		int[] b1=b;
		n1=a1.length;
		n2=b1.length;
		if(n1==n2)
		{
			while(k<n1)
			{
				dotproduct=dotproduct+a1[k]*b[k];
				k++;
			}
		}
		return dotproduct;
		
	}
	
	
}
