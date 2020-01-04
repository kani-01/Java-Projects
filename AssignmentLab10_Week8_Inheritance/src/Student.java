
public class Student extends Person{
	
	
	private String schoolName;
	private int majorCode;
	
	public Student(String name,int age,String schoolName,int majorCode)
	{
		super(name,age);
		this.schoolName=schoolName;
		this.majorCode=majorCode;
	}
	
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	
	public void setMajorCode(int majorCode)
	{
		this.majorCode=majorCode;
	}
	
	public String getSchoolName()
	{
		return schoolName;
	}
	
	public int getMajorCode()
	{
		return majorCode;
	}
	
	
	public String toString()
	{
		return super.toString()+" , SchoolName: "+schoolName+" , MajorCode: "+majorCode;
	}
	

}
