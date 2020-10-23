package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

public class RunSelectQuery {

	public static void main(String[] args) throws SQLException {
		
		 /* step 1 : register the mysql data Base */
		Driver driverRef = new Driver();
		           DriverManager.registerDriver(driverRef);
		 /* step 2  : connect to data base */
		 Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		          
		 /* step 3 : create SQL Query statement*/
		 Statement stat = conn.createStatement();
		 
		 
		  String query = "select * from project";
		   
		 /* step 4 : execute Query */
		  ResultSet resut = stat.executeQuery(query);
		             while (resut.next()) {
						System.out.println(resut.getString(1) + "\t" +
		                                   resut.getString(2) + "\t"+
								           resut.getString(3) +  "\t"+
		                                   resut.getString(4) +"\t"+
								           resut.getString(5));
						
					}
		                   
		 /* step 5 : close the connection*/
		  conn.close();

	}

}
