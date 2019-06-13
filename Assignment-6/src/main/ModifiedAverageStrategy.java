import java.util.*;
import java.io.*;

/**
* <h1>Modified Average Strategy</h1>
* <p>This class handles computation of 
* curved averages.
* </p>
* @author  Chijioke Kamanu
* @since 2019-04-22
*/
public class ModifiedAverageStrategy implements AverageStrategy {
  /**
    * This method computes the curved average, dropping the 
    * two lowest grades
    * @param grades This is the list of grades taken as input
    * @return int This returns the computed curved average
    */
  public int compute(List<Integer> grades) throws EmptyListException{
    if (grades.size() < 3){
      throw new EmptyListException("List is Empty!");
    }
    int gradesSum = 0;
    grades.remove(grades.indexOf(Collections.min(grades)));
    grades.remove(grades.indexOf(Collections.min(grades)));
    for (int i = 0; i < grades.size(); i++){
      gradesSum += grades.get(i);
    }
    return (int)(gradesSum/grades.size());
  }
}