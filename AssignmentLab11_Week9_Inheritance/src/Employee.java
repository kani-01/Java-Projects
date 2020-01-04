
public abstract class Employee {
	
	private String name;
	private int age,employeeID;
	
	public Employee()
	{
		
	}
	
	public Employee(String name,int employeeID)
	{
		this.name=name;
		this.employeeID=employeeID;
	}
	
	public Employee(String name,int employeeID,int age)
	{
		this.name=name;
		this.employeeID=employeeID;
		this.age=age;		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getAge(String age)
	{
		return age;
	}
	
	public abstract double findPay();
	
	public String toString()
	{
		return " Name is : "+name+" Employee ID is : "+employeeID+" Age : "+age;
	}
	
	public boolean equals(Employee other)
	
	{
//		boolean flag = false;
		if((this.employeeID==(other.employeeID))&&(this.name.equals(other.name)))
//			flag=true;
			return true;
//		return (this.name.equals(other.name))&& boolean((this.employeeID=(other.employeeID)));
		else 
			return false;		
	}

}
