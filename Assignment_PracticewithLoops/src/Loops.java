import java.util.*;

public class Loops {
	
	private static int n,sum,choice,opt;
	private static double x,product, xtopowern;
	
	public Loops()
	{
		
	}

	public static int calculateSum(int n)
	{
		sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		return sum;
		
	}
	
	public static double calculateProduct(int n)
	{
		product=1;
		for(int i=1;i<=n;i++)
			product=product*i;
		return product;
		
	}
	
	public static double calculateXToPowerN(int n,double x)
	{
		xtopowern=x;
		for(int i=2;i<=n;i++)
		xtopowern=xtopowern*x;
		return xtopowern;
		
	}
	
	public static int menu()
	{
		System.out.println("\nEnter a choice\n 1.Calculate Sum 1+2+3+4 \n 2.Calculate Product 1*2*3..*n \n 3.Calculate XToPowerN \n 4.Quit");
		Scanner console = new Scanner(System.in);
		opt = console.nextInt();
		//console.close();
		return opt;
		
	}
	
	public static void main(String args[])
	{
		choice=menu();
		while(choice!=4)
		{
		if(choice==1) 
		{
			Scanner sumScan = new Scanner(System.in);
			System.out.println("Enter n");
			n=sumScan.nextInt();
			System.out.println("Sum is "+calculateSum(n));
		}
		// if (sumScan.hasNextInt()) {
		//	 }
		// else
		// System.out.println("Error");
		// n=Integer.parseInt(myScanner.nextLine());
		// sumScan.close();
		
		
		if(choice==2)
		{
			Scanner prod = new Scanner(System.in);
			System.out.println("Enter n");
			n=prod.nextInt();
			System.out.println("Product is "+calculateProduct(n));
//			prod.close();
		}
		if(choice==3)
		{			
			Scanner xtoy = new Scanner(System.in);
			System.out.println("Enter the power n");
			n=xtoy.nextInt();
			System.out.println("Enter the number x");
			x=xtoy.nextDouble();
			System.out.println("X to the Power N is "+calculateXToPowerN(n,x));
//			xtoy.close();
		}
		choice=menu();
		}
		if(choice==4)
		System.out.println("Program Terminated");
	}
}
