
import java.util.*;


public class LearningArrayListOperations {
	
	static ArrayList<String> myArrayList = new ArrayList<String>();
//	myArrayList name = new myArrayList("Ankit");
//	static ArrayList<Double> marray = new ArrayList<Double>();
	
	public static void addString(String newname)
	{
		
		//new String("Ankit");
		String newname1=newname;
		myArrayList.add(newname1);
		//return newname;
		
	}
	
	public static void removeString(String deletename)
	{
		String delname1 = deletename;
		boolean del = myArrayList.remove(delname1);
		if (del==true)
			System.out.println("String Removed");
		else
			System.out.println("String not found");
	}
	
	public static void removeObject(int delname2)
	{
		int delname1 = delname2;
		boolean del = myArrayList.remove(myArrayList.get(delname1));
		if (del==true)
			System.out.println("String Removed");
		else
			System.out.println("String not found");
	}
	
	public static void displayString()
	{
//		myArrayList.getClass();
//		for (String index:myArrayList)
		System.out.print("[ ");
		for(int i=0;i<myArrayList.size();i++)
			System.out.print(myArrayList.get(i)+" : ");
		System.out.print("]");
//		System.out.println(myArrayList);
	}
	
	public static int menu()
	{
	int choice;
	System.out.println("\n 1.Enter a new String \n 2.Delete an existing String \n 3.Display all Strings \n 4.Enter location of string to be removed \n 5.QUIT");
	Scanner console = new Scanner(System.in);
	choice = console.nextInt();
	return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=menu();	
		while(choice<5)
		{
			switch(choice)
			{
				case 1:
				System.out.println("Enter a New String");
				Scanner name = new Scanner(System.in);
				String newname1 = name.next();
				addString(newname1);
				break;
			
				case 2:
				System.out.println("Enter the String to be Removed");
				Scanner delname = new Scanner(System.in);
				String deletename = delname.next();
				removeString(deletename);
				break;
				
				case 3:
				displayString();
				break;
				
				case 4:
					System.out.println("Enter the String location to be Removed");
					Scanner console1 = new Scanner(System.in);
					int delname2 = console1.nextInt();
					removeObject(delname2);
					break;
					
				default:
					break;
			}
			choice=menu();
		}
		System.out.println("Programming Terminating");
	}

}
