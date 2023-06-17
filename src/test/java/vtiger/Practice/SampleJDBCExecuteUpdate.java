package vtiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteUpdate {

	@Test
	public void sample() throws SQLException {
		
		// Step 1: Register the driver to DB
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		// Step 2: get the connection with database // give db name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcsm27", "root", "root");

		// Step 3: Issue Create Statement
		Statement state = con.createStatement();

		// Step 4: Execute a query // give table name
		String query = "insert into wcsm27_info values('BatMan',13,'California'),('hulk',15,'Hollywood');";
		int result = state.executeUpdate(query);
		System.out.println(result);
		if(result==2)
		{
			System.out.println("data is added");
		}
		else
		{
			System.out.println("data not added");
		}
		
		// Step 5: Close the database
		con.close();
		System.out.println("db closed");
	}

}
