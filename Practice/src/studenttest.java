
public class studenttest {

	public static void main(String[] args)
	{
		student[] class_students = new student[5];
		for(int i=0;i<class_students.length;i++)
			class_students[i]= new student();
		class_students[0].setRoll(01);
		class_students[0].setName("Ankit");
		class_students[1].setRoll(02);
		class_students[1].setName("Anwar");
		class_students[2].setRoll(03);
		class_students[2].setName("Daisy");
		class_students[3].setRoll(04);
		class_students[3].setName("Oswald");
		class_students[4].setRoll(05);
		class_students[4].setName("Noddy");
		
		for(int i=0;i<class_students.length;i++)
		{
			System.out.print(class_students[i].getRoll()+"\t");
			System.out.print(class_students[i].getName()+"\t");
			System.out.println();
		}
	}
}
