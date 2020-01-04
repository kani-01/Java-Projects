import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import java.lang.String;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;
		String str ="Hello World.";
		boolean value = true;
		
		if(value) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
		System.out.println(str);
		
		String[] myArray={"Ankit","Anwar","Bob","Daisy","Oswald"};
		for(int i=0;i<myArray.length;i++)
			System.out.print(myArray[i]+"\t");
		System.out.println();
		char[] myarr2= {'A','B','C'};
		for(int i=0;i<myarr2.length;i++)
			System.out.print(myarr2[i]+"\t");
		System.out.println();
		
		
//		String str1 = new String["World"];
//		System.out.println(str1);
//		Scanner a = new Scanner(System.in);
//		n=a.nextInt();
//		s=String.valueOf(str);		
		
		String name;
		name=JOptionPane.showInputDialog("Enter Name and press ok");
		System.out.println(name);
		JOptionPane.showMessageDialog(null,name, "Your Name is",-1);
		int a=JOptionPane.PLAIN_MESSAGE;
		int b=JOptionPane.ERROR_MESSAGE;
		int c=JOptionPane.INFORMATION_MESSAGE;
		int d=JOptionPane.WARNING_MESSAGE;
		int e=JOptionPane.QUESTION_MESSAGE;
		System.out.println("\n"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+"\n");
		
		try 
		{
			Scanner file = new Scanner(new FileReader("C:\\Kanimozhi Marshall\\1. OOP - James J. Fuller (CS 580)\\2. Lab Assignments\\test.txt"));
//			Scanner file = new Scanner(new FileReader("kani.txt"));
			String filecontent=file.next();
			String filecontent2=file.next();
			System.out.println(filecontent+" "+filecontent2);
			
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("error");
		}
		
		try 
		{
			PrintWriter outfile = new PrintWriter("program.out");
			outfile.println("Write to File Operation");
			outfile.close();
		} 
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("error");
		}
		

	}

}
