package test;

public class FunctionReferenceDemo {
	
	public static void main(String[] args) {
		int[] array = {11,12,13,14,15};
		System.out.println("Before calling the function");
		for (int i = 0; i < array.length; i ++) {
			System.out.println("array [ "+i+" ] "+array[i]);
		}
		System.out.println("--------------------------------------");
		assignValues(array);
		System.out.println("After calling the function");
		for (int i = 0; i < array.length; i ++) {
			System.out.println("array [ "+i+" ] "+array[i]);
		}
	}
	
	public static void assignValues(int[] array){
		array[0] = 60;
		array[1] = 61;
		array[2] = 62;
		array[3] = 64;
		array[4] = 65;
	}

}
