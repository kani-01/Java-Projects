import java.util.ArrayList;
import java.util.Scanner;

public class CircleTest extends Circle{
	private static double radius;
	private static int choice,k,flag;
	private static ArrayList<Circle> myArray = new ArrayList<Circle>();
	
//	@Override
//	public int compareTo(Object arg0) {
//		// TODO Auto-generated method stub
//		
//		return 0;
//	}
	
	public static int menu()
	{
	System.out.println("\n 1. Enter a Circle \n 2. Print all Circles \n 3. QUIT");
	Scanner console1 = new Scanner(System.in);
	choice=console1.nextInt();
//	console1.close();
	return choice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;
		while(choice<3)
		{
			flag=0;
			choice=menu();
			Scanner console = new Scanner(System.in);
		switch(choice)
		{
		case 1:
			System.out.println("Enter Radius of the Circle : ");
			radius=console.nextDouble();
			Circle other = new Circle(radius);
//			myArray.add(new Circle(radius));
			for(int j=0;j<myArray.size();j++)
			{
//			k=compareTo(new Circle(radius));
			if ((myArray.get(j).compareTo(other))==1)
//			if(k==0|k==-1)
			{
				myArray.add(j, new Circle(radius));
//				myArray.add(new Circle(radius));
				flag=1;
				break;
			}

			}
			if(flag==0)
				myArray.add(new Circle(radius));
			break;
			
		case 2:
			System.out.println("Printing all Circles : ");
			for(int i=0;i<myArray.size();i++)
				System.out.println(myArray.get(i));
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
