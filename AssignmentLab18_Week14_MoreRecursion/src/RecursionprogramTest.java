import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RecursionprogramTest {

	private static int choice,n,x,y;
	
	public static int menu()
	{
	System.out.println("\n Menu: \n 1. Find n! \n 2. Compute sum 1+2+3+.....+n \n 3. Compute and print nth Fibonacci number \n 4. Find the maximum value in an array of ints.\n 5. QUIT");
	Scanner console1 = new Scanner(System.in);
	choice = console1.nextInt();
//	console1.close();
	return choice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		choice=0;
		while(choice<5)
		{
			choice=menu();
			Scanner console = new Scanner(System.in);
		switch(choice)
		{
		case 1:
			System.out.println("Enter the value of n");
			n=console.nextInt();
			System.out.println("Factorial of n is :"+Recursionprogram.findFactorial(n));
		break;
		
		case 2:
			System.out.println("Enter the value of n");
			n=console.nextInt();
			System.out.println("Sum upto n numbers is :"+Recursionprogram.findSum(n));
		break;	
		
		case 3:
			System.out.println("Enter the value of n");
			n=console.nextInt();
			System.out.println("nth Fibonacci number is :"+Recursionprogram.findFibonacci(n));
			break;	
		
		case 4:
			Random myRandom = new Random();
			Integer[] integerArray = new Integer[20];
			ArrayList<Integer> array1 = new ArrayList<Integer>();
			for(int i=0;i<20;i++)
			{
				integerArray[i] = (myRandom.nextInt(100));
			}
			System.out.println();
			break;
			
			
		default:
		break;
		
		}
		}
	}
}
