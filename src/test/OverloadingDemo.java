package test;

public class OverloadingDemo {
	
	public static void main(String[] args) {
		
		OverloadingDemo obj = new OverloadingDemo();
		//obj.concat(2, 2);
		//obj.concat("Hello ", "World");
		obj.concat(45, 54);
	}
	
	public void concat(String a, String b) {
		System.out.println("Inside string and string");
		System.out.println(a + b);
	}
	
	public void concat(int a, int b) {
		System.out.println("Inside int and int");
		System.out.println(a + b);
	}
	
	public void concat(long a, long b) {
		System.out.println("Inside long and long");
		System.out.println(a + b);
	}
	
	public void concat(int a, long b) {
		System.out.println(a + b);
	}
	
	public void concat(long a, int b) {
		System.out.println(a + b);
	}
	
	public void concat(long a, int b, int c ) {
		System.out.println(a + b);
	}

}
