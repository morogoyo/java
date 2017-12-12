package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pulse {

	 Pulse(String name){
	try {
		Class.forName("com.mysql.jdbc.Driver"); //Name Class
//		Connection pulse = DriverManager.getConnection("jdbc:mysql://localhost:3306/hologic","root","root");//Connect to database
//		Statement statement = pulse.createStatement();// Create a statement
//		ResultSet rSet = statement.executeQuery("select * from threedimensions_emails  ");
		Connection pulse = DriverManager.getConnection("jdbc:mysql://107.161.176.194:3306/dataful_hologic_unsubscribe","dataful_hologic","lms650lms650");//Connect to database
		
		Statement statement = pulse.createStatement();// Create a statement
		ResultSet rSet = statement.executeQuery("select * from unsubscribe  ");
		
//		Connection pulse2 =DriverManager.getConnection("jdbc:mysql://lms-rds-01.csuwpebxwxcv.us-west-2.rds.amazonaws.com/hologic","rdslmsmas01","oZai2rmYn52HF5oc");//Connect to database
//		Statement statement2 = pulse2.createStatement();// Create a statement
//		ResultSet rSet2 = statement2.executeQuery("select * from brevera_emails");
//		
				while (rSet.next()) {
					System.out.println("Id: " +rSet.getString(1));
					System.out.println(" Name: "+rSet.getString(2));
					System.out.println("Title: " +rSet.getString(3));
					System.out.println();
					
				}	

//				while (rSet2.next()) {
//					System.out.println("Id: " +rSet2.getString(1));
//					System.out.println(" Name: "+rSet2.getString(2));
//					//System.out.println("Title: " +rSet2.getString(3));
//					//System.out.println("City :"+rSet2.getString(4));
//					//System.out.println();
//				}		
		
		
	} catch ( SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	}



