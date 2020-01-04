import java.lang.Math;

public class TwoNumbers {
	
	private double x,y,sum,product,xtopowery;
	
	public TwoNumbers()
	{
		
	}

	public TwoNumbers(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void setTwoNumbers(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double getx()
	{
		return x;
	}
	
	public double gety()
	{
		return y;
	}
	
	public double findSum()
	{
		sum=x+y;
//		System.out.println("x+y="+sum);
		return sum;
		
	}
	
	public double findProduct()
	{
		product=x*y;
	//	System.out.println("x*y="+product);
		return product;
		
	}
	
	public double findpower()
	{
		xtopowery=Math.pow(x, y);
	//	System.out.println("x to the y is "+xtopowery);
		return xtopowery;
		
	}
	
	
}
