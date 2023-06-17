package vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteQuery {
	
	@Test
	public void sample() throws SQLException
	{
		//Step 1: Register the driver to DB
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
				 
		//Step 2: get the connection with database // give db name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcsm27", "root", "root");
		
		//Step 3: Issue Create Statement
		Statement state = con.createStatement();
		
		//Step 4: Execute a query // give table name
		ResultSet result = state.executeQuery("select * from wcsm27_info;");
		while(result.next())
		{
			System.out.println(result.getString(1)+"-"+result.getInt(2)+"-"+result.getString(3));
		}
		
		//Step 5: Close the database
		con.close();
		System.out.println("db closed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
