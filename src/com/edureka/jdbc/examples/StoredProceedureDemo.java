package com.edureka.jdbc.examples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProceedureDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "welcome");
		CallableStatement cs = connection.prepareCall("{call insertIntoEmp1(?,?,?)}");
		cs.setString(1, "Naveen");
		cs.setInt(2, 33);
		cs.setString(3, "Delhi");
		cs.execute();
		cs.close();
		connection.close();
		
		
	}
	

}
