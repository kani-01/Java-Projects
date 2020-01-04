import java.lang.Math;

public class MURectangle {
	private double height, width, diagonal, area, perimeter;
		
	public MURectangle()
	{	
	}
	 
	public MURectangle(double height,double width)
	{
		this.height=height;
		this.width=width;
	}
	
	public void setHeight(double height)
	{
		this.height=height;
	}
	
	public void setWidth(double width)
	{
		this.width=width;
	}
	
	public double findArea()
	{
		area=height*width;
//		System.out.println("Area = "+area);
		return area;
	}
	
	public double findPerimeter()
	{
		perimeter=((2*height)+(2*width));
//		System.out.println("Perimeter = "+perimeter);
		return perimeter;
	}
	
	public double findDiagonal()
	{
		diagonal=Math.sqrt(Math.pow(height,2) + Math.pow(width,2));
//		System.out.println("Diagonal Length = "+diagonal);
		return diagonal;
	}
	
	public boolean strSquare()
	{
//		this.height=height;
//		this.width=width;
		if(height==width) 
		{
			System.out.println("It is a Square");
			return true;
		}
		else
		{
			System.out.println("It is not a Square");
			return false;
		}
	}
	
	public boolean isSquare()
	{
		if(height==width) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		String str="\nLength = "+height+"\n";
		str=str+"Width = "+width+"\n";
		str=str+"Area = "+area+"\n";
		str=str+"Perimeter = "+perimeter+"\n";
		str=str+"Diagonal length = "+diagonal+"\n";
		
		if (isSquare()==true)
			str=str+"It is a Square";
		else
			str=str+"It is not a Square";
		
		return str;
		
	}
	
}
