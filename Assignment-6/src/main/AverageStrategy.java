/**
* <h1>AverageStrategy!</h1>
* <p>
* This is an interface with a function to be implemented in classes.
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-04-22
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public interface AverageStrategy {
	public int compute(List<Integer> grades) throws EmptyListException;
}
