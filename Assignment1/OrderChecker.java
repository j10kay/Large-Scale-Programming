/**
* <h1>Order Checker!</h1>
* <p>The Order Checker program implements an application that
* simply checks if an integer array has its elements sorted
* in ascending or descending order.
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-01-25
*/

public class OrderChecker {
	
	/**
	   * This method is used to check if an array is sorted in
	   * ascending order.
	   * @param randomArray This is the only parameter to the isAscending method
	   * @return boolean This returns true or false depending on the arrangement
	   * of the array's elements.
	   */
	
	static boolean isAscending(int[] randomArray) {
		if (randomArray.length <= 1) {
			return true;
		}
		for (int i = 0; i < randomArray.length - 1; i++) {
			for (int j = i+1; j < randomArray.length; j++) {
				if (randomArray[i] > randomArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	   * This method is used to check if an array is sorted in
	   * descending order.
	   * @param randomArray This is the only parameter to the isDescending method
	   * @return boolean This returns true or false depending on the arrangement
	   * of the array's elements.
	   */
	
	static boolean isDescending(int[] randomArray) {
		if (randomArray.length <= 1) {
			return true;
		}
		for (int i = 0; i < randomArray.length - 1; i++) {
			for (int j = i+1; j < randomArray.length; j++) {
				if (randomArray[i] < randomArray[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
