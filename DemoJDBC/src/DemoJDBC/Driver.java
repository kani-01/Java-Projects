package DemoJDBC;

import java.sql.*;

public class Driver {

//	private static int id=0;
//	private static String name="hg";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//1. Get database Connection
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitytemp?autoReconnect=true&useSSL=false","root","Terence@04"); 
			
			//2. Create a Statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute SQL Query
			ResultSet myRs = myStmt.executeQuery("select * from instructor;");
//			ResultSet myRs = myStmt.executeQuery("select * from instructor where dept_name = 'music' ;");
			
			//4. Process the result set
			while(myRs.next())
			{
				System.out.println(myRs.getString("id")+" , "+myRs.getString("name")+" , "+myRs.getString("dept_name")+" , "+myRs.getString("salary"));
			}
		
			
	/*		//3. Update/Insert Statement
			String sql = "insert into instructor values (5,'rstu','geology',50000)";
			//4.Update
			myStmt.executeUpdate(sql);
			
			System.out.println("Insert Complete");
			
	*/
			
	/*		//3. Delete Statement
			String sql = "delete from instructor where dept_name = 'history'";
			//4.Update
			int rowsAffected = myStmt.executeUpdate(sql);
			System.out.println("Rows affected : " +rowsAffected);
			if(rowsAffected>0) 
			{
			System.out.println("Deletion Complete");
		}
	*/		
		}
		
		catch(Exception exe)
		{
			exe.printStackTrace();
		}

	}

}
