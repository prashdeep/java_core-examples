package com.edureka.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "welcome");
		Statement statement = connection.createStatement();
		
	    //statement.execute("insert into employee (name, age, city) values ('James', 36, 'Frisco');");
		//statement.executeUpdate("update employee set name='Vinay' where id=4;");
		statement.execute("delete from employee where id=2");
		
		ResultSet resultSet = statement.executeQuery("select * from	employee");
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String city = resultSet.getString(3);
			int age = resultSet.getInt(4);
			System.out.println("Employee with Id: "+id+" name: "+ name+", residing at "+ city+ " and age is : "+age);
		}
	}
}
