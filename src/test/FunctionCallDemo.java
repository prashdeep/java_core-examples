package test;

public class FunctionCallDemo {

	public static void main(String[] args) {
		method1();
		System.out.println("Called inside the main method");
	}
	private static void method1() {
		method2();
		System.out.println("Called inside the method 1");
	}
	private static void method2() {
		method3();
		System.out.println("Inside the method 2");
	}
	private static void method3() {
		System.out.println("Inside the method 3");
	}
}
