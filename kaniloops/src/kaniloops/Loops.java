package kaniloops;
import java.util.Scanner;

public class Loops {
		
		private static double n;
		private static int choice,opt;
		private static double sum;
		private static double product, xtopowern;

		public static double calculateSum(double n)
		{
			sum=0;
			for(int i=1;i<=n;i++)
				sum=sum+n;
			return sum;
			
		}
		
		public static double calculateProduct(int n)
		{
			product=1;
			for(int i=1;i<=n;i++)
				product=product*n;
			return product;
			
		}
		
		public static double calculateXToPowerN(int n,double x)
		{
			for(int i=1;i<=n;i++)
			xtopowern=x*x;
			return xtopowern;
			
		}
		
		public static int menu()
		{
			System.out.println("Enter a choice\n 1.Calculate Sum 1+2+3+4 \n 2.Calculate Product 1*2*3..*n \n 3.Calculate XToPowerN \n 4.Quit");
			Scanner console = new Scanner(System.in);
			opt = console.nextInt();
			console.close();
			return opt;
			
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		choice=menu();

		while(choice==1) 
			{
				double n;
				Scanner sumobj = new Scanner(System.in);
				System.out.println("Enter n");
				n=sumobj.nextDouble();
				System.out.println("Sum is"+calculateSum(n));
				
			}
	}

}
