package test;

public class SringExamples {
	
	public static void main(String[] args) {
		String name = "Pradeep";
	
		
		name = name.concat(" Number");
		System.out.println(name);
		String lowerCase = "abcdefghijkl";
		String upperCase = lowerCase.replace('a','z');
		System.out.println(upperCase);
		
		String untrimmedStr = "  sdfsdf   value             ";
		System.out.println(">>"+untrimmedStr.trim()+"<<");
		
		for(int i = 0; i < 5; i++) {
			String str = ""+i;
			System.out.println(str);
		}
		
		String hello = "hello";
		String world = "world";
		String helloWorld = hello + world;
		
		StringBuffer sb1 = new StringBuffer("hello").append("world");
		
		StringBuffer sb = new StringBuffer();
		sb.append("street").append("city").append("state").append("cpountry");
		
	}

}
