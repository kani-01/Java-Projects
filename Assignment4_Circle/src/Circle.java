import java.lang.Math;


public class Circle {
	
	private double radius,area,circumference;
	
	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double calculateArea()
	{
		area=(Math.PI)*(Math.pow(radius, 2));
		//System.out.println("\nArea is : "+area);
		return area;
	}
	
	public double calculateCircumference()
	{
		circumference=2*(Math.PI)*(radius);
		//System.out.println("Circumference is : "+circumference);
		return circumference;
	}
	
	public String tostring()
	{
		String str;
		str="\nRadius :"+radius+"\n";
		str=str+"Area :"+area+"\n";
		str=str+"Circumference :"+circumference+"\n";
		//System.out.println(str);
		return str;
		
	}

}
