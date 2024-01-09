package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Class 
{
	public static void main(String[] args) throws SQLException {
		{
			String url= "jdbc:mysql://localhost:3306/bank";
			String un= "root";
			String pwd= "root";
			
			Connection con = DriverManager.getConnection(url, un, pwd);
			Statement state = con.createStatement();
			ResultSet result = state.executeQuery("select * from customer;");
			
			while (result.next())
					{
				String username = result.getString("username");
				String password = result.getString("pass");
				System.out.println(username);
					}
		}
	}

}