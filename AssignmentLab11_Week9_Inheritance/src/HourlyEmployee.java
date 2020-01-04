
public class HourlyEmployee extends Employee{
	
	private double hoursWorked, hourlyRate,finalpay;
		
	public HourlyEmployee() 
	{
		
	}
	
	public HourlyEmployee(String name,int employeeID,int age, double hourlyRate, double hoursWorked) 
	{
		super(name,employeeID,age);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	
	public void sethoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	
	public void sethourlyRate(int hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	
	public double gethoursWorked()
	{
		return hoursWorked;
	}
	
	public double gethourlyRate()
	{
		return hourlyRate;
	}
	
	public double findPay()
	{
		if(hoursWorked<=40)
			finalpay=hoursWorked*hourlyRate;
		else
			finalpay=40*hourlyRate+1.5*hourlyRate*(hoursWorked-40);
		return finalpay;
		
	}
	
	public String toString()
	{
		return super.toString()+" Hours Worked is : "+hoursWorked+" Hourly Rate is : "+hourlyRate+"\n"+" Pay : "+findPay();
	}

}
