
public class SalariedEmployee extends Employee{
	
	private double salary,finalPay;
	private int yearsOfService;
	
	public SalariedEmployee()
	{
		
	}
	
	public SalariedEmployee(String name,int employeeID)
	{
		super(name,employeeID);  // How???????
	}

	public SalariedEmployee(String name,int employeeID,int age, double salary, int yearsOfService)
	{
		super(name,employeeID,age);
		this.salary=salary;
		this.yearsOfService=yearsOfService;
	}
	
	public void setsalary(double salary)
	{
		this.salary = salary;
	}
	
	public void setEmployeeID(int yearsOfService)
	{
		this.yearsOfService = yearsOfService;
	}
	
	public double getsalary()
	{
		return salary;
	}
	
	public double getyearsOfService()
	{
		return yearsOfService;
	}
	
	
	public double findPay()
	{
		finalPay= salary+(salary*0.01*yearsOfService);
		return finalPay;
	}
	
	public String toString()
	{
		return super.toString()+" Salary is : "+salary+" Years of Service is : "+yearsOfService+"\n"+" Pay : "+findPay();
	}
	
}
