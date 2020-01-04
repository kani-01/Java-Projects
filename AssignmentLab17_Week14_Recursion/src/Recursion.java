
public class Recursion {
	
	public static int recursivePow(int x,int n)
	{
		if(n==1)
		return x;
		else
		return x*recursivePow(x, n-1);
	}
	
	public static int gcd(int x,int y)
	{
		if(y==0)
		return x;
		else
		return gcd(y,x%y);
	}
	
}
