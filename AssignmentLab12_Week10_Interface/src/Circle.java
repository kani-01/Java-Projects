import java.lang.Math;
import java.util.ArrayList;
public class Circle {
	
	protected double radius;
	private double area;
	private double circumference;
	private String str;
	public interface Comparable
	{
	
	}
	
	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public boolean equals(Circle other)
	{
		if(this.radius==other.radius)
			return true;
		else
			return false;
	}
	
	public double findArea()
	{
		area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public double findCircumference()
	{
		circumference = 2*Math.PI*radius;
		return circumference;
	}
	
	public String toString() 
	{
		str=" Radius : "+radius+" Area : "+findArea()+" Circumference : "+findCircumference();
		return str;
	}
	
	public int compareTo(Circle other)
	{
		if(this.radius<=other.radius)
			return 0;
		else 
			return 1;
	}

	public int compareTo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
