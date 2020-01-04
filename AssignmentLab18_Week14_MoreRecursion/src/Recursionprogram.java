import java.util.ArrayList;
import java.util.Random;

public class Recursionprogram {

	public static int findFactorial(int n)
	{
		if(n==1)
		return n;
		else
		return n*findFactorial(n-1);
	}
	
	public static int findSum(int n)
	{
		if(n==0)
		return n;
		else
		return n+findSum(n-1);
	}
	
	public static int findFibonacci(int n)
	{
		if(n==0|n==1)
		return n;
		else
		return findFibonacci(n-1)+findFibonacci(n-2);
	}
	
	public static int findMaximumElement()
	{
		int maxElement=0;
		Random myRandom = new Random();
		Integer[] integerArray = new Integer[20];
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		for(int i=0;i<20;i++)
		{
			integerArray[i] = (myRandom.nextInt(100));
		}
		
		
		return maxElement;
	}

}

