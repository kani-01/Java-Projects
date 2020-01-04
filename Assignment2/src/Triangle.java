import java.lang.Math;

public class Triangle {
	
	public static void main(String args[])
	{
		double base, height, hypotenuse, cos, sin, tan, cot, area, perimeter;
		base =85;
		height=150;
		
		hypotenuse = Math.sqrt((Math.pow(base,2)+Math.pow(height,2)));
		System.out.println("The Length of the Hypotenuse is = "+hypotenuse);
		
		cos=base/hypotenuse;
		System.out.println("cos(ACB) is = "+cos);

		sin=height/hypotenuse;
		System.out.println("cos(ACB) is = "+sin);

		tan=height/base;
		System.out.println("cos(ACB) is = "+tan);

		cot=base/height;
		System.out.println("cos(ACB) is = "+cot);
		
		area=(0.5*base*height);
		System.out.println("The Area of the Triangle is = "+area);
		
		perimeter=base+height+hypotenuse;
		System.out.println("The Perimeter of the Triangle is ="+perimeter);
	
	}

}
