package com.edureka.module3;

public class Student {

	/*
	 * default value of 
	 *   int 0
	 *   long 0
	 *   double 0.0
	 *   boolean = false
	 *   char = ''
	 *   Objects = null;
	 *   short = 0;
	 *   byte = 0
	 */
	private int leaveBalance;
	private long id;
	private String name;
	private int age;
	
	public Student(int leaveBalance, int id, String name, int age) {
		this.leaveBalance = leaveBalance;
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student(int leaveBalance, int id, String name) {
		this.leaveBalance = leaveBalance;
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLeaveBalance() {
		return leaveBalance;
	}

	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}

	public boolean applyForLeave(int numberOfDays) {
		if (this.leaveBalance > numberOfDays) {
			System.out.println("Applied for " + numberOfDays + " leaves");
			this.leaveBalance -= numberOfDays;
			return true;
		}
		System.out.println("Not enough leave balance");
		return false;
	}

}
