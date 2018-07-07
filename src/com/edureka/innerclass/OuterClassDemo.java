package com.edureka.innerclass;

class OuterClass {
	private int value = 10;
	
	private void printValue() {
		System.out.println("The value is"+value);
		new InnerClass().printOuterClassMethod();
	}
	
	class InnerClass{
		public void fromInnerClass() {
			System.out.println("Accessing value from inner class "+value);
		}
		
		private void printOuterClassMethod(){
			printValue();
		}
	}
	
}



public class OuterClassDemo {
	
	public static void main(String[] args) {
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		innerObject.fromInnerClass();
	}

}
