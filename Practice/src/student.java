import java.io.*;

public class student {
	
	int rollno;
	String name;
	
	public student()
	{
		
	}
	
	public student(int roll,String name)
	{
		this.rollno=roll;
		this.name=name;
	}
	
	public void setRoll(int num)
	{
		this.rollno = num;
	}
	
	public void setName(String name1)
	{
		this.name=name1;
	}
	
	public int getRoll()
	{
		return rollno;
	}
	
	public String getName()
	{
		return name;
	}

	
}

