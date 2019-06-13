import java.util.*;
import java.io.*;
import java.lang.*;

/**
* <h1>Average Context!</h1>
* <p>The Average Context class implements the Strategy pattern
* functionality, it enables the program decide what average 
* computation it uses.
* </p>
* @author  Chijioke Kamanu
* @since 2019-04-22
*/
public class AverageContext {
  private AverageStrategy strategy;
  /**
    * This method sets the average strategy to use
    * @param AverageStrategy This is the average strategy that's selected
    * @return None
    */
  public void setAverageStrategy(AverageStrategy strategy){
    this.strategy = strategy;
  }
  
  /**
    * This method computes the average using the selected strategy
    * @param grades This is a list of grades
    * @return int This returns the desired average
    */
  public int computeAverage(List<Integer> grades) throws EmptyListException{
    return strategy.compute(grades);
  }
}