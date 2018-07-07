package test;

/**
 * This class demonstrates the loops available in Java.
 * @author pradep
 * @version 1.1
 * @since 1.0
 * 
 */
public class LoopDemo {
	
	public static void main(String[] args) {
		// Single line comment
		/*	Multi
		 *   Line
		 *   Comment
		*/
		for(int i = 0; i < 10; i++) {
			//System.out.println(i);
		}
		
		//while loop demo
		int loop = 10;
		/*while(loop < 10) {
			System.out.println("The value of i is "+loop);
			String str = new String("sdfsdfsdfsdff "+loop);
			loop++;
		}*/
		
		do {
			System.out.println("Atleast called once");
		} while(loop < 10);
	}

}
