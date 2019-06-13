/**
* <h1>Empty List Exception</h1>
* <p>The Empty List Exception class defines a custom 
* exception for the program.
* </p>
* @author  Chijioke Kamanu
* @since 2019-04-22
*/

public class EmptyListException extends Exception {
  /**
    * This method outputs an error message for the user defined exception
    * @param message This is the desired error message
    * @return None
    */
  public EmptyListException(String message) {
    super(message);
  }
}