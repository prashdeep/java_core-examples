package com.edureka.module3;

public class StudentMain {
	
	public static void main(String[] args) {
		Student student1 = new Student(20, 1, "Kiran", 22);
		Student student2 = new Student(20, 2, "Vinay", 21);
		Student student3 = new Student(20, 4, "Vikram");
		student1.applyForLeave(10);
		student2.applyForLeave(2);
		
		System.out.println("Leave balance for student1 is "+student1.getLeaveBalance());
		
		System.out.println("Leave balance for student2 is "+student2.getLeaveBalance());

		
		
	}

}
