import java.util.*;
import java.io.*;
import java.lang.*;

/**
* <h1>Normal Average Strategy</h1>
* <p>This class does regular average computation
* </p>
* @author  Chijioke Kamanu
* @since 2019-04-22
*/
public class NormalAverageStrategy implements AverageStrategy {
  /**
    * This method computes the normal average
    * @param grades This is the list of grades taken as input
    * @return int This returns the computed normal average
    */
  public int compute(List<Integer> grades) throws EmptyListException{
    if (grades.size() == 0){
      throw new EmptyListException("List is empty!");
    }
    int gradesSum = 0;
    for (int i = 0; i < grades.size(); i++){
      gradesSum += grades.get(i);
    }
    return (int)(gradesSum/grades.size());
  }
}