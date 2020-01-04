import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceTestClass 
{
	private static int choice,flag=0;
	private static String name;
	private static int age,employeeID,yearsOfService;
	private static double salary,hourlyRate,hoursWorked;
	private static ArrayList<Employee> myArray = new ArrayList<Employee>();
	
	
	public static int menu()
	{
	System.out.println("\n 1. Enter a Salaried Employee \n 2. Enter an hourly Employee \n 3. Print all Employees \n 4. Delete an Employee \n 5. QUIT");
	Scanner console1 = new Scanner(System.in);
	choice=console1.nextInt();
//	console1.close();
	return choice;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		choice=menu();
		Scanner console = new Scanner(System.in);
		while(choice!=5)
		{
		switch(choice)
		{
		case 1:
			System.out.println("Enter Employee Name, ID, Age, Salary and Years of Service");
			name=console.next();
			employeeID=console.nextInt();
			age=console.nextInt();
			salary=console.nextDouble();
			yearsOfService=console.nextInt();
			myArray.add(new SalariedEmployee(name, employeeID, age, salary, yearsOfService));
			break;
			
		case 2:
			System.out.println("Enter Employee Name, ID, Age, Hourly Rate and Hours Worked");
			name=console.next();
			employeeID=console.nextInt();
			age=console.nextInt();
			hourlyRate=console.nextDouble();
			hoursWorked=console.nextDouble();
			myArray.add(new HourlyEmployee(name, employeeID, age, hourlyRate,hoursWorked));
			break;
			
		case 3:
			for(int i=0;i<myArray.size();i++)
				System.out.println(myArray.get(i));
//				System.out.println(myArray.get(i).toString()); //can also use toString or need not mention
			break;
		
		case 4:
			System.out.println("Enter Employee Name, ID of the Employee to be Deleted");
			name=console.next();
			employeeID=console.nextInt();
			SalariedEmployee delEmp = new SalariedEmployee(name,employeeID);
			
			for(int i=0;i<myArray.size();i++)
			{
				flag=0;
//				System.out.println(myArray.get(i));
//				Employee Employee1 = myArray.get(i);
				if(myArray.get(i).equals(delEmp))
				{
					myArray.remove(i);
					flag=1;
					System.out.println("Employee Deleted");
//					break;
				}
			}
			if(flag==0)
			System.out.println("Employee not found");
			break;
			
		default:
			break;
		
		}
		choice=menu();
		}
		
		
	}

}
