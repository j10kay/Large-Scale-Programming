import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import howard.edu.oop.assignment2.FileOperations;
import howard.edu.oop.assignment2.OrderChecker;


/**
* <h1>Homework Two!</h1>
* <p>The second assignment for Large Scale Programming.
* This assignment enhanced my understanding of 
* the Java Programming Language.
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-02-07
*/

public class Main {
  
  /**
	   * This is the printArray method which enables me format the 
	   * arrayList output in a certain manner and use this format
	   * multiple times with ease.
	   * @param myArray This is the only parameter to the printArray method.
	   * @return Nothing.
	   */

  public static void printArray(ArrayList<Integer> myArray) {
		for (int i = 0; i < myArray.size()-1; i++) {
			System.out.print(myArray.get(i)+ ", ");
		}
		System.out.print(myArray.get(myArray.size()-1) + " ");
	}
	
	/**
	   * This is the main method which makes use of 
	   * isAscending and isDescending methods from
	   * the OrderChecker class as well as getTestArrays 
     * from the FileOperations class.
	   * @param args Unused.
	   * @return Nothing.
	   */
	public static void main(String[] args) throws FileNotFoundException{
		
		OrderChecker checker = new OrderChecker(); //Instantiation of OrderChecker object 
    ArrayList<ArrayList<Integer>> outputArray = FileOperations.getTestArrays("arrayfile.txt");              //Calling getTestArrays without object instantiation given that it is a static function
    
    for (int i = 0; i < outputArray.size(); i++) {
			if (checker.isAscending(outputArray.get(i))) {    //Check if array elements are sorted in ascending order
			System.out.print("The array: ");
			printArray(outputArray.get(i));
			System.out.println("is in ascending order.");
			
		  } else {
			System.out.print("The array: ");
			printArray(outputArray.get(i));
			System.out.println("is not in ascending order.");
		  }

		  if (checker.isDescending(outputArray.get(i))) { //Check if array elements are sorted in descending order
			System.out.print("The array: ");
			printArray(outputArray.get(i));
			System.out.println("is in descending order.\n");
			
		  } else {
			System.out.print("The array: ");
			printArray(outputArray.get(i));
			System.out.println("is not in descending order.\n");
		  }
    }
	}
}
