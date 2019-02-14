package howard.edu.oop.assignment2;
import java.util.ArrayList;

/**
* <h1>Order Checker!</h1>
* <p>The Order Checker program implements an application that
* simply checks if an integer ArrayList has its elements sorted
* in ascending or descending order.
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-02-07
*/

public class OrderChecker {
	
	/**
	   * This method is used to check if an ArrayList is sorted in
	   * ascending order.
	   * @param randomArray This is the only parameter to the isAscending method
	   * @return boolean This returns true or false depending on the arrangement
	   * of the ArrayList's elements.
	   */
	
	public static boolean isAscending(ArrayList<Integer> randomArray) {
		if (randomArray.size() <= 1) {
			return true;
		}

		for (int i = 0; i < randomArray.size() - 1; i++) {
      if (randomArray.get(i) > randomArray.get(i+1)) {
        return false;
      }
		}
		return true;
	}
	
	/**
	   * This method is used to check if an ArrayList is sorted in
	   * descending order.
	   * @param randomArray This is the only parameter to the isDescending method
	   * @return boolean This returns true or false depending on the arrangement
	   * of the ArrayList's elements.
	   */
	
	public static boolean isDescending(ArrayList<Integer> randomArray) {
		if (randomArray.size() <= 1) {
			return true;
		}
		for (int i = 0; i < randomArray.size() - 1; i++) {
      if (randomArray.get(i) < randomArray.get(i+1)) {
        return false;
      }
		}
		return true;
	}
}
