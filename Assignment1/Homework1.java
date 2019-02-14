/**
* <h1>Homework One!</h1>
* <p>The first assignment for Large Scale Programming.
* This assignment introduced me to the basic concepts of 
* the Java Programming Language.
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-01-25
*/
public class Homework1 {
	
	/**
	   * This is the printArray method which enables me format the 
	   * array output in a certain manner and use this format
	   * multiple times with ease.
	   * @param myArray This is the only parameter to the pritnArray method.
	   * @return Nothing.
	   */
	public static void printArray(int[] myArray) {
		for (int i = 0; i < myArray.length-1; i++) {
			System.out.print(myArray[i]+ ", ");
		}
		System.out.print(myArray[myArray.length-1] + " ");
	}
	
	/**
	   * This is the main method which makes use of 
	   * isAscending and isDescending methods from
	   * the OrderChecker class.
	   * @param args Unused.
	   * @return Nothing.
	   */
	public static void main(String[] args) {
		
		//Test array declaration and initialization
		int[] myArray = new int[10];
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		myArray[3] = 4;
		myArray[4] = 5;
		myArray[5] = 6;
		myArray[6] = 7;
		myArray[7] = 8;
		myArray[8] = 9;
		myArray[9] = 10;
		
		OrderChecker checker = new OrderChecker(); //Instantiation of OrderChecker object 
		
		if (checker.isAscending(myArray)) {    //Check if array elements are sorted in ascending order
			System.out.print("The array: ");
			printArray(myArray);
			System.out.println("is in ascending order.");
			
		} else {
			System.out.print("The array: ");
			printArray(myArray);
			System.out.println("is not in ascending order.");
		}

		if (checker.isDescending(myArray)) { //Check if array elements are sorted in descending order
			System.out.print("The array: ");
			printArray(myArray);
			System.out.println("is in descending order.");
			
		} else {
			System.out.print("The array: ");
			printArray(myArray);
			System.out.println("is not in descending order.");
		}

		int[] myArray2 = {10,9,8,7,6,5,4,3,2,1};  //Test array declaration and initialization
		if (checker.isAscending(myArray2)) {     //Check if array elements are sorted in ascending order
			System.out.print("The array: ");
			printArray(myArray2);
			System.out.println("is in ascending order.");
			
		} else {
			System.out.print("The array: ");
			printArray(myArray2);
			System.out.println("is not in ascending order.");
		}

		if (checker.isDescending(myArray2)) {  //Check if array elements are sorted in descending order
			System.out.print("The array: ");
			printArray(myArray2);
			System.out.println("is in descending order.");
			
		} else {
			System.out.print("The array: ");
			printArray(myArray2);
			System.out.println("is not in descending order.");
		}
	}

}
