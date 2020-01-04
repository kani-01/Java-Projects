import java.util.Scanner;
public class RecursionTest {
	private static int choice,n,x,y;
	public static int menu()
	{
		
	System.out.println("\n 1. x to nth power \n 2. GCD of m and n \n 3. QUIT");
	Scanner console1 = new Scanner(System.in);
	choice = console1.nextInt();
//	console1.close();
	return choice;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		choice=0;
		while(choice<3)
		{
			choice=menu();
			Scanner console = new Scanner(System.in);
		switch(choice)
		{
		case 1:
			System.out.println("Enter the value of x");
			x=console.nextInt();
			System.out.println("Enter the value of n");
			n=console.nextInt();
			System.out.println(Recursion.recursivePow(x,n));
		break;
		
		case 2:
			System.out.println("Enter the value of x");
			x=console.nextInt();
			System.out.println("Enter the value of y");
			y=console.nextInt();
			System.out.println(Recursion.gcd(x, y));
		break;	
		
		case 3:
			System.out.println("Program Terminating");
			break;	
		
		default:
		break;
		
		}
		
		}

	}

}
