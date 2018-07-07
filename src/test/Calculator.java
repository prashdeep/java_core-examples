package test;

public class Calculator {
	
	public static void main(String[] args) {
		double result = divide(4545,43);
		printResult(result);
	}
	
	private static void printResult(double result) {
		System.out.println("The result of division is "+result);
	}

	public static int sum(int a, int b) {
		return a +b;
	}
	
	public static int sub(int a, int b) {
		return (a - b);
	}
	
	public static int mult(int a, int b) {
		return (a * b);
	}
	
	public static double divide(int a, int b) {
		return a / b;
	}

}
