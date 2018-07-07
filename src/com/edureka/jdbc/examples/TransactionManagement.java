package com.edureka.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "welcome");
		Statement statement = connection.createStatement();

		connection.setAutoCommit(false);
		try {
			// withdraw 2000 from emp id 1
			statement.executeUpdate("update employee set account_balance = 11000 where id = 1;");
			// deposit into emp id 2;
			statement.executeUpdate("update employee set account_balance = 8000 where id = 4;");
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
