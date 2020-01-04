import java.util.Scanner;

public class TwoNumbersTest {

	public static int menu()
	{
		int option;
		Scanner opt = new Scanner(System.in);
		System.out.println("\n1. Enter another number \n2. Quit ");
		option = opt.nextInt();
//		opt.close();	
		return option; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=1;
		double x,y;
		//2String str="Y";
		//while(str.equals("Y"))
		//System.out.println("Today is a nice day. Lets go fishing");
		Scanner myScanner = new Scanner(System.in);
		while(choice==1)
		{
		System.out.println("\n Enter x:");
		x=myScanner.nextDouble();
		System.out.println("\n Enter y:");
		y=myScanner.nextDouble();
		
		TwoNumbers twonum = new TwoNumbers();
		twonum.setTwoNumbers(x, y);
		System.out.println("x+y = "+twonum.findSum());
		System.out.println("x*y = "+twonum.findProduct());
		System.out.println("x to the y is "+twonum.findpower());
		choice=menu();
		}
		myScanner.close();
		System.out.println("Program terminated");
	}
	

}
