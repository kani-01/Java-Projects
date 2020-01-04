
public class Worker extends Person {
	
	public String job;
	double weeklyPay;
	
	public Worker(String name,int age,String job,double weeklyPay)
	{
		super(name,age);
		this.job=job;
		this.weeklyPay=weeklyPay;
	}
	
	public void setJob(String job)
	{
		this.job = job;
	}
	
	public void setMajorCode(double weeklyPay)
	{
		this.weeklyPay=weeklyPay;
	}
	
	public String getJob()
	{
		return job;
	}
	
	public double getWeeklyPay()
	{
		return weeklyPay;
	}

	public String toString()
	{
		return super.toString()+" , Job: " +job+""+" , Weekly Pay: " +weeklyPay;			
	}
	
	
}
