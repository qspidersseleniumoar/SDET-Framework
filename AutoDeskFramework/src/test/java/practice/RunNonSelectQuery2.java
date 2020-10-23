package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

public class RunNonSelectQuery2 {

	public static void main(String[] args) throws SQLException {
		
		 /* step 1 : register the mysql data Base */
		Driver driverRef = new Driver();
		           DriverManager.registerDriver(driverRef);
		 /* step 2  : connect to data base */
		 Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		          
		 /* step 3 : create SQL Query statement*/
		 Statement stat = conn.createStatement();
		 
		 
		  String query = "insert into project values('TY_PROJ_096','deepak','','Orange','Completed',10)";
		   
		 /* step 4 : execute Query */
		  int resut = stat.executeUpdate(query);
		      System.out.println(1);    
		                   
		 /* step 5 : close the connection*/
		  conn.close();

	}

}
