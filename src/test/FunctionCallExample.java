package test;

public class FunctionCallExample {

	public static void main(String[] args) {
		int a = 56;
		int b = 67;
		System.out.println("Before calling assignValue function a: "+ a + " b is "+b );
		assignValues(a, b);
		System.out.println("After calling assignValue function a: "+ a + " b is "+b );
	}
	
	public static void assignValues(int a, int b) {
		a = 20;
		b = 50;
		System.out.println("Inside the assignValues function a: "+a+" b is b:"+b);
	}
}
