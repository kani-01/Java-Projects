//import java.io.*;
import java.util.Scanner;

public class CircleTest {	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Reading data using readLine
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String rad = null;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("\n Enter a radius:");
		double radius=myScanner.nextDouble();
		
/*		try {
			rad = reader.readLine();
			} 
		catch (IOException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		double radius= Double.parseDouble(rad);  */
		
		if(radius>0)
			{
		Circle C = new Circle();
		C.setRadius(radius);
		System.out.println("Area is = "+C.calculateArea());
		System.out.println("Circumference is = "+C.calculateCircumference());
		System.out.println(C.tostring());
			}
		myScanner.close();
	}

}
