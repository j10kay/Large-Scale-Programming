import java.util.*;
import java.io.*;
import java.lang.*;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;


@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestAverageStrategy.class,  //Added test classes here.
})

/**
* <h1>Homework Six!</h1>
* <p>The sixth assignment for Large Scale Programming.
* This assignment enhanced my understanding of the Strategy Pattern
* and gave me more practice with jUnit Testing.
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-04-22
*/
public class Main {
  /**
	   * This is the main method which invokes the
	   * test suite and notifies me if any method fails
	   * @param args Unused.
	   * @return Nothing.
	   */
  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }

  /**
	   * This suite() method is helpful when using JUnit 3 Test Runners or Ant.
	   * @param Nothing
	   * @return JUnit4TestAdapter(Main.class)
	   */
  public static junit.framework.Test suite() {
    return new JUnit4TestAdapter(Main.class);
  }
}