package test;

public class CompileTimePolymporphism {
	
	public static void main(String[] args) {
		//concat(34, 46);
		//concat("Pradeep" , "Kumar");
		//concat(324 , "Kumar");
		//concat("Type" , 45);
		
		int a = 56;
		long b = 78;
		concat(b,a);
	}
	
	public static void concat(int a, int b) {
		System.out.println("Should be called");
		System.out.println(a+b);
	}
	
	
	public static void concat(int a, long b) {
		System.out.println("SHould be this time");
		System.out.println(a+b);
	}
	
	public static void concat(long a, int b) {
		System.out.println(a+b);
	}
	
	public static void concat(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void concat(String a, String b) {
		System.out.println(a+b);
	}
	
	public static void concat(int a, String b) {
		System.out.println(a+b);
	}
	
	public static void concat(String a, int b) {
		System.out.println(a+b);
	}
	

}
