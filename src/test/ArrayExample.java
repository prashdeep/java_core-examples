package test;

public class ArrayExample {

	public static void main(String[] args) {
		//data type variable_name[] = new data_type[size];
		  char [] flagArray = new char[10];
		  // properties of array
		  /*
		   * 1. Array is fixed size.
		   * 2. Array has length property
		   * 3. Array will start with 0 and will contain n -1.
		   * 4. Array values can be accessed with array[index]
		   * 3. All values of array will be initialized with their default values
		   *    a. for Integer - 0
		   *    b. for byte - 0
		   *    c. for char - ''
		   *    d. for boolean - false
		   *    e. for float - 0.0
		   *    f. for double - 0.0
		   *    g. for long - 0 
		   */
		  flagArray[9] = 'a';
		  flagArray[2]= 'g';
		   for ( int index = 0; index < flagArray.length; index++) {
			   System.out.println(" >>"+flagArray[index]+"<<");
		   }
		   
		   int[] knownElementsArray = {3,45,23,56};
		  // System.out.println(knownElementsArray[1]);
	}
}
