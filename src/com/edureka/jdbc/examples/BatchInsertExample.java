package com.edureka.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsertExample {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "welcome");
		Statement statement = connection.createStatement();

		connection.setAutoCommit(false);
		try {
			
			statement.addBatch("insert into employee (name, age, city) values ('James', 36, 'Frisco');");
			statement.addBatch("insert into employee (name, age, city) values ('Hari', 30, 'Houston');");
			statement.addBatch("insert into employee (name, age, city) values ('Raj', 23, 'Calcutta');");
			statement.addBatch("insert into employee (name, age, city) values ('Jerry', 33, 'Chennai');");
			statement.addBatch("insert into employee (name, age, city) values ('Emmy', 28, 'Plano');");
			statement.executeBatch();
			//statement.executeUpdate("update employee set name='Vinay' where id=4;");
			connection.commit();
			System.out.println("Transaction executed successfully");
		} catch (Exception e) {
			System.out.println("Rolling back the transaction");
			connection.rollback();
		}

		statement.close();
		connection.close();
	}

}
